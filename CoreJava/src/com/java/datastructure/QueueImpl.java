package com.java.datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {		
		Queue<Integer> queue= new PriorityQueue<>();
		System.out.println(queue.isEmpty());
		/*//If stack is empty and we do poll, returns null
		System.out.println(queue.poll());	//returns null
		System.out.println(queue.peek());   //returns null
		System.out.println(queue.offer(2));
		System.out.println(queue.offer(14));
		System.out.println(queue.offer(60));
		System.out.println(queue.offer(4));
		System.out.println(queue.offer(6));
		//null not allowed for priotity queue , gives null pointer exception
		//System.out.println(queue.offer(null));
		//System.out.println(queue.offer(null));
		System.out.println(queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.size());
		queue.add(5);
		System.out.println(queue.size());
		//no method to search how far the element is from the top
*/		System.out.println("---------");
		for(int i=1; i<1000;i++){
			int val= (int) (Math.random()*10);
		
		queue.offer(val);
		}
		Iterator<Integer> it= queue.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
