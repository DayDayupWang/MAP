
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StringAppearNum {
    public static void main(String[] args) {
        // 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        // 创建HashMap:集合，键是Character,值是Integer

        // HashMap<Character,Integer>hm new HashMap<Character,Integer>();
        // 使用Treemap内部会对key排序
        TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();
        // 遍历字符串，得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            // 拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            Integer value = hm.get(key);
            if (value == null) {
                // 如果返回值是nulL:说明该字符在HashMap:集合中不存在，就把该字符作为键，1作为值存储
                hm.put(key, 1);
            } else {
                // 如果返回值不是nulL:说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
                value++;
                hm.put(key, value);
            }
        }
        // 创建一个存储字符串的容器把字符装填进去
        StringBuilder sb = new StringBuilder();
        // 遍历容器
        Set<Character> keyset = hm.keySet();
        for (Character c : keyset) {
            Integer value = hm.get(c);
            sb.append(c).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);

    }
}