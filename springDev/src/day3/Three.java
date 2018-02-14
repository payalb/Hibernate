package day3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Three {
	
	private Point pointA, pointB, pointC;

	public Point getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return (Point) Class.forName("day3.Point").newInstance();
	}
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

	@PreDestroy
	 public void destroy() throws Exception {
			System.out.println("Three destroyed...");
			
		}
	 @PostConstruct
	 public void init() throws Exception {
			System.out.println(" Three init method called...");
			
		}

	 
}
