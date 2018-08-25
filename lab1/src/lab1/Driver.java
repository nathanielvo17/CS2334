package lab1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
   @author Nathaniel Vo
   @version 2018 August 23
   Lab 1
   This program takes a String input of the format: "lab_name#number_of_students#number_of_teaching_assistants",
   calculates the lab coverage based on the amount of students per teaching assistant,
   and gives a String output of the format: "Lab: lab_name, Students: number_of_students, Teaching Assistants: number_of_teaching_assistants, lab_coverage"
*/
public class Driver 
{
    public static void main(String args[]) throws IOException
    {
        /* 
          Takes in a String from the user of the following format:
          lab_name#number_of_students#number_of_teaching_assistants
        */
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String input = br.readLine();

        /*	Takes the input received and uses it to create an instance "course" of the class "Lab"
         * 	Outputs the String representation of the Lab "course" of the following format:
         *  Lab: lab_name, Students: number_of_students, Teaching Assistants: number_of_teaching_assistants, lab_coverage
         */
        Lab course = new Lab(input);
        System.out.println(course);
        br.close();
    }
}
