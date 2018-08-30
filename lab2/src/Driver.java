/**
 * Driver class that adds animals to a zoo and displays information about the zoo.
 * Used as a basic test of some of the code's functionality.
 * 
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-26
 */
public class Driver
{
    /**
     * The main method which does not utilize args.
     * Simply instantiates two Animal objects, adds
     * them to a zoo, and then prints out information about the zoo.
     * @param args String array taking command-line arguments
     */
    public static void main(String[] args) 
    {
        /*
         * You don't have to change any of this particular code however you may 
         * find it useful to play around with how the code works here.
         */
        Animal a = new Animal("Cheetah", "Chester", 350.0, 40);
        Animal b = new Animal("Tiger", "Tony", 200.5, 15);

        // Create a zoo and add animals to it:
        //Zoo zoo = new Zoo();
        //zoo.addAnimal(a); // Gorilla
       // zoo.addAnimal(b); // Tiger

        // Print out info about the zoo:
        //System.out.println(zoo);
        System.out.println(a);
    }
}
