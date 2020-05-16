
public class gcd {
	public int GCD(int x, int y){
		if(y==0) {
			return x;
		}
		else
		return GCD(y,x%y);
		
	}
	public static void main(String[] args) {
		int x = 100;
		int y = 90;
		gcd GCD = new gcd();
		System.out.print(GCD.GCD(x, y));
	}

}
