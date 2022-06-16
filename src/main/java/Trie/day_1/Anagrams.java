package Trie.day_1;

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        String[] list = {"act","god","cat","dog","tac"};
        System.out.println(getAnagrams(list));
    }
    public static List<List<String>> getAnagrams(String[] string_list){
        // Code here
        Map<String,List<String>> mp = new TreeMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i =0;i<string_list.length;i++){
            String temp = string_list[i];
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(mp.containsKey(key)){
                List<String> list  =   mp.get(key);
                list.add(string_list[i]);
                mp.put(key ,list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(string_list[i]);
                mp.put(key,list);
            }
        }


        for(Map.Entry<String,List<String>> entry:mp.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
