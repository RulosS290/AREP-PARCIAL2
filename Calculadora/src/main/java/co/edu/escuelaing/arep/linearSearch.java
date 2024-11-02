package co.edu.escuelaing.arep;

import java.util.ArrayList;
import java.util.List;

public class linearSearch {

    private String name = "linearSearch";
    private List<Integer> numbers = new ArrayList<Integer>();
    private int value;
    private int output;

    public linearSearch(List<Integer> numbers, int value){
        this.numbers = numbers;
        this.value = value;
        this.output = search(value);
    }

    private int search(int value){
        for(int x = 0; x < numbers.size(); x++){
            if(value == numbers.get(x)){
                return x;
            }
        }
        return -1;
    }

    public String getName(){
        return name;
    }

    public int getOutput(){
        return output;
    }

    
    
}

