
package interfacedemo;

//Polymorphed geometry
public class Rectangle implements geometry {
    private double length, width;

    public Rectangle(double length, double width){
        this.setLength(length);
        this.setWidth(width);
    }
    
    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public final void setLength(double length) {
        if(length >= 0.0){
            this.length = length;
        }
        else this.width = 0.0;
        
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public final void setWidth(double width) {
        if(width >=0.0){
            this.width = width;
        }
        else this.width = 0.0;
    }
    
    @Override
    public double area(){
        return this.length*this.width;
    }
    
    @Override
    public double perimeter(){
        return (this.length*2) + (this.width*2);
    }
    
    @Override
    public double surface_area(){
        return this.area();
    }
    
    @Override
    public double volume(){
        return 0.0;
    }
}
