
package interfacedemo;

//Inheritance
public class RPrism extends Rectangle{
    private double height;
    
    public RPrism(double length, double width, double height){
        super(length, width);
        this.setHeight(height);
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        if(height >= 0.0){
            this.height = height;
        }
        else this.height = 0.0;
    }
}
