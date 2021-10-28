package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.challenges.Octo2ndChallenge;

public class Octo2ndTest {
	
	Octo2ndChallenge octo;
	
	int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
	ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList(12,70,15));
	ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList(65,21));
	
	@BeforeAll
	public static void setMO() {
	}
	
	@BeforeEach
	public void setInts() {
		octo = new Octo2ndChallenge();
	}
	
	@AfterEach
	public void resetResult() {
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown called");
		octo = null;
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = {97, 86})
	@DisplayName("Testing contiguous subarray sum method")
	void testAtbash(int target) {
		System.out.println("method called");
		ArrayList<Integer> actual = octo.subArray(arr, target);
		System.out.println(actual);
		if (target == 97) {
			assertEquals(ans1, actual);
		}
		else if (target == 86) {			
			assertEquals(ans2, actual);
		}
		
	}

}

