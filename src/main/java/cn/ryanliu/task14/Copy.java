package cn.ryanliu.task14;
/*
将某个文档读入并另存为另一个文档,调用IO方法
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        try {
            IO.dump(
                    new FileInputStream(args[0]),
                    new FileOutputStream(args[1])
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
