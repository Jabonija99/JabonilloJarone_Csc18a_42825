
package pkgfinal;


public abstract class Rental {
    private boolean newModel; //New model flag
    private double rentCost; //Cost of rent
    private long rentNum; //Rental number
    
    //Constructor
    public Rental(boolean newModel, double rentCost, long rentNum){
        setNewModel(newModel); //Set new model flag
        setRentCost(rentCost); //Set cost of rent
        setRentNum(rentNum); //Set rental number
    }
    
    //Equals method
    public boolean equals(long rentNum){
        boolean equal = false; //Set equal flag to false
        
         //If this rent number equal the given num
        if(this.getRentNum() == rentNum)
            equal = true; //Set flag to true
        
        return equal; //Return boolean
    }

    //get newModel
    public boolean isNewModel() {
        return newModel;
    }

    //set newModel
    public void setNewModel(boolean newModel) {
        this.newModel = newModel;
    }

    //Get rentCost
    public double getRentCost() {
        return rentCost;
    }

    //Set rentCost
    public void setRentCost(double rentCost) {
        //If rent cost below zero
        if(rentCost > 0.0)
            //Assign rentCost value
            this.rentCost = rentCost; 
        else 
            //Throw exception
            throw new IllegalArgumentException("Invalid rent cost value");
            
    }

    //Get rentNumber
    public long getRentNum() {
        return rentNum;
    }

    //Set rentNumber
    public void setRentNum(long rentNum) {
        //If rent number is between 0 and long int max value
        if(rentNum > 0 || rentNum < 2147483646)
            this.rentNum = rentNum; //Assign rent number
        else
            //Throw excpetion
            throw new IllegalArgumentException("Bounds Error: Rent number");
    }
    
    //Abstract late charge method
    public abstract double lateCharge();
    
}
