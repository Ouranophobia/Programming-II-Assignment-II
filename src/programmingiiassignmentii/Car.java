
package programmingiiassignmentii;

public class Car {
    private final String make;
    private final String model;
    double basePrice;
    
    public Car(String make, String model, double basePrice){
        this.make = make;
        this.model = model;
        this.basePrice = basePrice;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public double getPrice(){
        return basePrice;
    }
    
    public double setPrice(double basePrice){
        this.basePrice = basePrice;
        return basePrice;
    }
    
    @Override
    public boolean equals(Object obj){
        Car other = (Car)obj;
        if(this.make.equals(other.make) && this.make.equals(other.make))
            return true;     
        return false;
    }

    @Override
    public String toString(){
    String output = "Car Make: " + (this.make) + " Model: " + (this.model) + " Base Price: " + (this.basePrice);
    return output;}

}

