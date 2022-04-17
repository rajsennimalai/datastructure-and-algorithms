package com.raj.dsa.linearsearch;

import java.util.List;

/**
 * input: List<int> numbers, int target
 * Output: Returns the index of the target element else -1
 */
public class LinearSearch {

	public int linearSearch(List<Integer> list, int target) {
		int result=-1;
		int lengthOfList=list.size();
		
		for(int i=0;i<lengthOfList;i++) {
			if(list.get(i).equals(target)) {
				result=i;
				break;
			}
		}
		
		
		return result;
		
	}
	
}
