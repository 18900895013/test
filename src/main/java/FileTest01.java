import java.io.*;
import java.util.Optional;

/**
 * @Author
 * @Date 2019/8/1 9:49
 **/
public class FileTest01 {
    public static void main(String[] args)throws Exception {
        File f = new File("G:\\test","timg.jpg");
        InputStream is = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(is);
        OutputStream os = new FileOutputStream("G:\\test\\image\\timg1.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int len = 0;
        byte[] bytes = new byte[1024];

        while ((len=bis.read(bytes))!=-1){

            bos.write(bytes,0,len);
        }
        bos.close();
        os.close();
        bis.close();
        is.close();
    }
}
