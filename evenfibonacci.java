class EvenFibonacci{
public static void main(String []args){
double a = 0;
double b = 1;
double sum = 0;
	for(double i=1; i<=100; i++){
	double c=a+b;
		if(c%2==0){
		sum+=c;
		}
	a=b;
	b=c;
	}
System.out.println(sum);
}
}