-------------------------------------------- Addition of First & Last ----------------------------------------------------------
import java.util.*;
class ll {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.addLast("last");
        System.out.println(list);
    }
}
// output ----> [This, is, a, list, last]
--------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------- Size of an LinkedList -------------------------------------------------------------
import java.util.*;
class ll {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.addLast("last");
        System.out.println(list);

        System.out.println("This is the size of an above LinkedList: "+ list.size());

    }
}
// output ----> [This, is, a, list, last]
//              This is the size of an above LinkedList: 5
--------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------- Get a list of an LinkedList -------------------------------------------------------
import java.util.*;
class ll {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.addLast("last");
        System.out.println(list);

        System.out.println("This is the size of an above LinkedList: "+ list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + "--->");
        }
        System.out.println("NULL");
    }
}
// output ----> [This, is, a, list, last]
//              This is the size of an above LinkedList: 5
//              This--->is--->a--->list--->last--->NULL
--------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------- Deletion of an LinkedList ---------------------------------------------------------
import java.util.*;
class ll {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.addLast("last");
        System.out.println(list);

        System.out.println("This is the size of an above LinkedList: "+ list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + "--->");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
// output ----> [This, is, a, list, last]
//              This is the size of an above LinkedList: 5
//              This--->is--->a--->list--->last--->NULL
//              [is, a, list, last]
//              [is, a, list]
//              [is, a]
--------------------------------------------------------------------------------------------------------------------------------
