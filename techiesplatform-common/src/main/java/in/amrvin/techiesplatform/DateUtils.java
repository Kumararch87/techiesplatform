package in.amrvin.techiesplatform;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	private static final String STANDARD_FORMATE = "dd/MM/yyyy";

	public static Date getDate(String date) {
		Date localDate = null;
		try {
			DateFormat format = new SimpleDateFormat(STANDARD_FORMATE);
			localDate = format.parse(date);
		} catch (ParseException e) {

		}
		return localDate;
	}

	public static String getDateAsString(final Date date) {
		String localDate = null;
		SimpleDateFormat format = new SimpleDateFormat(STANDARD_FORMATE);
		localDate = format.format(date);
		return localDate;
	}
	
}
