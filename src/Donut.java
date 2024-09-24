 // the donut class takes 3 values, height, inner and outer radius of the donut, using calculateVolume 
//method, it calculates the volume.
public class Donut {
	
	private double height; 
	private double outerRadius;
	private double innerRadius;
	
	// constructor -- for the donut method
	public Donut(double height, double outerRadius, double innerRadius) {
		this.height = height;
		this.outerRadius = outerRadius;
		this.innerRadius = innerRadius;
	}

 //Height getter
	 public double getHeight() {	
		   return this.height;     // read the value
	   }
//Height Setter
	public void setHeight(double height) {
		   this.height = height;     //update the value
	}
//Out Radius Getter	
	public double getOuterRadius() {
		   return this.outerRadius;
	   }
//Out Radius Setter
    public void setOuterRadius(double outerRadius) {
		   this.outerRadius = outerRadius; 

}
 //Inner Radius Getter
    public double getInnerRadius() {
		   return this.outerRadius;
	   }
//Inner Radius Setter
    public void setInnerRadius(double outerRadius) {
		   this.outerRadius = outerRadius; 

}
 // Call the method of class Math Power and math PI 
 // Compute The Volume of The Squashed Donut by using the equation 
    public double CalculateVolume(){
    	double volume = (Math.pow(Math.PI, 2)*height*(outerRadius-innerRadius)*(outerRadius+innerRadius))/4;
    	return volume;
	 
 }
}