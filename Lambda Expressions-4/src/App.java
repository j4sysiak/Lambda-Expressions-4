interface Executable {
	int check();
}

class Runner {
	
	public void run(Executable e){
		System.out.println("Executing code block ...");
		int value = e.check();
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
			public int check() {
				System.out.println("check: Hello there.");
				return 1;
			}
 
			}
					 );
		
		System.out.println("==================Lambda (java 1.8)======================");
	 
		runner.run(/*implementing object interface Executable*/ 
					() -> {
							System.out.println("Lambda expression2");
							System.out.println("Lambda expression3");
							return 2;
						  } 
				  );
		
		
		runner.run(/*implementing object interface Executable*/ 
				() -> 3 
			  );
  
	}

}
