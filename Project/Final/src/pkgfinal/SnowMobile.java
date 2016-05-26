
package pkgfinal;


public class SnowMobile extends Rental{
    private int cap; //Capacity of snowmobile
    private String vin; //Vehicle identification number
    
    
    public SnowMobile(boolean newModel, double rentCost, long rentNum, int cap,
            String vin){
        super(newModel, rentCost, rentNum); //Rental construction
        
        setCap(cap); //Set Capacity
        setVin(vin); //Set vehicle ID
    }
    
    //Return capacity
    public int getCap() {
        return cap; 
    }

    //Set capacity
    public void setCap(int cap) {
        if(cap > 0)
            this.cap = cap;
        else
            throw new IllegalArgumentException("Bounds Error: Snowomobile cap");
    }  
   
    //Return vehicle ID
    public String getVin() {
        return vin;
    }

    //Set vehicle ID
    public void setVin(String vin) {
        if(vin == "")
            throw new IllegalArgumentException("Invalid VIN");
        else
            this.vin = vin;
    }
    
    //Snow mobile string output
    @Override
    public String toString(){
        return String.format("New Model: %s\nRental Cost: %.2f\n"
                + "Rental Number: %d\nCapacity: %d\nVIN: %s\n", isNewModel(), 
                getRentCost(), getRentNum(), cap, vin);
    }
    
    //Snow mobile late charge fee (20+capacity*5)%
    @Override
    public double lateCharge(){
        return (getRentCost() + (getRentCost()*((20+(double)cap*5)/100.00)));
    }

    
}
