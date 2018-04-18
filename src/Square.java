
public class Square {
	
	private int x;
	private int y;
	private double sideLength;
	private String theShape = "[]";
	
	public Square(){
		//no arguments here
	}
	
	public Square(int nX, int nY){
		x = nX;
		y = nY;
	}

	public Square(int nX, int nY, double sideSize){
		x = nX;
		y = nY;
		sideLength = sideSize;
	}
	
	public void draw(){
		System.out.println(theShape);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int nX){
		this.x = nX;
	}
	
	public void setY(int nY){
		this.y = nY;
	}

	public int getY() {
		return y;
	}

	public double getSideLength() {
		return sideLength;
	}
	
	public void setSideLength(int sl){
		this.sideLength = sl;
	}
	
	public double getArea(int sideLength) {
		return sideLength * sideLength;
	}
	
	public String toString(){
		return "x= "+x+ ", y= "+y;
	}

	public boolean equals(Square that){
		if(this.x == that.x) return false;
		if(this.y == that.y) return false;
		if(this.sideLength > that.sideLength) return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
