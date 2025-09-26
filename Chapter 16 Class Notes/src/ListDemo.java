/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList a = new LinkedList();

        a.addFirst("Cam");
        a.addFirst("Connor");
        a.addFirst("Katherine");
        a.addFirst("Jonathan");

        System.out.println(a);
    }
}
