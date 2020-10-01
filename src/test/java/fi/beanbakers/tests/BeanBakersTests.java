package fi.beanbakers.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Some examples and asserts on some basic programming problems.
 * 
 * @author Peter
 */
public class BeanBakersTests {

	@Test
	public void testReverseList() {
		List<String> input = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
		List<String> expectedResult = Arrays.asList("g", "f", "e", "d", "c", "b", "a");

		List<String> result = doReverseList(input);
		Assert.assertArrayEquals(expectedResult.toArray(new String[expectedResult.size()]),
				result.toArray(new String[result.size()]));
	}

	/**
	 * Write your method here that returns the provided input list reversed.
	 * 
	 * @param input list
	 * @return provided list reversed
	 */
	private <T> List<T> doReverseList(List<T> input) {
		
		List<T> uusilista = new ArrayList<T>();
		//nyt lisää uuteen listaan kääntäen arvot input parametrista
		for (int i = input.size() ; i != 0; i--) {
			uusilista.add(input.get(i -1));
			}
		System.out.print(uusilista);
		return uusilista;
	}

	@Test
	public void testFibonacciSequence() {
		int sequenceLength = 8;
		int[] expectedResult = { 1, 1, 2, 3, 5, 8, 13, 21 };
		int[] result = doFibonacciSequence(sequenceLength);
		Assert.assertArrayEquals(expectedResult, result);
	}

	/**
	 * Write your method here that returns the fibonacci sequence up to the provided
	 * sequence length.
	 * 
	 * @param sequenceLength the amount of fibonacci sequence items to calculate
	 * @return int array containing the calculated fibonacci sequence
	 */
	private int[] doFibonacciSequence(int sequenceLength) {
		
		int[] loppulista = new int[sequenceLength];
		int ykkosarvo = 1;
		int kakkosarvo = 0;
		
		for (int i = 0; i < sequenceLength; i++) {
			loppulista[i] = ykkosarvo + kakkosarvo;
			ykkosarvo = kakkosarvo;
			kakkosarvo = loppulista[i];
		}
		
		
		return loppulista;
	}

	@Test
	public void testAscendingAndDescendingSeries() {
		List<Integer> testSeriesA = Arrays.asList(1, 2, 5, 8, 15, 27, 31, 50);
		List<Integer> testSeriesB = Arrays.asList(1, 2, 1, 8, 7, 27, 31, 50);

		Assert.assertTrue(isAscendingSeries(testSeriesA));
		Assert.assertFalse(isAscendingSeries(testSeriesB));
		Assert.assertTrue(isDescendingSeries(doReverseList(testSeriesA)));
		Assert.assertFalse(isDescendingSeries(doReverseList(testSeriesB)));
	}

	/**
	 * Write your method here that returns true if the provided list of integers is
	 * ascending, false otherwise.
	 * 
	 * @param series
	 * @return true if provided series ascends, false otherwise.
	 */
	private boolean isAscendingSeries(List<Integer> series) {
		
		for (int i = 1; i < series.size(); i++) {
			
				if (series.get(i - 1) >= series.get(i)) {
					return false;
			}
		}
		
		return true;
	}

	/**
	 * Write your method here that returns true if the provided list of integers is
	 * descending, false otherwise.
	 * 
	 * @param series
	 * @return true if the provided series descends, false otherwise.
	 */
	private boolean isDescendingSeries(List<Integer> series) {
		
		for (int i = 1; i < series.size(); i++) {
			
			if (series.get(i - 1) <= series.get(i)) {
				return false;
		}
		}
	
		return true;
	}
}
