package codlity.task_1;

import java.util.*;
import java.util.stream.*;

class Solution {
    static int count = 0;

    public List<Integer> convertArrayToList(int[] array)
    {
        List<Integer> list = new ArrayList<>();

        for(int i : array) {
            list.add(i);
        }

        return list;
    }

    public int solution(int[] ranks) {
        List<Integer> list = this.convertArrayToList(ranks);
        List<Integer> resultList = list.stream().distinct().collect(Collectors.toList());

        resultList.forEach((res) -> {
            if(list.contains(res+1)) {
                count = count + Math.toIntExact(list.stream().filter(x -> x.equals(res)).count());
            }
        });

        return count;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] data = {4,4,3,3,1,0};

        System.out.println(s.solution(data));
    }
}
