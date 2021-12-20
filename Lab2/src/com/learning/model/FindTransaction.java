package com.learning.model;

public class FindTransaction {


	public int findtran(int[] arr, int tran_ach) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			sum +=arr[i];
			System.out.println(sum);
			if(sum >= tran_ach) {
				return i+1;
			}
		}
		return -1;
		
	}
}
