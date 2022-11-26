import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        // 创建集合对象
        Map<String, String> map = new HashMap<String, String>();
        // 添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        // 获取所有键的集合。用keySet()方法实现
        Set<String> keySet = map.keySet();
        // 遍历键的集合，获取到每一个键。用增强fo实现
        for (String key : keySet) {
            // 根据键去找值。用get(Object key.)方法实现
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
        System.out.println("-------------------------------");
        // 获取所有键值对对象的集合，这一步相当于把map装进set中从而遍历set来找
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 增强for遍历得到每一个键值对对象
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }

    }
}