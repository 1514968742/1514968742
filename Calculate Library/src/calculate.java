/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
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
		return((number*180)/3.14159);
	}
	public static double toRadians(double number){
		return((number*3.14159)/180);
	}
	public static double discriminant(double A, double B , double C){
		return(B*B-4*A*C);
	}
	public static String toImproperFrac(int whole,int denom,int num){
		return((whole*denom+num)+" / "+denom);
	}
	public static String toMixedNum(int num,int denom){
		return((num+"/"+denom + "\t" + num%denom+"/"+ denom));
	}
	public static String foil(int a,int b,int c, int d){
		String answer;
	
		answer=(a*b)+"x^2"+(a*d)+(b*c)+"x"+(c*d);
		return answer;
		
	}
		
	public static boolean isDivisbleBy(int a, int b){
		if(a%b==0){
			return true;
		}else{
			return false;
		}
	}
	public static double absValue(double a){
		return a+a+a;
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
		double answer=(a*100)+0.5;
		answer = ((int)answer/100);
		return answer;
	}
	public static double exponent(double base,int power){
		double answer =1;
		for(int i =1 ;i<= power;i++){
			answer=base*answer; }
			return answer;
	}
	public static int factorial(int a){
		int answer=a;
		for (int i=a-1;i>1;i--){
			answer=(i*answer);
		}
		return answer;
	}
	public static boolean isPrime(int a){
		int numb=2;
		while(numb!=a){
			if(Calculate.isDivisbleBy(a, numb)==true){
				return false;
			}else{
				numb++;
			}	
		}
		return true;
	}

	public static int gcf(int a,int b){
		int c=Calculate.min(a, b);
		int d=Calculate.max(a, b);
		if(c==0){
			return d;
		}
		while(c!=0){
			c=d;
			c=d%c;
		}
		return d;
	}
	public static double sqrt(double a){
		double x=0;
		if(a<0){
			throw new IllegalArgumentException("can't square");
		}
		while ((a-x*x)>0.01){
			 x=x+0.001;
		}
			return x;
	}

}
	


