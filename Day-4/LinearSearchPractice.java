public class Main {
  static int linearSearch(int[] arr, int target) {
    int comparisons = 0;

    for (int i = 0; i < arr.length; i++) {
        comparisons++;
        if (arr[i] == target) {
            System.out.println("Comparisons: " + comparisons);
            return i;
        }
    }
    System.out.println("Comparisons: " + comparisons);
    return -1;
}
  public static void main(String[] args) {
    int[] numbers = {12, 7, 25, 40, 18, 9};

    System.out.println(linearSearch(numbers, 40));
    System.out.println(linearSearch(numbers, 100));
  }
}
