package QQChatRoom.ChatRoomClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadDataFromServerThread extends Thread{
    private final Socket socket;
    public ReadDataFromServerThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try{
            InputStream in=this.socket.getInputStream();
            Scanner scanner=new Scanner(in);
            while(true){
                try{
                    String mesage=scanner.nextLine();
                    System.out.println("来自服务端："+mesage);
                }catch (NoSuchElementException e){
                    break;
                }
            }
        }catch (IOException e){
            
        }
        super.run();
    }
}
