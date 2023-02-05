import java.util.LinkedList;

public class LinkedListExample {
    public static void main (String[] args){

        //LinkedList works almost the same way as ArrayList but they work differently
        //behind the scene. ArrayList uses an array
        //LinkedList starts in reference to the beginning element and the end. Has to follow the next
        // or previous pointers to get to the middle elements.

        LinkedList<String> namesLinkedlist = new LinkedList<>();

        namesLinkedlist.add("Nelia");
        namesLinkedlist.add("Ana");
        namesLinkedlist.add("Gem");
        namesLinkedlist.add("Emma");
        System.out.println(namesLinkedlist.get(2));



    }
 }
