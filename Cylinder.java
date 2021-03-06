
public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "Cylinder " + super.getName() + " with height " + getHeight() + " and radius " +  super.getRadius();
    }

    public double getVolume(){
	return Math.PI * Math.pow(super.getRadius(), 2) * getHeight();
    }
}
