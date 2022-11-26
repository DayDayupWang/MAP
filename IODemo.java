import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;

        // 加入finally实现释放资源
        try {
            fos = new FileOutputStream("C:\\Users\\shinelon\\Desktop\\学习过程文件\\java\\MAP\\src\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // 字节输入流读数据步骤
        // 创建字节输入流对象

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\shinelon\\Desktop\\学习过程文件\\java\\MAP\\src\\fis.txt");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        // 一次读一个字节数据
        int by;
        while ((by = fis.read()) != -1) {
            System.out.println((char) by);
        }
        // 一次读一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        // 复制文件的操作
        // 考虑好来源和去处即可
        // int by;
        // while ((by = fis.read()) != -1) {
        // fos.write(by);
        // }
        fis.close();
        fos.close();
    }
}
