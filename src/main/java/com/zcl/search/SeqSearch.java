package com.zcl.search;

import java.util.HashMap;
import java.util.Map;

/**
 * 线性查找
 *
 * @Author AlphaZcl
 * @Date 2021/7/21
 **/
public class SeqSearch {

    public boolean seqSearch(int[] arr,int val){
        boolean res = false;
        for(int v : arr){
            if(v == val ){
                res = true;
                break;
            }
        }
        return res;
    }

    public int seqSearch2(int[] arr,int val){
        Map<Integer,Integer> cahe = new HashMap<>();
        int index = -1;
        for(int i=0;i<arr.length;i++){
            cahe.put(arr[i],i);
        }
        if(cahe.containsKey(val)){
            index = cahe.get(val);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 14, 53, 63, 154, 214, 542, 616, 748};
        int val = 53;
        SeqSearch ss = new SeqSearch();
        System.out.println(ss.seqSearch(arr,val));
        System.out.println(ss.seqSearch2(arr,val));
    }

}
