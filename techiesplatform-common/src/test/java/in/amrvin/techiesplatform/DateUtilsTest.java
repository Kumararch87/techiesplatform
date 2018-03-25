package in.amrvin.techiesplatform;


import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DateUtilsTest {
	
	private DateUtils dateUtils;
	
	@Before
	public void before()
	{
		dateUtils = new DateUtils();
	}
	@Test
	public void testDateNotNull() {
		Date date = dateUtils.getDate("25/03/2018");
		Assert.assertNotNull(date);
	}
	@Test
	public void testDateFormatCorrect() {
		Date date = dateUtils.getDate("25/03/2018");
		Assert.assertEquals(dateUtils.getDateAsString(new Date()), date);
	}
}
