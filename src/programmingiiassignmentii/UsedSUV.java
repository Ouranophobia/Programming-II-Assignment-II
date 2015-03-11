
package programmingiiassignmentii;

public class UsedSUV extends SUV {
    
    private final int age;
    
    public UsedSUV(String make, String model, double basePrice, int seatCap, double discount, int age) {
        super(make, model, basePrice, seatCap, discount);
        
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public double ageDiscount(){
        double finalPrice = 0;
        if(age < 5){
            finalPrice = super.getActualPrice() - (super.getActualPrice() * 10 / 100);
        }
        if(age < 10){
            finalPrice = super.getActualPrice() - (super.getActualPrice() * 20 / 100);
        }
        if(age >= 10){
            finalPrice = super.getActualPrice() - (super.getActualPrice() * 30 / 100);
        }
        return finalPrice;
    }
    
        @Override
        public boolean equals(Object obj){
            UsedSUV other = (UsedSUV)obj;
            if(!super.getMake().equals(other.getMake()))
                return false;
            if(!super.getModel().equals(other.getModel()))
                return false;
            if(super.getSeatCap() != (other.getSeatCap()))
                return false;
            return this.age == other.age;
        }
    
        @Override
         public String toString(){
         String output = "Used SUV Make: " + (super.getMake()) + " Model: " + (super.getModel()) + " Base Price: " + (super.getPrice()) + 
                 " Seat Capacity: " + (super.getSeatCap()) + " Discount: " + (super.getDiscount()) + "% Age of Car: " + (this.getAge()) + 
                 " years. With the final cost of: $" + (this.ageDiscount());
         return output;
         }
    
}
