package in.amrvin.techiesplatform;

public class StringUtils {

	public static boolean isEmpty(String value) {
		boolean isValueEmpty = false;
		if (value == null || value.trim() == "") {
			isValueEmpty = true;
		}
		return isValueEmpty;
	}

	public static boolean isNotEmpty(String value) {
		return !isEmpty(value);
	}

}
