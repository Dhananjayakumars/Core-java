package methodoverriding;

public class CanonCamera extends Camera {
	String Batteries;
	int DigitalZoom;
	
	@Override
	void capture() {
		System.out.println("capturing HD photos");
	}
	void eyedetection() {
		System.out.println("eye detecting....");
	}
	
	

}
