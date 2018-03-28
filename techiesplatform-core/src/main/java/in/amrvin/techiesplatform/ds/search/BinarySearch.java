package in.amrvin.techiesplatform.ds.search;

public class BinarySearch implements ISearch {

	@Override
	public int search(int[] listOfValue, int findValue, boolean isFirstOccur) {
		if (listOfValue != null) {
			int startPos = 0;
			int endPos = listOfValue.length - 1;
			if (startPos == endPos) {
				if (listOfValue[startPos] == findValue) {
					return startPos;
				}
			}
			while (startPos <= endPos) {
				int mid = (startPos + endPos) / 2;
				if (listOfValue[mid] == findValue) {
					return mid;
				}
				if (listOfValue[mid] > findValue) {
					endPos = mid ;
				}
				if (listOfValue[mid] < findValue) {
					startPos = mid + 1;
				}
			}
		}
		return -1;
	}

}
