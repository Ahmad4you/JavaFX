package ex1;

public class Calc implements Calc1, Calc2{
	
	@Override
	public int Add(int num1, int num2) {
		
		
		return num1 + num2;
	}
	@Override
	public int Sub(int num1, int num2) {
		
		
		return num1 - num2;
	}
	@Override
	public int Multi(int num1, int num2) {
		
		
		return num1 * num2;
	}
	@Override
	public int Div(int num1, int num2) {
		
		
		return num1 / num2;
	}
	@Override
	public int Modulo(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 % num2;
	}
}
