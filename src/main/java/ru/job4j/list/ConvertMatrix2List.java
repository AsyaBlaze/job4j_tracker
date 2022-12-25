package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int rows = 0, cells = 0;
        for (int[] row : array) {
            for (int cell : row) {
                list.add(array[rows][cells]);
                cells++;
            }
            cells = 0;
            rows++;
        }
        return list;
    }
}
