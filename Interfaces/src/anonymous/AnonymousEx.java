package anonymous;



public class AnonymousEx {

	public static void main(String[] args) {
	/**
	*	Anonymous with interface
	*
	*	
	*/	
//		IEmp e = new IEmp() {
//			
//			@Override
//			public void printName() {
//				System.out.println("Wilken");
//			}	
//			
//		};
//		e.printName();
		
		/**
		 * Anonymous with Class
		 */
		
//		Emp p = new Emp() {
//			@Override
//			public void printInfos() {
//				System.out.println("Ahmad");
//				System.out.println("30");
//				System.out.println("Ulm");
//			}
//		};
//		p.printInfos();
		
//		new Emp() { }.printInfos();
		
//		new Emp() {
//			@Override
//			public void printInfos() {
//				System.out.println("Ahmad");
//				System.out.println("30");
//				System.out.println("Ulm");
//			}
//		}.printInfos();
		
		
		/**
		 * Object Without Name as Parameter
		 */
//		Myprint(new Emp());
		
		/**
		 * Anonymous as a parameter
		 * 
		 */
		
//		Emp e = new Emp() {
//			@Override
//			public void printInfos() {
//				System.out.println("Anonymous as a parameter 1");
//			}
//		};
//			
//		Myprint(e);
		
		
		/**
		 * or
		 */
	
//		Myprint(new Emp() {
//			@Override
//			public void printInfos() {
//				System.out.println("Anonymous as a parameter 2");
//			}
//		});
		
	}
	public static void Myprint(Emp emp) {
		emp.printInfos();
	}

}
