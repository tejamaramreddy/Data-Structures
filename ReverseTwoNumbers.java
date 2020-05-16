
public class ReverseTwoNumbers {
	public static void ReverseTwoNumbers(int x, int y) {
		
			x = ( x + y) - (y = x);
		
		System.out.println(x +" "+ y);
		
		
	}
	 public static void main(String args[]){
		 int x = 120;
		 int y = 129;
		 ReverseTwoNumbers.ReverseTwoNumbers(x, y);
	    }

}
