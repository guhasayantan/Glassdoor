package Citadel;

public class PossibleCountToptoBottonCorner {

	public static void main(String[] args) {
		System.out.print("The number of possible path from top left to botton right: "+ returnpath(8, 8));

	}
	public static int returnpath(int m, int n)
	{
		if(m==1 || n ==1)
			return 1;
		return returnpath(m-1, n) + returnpath(m, n-1);
	}

}
