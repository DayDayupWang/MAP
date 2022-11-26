import java.util.ArrayList;

import java.util.HashMap;
import java.util.Set;

public class HashMapInArrayList {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("kanye", "yeezy");
        hm1.put("PUTIAN", "AJ");

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("hangzhou", "longjing");

        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("xihu", "cuyu");
        array.add(hm1);
        array.add(hm2);
        array.add(hm3);
        // 遍历ArrayList中的HashMap<String, String>，
        // hm是给遍历的量起的名字，内部使用遍历hashmap的方式遍历
        for (HashMap<String, String> hm : array) {
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
        }

    }
}
