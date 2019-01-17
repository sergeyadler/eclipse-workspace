
public class ArrApp {

	public static void main(String[] args) {
	
		int arr1[]= {12,14,323,57,97,56,44,56};
		int arr2[]= {43,12,65,23,76,34,87,345};
		int arr3[]=new int[8];
		
		ArrTools.bubbleSort(arr1, 8);
		ArrTools.printArray(arr1);
		ArrTools.printArray(arr2);
		ArrTools.selectionSort(arr2, 8);
		ArrTools.printArray(arr2);
	}
}
