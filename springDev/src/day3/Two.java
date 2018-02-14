package day3;

public class Two {
	
	private Point pointA, pointB, pointC;

	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	 public void print(){
		 System.out.println(pointA+ " "+ pointB+" "+ pointC);
	 }

	 public void destroy() throws Exception {
			System.out.println("disposable bean destroyed...");
			
		}
	 public void init() throws Exception {
			System.out.println("Initializing beans init method called...");
			
		}



}
