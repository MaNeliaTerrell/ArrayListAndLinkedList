import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList{

    public static void main(String[] args) {


        ///------------------BASICS --------------

        //Arrays can hold primitive or objects
//        String[] friendsArray = new String[4];  //[] - signifies that this is an array,
//                                                // Arrays have definite size (4) so you have to state it
//        String[] friendsArray2 = {"Nelia", "Rina", "Jam", "Beth"};
//
//
//        //ArrayList can ONLY hold objects but supports wrapper types for primitives
//        ArrayList<String> friendsArrayList = new ArrayList<>();   // <> - diamond operator-specify the data type
//                                                                    //that you wanted to hold
//                                                                    // ArrayList can shrink and grow auto
//        ArrayList<String> friendsArrayList2 =
//                new ArrayList<>(Arrays.asList("Nelia", "Rina", "Jam", "Beth"));


        //// ----------------HOW TO GET VALUES FROM ARRAYS AND ARRAYLIST ---------

        /// Both use index - [0][1][2]....


        String[] friendsArray = {"Nelia", "Rina", "Jam", "Beth"};


        ArrayList<String> friendsArrayList =
                new ArrayList<>(Arrays.asList("Nelia", "Rina", "Jam", "Beth"));

        //-----------getting elements------------

     //   System.out.println(friendsArray[1]);   ///Arrays

      //  System.out.println(friendsArrayList.get(1));  ////ArrayList --- use the get method

        //-------------getting the size----------

        System.out.println(friendsArray.length);  //use length for Arrays (length is a field)

        System.out.println(friendsArrayList.size());   ///use the size method (size() is a method)

        /// -----------------ADDING AND REMOVING ELEMENTS ---

        // ARRAYS -- cannot add or remove elements because it has fixed size

        // ArrayList -- you can

        friendsArrayList.add("Liv");
        System.out.println(friendsArrayList.get(4));

        //-----------Set an element--------

        friendsArray[0] = "May";   //this will replace the element at whatever index you specify
        System.out.println(friendsArray[0]);

        friendsArrayList.set(0, "May");   ///use the set method for ArrayList
        System.out.println(friendsArrayList.get(0));

        //-------remove an element ------


        friendsArrayList.remove(2);   // use remove method and indicate index or the element itself
                                            //can also use remove("name")
        System.out.println(friendsArrayList.get(1));

        //------PRINTING THE ARRAY AND ARRAYLIST-----

        System.out.println(friendsArray);   //this will only give the memory address - it will
                                            //require certain steps such as for loop

        System.out.println(friendsArrayList);  /// complete arraylist

    }
}