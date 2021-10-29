package com.ektha.airthematic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class AirthmeticTest {

	private int a;
	private int b;
	private int expected;

	public AirthmeticTest(int a, int b, int expected) {
		super();
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	public static Collection parameters() {
		return Arrays.asList(new Object[][] { { 5, 6, 11 }, { 5, 7, 12 }, { 4, 5, 9 }

		});

	}

	@Test
	void testSum() {
		Airthmetic airthmetic = new Airthmetic();

		int result = airthmetic.sum(a, b);
		assertEquals(expected, result);

	}

}
