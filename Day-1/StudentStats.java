/* 
  Build a small java program called "StudentStats".

  Program should contains:-
    - Store students marks in an integer array.
    - Calculate the highest marks.
    - Calculate the average marks
    - Count students who passed (marks greater than or equals to 60).
*/

public class StudentStats {

    static int findHighest(int[] marks) {
        int high = marks[0];
        for(int num : marks){
          if(num > high){
            high = num;
          }
        }
        return high;
    }

    static double calculateAverage(int[] marks) {
        int sum = 0;
        for( int num : marks){
          sum += num;
        }
        return (double)sum/marks.length;
    }

    static int countPassed(int[] marks) {
        int count = 0;
        for(int num : marks){
          if(num >= 60) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] marks = {75, 32, 90, 45, 28, 88, 60};

        System.out.println("Highest: " + findHighest(marks));
        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Passed: " + countPassed(marks));
    }
}
