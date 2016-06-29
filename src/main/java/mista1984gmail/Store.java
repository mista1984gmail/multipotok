package mista1984gmail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by intelisoft on 29.06.2016.
 */
public class Store {
    private List<Integer> integers=new ArrayList<Integer>();

    public boolean add(Integer integer){
        if (integers.size()<10){
            integers.add(integer);
            System.out.println("after add "+integers.size());
            return true;
        }
        return false;
    }
    public boolean remove(){
        if(integers.size()>0){
            integers.remove(integers.size()-1);
            System.out.println("after remove "+integers.size());
        }
        return false;
    }



}
