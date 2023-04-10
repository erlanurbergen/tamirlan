package tamirlan.inheritance;

import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // inheritance
        // ArrayList
//
//        Laptop laptop = new Laptop("Lenovo", 350000, "Intel core i7", true);
//        laptop.sale(20);
//        Mobile mobile = new Mobile("Iphone 12", 269000, true);
////        System.out.println(laptop.getPrice());
////        System.out.println(laptop.getTotal(10));
//        Device devices[] = {laptop,mobile};
//
//        for (Device device : devices) {
////            device.sale(15);
////            System.out.println(device.getPrice());
//            if (device instanceof Mobile)
//                System.out.println(device.getPrice());
//        }
//
//        ArrayList<String> names = new ArrayList<>(); // dynamic array
//        names.add("Bob");
//        names.add("Alice");
//        names.add("Nina");
//        names.add("Mariya");
////        names.remove("Bob");
//        names.removeIf(n -> n.length() < 5);
//        // Stream api
//        // Collections - ArrayList(95) - LinkedList(5)
//        // Set
//        // Map
////        String s = names.get(10); // []
////
////        System.out.println(names.size());
////        System.out.println(names);
////        System.out.println(s);
//
////        Set numbers = new HashSet();
////        numbers.add(10);
////        numbers.add(11);
////        numbers.add(10);
////        numbers.add(12);
//        System.out.println(names);

        Device device = new Device();
        System.out.println(device);

    }
}
