
package programmingiiassignmentii;

public class GreenCar extends Car {
    
    private final String type;
    private double premiumPrice;
    
    public GreenCar(String make, String model, double basePrice, String type, double premiumPrice ) {
        super(make, model, basePrice);
        
        this.premiumPrice = premiumPrice;
        this.type = type;
    }
        
        
    public double getActualPrice(){
        double actualPrice = (super.basePrice * (this.premiumPrice / 100)) + super.basePrice;
        return actualPrice;
    }    
   
    public double getPremiumPrice(){
        return premiumPrice;
    }
    
    public double setPremiumPrice(double premiumPrice){
        this.premiumPrice = premiumPrice;
        return premiumPrice;
    }
    
    public String getType(){
        return type;
    }
    
    @Override
    public boolean equals(Object obj){
        GreenCar other = (GreenCar)obj;
        if(super.getMake().equals(other.getMake()) && super.getModel().equals(other.getModel()) && this.type.equals(other.type))
            return true;

        return false;
    }
    
    @Override
    public String toString(){
        String output = "Green Car Make: " + (super.getMake()) + " Model: " + (super.getModel()) + " Base Price: " + (super.getPrice()) +
            " Premium Price: " + (this.getPremiumPrice())+ "% Final Price: " + (this.getActualPrice()) + " Type: " + (this.getType());
        return output;
}
    
}
