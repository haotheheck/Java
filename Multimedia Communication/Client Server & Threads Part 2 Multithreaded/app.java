package cs380v1;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {
		
		//creating a thread called fib and executed thread code
		FibSequence fib = new FibSequence();
		fib.start();


	}
	
	catch(Exception e){
			
		e.printStackTrace();
	}
	

	}

}
