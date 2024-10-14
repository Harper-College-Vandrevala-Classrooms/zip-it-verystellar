package com.csc;
import java.util.ArrayList;
import java.util.List;

public class Zipper {

    <T> List<T> zip(List<T> list_1, List<T> list_2){
        List<T> result = new ArrayList<T>();
        int max_size;
        if(list_1.size()==list_2.size()) {
            max_size = list_1.size();
        }
        if(list_1.size()>list_2.size()){
            max_size = list_1.size();
        }
        else{
            max_size = list_2.size();
        }

        for(int i = 0; i <= max_size - 1; i++){
            if(i<list_1.size()){
                result.add(list_1.get(i));
            }
            if(i<list_2.size()){
                result.add(list_2.get(i));
            }
        }
        return result;
    }
}
