import java.util.*;

public class TwoLists
{
    public static List twoLists(List liste1, List liste2)
    {
        List nyListe = new LinkedList();

        Iterator a = liste1.iterator();
        Iterator b = liste2.iterator();

        while(a.hasNext() && b.hasNext())
        {
            nyListe.add(a.next());
            nyListe.add(b.next());
        }

        while (a.hasNext())
        {
            nyListe.add(a.next());
        }
        while (b.hasNext())
        {
            nyListe.add(b.next());
        }
        return nyListe;
    }
}
