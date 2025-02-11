package com.purwadhika.util;

import java.util.List;

public class ListUtil {

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


}
