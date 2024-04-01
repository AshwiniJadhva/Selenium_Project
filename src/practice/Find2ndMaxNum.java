package practice;

/*
 * Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 

Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
 */

public class Find2ndMaxNum {
	
	static void get2ndMaxNum(int arr[]) {
		int max = arr[0];
		int secongMax = arr[1];
		for(int index = 2;index<arr.length;index++) {
			if(arr[index]>max) {
				secongMax = max;
				max = arr[index];
			}
			else if(secongMax<arr[index]&& max!=arr[index]) {
				 secongMax = arr[index];
			}
		}
		System.out.println(max);
		System.out.println(secongMax);
	}
	
	static void maxNum(int arr[] ){
		int max = arr[0];
		for(int index = 0;index<arr.length;index++) {
			if(arr[index]>max) {
				max = arr[index];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,10,33,43,55,97,11,3,100,102,102};
		//Find2ndMaxNum.maxNum(arr);;
		Find2ndMaxNum.get2ndMaxNum(arr);
	}

}
