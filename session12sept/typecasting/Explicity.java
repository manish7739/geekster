package session12sept.typecasting;

public class Explicity {// also called Narrowing Type Casting(convert higher data type into lower datatype)
	public static void main(String []args) {
		double d=54667.456;
		int x= (int)d;
		System.out.println(x);
		
		float f=566.f;
		short s=(short)f;
		System.out.println(s);
	
		
		long l=5896370;
		byte b=(byte)l;
		System.out.println(b);
		
		int a=457;
		byte c=(byte)a;
		System.out.println(c);
		
		
	}

}
