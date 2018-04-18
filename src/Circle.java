
public class Circle {
	
	private int x;
	private int y;
	private double radius;
	private String theShape = "O";
	
	public Circle(){
		//no arguments here
	}
	
	public Circle(int nX, int nY){
		x = nX;
		y = nY;
	}

	public Circle(int nX, int nY, double radiusSize){
		x = nX;
		y = nY;
		radius = radiusSize;
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

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(int sl){
		this.radius = sl;
	}
	
	public double getArea(int radius) {
		return 3.14 * (radius*radius);
	}
	
	public String toString(){
		return "x= "+x+ ", y= "+y;
	}

	public boolean equals(Circle that){
		if(this.x == that.x) return false;
		if(this.y == that.y) return false;
		if(this.radius > that.radius) return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
