package bbpractice;

import java.util.Scanner;

public class P80026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int upper=0, lower=0, blank=0, digit=0, other=0;
		for(int i =0; i < str.length(); ++i){
			char c = str.charAt(i);
			int flag = -1;
			if(c>='A' &&c<='Z'){
				++upper;
				flag = 1;
			}
			if(c>='a' && c<='z'){
				++lower;
				flag = 1;
			}
			if(c==' '){
				++blank;
				flag = 1;
			}
			if (c>='0' &&c<='9'){
				++digit;
				flag = 1;
			}
			if	(flag == -1){
				++other;
			}
		}
		System.out.println("upper: " + upper + " lower: "+ lower + " blank: " + blank + " digit: "+digit +" other: "+ other);
	}

}
