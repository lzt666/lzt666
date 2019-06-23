package QQChatRoom;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SingleServer {
    public static void main(String[] args)throws Exception {
        ServerSocket serverSocket=new ServerSocket(4406);
        try{
            System.out.println("等待客户端连接中......");
            Socket client=serverSocket.accept();
            System.out.println("有新客户端连接，信号为："+client.getPort());
            Scanner clientInput=new Scanner(client.getInputStream());//获取客户端的输入输出流
            clientInput.useDelimiter("\n");
            PrintStream clientOut=new PrintStream(client.getOutputStream(),true,
                    "UTF-8");//读取客户端输入
            if(clientInput.hasNext()){
                System.out.println(client.getInetAddress()+"说："+clientInput.hasNext());
            }
            clientOut.println("欢迎访问");
            clientInput.close();
            clientOut.close();
            serverSocket.close();

        }catch (IOException e){
            System.out.println("服务区通信异常，错误为"+e);
        }

    }
}
