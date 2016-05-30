package Citadel;

public class ConvertStringtoInteger {

	public static void main(String[] args) {
		System.out.println("The number is "+ stringtoint("-982891"));

	}
	public static int stringtoint(String s)
	{
		boolean isNegative = false;
		int i = 0 , number = 0;
		if(s.charAt(0)=='-')
		{
			isNegative = true;
			i = 1;
		}
		for( ; i < s.length(); i++)
		{
			number = number * 10;
			number += ( s.charAt(i) - '0' );
		}
		if( isNegative )
	        number = -number;
	    return number;
	}

}
