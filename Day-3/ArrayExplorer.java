
public class ArrayExplorer {
    public static void main(String[] args) {
        int[] marks = {78, 92, 65, 88, 74};

      // 1. Display array length
        System.out.println("Number of marks: " + marks.length);

        // 2. Access an element
        System.out.println("Value at index 2: " + marks[2]);

        // 3. Update an element
        marks[2] = 70;

        // 4. Print all updated values
        System.out.print("Updated marks: ");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);

            if (i < marks.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // 5. Find minimum, maximum and count
        int min = marks[0];
        int max = marks[0];
        int count = 0;

        for (int i = 0; i < marks.length; i++) {
            int current = marks[i];

            if (current < min) {
                min = current;
            }

            if (current > max) {
                max = current;
            }

            if (current >= 80) {
                count++;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Marks >= 80: " + count);
    }
}
