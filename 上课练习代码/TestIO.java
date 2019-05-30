package IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestIO {
    public static void main(String[] args) throws IOException {
   File file =new File(File.separator+"Users"+File.separator+"yuisama"+File.separator
   +"Desktop"+File.separator+"test.png");
   if (file.exists()&&file.isFile()){
       System.out.println("文件大小:"+file.length());
       System.out.println("最后一次修改日期:"+new Date(file.lastModified()));
   }

    }
}
