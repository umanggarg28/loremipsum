class SmallestNumber{
public static void main(String args[]){
int a = 1;
int b = 1;
	while(b<=20){
		if(a%b==0)
		b++;
		else{
		a++;
		b = 1;
		}		
	}
System.out.println(a);
}
}