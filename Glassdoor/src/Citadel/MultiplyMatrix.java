package Citadel;

public class MultiplyMatrix {

	public static void main(String[] args) {
		double[][] A = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
						};
		double[][] B = {
				{7, 8, 9},
				{4, 5, 6},
				{1, 2, 3}
				
				
						};
		double[][] C = multiply(A, B);
		for(int i = 0; i<C.length; i++)
		{
		    for(int j = 0; j<C[i].length; j++)
		    {
		        System.out.print(C[i][j] + " ");
		    }
		    System.out.println();
		}

	}
	public static double[][] multiply(double[][] A, double[][] B) {
        int mA = A.length;
        int nA = A[0].length;
        int mB = B.length;
        int nB = B[0].length;
        if (nA != mB) throw new RuntimeException("Illegal matrix dimensions.");
        double[][] C = new double[mA][nB];
        for (int i = 0; i < mA; i++)
            for (int j = 0; j < nB; j++)
                for (int k = 0; k < nA; k++)
                    C[i][j] += A[i][k] * B[k][j];
        return C;
    }

}
