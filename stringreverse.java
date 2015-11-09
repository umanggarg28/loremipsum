import java.util.Scanner;
class StringReverse{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter a String: ");
String s = input.nextLine();
char[] s1 = s.toCharArray();
char[] s11 = new char[s1.length];
int i = 0;
int j = s1.length-1;
while(i<s1.length && j>=0){
s11[i] = s1[j];
i++;j--;
}
for(int k=0;k<s1.length;k++)
System.out.print(s11[k]);
}
}