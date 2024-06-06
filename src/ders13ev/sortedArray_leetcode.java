package ders13ev;

import java.util.HashSet;

public class sortedArray_leetcode {
    private static Integer HashSet;

    public static void main(String[] args) {
        //massiv yaradiriq
        int[] massivim = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        //masssivin uzunlugunu tapiriq
        int n = massivim.length;
        //hashset'den istifade edecem
        HashSet<Integer> set = new HashSet<>();
        //dovr
        for (int i = 0; i < n; i++) {
            set.add(massivim[i]);
            System.out.println(set );


        }
    }
}