package javaclass;
import java.util.*;
public class TelephoneNumber {
        public static void main(String[]args){
            String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            String str2="222333444555666777788899991234567890";
            Scanner scanner=new Scanner(System.in);
            while(scanner.hasNext()){
                int n=scanner.nextInt();
                ArrayList<String>arrayList=new ArrayList<>();
                for(int i=0;i<n;i++){
                    String str=scanner.next();
                    str=str.replace("-","");
                    String result="";
                    for(int j=0;j<7;j++){
                        result+=str2.charAt(str1.indexOf(str.charAt(j)+""));
                    }
                    result=result.substring(0,3)+"-"+result.substring(3,7);
                    if(!arrayList.contains(result))
                        arrayList.add(result);
                }
                Collections.sort(arrayList);
                for(int k=0;k<arrayList.size();k++){
                    System.out.println(arrayList.get(k));
                }
                System.out.println();



            }
        }
    }

