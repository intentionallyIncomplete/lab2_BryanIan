import java.util.Arrays;

/** for Class Design - IntList  */

public class IntList {

	private int numElements = 0;
	private int[] data = new int[100];

	public void add(int n) {
		data[numElements++] = n;
	}

	public String toString() {

		String retVal = "";

		if (data.length > 0) {
			StringBuilder sb = new StringBuilder();

			for (int i=0;i<numElements;i++) {
				sb.append(data[i]).append(",");
			}

			//this removes the comma that's added at the end
			retVal = sb.deleteCharAt(sb.length() - 1).toString(); 
		}
		return retVal;
	}//end toString method

	public int sum(){
		int theSum = 0;
		for(int a=0;a<numElements;a++){
			theSum += data[a];
		}
		return theSum;
	}

	public int indexOf(int target){
		for (int b=0; b<data.length; b++)
		{
			if (data[b] == (target)){
				return b;
			}
		}
		return -1;
	} 

	public static void main(String[] args) {
		IntList a = new IntList();
		a.add(95);
		a.add(100);
		a.add(58);
		System.out.println(a.toString());
		System.out.println(a.sum());
		System.out.println(a.indexOf(100)); 
		System.out.println(a.indexOf(20));
		//		System.out.println(a.save());
	}
}
