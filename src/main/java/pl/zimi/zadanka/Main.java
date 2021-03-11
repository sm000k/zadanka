package pl.zimi.zadanka;

import java.io.*;
import java.util.*;

/*
source:
https://www.geeksforgeeks.org/goldman-sachs-interview-experience-set-35-experienced/
 */
public class Main {

//    static void getNumberOSCONSOLE() {
////        version for os console
//        Console cns1 = System.console();
//        if (cns1 == null) {
//            System.out.println("No console available");
//            return;
//        }
//        String str = cns1.readLine(
//                "Enter number : "
//        );
//    }

    static List<Integer> processData(List<String> input) {
        List<Integer> possitiveStrings = new ArrayList<>();
        for (String s : input) {
            if (s.contains("1") && s.contains("2") && s.contains("3")) {
                possitiveStrings.add(Integer.parseInt(s));
            }


        }
        possitiveStrings.sort(Comparator.naturalOrder());
        return possitiveStrings;
    }


    public static void main(String[] args) {

        Integer n = 0;
        System.out.println("Give number of n");
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("Give " + n + " numbers");
        List<String> listStrings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listStrings.add(scanner.nextLine());
        }

        List<Integer> possitiveIntegers = processData(listStrings);

        for (Integer x : possitiveIntegers) {
            System.out.println(x);

        }

    }


}



