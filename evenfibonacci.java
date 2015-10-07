class EvenFibonacci{
public static void main(String []args){
int a = 0;
int b = 1;
int sum = 0;
	for(int i=1; i<=4000000; i++){
	int c=a+b;
		if(c%2==0){
		sum+=c;
		}
	a=b;
	b=c;
	}
System.out.println(sum);
}
}