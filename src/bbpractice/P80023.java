package bbpractice;

import java.util.Scanner;

public class P80023 {
	public static String deldhcar(String str, char c){

		for(int i=0; i < str.length() -1; ++i){
			if (str.charAt(i)==c){
				str = str.substring(0, i) + str.substring(i+1);
			}
			
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		sc.nextLine();
		for (int j =0; j < repeat; ++j){
			String str = sc.nextLine();
			char c = sc.next().charAt(0);
			deldhcar(str, c);
			System.out.println("result: " + str);
			
			
		}
	}

}
//不会做