
import java.io.*;

public class copyJavaNewMethodDemo {
    public static void main(String[] args) throws IOException {
        // 根据数据源创建字符缓冲输入流对象
        BufferedReader bis = new BufferedReader(new FileReader("myCharStream\\java.txt"));
        // 根据目的地创建字符缓冲输出流对象
        BufferedWriter bos = new BufferedWriter(new FileWriter("myCharStream\\copy.txt"));

        // 读写数据，复制文件
        // 使用字符缓冲流特有功能实现比如readline
        String len;
        while ((len = bis.readLine()) != null) {
            bos.write(len);
            bos.newLine();
            bos.flush();
        }

        // 释放资源
        bis.close();
        bos.close();
    }
}
