
public class ArrTools {
	public static void printArray(int arr[]) {
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		 System.out.println();
		}
		
		public static void fillArray(int arr[], int min, int max) {
			for (int i = 0; i < arr.length; i++) {
				arr[i]=min+(int)(Math.random()*(max-min+1));
			}
		}

		public static void bubbleSort(int arr[], int size){
			int i;
			int j;
			for(i=0; i<size-1; i++){
				for(j=0; j<size-1; j++){
					if(arr[j]>arr[j+1]){
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}

		public static int binarySearch(int arr[], int size, int num){
			int l; //left
			int r; //right
			int med; // middle
			for(l=0, r=size-1; l<=r;){
				med=(l+r)/2;
				if(arr[med]==num){
					return med;
				}
				if(arr[med]>num){
					r=med-1;
				}
				if(arr[med]<num){
					l=med+1;
				}
			}
			return -1;

		}
		
public static int minInRange(int arr[], int size, int start){
	int i;
	int min=start;
	for(i=start;i<size;i++){
		if(arr[i]<arr[min]){
			min=i;
		}
	}
	return min;
}
public static int maxInRange(int arr[], int size, int start){
	int i;
	int max=start;
	for(i=start;i<size;i++){
		if(arr[i]>arr[max]){
			max=i;
		}
	}
	return max;
}
public static void selectionSort(int arr[],int size){
	int i;
	int temp;
	for(i=0; i<size; i++){
		int j=minInRange(arr, size, i);
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

	}
}

public static int search(int arr[], int size, int num){
	int i;
	for(i=0;i<size;i++){
		if(arr[i]==num){
			return i;
		}
	}
	return -1;
}

}
