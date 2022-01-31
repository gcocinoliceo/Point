package P1;

public class Point {
	private int x;	
	private int y;
	
	public Point() {
		x=0;
		y=0;
	}
	
	public Point(int input_x, int input_y) {
		x=input_x;
		y=input_y;
	}
	
	public void setX(int input_x) {
		x=input_x;
	}
	
	public void setY(int input_y) {
		y=input_y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void trasla(int dX, int dY) {
		x+=dX;
		y+=dY;
	}
	
	public double distanza(int x2, int y2) {
		return Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2));
	}

	public String toString(int inputX, int inputY) {
		String stringX = String.valueOf(inputX);
		String stringY = String.valueOf(inputY);
		
		return "x = "+stringX+", y = "+stringY;
	}

}
