import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator iterator = strings.listIterator();
        String temp;
        for (int i = 0; i<strings.size();i++ )
        {
            temp = strings.removeLast();
            iterator.add(temp);
        }
    }
}