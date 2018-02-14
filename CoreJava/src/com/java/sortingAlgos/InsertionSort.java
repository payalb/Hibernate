package com.java.sortingAlgos;



public class InsertionSort {

	public static void main(String[] args) {
		int[] array= {3,4,6,8,9,7,2,5,1};
		 
		for(int i=1; i<array.length; i++){
			for(int j=i-1; j>=0; j--){
				if(array[j+1]<array[j]){
					int swapVar= array[j+1];
					array[j+1]= array[j];
					array[j]= swapVar;
				}else{
					break;
				}
			}
		}
		System.out.println(array);
	}


}
