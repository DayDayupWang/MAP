import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class outputStreamWriteDemo {
    public static void main(String[] args) throws IOException {
        // m1();
        // m2();
        // m3();
        // m4();
        m5();
    }

    // 直接写入
    public static void m1() throws IOException {
        OutputStreamWriter Files = new OutputStreamWriter(new FileOutputStream("D:\\a.txt"));
        Files.write(90);
        Files.close();
    }

    // 数组方式写入
    public static void m2() throws IOException {
        OutputStreamWriter Files = new OutputStreamWriter(new FileOutputStream("D:\\a.txt"));
        char[] chs = { 'a', 'b', 'c', 'd', 'e' };
        Files.write(chs);
        Files.close();
    }

    // 接受多个参数写入
    public static void m3() throws IOException {
        OutputStreamWriter Files = new OutputStreamWriter(new FileOutputStream("D:\\a.txt"));
        char[] chs = { 'a', 'b', 'c', 'd', 'e' };
        Files.write(chs, 1, 3);
        Files.close();
    }

    // 需要注意一下 文件的字符编码和idea要一直 最好都调成 utf-8
    public static void m4() throws IOException {
        OutputStreamWriter Files = new OutputStreamWriter(new FileOutputStream("D:\\a.txt"));
        String chs = "你好java";
        Files.write(chs);
        Files.close();

    }

    // 第五种
    public static void m5() throws IOException {
        OutputStreamWriter Files = new OutputStreamWriter(new FileOutputStream("D:\\a.txt"));
        String chs = "你好java";
        // System.out.println(chs);
        Files.write(chs, 1, 3);
        Files.close();
    }

}
