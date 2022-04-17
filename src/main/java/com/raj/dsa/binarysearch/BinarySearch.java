/**
 * 
 */
package com.raj.dsa.binarysearch;

import java.util.List;

/**
 * @author Rajkumar
 *
 */
public class BinarySearch {
	
	public int search(List<Integer> list, int target) {
		int resultIndex=-1;
		int lengthOfList=list.size();
		int first=0;
		int last=lengthOfList-1;
		int midPoint=-1;
		int midPointValue;
		while(first<=last) {
			midPoint=(first+last)/2;
			midPointValue=list.get(midPoint);
			if(midPointValue == target) {
				resultIndex=midPoint;
				break;
			}else if(midPointValue<target) {
				first=midPoint+1;
			}else if(midPointValue > target) {
				last=midPoint-1;
			}
			
		}
				
		return resultIndex;
		
	}

}
