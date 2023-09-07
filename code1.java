package ArrayList_Wrapper_class;

import java.util.ArrayList;

public class code1 {
    public static void main(String[] args) {
        // creating a wrapper class
        Integer a = Integer.valueOf(4);
        System.out.println(a);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        // creating ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        // adding element in an arraylist
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // accessing element of ith index
        System.out.println(l1.get(1));

        // accessing element of ith index using loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        // accesing element of arraylist directly without using anyloop
        System.out.println(l1);

        // adding element at some index
        l1.add(1, 100);
        System.out.println(l1);
    }
}
