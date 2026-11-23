/* 
  Build a java program called "StudentMarks".

  Program should contains:-
    - Print every elements along with it index.
    - Update the value of index 4 to 45.
    - Print the updated Array.
    - Find the minimum and maximum marks.
    - Count how many student are greater than or equals to 40.
*/

public class StudentMarks{
  public static void main(String[] args){
    int[] marks = {35, 82, 67, 40, 29, 91};

    //Print elements along with it index
    for(int i = 0; i < marks.length; i++){
      System.out.println("index:" + i + " - " + marks[i]);
    }

    //Update the value of index 4 to 45
    marks[4] = 45;

    //Print the updated Array
    System.out.print("Updated marks: ");
    for(int i = 0; i < marks.length; i++){
      System.out.print(marks[i] + " ");
    }
    System.out.println();

    //Find minimum and Maximum marks
    int min = marks[0];
    int max = marks[0];
    for(int i = 0; i < marks.length; i++){
      if(marks[i] < min) min = marks[i];
      if(marks[i] > max) max = marks[i];
    }
    System.out.println("Minimum marks: " + min);
    System.out.println("Maximum marks: " + max);

    //Count how many student are greater than or equals to 40
    int count = 0;
    for(int i = 0; i < marks.length; i++){
      if(marks[i] >= 40) count++;
    }
    System.out.println("Marks >= 40 : " + count);
  }

}
