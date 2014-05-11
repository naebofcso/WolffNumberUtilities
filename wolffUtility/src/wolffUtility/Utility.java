package wolffUtility;
import java.util.Scanner;
import java.lang.Math;

public class Utility 
{

	public static void main(String[] args) {
		System.out.println("Enter number of numbers");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		double[] inputArray = new double[length];
		System.out.println("Enter in the numbers with a space in between");
		inputArray = fillArray(inputArray);
		System.out.println("Enter what you want to do with these numbers");
		String operation = input.next();
		if(operation.equals("beerslaw"))
		{
			beersLaw(inputArray);
		}
	}

	public static double[] fillArray(double[] inputArray) 
	{
		Scanner numInput = new Scanner(System.in);
		for(int i = 0; i < inputArray.length; i++)
		{
			inputArray[i] = numInput.nextDouble();
		}
		return inputArray;
	}

	public static void beersLaw(double[] inputArray) 
	{
		for(int i = 0; i < inputArray.length; i++)
		{
			System.out.println(-Math.log10(inputArray[i]/100));
		}
		
	}

}
