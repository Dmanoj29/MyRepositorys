package mod1;

import java.util.Scanner;

public class problem4 {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9};
		//int arr1[]=new int[] {1,2,3,4,5,6,7,8,9,1,2};
		
		System.out.println("Enter the number of elements");
		
		
		Scanner sc = new Scanner(System.in);  
		int[] string = new int [sc.nextInt()];      
		
		System.out.println("enter the elements:");
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextInt();  
		}  
		sc.close();
		
		for(int i=0;i<arr.length;i++)
		{
			int co=0;
			
			for(int j=0;j<string.length;j++)
			{
				if(string[j]%arr[i]==0)
				{
					co++;
				}
			}
			System.out.println(arr[i]+":"+co);
			
		}
	}

}
