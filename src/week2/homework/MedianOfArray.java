package week2.homework;
	
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
	
	public class MedianOfArray {
	
	// Given two sorted arrays A1, A2. Write a code to find median of the arrays
	//
	// Example 1:
	//
	// Input:
	//
	// A1 = [1,3]
	// A2 = [2]
	//
	// Output: 2
	//
	// Example 2:
	//
	// Input:
	//
	// A1 = [1,2]
	// A2 = [3,4]
	//
	// Output: 2.5
	
	
	
	
	//DataSets
	@Test
	public void eg1() {
		int[] inputOne = { 1, 3 };
		int[] inputTwo = { 2 };
		System.out.println("One: " + String.format("%.1f", findMedian1(inputOne, inputTwo)));
	}

	@Test
	public void eg2() {
		int[] inputOne = { 8, 2 };
		int[] inputTwo = { 3, 4 };
		System.out.println("Two: " + String.format("%.1f", findMedian1(inputOne, inputTwo)));
	}

	@Test
	public void eg3() {
		int[] inputOne = { 1, 2, 7, 9, 10 };
		int[] inputTwo = { 3, 4, 11, 56, 88, 90 };
		System.out.println("Three: " + String.format("%.1f", findMedian1(inputOne, inputTwo)));

	}
	@Test
	public void eg4()
	{
	int[] inputOne= {-1,2};
	int[] inputTwo= {3,4,5};
	System.out.println("Four: "+String.format("%.1f", findMedian1(inputOne,inputTwo)));
	
	}
	@Test
	public void eg5()
	{
	int[] inputOne= {1,1};
	int[] inputTwo= {3,4};
	System.out.println("Five: "+String.format("%.2f", findMedian1(inputOne,inputTwo)));
	}
	
	//Solution 1
	
	
	//1. Loop through the first array and add all elements to the new array
	//2. Loop through the second array and add all elements to the new array
	//3. sort the array using inbuilt function from collections
	//4. Determine the length of array list
	//5. if odd, return n/2
	//6.if even return (n/2+(n+1)/2)2, where n is the element at the respective index
	
	private float findMedian1(int[] firstInput, int[] secondInput) {
		List<Integer> combinedArray = new ArrayList<>();
		for (int i = 0; i < firstInput.length; i++)// O[N]
		{
			combinedArray.add(firstInput[i]);
		}
		for (int i = 0; i < secondInput.length; i++)// O[N]
		{
			combinedArray.add(secondInput[i]);
		}
		Collections.sort(combinedArray);// O[nlogn]

		int midSize = combinedArray.size() / 2;// O[1]

		if (combinedArray.size() % 2 == 0)// O[1]
		{
			return (combinedArray.get(midSize - 1) + combinedArray.get(midSize)) / 2;
		} else {
			return combinedArray.get(midSize);
		}

	}
	
	
	
	private void findMedian12(int[] a1, int[] a2) {
		List<Integer> collect = Arrays.stream(a1).boxed().collect(Collectors.toList());
		collect.addAll(Arrays.stream(a2).boxed().collect(Collectors.toList()));
		Collections.sort(collect);
		int med = collect.size() / 2;

		if (collect.size() % 2 == 0)
			System.out.println((collect.get(med - 1) + collect.get(med)) / 2f);
		else
			System.out.println(collect.get((int) Math.ceil(med / 2f)));
	}
	
	private void findMedian(int[] a1, int[] a2) {
		int len=a1.length+a2.length+1;
		
		if(len%2!=0) {
			double f=len/2f;
			f=Math.floor(f)+Math.ceil(f);
			System.out.println(String.format("%.1f", f/2));
		}else {
			System.out.println(String.format("%.1f", (float)len/2));
		}	
	}
	
	
	
	
	
	
	
	
	
	}