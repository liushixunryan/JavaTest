package cn.ryanliu.task14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
一个来源与目的地都不知道的情况下的dump()程序
 */
public class IO {
    public static void dump(InputStream src, OutputStream dest) throws IOException {   //数据来源与目的地
        try (InputStream input=src;OutputStream output=dest){           //尝试自动关闭资源
            byte[] data=new byte[1024];     //尝试从来源每次读取1024字节
            int length;
            while ((length=input.read(data)) !=-1){     //读出数据
                output.write(data,0,length);
            }
        }
    }
}
//这是一个将某个文档读入并另存为另一个文档,则可以这么使用
