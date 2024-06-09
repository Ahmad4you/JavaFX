package ex1;

public class CalcPlus implements Calc1{
	@Override
	public int Add(int num1, int num2) {
		System.out.println("CalcPlus!!");
		
		return num1 + num2;
	}
	@Override
	public int Sub(int num1, int num2) {
		System.out.println("CalcPlus!!");
		
		return num1 - num2;
	}
	
}
