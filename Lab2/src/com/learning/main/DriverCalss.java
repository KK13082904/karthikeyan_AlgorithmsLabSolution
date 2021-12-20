package com.learning.main;

import java.util.*;
import com.learning.model.FindTransaction;

public class DriverCalss {
	
	public static void main(String[] args) {
		
		int tran, targ, tran_ach;
		int arr[] = null;
		
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		FindTransaction fin_obj = new FindTransaction();
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the transaction arry");
		
		tran = obj.nextInt();
		arr = new int[tran];
		
		System.out.println("Enter the array val- ");
		for(int i = 0; i < tran; i++) {
			arr[i]= obj.nextInt();
			
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		targ = obj.nextInt();
		for(int i=1;i<=targ;i++) {
			System.out.println("Enter the value of target");
			tran_ach=obj.nextInt();
			int temp = fin_obj.findtran(arr,tran_ach);
			if(temp==-1) {
				System.out.println("Tareget not matched");
			}else {
				System.out.println("Tareget achived after "+temp+" transaction");
			}
		}
		
	}

}
