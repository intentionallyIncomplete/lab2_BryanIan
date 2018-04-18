
public class Point2D {

	//class variables set to private integers
	private int x;
	private int y;

	//getters
	public int getX() {	return x;	}
	public int getY() {	return y;	}

	//setters
	public void setY(int nY) {	this.y = nY;	}
	public void setX(int nX) {	this.x = nX;	}

	public void resetToOrigin(){
		this.setX(0);
		this.setY(0);
	}

	public void translate(int dx, int dy){
		this.setX(dx+x);
		this.setY(dy+y);
	}

	public String toString(){
		return "x= "+x+ ", y= "+y;
	}

	public boolean equals(Point2D that){
		if(this.y < that.y) return false;
		if(this.y > that.y) return false;
		if(this.x < that.x) return false;
		if(this.x > that.x) return false;
		return true;
	}

	public static void main(String[] args) {
		Point2D a = new Point2D();
		a.setX(5);
		a.setY(2);
		System.out.println("point at (" + a.getX() + "," + a.getY());
		a.translate(-1,-1);
		System.out.println("Point at (" + a.getX() + "," + a.getY());
		a.resetToOrigin();
		System.out.println("Point at (" + a.getX() + "," + a.getY());
		Point2D b = new Point2D();
		Point2D c = new Point2D();
		System.out.println(b.toString());
		System.out.println(c); //Question: why don’t I need c.toString() here?
		/*
		 * Answer to question above:
		 * the .toString method here is not needed because
		 * the object (c) contains a state that converts
		 * the integers to a string.
		 */
		System.out.println("Are b and c equal:" + b.equals(c));
	}

}
