
public class Recursion {
	
	

	public static int fact(int n){


	if(n <= 1){
	
	return n;
	
	}else{
	
	return n * fact(n - 1);
	
	}	
	
	}
	
	public static void main(String[] args){
	
	System.out.println(Recursion.fact(3));

	}
}