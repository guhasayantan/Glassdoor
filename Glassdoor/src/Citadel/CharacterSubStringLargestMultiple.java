package Citadel;

public class CharacterSubStringLargestMultiple {

	public static void main(String[] args) {
		String input = "809723";
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < input.length()-3; i++)
		{
			String substring = input.substring(i,i+4);
			
			char[] numbers = substring.toCharArray();
			int mul =1;
			
			for(int j =0 ; j < numbers.length; j++)
			{
				int num = Character.getNumericValue(numbers[j]);
				
				mul = mul * num;
			}
			if(mul > max)
				max = mul;
		}
		System.out.println(max);

	}

}
