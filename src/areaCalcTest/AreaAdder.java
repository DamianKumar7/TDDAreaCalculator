package areaCalcTest;

import java.util.List;

public class AreaAdder {

	
	List<Shape>areas;
	public AreaAdder(List<Shape> areas) {
		// TODO Auto-generated constructor stub
		this.areas = areas;
		
	}
	public double getSum() {
		
		double sum =0;
		for(int i = 0;i <areas.size();i++) {
			Shape current = areas.get(i);
			sum += current.getArea();
		}
		return sum;
	}

}
