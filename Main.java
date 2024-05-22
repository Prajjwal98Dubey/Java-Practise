/*
add-> is the push operation of the arraylist.
remove-> it is the pop operation of the arraylist and it takes index as the argument.
subList-> it gives the sublist of the list it requires start index and end index but the end index is not included.
*/
import java.util.*;
class Main{
    static int myMethod(int x , int y){
        return x + y;
    }
    static double myMethod(double x, double y){
        return x + y;
    }
    public static void main(String[] args){
       ArrayList<Integer>arr = new ArrayList<Integer>();
       int[] nums = {1,2,3,4,4,5,4,6,6,4,3};
       for(int i : nums){
        arr.add(i);
       }
       System.out.println(arr.get(0));
    //    System.out.println("this is new" + arr.remove());
    //    System.out.println(arr);
    //    int removeElement = arr.remove(2);
    //    System.out.println(removeElement);
    //    System.out.println(arr.get(0));
    //    arr.set(0,100);
    //    System.out.println(arr);
    //    int[] arr1 = new int[3];
    //    List<Integer>sub = arr.subList(0,3);
    //    System.out.println(sub);
    //    System.out.println(arr.getClass().getName());


    }
}