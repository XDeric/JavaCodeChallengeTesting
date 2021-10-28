package com.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Find the Contiguous Subarray with Sum to a Given Value in an array.

For example :

1
2
3
4
5
6

arr[]={14, 12, 70, 15, 99, 65, 21, 90};
X =97.
Sum found between index 1 to 3
Elements are 12, 70 and 15
*/

public class Octo2ndChallenge {
	
	int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
	
	public ArrayList<Integer> subArray(int[] sub, int target) {
		
		ArrayList<Integer> contArr = new ArrayList<>(Arrays.asList(14,12));
		ArrayList<Integer> index = new ArrayList<>(Arrays.asList(0,1));
		
		int p1 = 0;
		int p2 = 1;
		int sum = sub[p1] + sub[p2];;
		
		while (p2 < sub.length || p1 < sub.length - 1) {
			
			if (sum < target) {
				p2++;
				sum += sub[p2];
				contArr.add(sub[p2]);
				index.add(p2);
			}else if (sum > target) {
				sum -= sub[p1];
				contArr.remove(0);
				index.remove(0);
				p1++;
			}else if(sum == target) {
				break;
			}

//			System.out.println(contArr);
//			System.out.println("sum:" + sum);
		}
		
		
//		System.out.println("Ans: " + contArr);
		
		return contArr;
	}
	

}
