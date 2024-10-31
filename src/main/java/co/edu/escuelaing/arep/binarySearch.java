package co.edu.escuelaing.arep;

import java.util.ArrayList;
import java.util.List;

public class binarySearch {

    private String name = "linearSearch";
    private List<Integer> numbers = new ArrayList<Integer>();
    private int value;
    private int output;

    public binarySearch(List<Integer> numbers, int value){
        this.numbers = numbers;
        this.value = value;
        this.output = search(numbers);
    }

    private int search(List<Integer> mylist){
        int mitad = (mylist.size()/2);
        System.out.print(mitad);
        if(mylist.get(mitad) == value){
            return mitad;
        }else if(mylist.get(mitad) > value){
            return searchMenor(mitad, mylist);
        }
        return searchMayor(mitad, numbers);
    }
    

    private int searchMenor(int mid, List<Integer> mylist){
        List<Integer> newNumbers = new ArrayList<Integer>();
        for(int x = 0; x < mid; x ++){
            newNumbers.add(mylist.get(x));
        }
        return search(newNumbers);
    }

    private int searchMayor(int mid, List<Integer> mylist){
        List<Integer> newNumbers = new ArrayList<Integer>();
        for(int x = mid; x < mylist.size(); x ++){
            newNumbers.add(mylist.get(x));
        }
        return search(newNumbers);
    }

    public String getName(){
        return name;
    }

    public int getOutput(){
        return output;
    }

    
    
}
