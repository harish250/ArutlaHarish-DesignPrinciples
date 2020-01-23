import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
public class main {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ListIterator iterator = myList.listIterator();
        System.out.println("Iterating in forward direction : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Iterating in backward direction : ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}