package com.java.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImpl {

	public static void main(String[] args) {
		Deque<Integer> q= new ArrayDeque<>();
		//element() method will throw NoSuchElementException on empty q
	//	q.element();
		System.out.println("Poll result: "+q.poll());
		System.out.println("Peek result: "+q.peek());
		q.add(5);
		//null should not be added as return value is null for poll if empty
		//Throws NullPointerException
		//q.add(null);
		System.out.println("size: "+ q.size());
		q.addFirst(3);
		q.addLast(6);
		System.out.println("Elements: ");
		q.forEach(System.out::println);
		System.out.println("Top element : "+q.element());
		System.out.println("After element() size is same i.e. "+q.size());
		System.out.println("Removing top element :"+ q.pollFirst());
		q.addFirst(32);
		System.out.println("Removing last element :"+ q.pollLast());
		q.push(45);
		q.offerFirst(126);
		q.add(32);
		q.add(45);
		q.offerLast(373);
		System.out.println("Inspecting top element :"+q.peekFirst());
		System.out.println("Inspecting last element :"+q.peekLast());
		q.removeFirstOccurrence(32);
		q.removeLastOccurrence(45);
		q.forEach(System.out::println);
	}

}
