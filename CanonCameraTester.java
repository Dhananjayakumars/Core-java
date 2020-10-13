package methodoverriding;

public class CanonCameraTester {

	public static void main(String[] args) {
	
		CanonCamera cc=new CanonCamera();
		cc.Batteries="Lithium";
		cc.price=30000;
		cc.weight=0.789;
		cc.Displaytype="LCD";
		cc.brand="canon";
		cc.Displaydetails();
		cc.eyedetection();
		cc.capture();
		

	}

}
