import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        // Complete the constructor
        driveway = new Stack<>();
        street = new Stack<>();


    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
        this.driveway.push(licensePlate);
        this.print();


    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method
        

        if (driveway.contains(licensePlate)){
          while (!driveway.isEmpty()) {
            int removed = driveway.pop();
            if ((removed)==licensePlate) {
              this.print();
              while (!street.isEmpty()) {
                driveway.push(street.pop());
              }
              return;
            }
            else {
              street.push(removed);
            }
          }
        }
        else {
          System.out.println("Car not in driveway.");
        }
      


    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        // Print the cars in the driveway here
        int dsize = driveway.size();
        //if (dsize > 0) {
          for (int i = 0; i < dsize; i++) {
            System.out.println(driveway.get(i));
          }
        //}

        System.out.println("In Street, starting at first in (one license plate per line):");
        // Print the cars in the street here
        int ssize = street.size();
        //if (ssize > 0) {
          for (int i = 0; i < ssize; i++) {
            System.out.println(street.get(i));
          }
        //}

    }
}
