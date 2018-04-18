
public class Date {
	
	private int month;
	private int day;
	private int year;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date aDate = new Date();
		aDate.setDate(04, 20, 1995);
		aDate.report();
	}
	
	public void setDate(int month, int day, int year){
		
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void report(){
		 System.out.println(month+"/"+day+"/"+year);
	}
}
