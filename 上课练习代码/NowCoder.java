package javaclass;
import java.util.Scanner;

public class NowCoder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String value=scanner.nextLine();
            char[]ch=value.toCharArray();
            for (int i=0;i<ch.length;i++){
                char chars=ch[i];
                if (ch[i]==' '){
                    continue;
                }else if ('A'<=chars){
                    chars=(char)('E'<chars?(chars-5):(chars+21));
                    ch[i]=chars;
                }
            }
            System.out.println(new String(ch));
        }
        }
    }

