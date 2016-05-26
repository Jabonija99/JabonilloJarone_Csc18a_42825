
package pkgfinal;


public class Snowboard extends Rental{
    private int size; //Size in cm
    private boolean freestyle; //Board type bool
    
    public Snowboard(boolean newModel, double rentCost, long rentNum, 
            int size, boolean freestyle){
        super(newModel, rentCost, rentNum); //Rental construction
        
        setSize(size); //Set size
        setFreestyle(freestyle);//Set board style
    }
    
    //Return size
    public int getSize() {
        return size;
    }

    //Set size
    public void setSize(int size) {
        if(size > 0)
            this.size = size;
        else
            throw new IllegalArgumentException("Bounds Error: Snowboard Size");
    }
    
    //Return board style
    public boolean isFreestyle() {
        return freestyle;
    }

    //Set board style
    public void setFreestyle(boolean freestyle) {
        this.freestyle = freestyle;
    }
    
    //Snowboard output string
    @Override
    public String toString(){
        return String.format("New Model: %s\nRental Cost: %.2f\n"
                + "Rental Number: %d\nSize: %d cm\nFreestyle: %s\n", 
                isNewModel(), getRentCost(), getRentNum(), size, freestyle);
    }
    
    //Snowboard late charge 20%
    @Override
    public double lateCharge(){
        return getRentCost() + (getRentCost()*.2);
    }

    
    
}
