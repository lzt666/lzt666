package javaclass;
import java.util.Scanner;
public class EncodeAndDecode {
        public static void main(String []args){
            Scanner scanner=new Scanner(System.in);
            while(scanner.hasNext()){
                String passwordEncode=scanner.nextLine();
                String passwordDecode=scanner.nextLine();
                char[]ch=passwordEncode.toCharArray();
                StringBuffer sb=new StringBuffer();
                for(int i=0;i<ch.length;i++){
                    if(ch[i]=='z'){
                        sb.append("A");
                    }else if(ch[i]>='a'&&ch[i]<'z'){
                        sb.append(String.valueOf((char)(ch[i]-31)));
                    }else if(ch[i]=='Z'){
                        sb.append("a");
                    }else if(ch[i]>='A'&&ch[i]<'Z'){
                        sb.append(String.valueOf((char)(ch[i]+33)));
                    }else if(ch[i]=='9'){
                        sb.append("0");
                    }else if(ch[i]>='0'&&ch[i]<'9'){
                        sb.append(Integer.valueOf(String.valueOf(ch[i]))+1);
                    }
                }
                System.out.println(sb.toString());
                char[]ch1=passwordDecode.toCharArray();
                StringBuffer sb1=new StringBuffer();
                for(int p=0;p<ch1.length;p++){
                    if(ch1[p]=='a'){
                        sb1.append("Z");
                    }else if(ch1[p]>'a'&&ch1[p]<='z'){
                        sb1.append(String.valueOf((char)(ch1[p]-33)));
                    }else if(ch1[p]=='A'){
                        sb1.append("z");
                    }else if(ch1[p]>'A'&&ch1[p]<='Z'){
                        sb1.append(String.valueOf((char)(ch1[p]+31)));
                    }else if(ch1[p]=='0'){
                        sb1.append("9");
                    }else if(ch1[p]>'0'&&ch1[p]<='9'){
                        sb1.append(Integer.valueOf(String.valueOf(ch1[p]))-1);
                    }
                }
                System.out.println(sb1.toString());
            }
        }
    }
