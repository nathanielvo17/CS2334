package lab1;

public class Lab 
{
    //  Constructs a String array of size 4
    private String data[] = new String[4];
    /**
      Creates a temporary String array that takes in the input of the form: lab_name#number_of_students#number_of_teaching_assistants
      and splits the input into 3 different Strings in the temporary String array.
      Puts the data of the temporary array into the data array.
    */
    public Lab(String input) 
    {   
        //  Temporary String array to split input based on "#"
        String temp[] = input.split("#");
        //  for loop that initializes data array to the split temporary array 
        for (int i = 0; i < 3; i++) 
        {
            data[i] = temp [i];
        }
        /*
          Converts the lab name to all capitalized letters
          Creates float variables for number of students and number of teaching assistants
		  Creates float variable assigned to the number of students per teaching assistants.
        */
        data[0] = data[0].toUpperCase();
        float students = Float.parseFloat(data[1]);
        float teachingAssistants = Float.parseFloat(data[2]);
        float studentsPerTA = students / teachingAssistants;


        //  if-else tree that sets the lab_coverage variable to a particular coverage, dependent on the number of students per teaching assistants

        //  Checks if there are less than 20 students per TA
        if (studentsPerTA < 20) 
        {
            data[3] = "Extremely Well Covered";
        }
        //  Checks if there are less than 30 students per TA
        else if (studentsPerTA < 30)
        {
            data[3] = "Very Well Covered";
        }
        //  Checks if there are less than 35 students per TA
        else if (studentsPerTA < 35) 
        {
            data[3] = "Well Covered";
        }
        //  Checks if there are greater than 35 students per TA
        else 
        {
            data[3] = "Covered";
        }
    }
    /**	
      Constructs a String representation of our Lab details
      The String is of the format:
      "Lab: lab_name, Students: number_of_students, Teaching Assistants: number_of_teaching_assistants, lab_coverage"
      @param lab_name | Name of the course
      @param number_of_students | Number of enrollment in the course
      @param number_of_teaching_assistants | Number of Teaching Assistants in the course
      @param lab_coverage | Class Coverage defined by the number of Teaching Assistants and number of enrollment
      @return "Lab: lab_name, Students: number_of_students, Teaching Assistants: number_of_teaching_assistants, lab_coverage" 
    */
    public String toString() 
    {
        return String.format("Lab: %s, Students: %s, Teaching Assistants: %s, %s", data[0], data[1], data[2], data[3]);
    }
	
}