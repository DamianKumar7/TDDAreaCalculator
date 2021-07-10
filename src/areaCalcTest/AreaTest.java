package areaCalcTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AreaTest {

	@Test
	void testNegative() {
		Rectangle rectangle = new Rectangle(-1,-1);
		
		assertEquals(-1.0,rectangle.getArea());
	}
	@Test
	void testValidRect() {
		Rectangle rectangle = new Rectangle(5,6);
		assertEquals(30.0,rectangle.getArea());
	}
	@Test
	void testValidCirc() {
		Circle circle = new Circle(10);
		assertEquals(157.0,circle.getArea());
		
	}
	@Test
	void testListOfShapes() {
		AreaAdder adder = new AreaAdder(Arrays.asList(new Rectangle(5,6),new Circle(10)));
		assertEquals(187.0,adder.getSum());
	}

}
