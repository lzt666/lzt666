package QQChatRoom;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SingleClient {
    public static void main(String[] args) throws Exception{
        String serverName ="127.0.0.1";
        Integer Port=4406;
        try{
            Socket client=new Socket(serverName,Port);
            System.out.println("连接上服务器，服务区地址为:"+client.getInetAddress());
            PrintStream out =new PrintStream(client.getOutputStream(),true,"UTF-8");
            Scanner in =new Scanner(client.getInputStream());
            in.useDelimiter("\n");//向服务器输出内容
            out.println("client");
            if (in.hasNext()){
                System.out.println("服务器发送消息为:"+in.next());
            }
            in.close();
            out.close();
            client.close();
        }catch(IOException e){
            System.out.println("客户端通信出现异常，错误为"+e);
        }
    }
}
