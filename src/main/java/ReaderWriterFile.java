import java.io.*;
import java.util.Optional;

/**
 * @Author
 * @Date 2019/8/1 9:20
 **/
public class ReaderWriterFile {
    public static void main(String[] args) throws Exception {
        File f  = new File("G:\\test","a.txt");

        Writer w  = new FileWriter(f,true);

        w.append("你好ss");

        w.close();
        w.close();
    }
}
