package day3;

import org.springframework.expression.AccessException;

public class Point {
	
	private static Point pObj;
	
	private Point() throws Exception {
		if(pObj!=null) {
		throw new AccessException("Cannot call constructor");
		}
	}

	public static Point getInstance() throws Exception {
		if(pObj== null) {
			return new Point();
		}else {
			return pObj;
		}
	}
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	/*@Override
	public String toString(){
		System.out.println(this);
		return x+ " "+ y;
	}*/
}
