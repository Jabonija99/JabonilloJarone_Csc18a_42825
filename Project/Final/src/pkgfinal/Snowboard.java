
package pkgfinal;


public class Snowboard extends Rental{
    private int size; //Size in cm
    private boolean freestyle; //Board type bool
    
    public Snowboard(boolean newModel, double rentCost, long rentNum, 
            int size, boolean freestyle){
        super(newModel, rentCost, rentNum);
        
        setSize(size);
        setFreestyle(freestyle);
    }
    
    public int getSize() {
        return size;
    }

    
    public void setSize(int size) {
        if(size > 0)
            this.size = size;
        else
            throw new IllegalArgumentException("Bounds Error: Snowboard Size");
    }
    
    public boolean isFreestyle() {
        return freestyle;
    }

    public void setFreestyle(boolean freestyle) {
        this.freestyle = freestyle;
    }
    
    @Override
    public String toString(){
        return String.format("New Model: %s\nRental Cost: %.2f\n"
                + "Rental Number: %d\nSize: %d cm\nFreestyle: %s\n", 
                isNewModel(), getRentCost(), getRentNum(), size, freestyle);
    }
    
    @Override
    public double lateCharge(){
        return getRentCost() + (getRentCost()*.2);
    }

    
    
}
