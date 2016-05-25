package Citadel;
import java.math.BigDecimal;
import java.util.*;
public class SimpleMovingAverage {
	
	Queue<BigDecimal> q = new LinkedList<BigDecimal>();
	int count =0;
	BigDecimal sum = BigDecimal.ZERO;
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		SimpleMovingAverage obj = new SimpleMovingAverage();
		for(int i=0; i < arr.length; i++)
		{
			obj.add(BigDecimal.valueOf(arr[i]));
			System.out.println("The average is " + obj.average());
		}
		
		
	}
	public void add(BigDecimal num)
	{
		sum = sum.add(num);
		q.add(num);
		if(q.size() > 3)
		{
			sum = sum.subtract(q.remove());
		}
		
	}
	public BigDecimal average()
	{
		if(q.isEmpty())
			return BigDecimal.ZERO;
		BigDecimal divisor = BigDecimal.valueOf(q.size());
		return sum.divide(divisor);
	}
	
}
