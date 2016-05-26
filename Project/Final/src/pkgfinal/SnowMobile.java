
package pkgfinal;


public class SnowMobile extends Rental{
    private int cap; //Capacity of snowmobile
    private String vin; //Vehicle identification number
    
    
    public SnowMobile(boolean newModel, double rentCost, long rentNum, int size){
        super(newModel, rentCost, rentNum);
        
        setCap(cap);
    }
    
    public int getCap() {
        return cap;
    }

    
    public void setCap(int cap) {
        if(cap > 0)
            this.cap = cap;
        else
            throw new IllegalArgumentException("Bounds Error: Snowomobile cap");
    }  
   
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        if(vin == "")
            throw new IllegalArgumentException("Invalid VIN");
        else
            this.vin = vin;
    }
    
    @Override
    public String toString(){
        return String.format("New Model: %d\nRental Cost: %.2f\n"
                + "Rental Number: %d\nCapacity: %d\nVIN: %s", isNewModel(), 
                getRentCost(), getRentNum(), cap, vin);
    }
    
    @Override
    public double lateCharge(){
        return getRentCost() + (getRentCost()*((20+cap*5)/10));
    }

    
}
