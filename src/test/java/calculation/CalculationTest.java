package calculation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
	Calculation calculation;

	@BeforeEach
	void setUp() {
		System.out.println("setUp");
		calculation = new Calculation();
	}

	@Test
	void 덧셈() {
		System.out.println("덧셈");
		assertEquals(5, calculation.add(2, 3));
	}

	@Test
	void 뺄셈() {
		assertEquals(3, calculation.subtract(7,4));
	}

	@Test
	void 곱셈() {
		assertEquals(6, calculation.multiply(2, 3));
	}

	@Test
	void 나눗셈() {
		assertEquals(2, calculation.divide(4, 2));
	}

	@AfterEach
	void tearDown() {
		System.out.println("tearDown");
		calculation = null;
	}
}
