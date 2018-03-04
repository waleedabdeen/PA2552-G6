package calc;

public class CalculatorMain {
	public CalculatorMain(){

	}
	public int add(int a, int b){
		return a+b;
	}

	public int sub(int a, int b){
		return a-b;
	}

	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b){
		if(b == 0) {
			return 0;
		}else {
			return a/b;
		}
	}

	public double squareRoot(int a) {
		if (a < 0) {
			return 0;
		}
		return Math.sqrt(a);
	}


	/*Adding new function */

	double power(int a, int b){
		double answer =a;

		if(b==0){
			return 1;
		}else if(b==1)
		{
			return a;

		}else {

			for (int x=2; x<=Math.abs(b); x++){
				answer *= a;
			}
			
			if(b<0){
				return 1/answer;
			}
			
		}
		return answer;
	}
	
	double log(int a, int b) {
		if(a>0 && a!=1 && b>0 && b!=1) {
			return Math.log(a)/Math.log(b);
		}else return 0;	
	}
}
