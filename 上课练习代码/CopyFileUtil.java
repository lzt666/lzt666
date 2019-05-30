package IO;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileUtil {
    public static boolean  copyFile (String srcFilePath,String destFilePath){
        File inFile =new File(srcFilePath);
        File outFile=new File(destFilePath);
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream =null;
        try{
            fileInputStream=new FileInputStream(inFile);
            fileOutputStream=new FileOutputStream(outFile);
            copyFileHandle(fileInputStream,fileOutputStream);
        }catch(IOException e){
            e.printStackTrace();
            return false;

        }finally{
            try{
                fileInputStream.close();
                fileOutputStream.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
return true;

    }

    private static void copyFileHandle(InputStream inputStream, OutputStream outputStream)throws IOException {
    long start  =System.currentTimeMillis();
    int tmp=0;
    do{
        tmp=inputStream.read();
        outputStream.write(tmp);
    }while(tmp!= -1);
    long end =System.currentTimeMillis();
        System.out.println("拷贝文件所花费的时间:"+(end-start));
    }
    public static void main(String[] args) {
        if (args.length != 2) {
            // 现在参数不不是两个
            System.out.println(" 非法操作，命令为: java CopyFile 源⽂文件 路路径 ⽬目标⽂文件路路径");
            return;
        }
        String sourcePath = args[0]; // 取得源⽂文件路路径
        String destPath = args[1]; // 取得⽬目标路路径
        if (CopyFileUtil.fileIsExists(sourcePath)) {
            CopyFileUtil.createParentsDir(sourcePath); // 创建⽬目录
            System.out.println(CopyFileUtil.copyFile(sourcePath, destPath) ? "文件拷⻉成功" : "文件拷⻉失败");
        }
        else {   
            System.out.println("源⽂文件不存在，⽆法进行拷⻉");  } }

    private static boolean fileIsExists(String sourcePath) {
        return new File(sourcePath).exists();
    }

    private static void createParentsDir(String sourcePath) {
File file=new  File(sourcePath);
if (!file.getParentFile().exists()){
    file.getParentFile().mkdirs();

    }


}
}
