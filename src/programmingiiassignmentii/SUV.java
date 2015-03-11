
package programmingiiassignmentii;

public class SUV extends Car {

    private final int seatCap;
    double discount;
    
    public SUV(String make, String model, double basePrice, int seatCap, double discount) {
        super(make, model, basePrice);
        
        this.seatCap = seatCap;
        this.discount = discount;
    }

    public int getSeatCap(){
        return seatCap;
    }
    
    public double getDiscount(){
        return discount;
    }
    
    public double setDiscount(double discount){
        this.discount = discount;
        return discount;
    }
    
    public double getActualPrice(){
        double actualPrice;
        actualPrice = super.basePrice - (super.basePrice * discount / 100);
        return actualPrice;
    }
    
    
       @Override
    public boolean equals(Object obj){
        SUV other = (SUV)obj;
        if(super.getMake().equals(other.getMake()) && super.getModel().equals(other.getModel()))
            return true;
        if(this.seatCap == (other.seatCap))
            return true;

        return false;
    }
    
    @Override
    public String toString(){
    String output = "SUV Make: " + (super.getMake()) + " Model: " + (super.getModel()) + " Base Price: " + (super.getPrice()) + 
            " Seat Capacity: " + (this.getSeatCap()) + " Discount: " + (this.getDiscount()) + "%. Final price: " + (this.getActualPrice());
    return output;
}
    
}
