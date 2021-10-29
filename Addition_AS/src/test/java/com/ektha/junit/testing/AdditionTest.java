package com.ektha.junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testSum() {

		Addition addition = new Addition();

		int actualResult = addition.sum(10, 20);

		assertEquals(30, actualResult);

	}

}
