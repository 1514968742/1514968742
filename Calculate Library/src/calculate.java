/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class calculate {
	public static int square(int number){
		return (number*number);
	}
	public static int cube(int number){
		return(number*number*number);
	}
	public static double average(double number1, double number2){
		return((number1+number2)/2);
	}
	public static double average2(double number1, double number2,double number3){
		return((number1+number2+number3)/3);
	}
	public static double toDegrees(double number){
		return((number*3.14159/180));
	}
	public static double toRadians(double number){
		return((number/3.14159*180));
	}
	public static double discriminant(double A, double B , double C){
		return(B*B-4*A*C);
	}
	public static int toImproperFrac(int A,int B,int C){
		A=3;
		B=1;
		C=2;
		int top=A*C+B;
		int bot=C;
		return bot;
	}
	public static int toMixedNum(int numb1,int numb2){
		String imProFra;
		(int)imProFra= ((numb1)/2);
	}
	public static String foil(int a,int b,int c, int d){
		String answer;
	
		answer=(a*b)+"x^2"+(a*d)+(b*c)+"x"+(c*d);
		return answer;
		
	}
		
	public static boolean isDivisbleBy(int a, int b){
		if(a%b==0){
			return false;
		}else{
			return true;
		}
	}
	public static double absValue(double a){
		Math.abs(a);
		return a;
	}
	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	public static double max2(double a,double b,double c){
		if (a > b && a > c){
			return a;
		}else if(b > a && b> c){
			return b;
		}else{
			return c;
		}
	}
	public static int min(int a,int b){
		if (a<b){
			return a;
		}else{
			return b;
			
		}
	}
	public static double round2(double a){
		double b=(int)b*100+0.5;
		double answer = b/100;
		return answer;
	}
	public static double exponent(double a,int b){
		int answer =1;
		for(int i =1 ;i<= b;i++){
			answer*=a; }
			return answer;
	}
	public static int factorial(int a){
		int answer =1;
		for (int i=1; i<=a;i++){
			answer*=a;
			return answer;
		}
	}
	public static boolean isprime(int a){
		for(int i=2;i<a;i++) {
			if(a%i==0){
				return false;
			}else{
				return true;
		}
	}
	public static


