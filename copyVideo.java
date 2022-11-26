import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyVideo {
    public static void main(String[] args) throws IOException {
        long stime = System.currentTimeMillis();
        // Method1(); //字节流单字节复制 3049ms
        // Method2(); //字节流字符数组 4ms
        // Method3(); //字节缓冲流单字节 17ms
        // Method4(); //字节缓冲里字符数组 2ms

        long etime = System.currentTimeMillis();
        System.out.println("耗时：" + (etime - stime) + "ms");
    }

    // 字节流一次读写一字节
    public static void Method1() throws IOException {
        FileInputStream fls = new FileInputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream("a1.txt");
        int len;
        while ((len = fls.read(null)) != -1) {
            fos.write(len);
        }
        fls.close();
        fos.close();
    }

    // 字节流一次读写一个字节数组
    public static void Method2() throws IOException {
        FileInputStream fls = new FileInputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream("a1.txt");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fls.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fls.close();
        fos.close();
    }

    // 字节缓冲流一次读写一字节
    public static void Method3() throws IOException {
        FileInputStream fls = new FileInputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream("a1.txt");
        BufferedInputStream bis = new BufferedInputStream(fls);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len;
        while ((len = bis.read(null)) != -1) {
            bos.write(len);
        }
        fls.close();
        fos.close();
    }

    // 字节缓冲流一次读写一数组
    public static void Method4() throws IOException {
        FileInputStream fls = new FileInputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream("a1.txt");
        BufferedInputStream bis = new BufferedInputStream(fls);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        fls.close();
        fos.close();
    }

}
