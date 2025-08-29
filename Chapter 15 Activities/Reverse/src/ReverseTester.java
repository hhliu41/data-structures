import java.util.LinkedList;


/**
 * A test program to reverse the entries in a linked list.
*/
public class ReverseTester
{
    public static void main(String[] args)
    {
        LinkedList<String> employeeNames = new LinkedList<>();
        employeeNames.addLast("Dick");
        employeeNames.addLast("Harry");
        employeeNames.addLast("Romeo");
        employeeNames.addLast("Tom");

        ListUtil.reverse(employeeNames);
        System.out.println(employeeNames);
        System.out.println("Expected: [Tom, Romeo, Harry, Dick]");

        LinkedList<String> test2 = new LinkedList<>();
        test2.addLast("Dick");
        test2.addLast("Harry");
        test2.addLast("Romeo");
        test2.addLast("Tom");
        test2.addLast("Jonny");

        ListUtil.reverse(test2);
        System.out.println(test2);
        System.out.println("Expected: [Jonny, Tom, Romeo, Harry, Dick]");
    }
}