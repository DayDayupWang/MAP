import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

// 给出如下的数据：
// 第一个ArrayList集合的元素：（三国演义）
// 诸葛亮
// 赵云
// 第二个ArrayList集合的元素：（西游记)
// 唐僧
// 孙悟空
// 第三个ArrayList集合的元素：（水浒传）
// 武松
// 鲁智深

public class ArrayListInHashMap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("曹操");
        sgyy.add("张飞");
        sgyy.add("赵云");
        hm.put("三国演义", sgyy);
        ArrayList<String> xyz = new ArrayList<String>();
        xyz.add("唐僧");
        xyz.add("八戒");
        xyz.add("悟空");
        hm.put("西游记", xyz);
        // 先遍历hashmap需要创建keyset集合
        Set<String> keyset = hm.keySet();
        for (String key : keyset) {
            ArrayList<String> mingzhu = hm.get(key);
            System.out.println(key);
            for (String s : mingzhu) {
                System.out.println("\t" + s);
            }
        }

    }
}
