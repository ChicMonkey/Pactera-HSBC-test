package driverLess.Car;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pactera.hsbc.car.service.CarImpl;

public class CarImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		CarImpl car=new CarImpl(1,1,"N");
		car.move("turn");
		assertTrue("the orientation after turn is "+car.getOriention(),
				"E".equalsIgnoreCase(car.getOriention()));
		car.move("move");
		assertTrue("the position after turn is y="+car.getY(),2==car.getY());
	}
}
