/**
 * 
 */
package com.raj.dsa.linearsearch;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.raj.dsa.test.datasets.Dataset;

/**
 * @author Rajkumar
 *
 */
class LinearSearchTest {

	@Test
	@DisplayName("Worst case - last element in array")
	void testWorstCase() {
		
		LinearSearch linearSearch=new LinearSearch();
		int result=linearSearch.search(Dataset.SEARCH_INPUT, 5);
		assertEquals(3, result);
	}
	
	@Test
	@DisplayName("Worst case - element not present in array")
	void testWorstCaseNotFound() {
		LinearSearch linearSearch=new LinearSearch();
		int result=linearSearch.search(Dataset.SEARCH_INPUT, 6);
		assertEquals(-1, result);
	}
	
	@Test
	@DisplayName("Best case - first element in array")
	void testBestCase() {
		LinearSearch linearSearch=new LinearSearch();
		int result=linearSearch.search(Dataset.SEARCH_INPUT, 1);
		assertEquals(0, result);
	}
	
	@Test
	@DisplayName("Average case - middle element in array")
	void testAverageCase() {
		LinearSearch linearSearch=new LinearSearch();
		int result=linearSearch.search(Dataset.SEARCH_INPUT, 3);
		assertEquals(2, result);
	}

}
