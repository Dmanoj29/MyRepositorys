package mod1;

import java.util.Scanner;

public class problem2 {
public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=0;
		a=s1.nextInt();
		for(int i=0;i<a+a;i++ ) {
			if(i%2==1)
			System.out.println(i);
		}
		
		}
}
