class GreatestPrimeFactor{
public static void main(String args[]){
long num = 600851475143l;
long i, max = 0l;
boolean check = false;
	for(i=1;i<=num;i++){
		if(num%i==0){
		check = checkPrime(i);
			if(check)
			max=i;
		}
	}
System.out.println(max);
}
public static boolean checkPrime(long j){
for(long k=2;k<j;k++){
	if(j%k==0)
	return false;
}
return true;
}
}

