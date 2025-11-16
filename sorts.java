import java.util.*;

public class sorts {

  public static void selectionSort(int[] a) {
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (a[j] < a[minIndex]) {
          minIndex = j;
        }
      }
      int temp = a[i];
      a[i] = a[minIndex];
      a[minIndex] = temp;
    }
  }

  public static void insertionSort(int[] a) {
    int n = a.length;
    for (int i = 1; i < n; i++) {
      int key = a[i];
      int j = i - 1;
      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
  }

  public static void bubbleSort(int[] a) {
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
      boolean swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) break;
    }
  }

  public static void printArray(int[] a) {
    for (int x : a) System.out.print(x + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    selectionSort(arr);
    insertionSort(arr);
    bubbleSort(arr);

    printArray(arr);
  }
}
