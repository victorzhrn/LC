
public class SimpleTest {
	
	public static void main (String[] args){
		int x = 5;
		System.out.println((x));
		System.out.println(Integer.toBinaryString(x));
		
		int y = x<<1;
		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));
		
		int z = y>>2;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
		int xx = x & x;
		System.out.println("101 and 101: " + Integer.toBinaryString(xx));
		
		int yy = y ^ y;
		System.out.println("1010 ir 1010: " + Integer.toBinaryString(yy));
		
		x = 7;
		int xy = x^y;
		System.out.println(x+" xor "+ y+" = "+xy);
		
		System.out.println("-1 binary: " + Integer.toBinaryString(-1));
	}

}
