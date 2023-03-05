package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		Junit test = new Junit();
		int res = test.fibRec(10);
		assertEquals(5, res); 
	}

}
