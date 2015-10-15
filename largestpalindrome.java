import java.util.Scanner;
import java.util.*;
class LargestPalindrome{
public static void main(String args[]){
int num = 0;
int k = 0;
int temp = 0;
int[] arr = new int[999];
boolean check = false;
int i,j;
	for(i=999;i>=1;i--){
		for(j=999;j>=1;j--){
		num=i*j;
		check = checkPalindrome(num);
		if(check){
		arr[k++] = num;
		temp = max(arr);
		break;
		}
		}
	}
System.out.println(temp);
}
public static boolean checkPalindrome(int num){
int rev = 0;
int rem;
int num1 = num;
while(num>0){
	rem = num % 10;
	rev = rev*10 + rem;
	num /= 10;
	}
if(num1 == rev)
return true;
else 
return false;
}
public static int max(int[] arr){
int max = arr[0];
	for(int i=1;i<arr.length;i++){
		if(arr[i]>max)
		max = arr[i];
	}
return max;
}
}
