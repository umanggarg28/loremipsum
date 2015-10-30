import java.util.*;
import java.util.Scanner;
class Anagrams{
public static void main(String args[]){
int a=0;
int b=0;
Scanner input = new Scanner(System.in);
System.out.println("Enter the first string: ");
String s1 = input.nextLine();
System.out.println("Enter the second string: ");
String s2 = input.nextLine();
char[] s11 = s1.toCharArray();
char[] s22 = s2.toCharArray();
Arrays.sort(s11);
Arrays.sort(s22);
String output1 = new String(s11);
String output2 = new String(s22);
if(output1.equals(output2))
System.out.println("The two strings are anagrams!");
else
System.out.println("The two strings are not anagrams!");
}
}