//Program on primitive datatype integer
public class PrimitiveDataInt {
	public static void main(String[] args) {
		int max = 2147483647;
		int min = -2147483648;
		short shortMax = 32767;
		short shortMin = -32768;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		System.out.println("shortMax: "+shortMax);
		System.out.println("shortMin: "+shortMin);
		System.out.println("longMax: "+longMax);
		System.out.println("longMin: "+longMin);
		System.out.println("byteMax: "+byteMax);
		System.out.println("byteMin: "+byteMin);
		
	}
}
/* output:- shortMin: -32768
longMax: 9223372036854775807
longMin: -9223372036854775808
byteMax: 127
byteMin: -128 */