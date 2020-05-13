package com.javapractice.stringexamples;

public class SumofDigitsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a java code to find the sum of the given numbers Input:
		 * "asdf1qwer9as8d7" output: 1+9+8+7 = 25
		 */
		
		// Approach-1
		
			String str = "asdf1qwer9as8d7";
			
			str = str.replaceAll("\\D", "");
			
			System.out.println(str);
			int intNumber = Integer.parseInt(str);
			
			int sum = 0;
			
			while(intNumber>0)
			{
				int rem = intNumber%10;
				intNumber = intNumber/10;
				sum = sum+rem;
			}
			
			System.out.println("Sum of numbers = "+sum);
		

		
		
		//Approach -2 
			String st = "asdf1qwer9as8d7";
			
			st = st.replaceAll("[^0-9]", "");
			
			System.out.println("After removing other than numbers is "+st);
			
			int num = Integer.parseInt(st);
			
			int sumof = 0;
			
			while(num>0)
			{
				int rem = num%10;
				num = num/10;
				sumof = sumof+rem;
			}
			
			System.out.println("Sum of numbers = "+sumof);
		}

}
