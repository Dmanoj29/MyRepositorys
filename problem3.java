package mod1;

import java.util.Scanner;

public class problem3 {
public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter  numbers");
		int a=0;
		a=s1.nextInt();
		
		if(a%2==0)
			a=a-1;
		
		

		for(int i=1;i<=a+a;i++ ) {
			if(i%2==1)
			{
				System.out.println(i);
							
			}
			}
		}
		
}
