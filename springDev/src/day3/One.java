package day3;



import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class One /*implements InitializingBean, DisposableBean*/{
	
	private Point pointA, pointB, pointC;

/*	@Override
	public void afterPropertiesSet() throws Exception {
		
		 * Called when properties have been set.
		 
		System.out.println("Initializing beans init method called...");
		
	}
*/
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

	 public String toString(){
		 System.out.println(pointA+ " "+ pointB+" "+ pointC);
		return null;
	 }
	 /*
	  * Called before bean is getting destroyed
	  * (non-Javadoc)
	  * @see org.springframework.beans.factory.DisposableBean#destroy()
	  */
	 
	//@Override
	 @PreDestroy
	public void destroy() throws Exception {
		System.out.println("disposable bean destroyed...");
		
	}

}

 class Test{
	
	 public One print(){
		 return new One();
	 };
	
}