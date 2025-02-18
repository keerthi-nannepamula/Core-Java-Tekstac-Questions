
public class VolumeCalculator {
	public double calculateVolume(double radius,double height) {
		Double volume=3.14*radius*radius*height;
		System.out.printf("Volume of the Cylinder is %.2f",volume);
		return volume;
	}
	
	public double calculateVolume(int length,int breadth,int h) {
		Double volume=(double) (length*breadth*h);
		System.out.printf("Volume of the Cuboid is %.2f",volume);
		return volume;
	}
}
