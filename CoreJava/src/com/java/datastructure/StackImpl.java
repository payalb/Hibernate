package com.java.datastructure;

import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<>();
		System.out.println(stack.isEmpty());
		//If stack is empty and we do pop, should throw exception
		//stack.pop();	//Throws EmptyStackException as empty
		//stack.peek();   //Throws EmptyStackException as empty
		stack.push(2);
		stack.push(14);
		stack.push(60);
		stack.push(4);
		stack.push(6);
		//null allowed
		stack.push(null);
		stack.push(null);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		stack.add(5);
		System.out.println(stack.size());
		//searches how far the element is from the top
		System.out.println(stack.search(4));
	}

}
