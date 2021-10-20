package com.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.challenges.October1stChallenge;

import org.junit.jupiter.params.*;

public class October1stTest {
	
	October1stChallenge octo;
	
	@BeforeAll
	public static void setMO() {
	}
	
	@BeforeEach
	public void setInts() {
		octo = new October1stChallenge();
	}
	
	@AfterEach
	public void resetResult() {
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown called");
		octo = null;
	}
	
	@RunWith(Parameterized.class)
	
	@Test
	@DisplayName("Testing atbash method")
	void testAtbash() {
		System.out.println("atbash called");
		String actual = octo.atbash("apple");
		System.out.println(actual);
		assertEquals("zkkov", actual);
	}

}
