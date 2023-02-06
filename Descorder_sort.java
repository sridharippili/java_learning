    import java.util.Arrays;

public class Descorder_sort {
  public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12, 22, 11, 90};
    bubbleSort(arr);
    System.out.println("Sorted array in Descending Order: ");
    System.out.println(Arrays.toString(arr));
  }

  static void bubbleSort(int[] arr) {
    int n = arr.length;
    int temp;
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (arr[j] < arr[j+1]) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
}