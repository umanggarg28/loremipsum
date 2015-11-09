import java.util.*;
import java.util.Scanner;
class TestUniqueChars{
public static void main(String args[]){
boolean unique = false;
Scanner input = new Scanner(System.in);
System.out.println("Enter a String: ");
String s = input.nextLine();
unique = uniqueChars(s);
if(unique)
System.out.println("The String has unique characters.");
else
System.out.println("The String doesn't have unique characters.");
}
public static boolean uniqueChars(String s){
char[] s1 = s.toCharArray();
Arrays.sort(s1);
	for(int i=0;i<s1.length-1;i++){
	if(s1[i]==s1[i+1])
	return false;
	}
return true;
}
}
