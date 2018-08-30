/**
 * Class to represent a zoo. Holds a list of animals that are present at the zoo.
 * 
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-26
 *
 */
public class Zoo
{
    /**
     * Array to keep track of all of the Zoo's animals.
     * The size of the animals array represents the capacity of the zoo - the maximum number of animals that the zoo
     * can hold. There may be fewer animals in the zoo than the zoo's current capacity. The zoo's initial capacity is
     * 1 animal, but will be increased as more animals are added. Because there may be more empty indicies in the
     * animals array than there are animals added to the zoo, currentIndex is used to mark the next location in the
     * array to store the animal.
     * 
     * e.g. The animals array is size 5, but only 4 animals are stored in the zoo. The animals are stored in indicies
     * 0-3, but index 4 is empty. The value of currentIndex is 4 as the next location to store a new animal will be
     * the 4th index.
     */
    private Animal[] animals;

    /**
     * The next empty location in the animals array.
     * Used to store the next animal the zoo acquires.
     */
    private int currentIndex;

    /**
     * Default Constructor
     * 
     * Initializes the array to a size of 1
     * Sets the currentIndex to 0
     */
    public Zoo() 
    {
        // TODO: implement this method as described in the documentation.
    	Animal[] animals = new Animal[1];
    	currentIndex = 0;
    }

    /**
     * Increases the capacity of the zoo (the size of the animals array) by 2.
     * 
     * Remember: an array's size is immutable - it cannot be changed. Instead, to "increase" the size of the
     * animals array, you will need to create a new array with a larger size, copy over the data in the "animals"
     * array, and update the reference of the "animals" array to the new array.
     */
    private void expandArray()
    {
        // TODO: create the new array
        // TODO: Copy each value from animals into the new array
        // TODO: Update the reference
    	Animal[] temp = new Animal[animals.length + 2];
    	for (int i=0; i < animals.length; i++)
    	{
    		animals[i] = temp[i];
    	}
    	
    }

    /**
     * Add a single animal to the zoo. Adds the animal into the animals array and updates the currentIndex.
     * Expands the animals array if there is not enough room to store a new animal.
     * 
     * @param ani The animal to be added to the zoo.
     */
    public void addAnimal(Animal ani)
    {
        // TODO: expand the array if there is not enough room to add a new animal.
        // TODO: add animal and update currentIndex counter.
    	
    	if (currentIndex < animals.length - 1)
    	{
    		expandArray();
    	}
    	
    	animals[currentIndex] = ani;
    	currentIndex += 1;
    	
    }

    /**
     * Loop over all the Animals in the zoo to compute the total weight.
     * 
     * @return The sum of weight of animals in the zoo.
     */
    public double getTotalWeight() 
    {
        /*=*************************************************************=*/
        /* PROVIDED AS AN EXAMPLE. ALREADY CORRECT AND FULLY IMPLEMENTED */
        /*=*************************************************************=*/
        double result = 0.0;
        // Loop over all animals and sum the weight:
        for (int i = 0; i < currentIndex; ++i) 
        {
            result += this.animals[i].getWeight();
        }
        return result;
    }
    
    /**
     * Loop over all the Animals in the zoo to compute the average age.
     * 
     * @return Average age (rounded down) of all animals in the zoo.
     */
    public int getAverageAge()
    {
        // TODO: implement this method as described in the documentation.
        // Look at getTotalWeight for help with looping.
    	int result = 0;
        for (int i = 0; i < currentIndex; ++i) 
        {
            result += this.animals[i].getAge();
        }
        return result;
    }

    /**
     * Returns the total number of animals in the zoo.
     * 
     * @return The number of animals in the zoo.
     */
    public int getSize() 
    {
        // TODO: implement this method as described in the documentation.
    	return (currentIndex - 1);
    }

    /**
     * Loop overall all animals and compute the total age of all animals with the given name.
     * 
     * @param name The given name. The function finds the summed age of all animals with this name.
     * @return The total age of all animals with the given name.
     */
    public int totalAgeWithName(String name) 
    {
        // TODO: implement this method as described in the documentation.
        // Look at getTotalWeight for help with looping.
    }
    
    /**
     * Loop over all the animals in the zoo and compute the number of animals of the given species.
     * 
     * @param species The given species. The function finds the number of animals with this species.
     * @return The number of animals of the given species
     */
    public int numberAnimalsOfSpecies(String species)
    {
        // TODO: implement this method as described in the documentation.
        // Look at getTotalWeight for help with looping.
    }

    /**
     * Retrieve the array that constitutes the animals in the zoo.
     * 
     * @return The Animal array representing the zoo.
     */
    public Animal[] getAnimals()
    {
        return animals;
    }

    /**
     * Print out formatted information about the animals in the zoo.
     * 
     * @return A string representing the animals in the zoo. Formatted as:
     * "The following animals currently reside in the zoo: \n" +
     * for each animal in the animals array (starting from index 0), the toString of the animal
     */
    public String toString() 
    {
        // TODO: implement this method as described in the documentation.
        // Look at getTotalWeight for help with looping. You will need to build a string for the returned result.
    }
}
