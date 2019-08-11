package javaclass;

        import java.util.ArrayList;
        import java.util.Scanner;

public class MuBangPinTu {//木棒拼图

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            ArrayList<Integer>arrayList=new ArrayList<>();
            long sum=0;
            int maxlen=0;
            int n=scanner.nextInt();
            for (int i=0;i<n;i++){
                int opreater=scanner.nextInt();
                int len=scanner.nextInt();
                if (opreater==1){
                    if (len>maxlen){
                        maxlen=len;
                    }
                    sum+=len;
                    arrayList.add(len);
                }else {
                    arrayList.remove((Integer)len);
                    if (len==maxlen){
                        maxlen=getMaxlen(arrayList);
                    }
                    sum-=len;
                }
                if (arrayList.size()<3){
                    System.out.println("No");
                }else if (sum-maxlen>maxlen){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
        scanner.close();
    }

    private static int getMaxlen(ArrayList<Integer> arrayList) {
        int maxlen=arrayList.get(0);
        for (int i=1;i<arrayList.size();i++){
            if (arrayList.get(i)>maxlen){
                maxlen=arrayList.get(i);
            }
        }
        return maxlen;
    }
}
