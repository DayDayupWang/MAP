import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        // 字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("C:\\Users\\shinelon\\Desktop\\学习过程文件\\java\\MAP\\src\\fis.txt"));
        // 一次读取一个字节数据
        int by;
        while ((by = bis.read()) != -1) {
            System.out.println((char) by);
        }
        // 释放资源；
        // 一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        bis.close();
    }
}
