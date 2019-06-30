package QQChatRoom.ChatRoomClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SingleThreadClient {
    public static void main(String[] args) {
        String ip="127.0.0.1";//服务器端口号，地址IP
        int port=4406;
        try{
            Socket socket=new Socket(ip,port);
            //数据传输
            OutputStream out=socket.getOutputStream();
            PrintStream printStream=new PrintStream(out);
            printStream.println("服务器，我来了");
            printStream.flush();
            //接收数据
            InputStream in =socket.getInputStream();
            Scanner scanner=new Scanner(in);
            System.out.println("来自服务端的数据:"+scanner.nextLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
