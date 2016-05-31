package Citadel;

public class PowerFunction {

	public static void main(String[] args) {
		System.out.println("The value of the power :" + power(3,-1));

	}
	public static float power(float x, int y)
	{
	    float temp;
	    if( y == 0)
	       return 1;
	    temp = power(x, y/2);       
	    if (y%2 == 0)
	        return temp*temp;
	    else
	    {
	        if(y > 0)
	            return x*temp*temp;
	        else
	            return (temp*temp)/x;
	    }
	}  
}
