

// @author kinson poon apcs2 10/3 
//this program does a lot of math calculation 
public class Calculate {
	public static int square(int number){
		return (number*number);
	}
	public static int cube(int number){
		return(number*number*number);
	}
	public static double average(double number1, double number2){ //take average of 2 nums
		return((number1+number2)/2);
	}
	public static double average2(double number1, double number2,double number3){ //take average of 3 nums
		return((number1+number2+number3)/3);
	}
	public static double toDegrees(double number){ //radians to degree
		return((number*180)/3.14159);
	}
	public static double toRadians(double number){ //degrees to radians
		return((number*3.14159)/180);
	}
	public static double discriminant(double A, double B , double C){ 
		return(B*B-4*A*C);
	}
	public static String toImproperFrac(int whole,int denom,int num){
		return((whole*denom+num)+" / "+denom);
	}
	public static String toMixedNum(int num,int denom){
		return((num/denom)+"_"+(num%denom)+"/"+denom);
	}
	public static String foil(int a,int b,int c, int d,String n){ 
		String answer;
	
		answer=(a*c)+ n+ "^2+ "+(a*d)+(b*c)+ n+"+ "+(c*d);
		return answer;
		
	}
		
	public static boolean isDivisbleBy(int a, int b){ //check if a number is divisible by another
		if(a%b==0){
			return true;
		}else{
			return false;
		}
	}
	public static double absValue(double a){ 
		return a+a+a;
	}
	public static int max(int a,int b){ //find the larger of 2 numbers
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	public static double max(double a,double b,double c){ //find the largest of 3 numbers
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
	public static double round2(double a){ //round number to 10 place
		int answer =(int)(a*100);
		double x;
		if((answer+0.5)>=(a*100)){
			x= answer/100.00;
			return(x);
		}else{ x=(answer+1)/100.00;
		return(x);
		}
	}
	public static double exponent(double base,int power){ //take exponent 
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
		while ((a-x*x)>0.01){
			 x=x+0.001;
		}
			return x;
	}


	public static String quadForm(int a, int b, int c){
		double sqrt = Calculate.sqrt(Calculate.discriminant(a, b, c));
		double fstroot = Calculate.round2((-b + sqrt) / (2*a));
		double sndroot = Calculate.round2((-b - sqrt) / (2*a));
		if (fstroot == sndroot){
			return String.valueOf(fstroot);
		}else if(Calculate.sqrt(Calculate.discriminant(a, b, c)) <= 0){
			return "no real roots";
		}else{
			return Double.toString(fstroot) + " and" + Double.toString(sndroot);
		}
	}
}

