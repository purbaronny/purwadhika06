package com.purwadhika.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtil {

    public List<Integer> rotateArray(List<Integer> numbers, int d) {
        if(numbers == null) {
            return null;
        }

        if(d < 1) {
            throw new IllegalArgumentException("d must be positive number");
        }

        int length = numbers.size();
        if (length == 0 || d % length == 0) {
            return numbers;
        }

        d = d % length;
        List<Integer> rotated = new ArrayList<>(numbers.subList(d, length));
        rotated.addAll(numbers.subList(0, d));

        return rotated;
    }

    public boolean checkArrayDuplicate(List<Integer> numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        if(numbers.isEmpty()) {
            return false;
        }

        int length = numbers.size();

        for(int i = 0; i < length; i++) {
            int check = numbers.get(i);
            int count = 0;
            for(int j = 0; j < length; j++) {
                if(check == numbers.get(j)) {
                    count++;
                    if(count > 1) {
                        break;
                    }
                }
            }
            if(count > 1) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> removeArrayDuplicate(List<Integer> numbers) {
        if(numbers == null) {
            return null;
        }

        List<Integer> result = new ArrayList<>();

        for(int i : numbers) {
            boolean add = true;
            for(int j : result) {
                if(i == j) {
                    add = false;
                    break;
                }
            }
            if(add) {
                result.add(i);
            }
        }

        return  result;
    }

    public List<Integer> sort(List<Integer> numbers, String direction) {
        if(numbers == null) {
            return null;
        }

        if(direction == null || direction.isEmpty()) {
            throw new IllegalArgumentException("direction is null or empty string");
        }

        boolean isAsc = true;
        if(direction.equalsIgnoreCase("asc")) {

        } else if(direction.equalsIgnoreCase("desc")) {
            isAsc = false;
        } else {
            throw new IllegalArgumentException("direction is not list");
        }

        int length = numbers.size();

        numbers = new ArrayList<>(numbers);
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if ((isAsc && numbers.get(j) > numbers.get(j + 1)) || (!isAsc && numbers.get(j) < numbers.get(j + 1))) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        return numbers;
    }

    public List<Integer> sort(List<Integer> numbers) {
        return sort(numbers, "ASC");
    }

    public List<Integer> removeOccurences(List<Integer> numbers, int key) {
        if(numbers == null) {
            return null;
        }

        List<Integer> cleans = new ArrayList<>();

        for(Integer number : numbers) {
            if(number != key) {
                cleans.add(number);
            }
        }

        return cleans;
    }

    public String reverseWord(String word) {
        if(word == null || word.isEmpty()) {
            throw new IllegalArgumentException("word is null or word is empty string");
        }
        int length = word.length();
        int length2 = length / 2;
        if(length2 % 2 != 0) {
            length2 += 1;
        }

        char[] chs = word.toCharArray();
        for(int i = 0; i < length2; i++) {
            if(i == length2 - 1) {
                continue;
            }
            char a = chs[i];
            char b = chs[length - i - 1];
            chs[i] = b;
            chs[length - i - 1] = a;
        }

        return String.valueOf(chs);
    }

    public List<Integer> findDuplicates(List<Integer> numbers) {
        if(numbers == null) {
            return null;
        }

        int length = numbers.size();
        List<Integer> cleans = new ArrayList<>();

        for(int i : numbers) {
            int count = 0;
            for(int j : numbers) {
                if(j == i) {
                    count++;
                    if(count > 1) {
                        break;
                    }
                }
            }
            if(count > 1) {
                boolean add = true;
                for(int j : cleans) {
                    if(i == j) {
                        add = false;
                        break;
                    }
                }

                if(add) {
                    cleans.add(i);
                }
            }
        }

        cleans = sort(cleans);
        return cleans;
    }

    public static List<Integer> countWarmDays(List<Integer> temperatures) {
        int n = temperatures.size();
        List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[n]));
        List<Integer> temps = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.set(i, 0);
        }

        for (int i = 0; i < n; i++) {
            while (!temps.isEmpty() && temperatures.get(i) > temperatures.get(temps.get(temps.size() - 1))) {
                int prevIndex = temps.remove(temps.size() - 1);
                result.set(prevIndex, i - prevIndex);
            }
            temps.add(i);
        }

        return result;
    }

    public void printList(List<Integer> numbers) {
        if(numbers == null) {
            return;
        } else {
            int length = numbers.size();
            System.out.print("[");
            for(int i = 0;i < length; i++) {
                System.out.print(numbers.get(i));
                if(i < length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
