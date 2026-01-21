package com.day7.eduresults;

import java.util.ArrayList;
import java.util.List;

public class RankService {

    public List<Student> generateRankList(List<Student> students) {
        if (students == null || students.size() <= 1) {
            return students;
        }
        return mergeSort(students);
    }

    private List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) return students;

        int mid = students.size() / 2;

        List<Student> left = mergeSort(new ArrayList<>(students.subList(0, mid)));
        List<Student> right = mergeSort(new ArrayList<>(students.subList(mid, students.size())));

        return merge(left, right);
    }

    // STABLE merge
    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getMarks() >= right.get(j).getMarks()) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }
}