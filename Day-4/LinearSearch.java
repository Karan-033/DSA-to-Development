//Example Inplementation of Java
public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50};

        System.out.println(linearSearch(numbers, 30));
        System.out.println(linearSearch(numbers, 99));
    }
}


/*
    Expected Output
        - 2
        - -1
*/
