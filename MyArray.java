//Arrays
import java.util.Scanner;
import java.lang.Math.*;

public class MyArray{

	static int[] Arr = new int[20];
	static int length;

	MyArray(){
	Scanner inp = new Scanner(System.in);
	System.out.println("Enter the length of the array: ");
	length = inp.nextInt();		
	
	    for(int i=0;i<length;i++){
	    	Arr[i] = (int) (Math.random()*100);
		}
	printArray();
	}

	public static void printArray(){
	    for(int i=0;i<length;i++){
	    	System.out.print(Arr[i] + " ");
            }
	}

	public static void BubbleSort(){
	int temp;
	for(int i=1;i<length;i++)
		for(int j=0;j<length-i;j++){
			if(Arr[j]>Arr[j+1]){
			temp=Arr[j+1];
			Arr[j+1]=Arr[j];
			Arr[j]=temp;
			}
		}
	printArray();
	}

	public static void SelectionSort(){
	for(int i=0;i<length-1;i++){
	int currentmin = Arr[i];
	int currentminindex = i;
		for(int j=i+1;j<length;j++){
			if(currentmin>Arr[j]){
			currentmin = Arr[j];
			currentminindex = j;
			}
		}
		if (currentminindex != i) {
 		Arr[currentminindex] = Arr[i];
 		Arr[i] = currentmin;
		}
	}
	printArray();
	}

//	public void InsertionSort(){
//	}

	public void LinearSearch(){	
	int i;
	boolean found = false;
	Scanner ip = new Scanner(System.in);
	System.out.println("\nEnter the element to be searched: ");
	int key = ip.nextInt();
		for(i=0;i<length;i++){
			if(key==Arr[i]){
			found = true;
			break;
			}
			}
	if(found)
	System.out.println("The index of the element is " +i);
	else
	System.out.println("Element not found!");
	}

	public void BinarySearch(){
	MyArray.SelectionSort();
	boolean found1 = false;
	int mid = 0;
	Scanner ip = new Scanner(System.in);
	System.out.println("\nEnter the element to be searched: ");
	int k = ip.nextInt();
	int low = 0;
	int high = length-1;
	while(high>=low){
	mid = (low+high)/2;
	if(k<Arr[mid])
	high = mid-1;
	else if(k==Arr[mid])
	found1=true;
	else
	low = mid+1;
	}
	if(found1)
	System.out.println("The index of the element is " +mid);
	else
	System.out.println("Element not found!");
	}

	public static void main(String[] args){
		MyArray obj = new MyArray();
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter the sort (selection, insertion, bubble) or search name (binary, linear) you want to perform: ");
		String s = input.nextLine();
		if(s.equals("selection"))
		obj.SelectionSort();
//		else if(s == "insertion")
//		InsertionSort(obj);
		else if(s.equals("bubble"))
		MyArray.BubbleSort();
		else if(s.equals("binary"))
		obj.BinarySearch();
		else if(s.equals("linear"))
		obj.LinearSearch();
	}

}