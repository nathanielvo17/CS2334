/**
 * Class to represent an animal in a zoo. Animals have a species, name, weight, and age.
 * 
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-26
 */
public class Animal 
{
    /**
     * The species of the animal
     */
    private String species;
    
    /**
     * The name of the animal
     */
    private String name;

    /**
     * The weight of the animal in pounds
     */
    private double weight;

    /**
     * The age of the animal in years
     */
    private int age;


    /**
     * Empty (Default) Constructor
     * 
     * Sets the weight to 0, age to 0, name to "noname", and species to "unknown"
     */
    public Animal()
    {
        // DONE: implement this method as described in the documentation. DONE
    	this.species = "unknown";
    	this.name = "noname";
    	this.weight = 0;
    	this.age = 0;
    }
    
    /**
     * Animal constructor setting all fields.
     * 
     * @param species The animal species.
     * @param name The animal's name.
     * @param weight The animal's weight in pounds.
     * @param age The animal's age in year.
     */
    public Animal(String species, String name, double weight, int age)
    {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }


    /**
     * Return the name of the given Animal
     * @return String name of the animal object
     */
    public String getSpecies() 
    {
        return this.species;
    }


    // DONE: create getters for name, weight, and age
    public String getName()
    {
    	return this.name;
    }
    
    public int getAge()
    {
    	return this.age;
    }
    
    public double getWeight()
    {
    	return this.weight;
    }
    
    /**
     * When the user needs to print out info about an animal, present
     * the animal in order of name, weight, and selling price
     * 
     * @return The string representation of the Animal class, formatted as:
     *         "(name), a (species). (weight, to one decimal place) pounds, (age) years old.\n"
     */
    public String toString()
    {
        // TODO: implement this method as described in the documentation.
    	return String.format("%s, a %s. %s pounds, %s years old \n", this.name, this.species, this.weight, this.age);
    }
}
