import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;

public class listDirectoryDemo {
    public static void main(String[] args) {
        File scFile = new File("C:\\Users\\shinelon\\Desktop\\学习过程文件\\java_notes");
        getAllFilePath(scFile);

    }

    public static void getAllFilePath(File scFile) {
        File[] fileArray = scFile.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                // 判断file 对象是否为目录
                if (file.isDirectory()) {
                    // 是目录的话调用方法，进入下一层目录
                    getAllFilePath(file);
                } else {
                    // 不是的话获得绝对路径输出到控制台
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
