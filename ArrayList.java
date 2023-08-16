--------------------------------------- Add an element --------------------------------------------------------
import java.util.ArrayList;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.print(list);
    }
}
// output ---> [0, 2, 4]
---------------------------------------------------------------------------------------------------------------
--------------------------------------- Get an element --------------------------------------------------------
import java.util.ArrayList;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);
    }
}
// output ----> [0, 2, 4]
//               0
-------------------------------------------------------------------------------------------------------------
--------------------------------------- Add an in between element -------------------------------------------
import java.util.ArrayList;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1,1);
        list.add(3,3);
        System.out.println(list);
    }
}
// output ----> [0, 2, 4]
//               0
//        ----> [0, 1, 2, 3, 4]
---------------------------------------------------------------------------------------------------------------
--------------------------------------- Set an element --------------------------------------------------------
import java.util.ArrayList;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1,1);
        list.add(3,3);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.print(list);
    }
}
// output ----> [0, 2, 4]
//               0
//        ----> [0, 1, 2, 3, 4]
//        ----> [5, 1, 2, 3, 4]
-------------------------------------------------------------------------------------------------------------
--------------------------------------- Delete an element ---------------------------------------------------
import java.util.ArrayList;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1,1);
        list.add(3,3);
        System.out.println(list);
       
        // delete element
        list.remove(0);
        System.out.print(list);
    }
}
// output ----> [0, 2, 4]
//               0
//        ----> [0, 1, 2, 3, 4]
//        ----> [1, 2, 3, 4]
-------------------------------------------------------------------------------------------------------------
--------------------------------------- List size of an elements --------------------------------------------
import java.util.ArrayList;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1,1);
        list.add(3,3);
        System.out.println(list);
       
        // delete element
        list.remove(0);
        System.out.print(list);

        //list size
        int size = list.size();
        System.out.println(size);
    }
}
// output ----> [0, 2, 4]
//               0
//        ----> [0, 1, 2, 3, 4]
//        ----> [1, 2, 3, 4]
//        ----> 4
---------------------------------------------------------------------------------------------------------------
--------------------------------------- Overall ---------------------------------------------------------------
import java.util.ArrayList;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println("Array list of added elements: " + list);

        // get elements
        int element = list.get(0);
        System.out.println("Element at index 0: "+ element);

        // add element in between
        list.add(1,1);
        list.add(3,3);
        System.out.println("Elements are added: "+ list);

        //set element
        list.set(0,5);
        System.out.println("Element is replaced: "+   list);

        // delete element
        list.remove(0);
        System.out.println("Element at 0 index is removed: "+ list);

        //list size
        int size = list.size();
        System.out.println("Size of an listed array is: "+ size);
    }
}
// output ---> 
// Array list of added elements: [0, 2, 4]
// Element at index 0: 0
// Elements are added: [0, 1, 2, 3, 4]
// Element is replaced: [5, 1, 2, 3, 4]
// Element at 0 index is removed: [1, 2, 3, 4]
// Size of an listed array is: 4  
---------------------------------------------------------------------------------------------------------------
--------------------------------------- Overall with Loops ----------------------------------------------------
import java.util.ArrayList;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println("Array list of added elements: " + list);

        // get elements
        int element = list.get(0);
        System.out.println("Element at index 0: "+ element);

        // add element in between
        list.add(1,1);
        list.add(3,3);
        System.out.println("Elements are added: "+ list);

        //set element
        list.set(0,5);
        System.out.println("Element is replaced: "+   list);

        // delete element
        list.remove(0);
        System.out.println("Element at 0 index is removed: "+ list);

        //list size
        int size = list.size();
        System.out.println("Size of an listed array is: "+ size);

        //loops
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
// output ---> 
// Array list of added elements: [0, 2, 4]
// Element at index 0: 0
// Elements are added: [0, 1, 2, 3, 4]
// Element is replaced: [5, 1, 2, 3, 4]
// Element at 0 index is removed: [1, 2, 3, 4]
// Size of an listed array is: 4  
// loops: 1234
---------------------------------------------------------------------------------------------------------------
--------------------------------------- Overall with Loops ----------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println("Array list of added elements: " + list);

        // get elements
        int element = list.get(0);
        System.out.println("Element at index 0: "+ element);

        // add element in between
        list.add(1,1);
        list.add(3,3);
        System.out.println("Elements are added: "+ list);

        //set element
        list.set(0,5);
        System.out.println("Element is replaced: "+   list);

        // delete element
        list.remove(0);
        System.out.println("Element at 0 index is removed: "+ list);

        //list size
        int size = list.size();
        System.out.println("Size of an listed array is: "+ size);

        // loops
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println("Sorted List of an array: "+list);
    }
}
// output ---> 
// Array list of added elements: [0, 2, 4]
// Element at index 0: 0
// Elements are added: [0, 1, 2, 3, 4]
// Element is replaced: [5, 1, 2, 3, 4]
// Element at 0 index is removed: [1, 2, 3, 4]
// Size of an listed array is: 4  
// loops: 1234
// Sorted List of an array: [1, 2, 3, 4]
---------------------------------------------------------------------------------------------------------------
