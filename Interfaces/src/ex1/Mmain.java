package ex1;

public class Mmain {

	public static void RunAdd(Calc1 c) {
		System.out.println( c.Add(4, 3)); 
	}
	
	public static void main(String[] args) {

		Calc c = new Calc();
		CalcPlus cp = new CalcPlus();
		System.out.println( c.Add(4, 3)); 
		
		RunAdd(c);
		RunAdd(cp);
	}

}
