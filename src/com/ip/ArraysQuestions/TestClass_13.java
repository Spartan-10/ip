package com.ip.ArraysQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

//find-index-maximum-occurring-element-equal-probability
public class TestClass_13 {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(4, 3, 6, 8, 4, 6, 2, 4, 5, 9, 7, 4);
		
		for (int i = 0; i < 5; i++)
        {
            System.out.println("The index of the maximum occurring element is "
                    + findIndex(input));
        }
	}

	private static int findIndex(List<Integer> input) {
		
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		
		for(int val : input) {
			countMap.put(val, countMap.getOrDefault(val,0)+1);
		}
		
		int max_occurring= input.get(0);
		for(Map.Entry<Integer, Integer> pair: countMap.entrySet()) {
			if (countMap.get(max_occurring) < pair.getValue()) {
				max_occurring=pair.getKey();
			}
		}
		
		int k = rand(1, countMap.get(max_occurring));
		
		int index =0;
		while(k!=0 && index< input.size()) {
			if(input.get(index) == max_occurring) {
				k--;
			}
			index++;
		}
		
		return index-1;
	}

	private static int rand(int min, int max) {
		if(min>max || (max-min+1 > Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("Invalid Range");
		}
		
		return new Random().nextInt(max-min+1)+min;
	}
}
