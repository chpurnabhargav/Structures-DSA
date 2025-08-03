package ArrayLists; 
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        //adding elemets
        arr.add(30);
        arr.add(31);
        arr.add(32);
        arr.add(33);
        //adding elements at an index
        arr.add(4,34);
        //updating value at index 2 
        arr.set(2,300);
        System.out.println(arr);

        //to retrive value at specific index 
        System.out.println(arr.get(0));


        //size of our dynamic ArrayList
        System.out.println(arr.size());


        //to remove elements from Arraylists
        arr.remove(0);
        System.out.println(arr);

        //to clear the ArrayList
        arr.clear();
    }
}
