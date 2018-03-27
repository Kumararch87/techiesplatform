package main.java.in.amrvin.techiesplatform.ds.search;

public class LinearSearch implements ISearch {

	@Override
	public int linearSearch(int[] listOfValue, int findValue, boolean isFirstOccur) {
		int presentPos = -1;
		for (int pos = 0; pos < listOfValue.length; pos++) {
			if (listOfValue[pos] == findValue) {
				presentPos = pos;
				if (isFirstOccur) {
					return presentPos;
				}
			}
		}
		return presentPos;
	}

	public int linearSearch(int[] listOfValue, int findValue) {
		return linearSearch(listOfValue,findValue,true);
	}

}
