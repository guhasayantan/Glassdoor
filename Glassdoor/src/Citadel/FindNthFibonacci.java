package Citadel;

public class FindNthFibonacci {
	public static void main(String[] args) {
				
		nthFibonacci(9);
	}
	public static void nthFibonacci(int n)
	{
		int first = 1;
		int second = 1;
		int third = 0;
		for(int i = 3; i <= n; i++)
		{
			third = first + second;
			first = second;
			second = third;
			
		}
		System.out.print(third);
	}
}
