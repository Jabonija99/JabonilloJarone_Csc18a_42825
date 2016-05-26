
package pkgfinal;


public class Ski extends Rental{
    private int size; //Size in cm

    public Ski(boolean newModel, double rentCost, long rentNum, int size){
        super(newModel, rentCost, rentNum); //Rental constructor
        
        setSize(size); //Set size
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
            throw new IllegalArgumentException("Bounds Error: Ski Size");
    }
    
    //Ski output string
    @Override
    public String toString(){
        return String.format("New Model: %s\nRental Cost: %.2f\n"
                + "Rental Number: %d\nSize: %d cm\n", isNewModel(), 
                getRentCost(), getRentNum(), size);
    }
    
    //Ski late charge 10%
    @Override
    public double lateCharge(){
        //10% extra charge
        return getRentCost() + (getRentCost()*.1);
    }
    
}
