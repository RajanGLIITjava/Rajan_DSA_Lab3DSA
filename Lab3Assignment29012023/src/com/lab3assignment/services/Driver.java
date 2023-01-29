package com.lab3assignment.services;

import com.lab3assignment.services.BalancedCheck;

public class Driver {

	public static void main(String[] args) 
	{
		Boolean result1;
		Boolean result2;
		
		
		
		String str1 = "{([{}]())}"; // change the bracket pattern in the following str1 and str2 only
		String str2 = "{([{}]()}"; // change the bracket pattern in the following str1 and str2 only
		
		result1= BalancedCheck.CheckBalancedBrackets(str1);
		result2= BalancedCheck.CheckBalancedBrackets(str2);
		

		System.out.println(str1+" Brackets Balacing is: "+result1);
		System.out.println(str2+" Brackets Balacing is : "+result2);
		
	}

}
