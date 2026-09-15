import java.util.Scanner;

public class IT22199058Lab4Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter exam marks (Out of 100): ");
	double examMarks = input.nextDouble();
	
	if(examMarks < 0 || examMarks > 100) {
	  System.out.println("Invalid input for exam marks. Terminating program.");
	  input.close();
	  return;
	}
	
	System.out.print("Please enter lab submission marks (Out of 100): ");
	double labMarks = input.nextDouble();
	
	if(labMarks < 0 || labMarks > 100) {
	  System.out.println("Invalid input for exam marks. Terminating program.");
	  input.close();
	  return;
	}
	
	System.out.print("Please enter the percantage given for the exam: ");
	int examMarksPercentage = input.nextInt();
	
	System.out.print("Please enter the percantage given for the lab submission: ");
	int labMarksPercentage = input.nextInt();
	
	if(examMarksPercentage + labMarksPercentage != 100) {
	  System.out.println("The percentages must add upto 100. Terminating program.");
	  input.close();
	  return;
	}
	
	double finalMarks = (examMarks * (examMarksPercentage / 100.0) ) + (labMarks * (labMarksPercentage/ 100.0));
	
	System.out.println();
	System.out.println("Final exam mark is: " +finalMarks);
	
  }
}