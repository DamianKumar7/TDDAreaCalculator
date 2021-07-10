package areaCalcTest;

public class Circle extends Shape {
	int r;
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		if(r <0) {
			return -1.0;
		}
		else {
			return 0.5 * Math.pow(r,2)*3.14;
		}
	}

}
