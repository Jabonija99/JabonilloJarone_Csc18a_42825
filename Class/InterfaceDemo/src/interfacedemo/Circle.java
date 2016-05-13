
package interfacedemo;



import java.util.HashSet;
import java.util.Set;

//Use implement keyword to inherit interface
//Program will red mark every function until each is implemented
//Polymorphed geometry
public class Circle implements geometry{
    private double radius;

    //Constructor
    public Circle(double radius){
        this.setRadius(radius);
        
    }
    
    
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public final void setRadius(double radius) {
        if(radius >= 0.0){
            this.radius = radius;
        }
        else{
            this.radius = 0.0;
        }
    }
    
    @Override
    public double area(){
        return Math.PI*radius*radius; //Returns area of circle
    }
    
    @Override
    public double perimeter(){
        return 2.0*Math.PI*radius; //Returns perimeter of circle
    }
    
    @Override
    public double surface_area(){
        return this.area(); //Simply returns area
    }
    
    @Override
    public double volume(){
        return 0.0; //Circle contains no depth/volume
    }
    
    
}
