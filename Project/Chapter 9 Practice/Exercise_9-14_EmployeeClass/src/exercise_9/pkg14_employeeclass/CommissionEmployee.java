
package exercise_9.pkg14_employeeclass;


public class CommissionEmployee extends Employee{
    private double grossSales; //Gross weekly Sales
    private double comRate; //Commission percentage
    
    public CommissionEmployee(String fName, String lName, String ssn, 
            double grossSales, double comRate){
        super (fName, lName, ssn); //Employee superclass constructor
        
        if(grossSales < 0.0){
            throw new IllegalArgumentException
                ("Gross sales must be >= 0.0");
        }
        
        if(comRate <= 0.0 || comRate >= 1.0){
            throw new IllegalArgumentException
                ("Commission rate must be between 0.0 and 1.0");
        }
        
        this.grossSales = grossSales;
        this.comRate = comRate;
    }
    
    public void setGrossSales(double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException 
                ("Gross sales must be >= 0.0");
        }
        
        this.grossSales = grossSales;
    }
    
    public void setComRate(double comRate){
        if(comRate <= 0.0 || comRate >= 1.0){
            throw new IllegalArgumentException
                ("Commission rate must be between 0.0 and 1.0");
        }
        
        this.comRate = comRate;
    }
    
    public double getGrossSales(){
        return grossSales;
    }
    
    public double getComRate(){
        return comRate;
    }
    
    public double earnings(){
        return getComRate() * getGrossSales();
    }
    
    @Override
    public String toString(){
        return String.format(super.toString()+"%s: %d\n %s: %d\n %s: %d\n",
                "Gross Sales:", getGrossSales(), "Commision Rate:", 
                getComRate(), "Earnings:", earnings());
    }
}
