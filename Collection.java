import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

public class Collection 
{
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Nikhil");
        a.add(22);
        System.out.println(a);
        LinkedList l = new LinkedList();
        l.add(22.3f);
        try{
        l.add(2,23);
        }
        catch(Exception e){
            System.out.println("enetr a valid index");
        }
        System.out.println(l);

        HashSet h = new HashSet(); 
        h.add(12);
        h.add(23);
        h.add(14);
        System.out.println(h);

        TreeSet t = new TreeSet();
        t.add(54);
        t.add(65);
        t.add(76);
        System.out.println(t);
    }
}
