import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
    {

        // Opretter en ny scanner
        Scanner scanner = new Scanner(System.in);

        // Laver nye variabler
        int tal1, tal2;
        int nummer1, nummer2;

        // Laver nye linkedlister
        List l1 = new LinkedList();
        List l2 = new LinkedList();
        List newList = new LinkedList();

        System.out.println("Hvor mange elementer vil du indsætte i list1?");
        tal1 = scanner.nextInt();
        System.out.println("Tryk  de tal til du vil tilføje: ");
        for (int i = 0; i < tal1; i++)
        {
            nummer1 = scanner.nextInt();
            l1.add(nummer1);
        }

        System.out.println("Hvor mange elementer vil du indsætte i list2?");
        tal2 = scanner.nextInt();
        System.out.println("Tryk  de tal til du vil tilføje:  ");

        for (int i = 0; i < tal2; i++)
        {
            nummer2 = scanner.nextInt();
            l2.add(nummer2);
        }

        // Viser begge lister
        System.out.println("Første liste: " + l1);
        System.out.println("Anden liste: " + l2);

        // Kalder metoden (twoLists)
        newList = TwoLists.twoLists(l1,l2);
        System.out.println("Den nye liste er: " + newList);
    }
}
