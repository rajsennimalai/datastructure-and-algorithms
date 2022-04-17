/**
 * 
 */
package com.raj.dsa.binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.raj.dsa.test.datasets.Dataset;

/**
 * @author Rajkumar
 *
 */
class BinarySearchTest {

	@Test
	@DisplayName("Worst case - last element in array")
	void testWorstCase() {
		
		BinarySearch binarySearch=new BinarySearch();
		int result=binarySearch.search(Dataset.SEARCH_INPUT, 5);
		assertEquals(3, result);
	}
	
	@Test
	@DisplayName("Worst case - element not present in array")
	void testWorstCaseNotFound() {
		BinarySearch binarySearch=new BinarySearch();
		int result=binarySearch.search(Dataset.SEARCH_INPUT, 6);
		assertEquals(-1, result);
	}
	
	@Test
	@DisplayName("Best case - first element in array")
	void testBestCase() {
		BinarySearch binarySearch=new BinarySearch();
		int result=binarySearch.search(Dataset.SEARCH_INPUT, 1);
		assertEquals(0, result);
	}
	
	@Test
	@DisplayName("Average case - middle element in array")
	void testAverageCase() {
		BinarySearch binarySearch=new BinarySearch();
		int result=binarySearch.search(Dataset.SEARCH_INPUT, 3);
		assertEquals(2, result);
	}

}
