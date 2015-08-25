import java.util.HashMap;
import java.util.Scanner;  
public class Hello
{
	public static void main(String[] args)
	{        

	     @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int s=0;
		int a[]=new int[8]; 
		for(int i=0;i<8;i++)
			a[i]=sc.nextInt();
	  	s=sc.nextInt();
	    printSumPairs(a,s);        

	}


	public static void printSumPairs(int []input, int k)
	{
		//System.out.println(k);
	    HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();

	    for(int i=0;i<input.length;i++){

	        if(pairs.containsKey(input[i]))
	            System.out.println(input[i] +", "+ pairs.get(input[i]));
	        else
	            pairs.put(k-input[i], input[i]);
	    }

	}


}
