package bbpractice;

import java.util.Scanner;

public class P80021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		
		for (int j =0; j <5; ++j){
			arr[j]= sc.nextLine();
		}
		String greatest = arr[0];
		for (int i =0; i < arr.length-1; ++i){
			
			int result = arr[i].compareTo(greatest);
			if(result > 0){
				greatest = arr[i];
			}
		}
		System.out.println("Max is: " + greatest);
	}

}
