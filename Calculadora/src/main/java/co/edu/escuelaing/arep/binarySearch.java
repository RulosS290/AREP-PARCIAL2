package co.edu.escuelaing.arep;

import java.util.ArrayList;
import java.util.List;


public class binarySearch {

    private String name = "binarySearch";
    private List<Integer> numbers = new ArrayList<>();
    private int value;
    private int output;

    public binarySearch(List<Integer> numbers, int value) {
        this.numbers = numbers;
        this.value = value;
        this.output = search(0, numbers.size() - 1); 
    }

    private int search(int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2; 
        
        if (numbers.get(mid) == value) {
            return mid;
        } else if (numbers.get(mid) > value) {
            return search(left, mid - 1);
        } else {
            return search(mid + 1, right);
        }
    }
    public String getName() {
        return name;
    }

    public int getOutput() {
        return output;
    }
}
