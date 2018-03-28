package in.amrvin.techiesplatform.ds.search;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BinarySearchTest {
	
	BinarySearch binarySearch;
	
	@Before
	public void before()
	{
		binarySearch = new BinarySearch();
	}

	@Test
	public void testEmptyList() {
		Assert.assertEquals(-1, binarySearch.search(null, 5, false));
	}
	
	@Test
	public void testSingleList() {
		int customerIdList[] = {5};
		Assert.assertEquals(0, binarySearch.search(customerIdList, 5, false));
	}
	@Test
	public void testWithTwoList() {
		int customerIdList[] = {3,5};
		Assert.assertEquals(1, binarySearch.search(customerIdList, 5, false));
	}
	@Test
	public void testWithTwoList_1() {
		int customerIdList[] = {3,5};
		Assert.assertEquals(0, binarySearch.search(customerIdList, 3, false));
	}
	
	@Test
	public void testWithNList_1() {
		int customerIdList[] = {3,5,8,7,9,22,33,55,67,87};
		Assert.assertEquals(6, binarySearch.search(customerIdList, 33, false));
	}
	
	@Test
	public void testWithNList_2() {
		int customerIdList[] = {3,5,8,7,9,22,33,55,67,87};
		Assert.assertEquals(7, binarySearch.search(customerIdList, 55, false));
	}
	
	@Test
	public void testWithNList_3() {
		int customerIdList[] = {3,5,8,7,9,22,33,55,67,67,67,67,87};
		Assert.assertEquals(7, binarySearch.search(customerIdList, 67, false));
	}
}
