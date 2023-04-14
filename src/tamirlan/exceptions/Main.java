package tamirlan.exceptions;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Exceptions
        // try catch finally
        // throw

        // compiler exception
        // coding exception
//        System.out.println(10 / 0); // exception
//        System.out.println("Hello");
//        int arr[] = new int[1];
//        arr[2] = 100;
//        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
////        int a = scanner.nextInt();
////        System.out.println(a);
//        String number = scanner.next();
//        System.out.println(Integer.parseInt(number));

//        try {
//            // программа пытается запустить код
//            int a = scanner.nextInt();
//            System.out.println(a);
//        }catch (InputMismatchException e) {
//          // выбрасывается ошибка
//            System.err.println("Вышла ошибка");
//        }finally {
//            // обычно когда мы должны что то закрыть
//            // утечка памяти
//            System.out.println("сработал finally");
//            scanner.close();
//        }

//        System.out.println("After try catch");
        getException(new int[]{1, 2});

    }

    private static void getException(int arr[]) throws Exception {

        // 1 option
//        try {
//            if (arr.length == 2)
//                throw new Exception("Длина массива равна ");
//            else
//                System.out.println(Arrays.toString(arr));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


            if (arr.length == 2) {
                throw new MyException("== 2");
            }


        // 2 option


//            if (arr.length == 2)
//                throw new Exception("Длина массива равна ");
//            else
//                System.out.println(Arrays.toString(arr));
//

    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
