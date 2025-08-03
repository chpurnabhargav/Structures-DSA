package ArrayLists;
import java.util.*;
public class ArrayListsTwoD {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();
        ArrayList<Integer> c= new ArrayList<>();

        List<List<Integer>> grid=new ArrayList<>();
        grid.add(a);
        grid.add(b);
        grid.add(c);
        a.add(2);
        b.add(3);
        c.add(4);
        System.out.println(grid);
        System.out.println(grid.get(1));
        System.out.println(a.isEmpty());
        System.out.println(a.contains(3));
        System.out.println(grid.indexOf(c));
        for(int i=0;i<grid.size();i++){
            System.out.println(grid.get(i));
        }
        int arr[]=a.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<grid.size();i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<temp.size();j++){
                System.out.print(temp.get(j));
            }
            System.out.println();
        }
    }
}
