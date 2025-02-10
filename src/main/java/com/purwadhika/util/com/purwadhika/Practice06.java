package com.purwadhika.util.com.purwadhika;

import com.purwadhika.util.ListUtil;

import java.util.List;

public class Practice06 {

    public static void main(String[] args) {

        ListUtil listUtil = new ListUtil();

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        numbers = listUtil.rotateArray(numbers, 2);
        listUtil.printList(numbers);

        numbers = List.of(1,2,3,1);
        System.out.println(listUtil.checkArrayDuplicate(numbers));
        numbers = List.of(1,2,3,4);
        System.out.println(listUtil.checkArrayDuplicate(numbers));
        numbers = List.of(1,1,1,3,3,4,3,2,4,2);
        System.out.println(listUtil.checkArrayDuplicate(numbers));

        numbers = List.of(1, 2, 2, 3, 3, 3, 4, 5);
        numbers = listUtil.removeArrayDuplicate(numbers);
        listUtil.printList(numbers);

        numbers = List.of(8, 7, 5, 2);
        numbers = listUtil.sort(numbers);
        listUtil.printList(numbers);

        numbers = List.of(8, 7, 5, 2);
        numbers = listUtil.sort(numbers, "desc");
        listUtil.printList(numbers);

        numbers = List.of(1, 2, 1, 3, 5, 1);
        numbers = listUtil.removeOccurences(numbers, 1);
        listUtil.printList(numbers);

        String word = "malang";
        System.out.println(listUtil.reverseWord(word));
        word = "mas";


        numbers = List.of(4,3,2,7,8,2,3,1);
        numbers = listUtil.findDuplicates(numbers);
        listUtil.printList(numbers);

        numbers = List.of(1,1,2);
        numbers = listUtil.findDuplicates(numbers);
        listUtil.printList(numbers);

        numbers = List.of(1);
        numbers = listUtil.findDuplicates(numbers);
        listUtil.printList(numbers);

        numbers = List.of(73,74,75,71,69,72,76,73);
        numbers = listUtil.getDaysWarmers(numbers);
        listUtil.printList(numbers);

        numbers = List.of(30,40,50,60);
        numbers = listUtil.getDaysWarmers(numbers);
        listUtil.printList(numbers);

        numbers = List.of(30,60,90);
        numbers = listUtil.getDaysWarmers(numbers);
        listUtil.printList(numbers);
    }
}
