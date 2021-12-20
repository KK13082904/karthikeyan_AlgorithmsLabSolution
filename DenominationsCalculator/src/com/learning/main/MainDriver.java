package com.learning.main;

import java.util.Scanner;

import com.learning.model.DenominationsSorting;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		DenominationsSorting den_obj = new DenominationsSorting();
		
		System.out.println("Enter the size of the currency denominations");
		int num_ele = obj.nextInt();
		int[] tot_arr = new int[num_ele];
		int[] pays = new int[num_ele];
		
		System.out.println("Enter the currency denomination value");
		for (int i = 0; i < num_ele; i++) {
			tot_arr[i] = obj.nextInt();
		}
		
		//Sorting array
		den_obj.mergerSort(tot_arr, 0, tot_arr.length-1);
		
		for (int i = 0; i < num_ele; i++) {
			System.out.print(tot_arr[i]);
		}
		
		
		//int [] tot_arr= {123,18,12,5};
		//int [] pays= {0,0,0,0};
		System.out.println("Enter the amount you want to pay");
		int amount = obj.nextInt();
		//int amount = 153;
		
		boolean status = false;
		int count=0;
		int bal=0;
		int cal=0;
		
		for (int i = 0; i < tot_arr.length; i++) {
			bal = amount - cal;
			count = 0;
			status = false;
			while(status == false) {
				count++;
				if((tot_arr[i]*count)> bal) {
					break;
				}
			}
			count--;
			cal=cal+(tot_arr[i]*count);
			pays[i]=count;
			if(cal >= amount) {
				break;
			}
		}
		if(cal == amount) {
			for (int i = 0; i <pays.length ; i++) {
				if(pays[i] > 0) {
					System.out.println(tot_arr[i]+":"+pays[i]);
				}
			}
		}else {
			System.out.println("Cant get exact denomination");
		}
		obj.close();
		
	}

}
