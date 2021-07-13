package mod1;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter two numbers");
		double a=0,b=0;
		String type="+";
		a=s1.nextDouble();
		b=s1.nextDouble();
		
		type=s1.next();
		
		int lent=type.length();
		
		if(lent==0||lent>1)
		{
		System.out.println("invalid operator");
		}	
		
		if (lent==1 && type.charAt(0)=='+')
		{
			System.out.println(a+b);
		}
		
		if (lent==1 && type.charAt(0)=='-')
		{
			System.out.println(a-b);
		}
		
		if (lent==1 && type.charAt(0)=='*')
		{
			System.out.println(a*b);
		}
		
		if (lent==1 && type.charAt(0)=='/')
		{
			System.out.println(a/b);
		}
	
	}

}
