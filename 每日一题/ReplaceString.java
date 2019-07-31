package javaclass;

        import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s1=scanner.nextLine();
            String s2=scanner.nextLine();
            String pattern="["+s2+"]";
            String result=s1.replaceAll(pattern,"");
            System.out.println(result);
        }
    }
}
