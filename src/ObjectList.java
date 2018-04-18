/** for Class Design - IntList  */



public class ObjectList {

	private int numElements = 0;
	private Object[] myFractions = new Object[100];

	public void add(Object n) {
		myFractions[numElements++] = n;
	}

	public String toString() {

		String retVal = "";

		if (myFractions.length > 0) {
			StringBuilder sb = new StringBuilder();

			for (int i=0;i<numElements;i++) {
				sb.append(myFractions[i]).append(",");
			}

			//this removes the comma that's added at the end
			retVal = sb.deleteCharAt(sb.length() - 1).toString(); 
		}
		return retVal;
	}//end toString method
}
