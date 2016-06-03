package bbpractice;

import java.util.Scanner;

public class P80025 {
	public static int mirror(String p){
		int flag = -1;
		for (int i =0; i <p.length()/2; ++i){
			char c = p.charAt(p.length()-1-i);
			if(p.charAt(i)==c){
				flag = 1;
			} else{
				flag = 0;
				break;
			}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		sc.nextLine();
		for (int j =0; j < repeat; ++j){
			String p = sc.nextLine();
			int flag = mirror(p);
			if (flag ==1){
				System.out.println("YES");
			} else{
				System.out.println("NO");
			}
			
		}

	}

}
