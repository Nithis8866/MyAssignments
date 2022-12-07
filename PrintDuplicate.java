package week2.day2;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] arr = {19,12,14,19,20,14,17,16,10,12,10};
		int size=arr.length;
		System.out.println("The duplicate elements in an array are");
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}


