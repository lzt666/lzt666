package javaclass;

        import java.util.Scanner;

public class LuoYuoRemember {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String string=scanner.nextLine();
            String[] code=string.split("_");
            String result=code[0];
            for (int i=1;i<code.length;i++){
                result+=(char)code[i].charAt(0)-'a'+'A';
                for (int j=1;j<code[i].length();j++){
                    result+=code[i].charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}
