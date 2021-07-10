package areaCalcTest;

 class Rectangle extends Shape {
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double getArea() {
		if(length>0 && breadth >0) {
			return (double)length*breadth;
			
		}
		return -1.0;
	}
	
	
	

}
