import java.util.Arrays;

public class ShellSort {
	
	public static void main(String[] args) {
		
		int[] arr = {23, 29, 15, 19, 31, 7, 9, 5, 2};
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		
		shellSort(arr);
		System.out.println("\nAfter Sorting: " + Arrays.toString(arr));
		
	}
	
	public static void shellSort(int[] arr) {
        int n = arr.length;
        
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                
                arr[j] = temp;
            }
            
        }
        
    }

}
