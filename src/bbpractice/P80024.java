package bbpractice;

import java.util.Scanner;

public class P80024 {
	public static String strmcpy(String t, int m){
		String s="";
		if (t.length() > m){
		s = t.substring(m-1);
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		sc.nextLine();
		for(int i =0; i < repeat; ++i){
			String t = sc.nextLine();
			int m = sc.nextInt();

			String s = strmcpy(t,m);
			
			boolean flag = true;
			if (t.length() < m){
				System.out.println("error input");
				flag = false;
			}
			if ( flag = true){
				System.out.println(s);
			}
			sc.nextLine();
		}
	}

}
//不会
