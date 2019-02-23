interface Executable {
	int check(int a);
}

class Runner {
	
	public void run(Executable e){
		System.out.println("Executing code block ...");
		int value = e.check(12);
		System.out.println("Value: " + value*100);
	}
}

public class App {

	public static void main(String[] args) {

		Runner runner = new Runner();
		
		System.out.println("=================depricated (java 1.6 - 1.7)=======================");
		
		runner.run(
			/*implementing object interface Executable*/ new Executable() {
			 
			@Override
			public int check(int a) {
				System.out.println("check: Hello there.");
				return 1+a;   //1+12
			}
 
			}
					 );
		
		System.out.println("==================Lambda (java 1.8)======================");
	 
		runner.run(/*implementing object interface Executable*/ 
					(int a) -> {
							System.out.println("Lambda expression2");
							System.out.println("Lambda expression3");
							return a+2;
						  } 
				  );
		
		
		runner.run(/*implementing object interface Executable*/ 
				(int a) -> a+3 
			  );
		
		runner.run(/*implementing object interface Executable*/ 
				(int a) -> {
							return a+4;
							} 
			  );
  
	}

}
