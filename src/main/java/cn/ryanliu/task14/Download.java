package cn.ryanliu.task14;

//import com.sun.org.apache.xml.internal.utils.URI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/*
从Http服务器读取某个网页,并另存为文档,调用IO.dump()方法
 */
public class Download {
    public static void main(String[] args) throws IOException {
        URL url=new URL(args[0]);
        InputStream src=url.openStream();
        OutputStream dest =new FileOutputStream(args[1]);
        IO.dump(src,dest);
    }


}
