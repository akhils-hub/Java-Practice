package org.number_programs;

public class Conversion_String_Number {
	//Conversion_Stirng_Number
	public static void main(String[] args) {

		//Converting String to Number
		String s = "12340";
		//byte parseByte = Byte.parseByte(s);
		//short parseShort = Short.parseShort(s);
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);

		//long parseLong = Long.parseLong(s);
		//float parseFloat = Float.parseFloat(s);
		//double parseDouble = Double.parseDouble(s);


		//Converting Number to String
		int num = 0123;
		String string = Integer.toString(num);
		String valueOf = String.valueOf(num);
		System.out.println(string);
		System.out.println(valueOf);



		// Widening Casting(Automatically) = Converting a smaller type to a larger type size
		/**
		    bye > short > char > int > long > float > double
		 * */
		byte numByte = 10;
		int numInt = numByte;
		System.out.println(numInt);

		String s2 = "123";
		double parseInt3 = Integer.parseInt(s2);
		System.out.println(parseInt3);


		//Narrowing Casting (Manually) = Converting a larger type to a smaller type size
		//Must be done manually by placing data type  in parentheses infont of the

		/**
		    double > float > long > int > char > short > byte
		 * */
		int numInt1 = 12;
		byte numByte1 = (byte) numInt1;
		System.out.println(numByte1);


		String s3 = "123";
		byte parseInt2 = (byte) Integer.parseInt(s3);
		System.out.println(parseInt2);


	}

}
