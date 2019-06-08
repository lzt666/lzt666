package Test_code;

    public  class Test{
private static String commStr;
private static ThreadLocal<String> threadStr = new ThreadLocal<String>();
public static void main(String[]args) {
    commStr = "main";
    threadStr.set("main");

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            commStr = "thread";
            threadStr.set("thread");
        }
    });
    thread.start();
    try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println(commStr);
    System.out.println(threadStr.get());
}
    }/*synchronized(Sync.class)
            System.out.println("test方法开始，当前线程为 " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            { e.printStackTrace();
            }
            System.out.println("test方法结束，当前线程为 " + Thread.currentThread().getName());

        }
    } }
class MyThread extends Thread {

    @Override
    public void run() {
        Sync sync = new Sync();
        sync.test(); } }
public class Test{
public static void main(String[] args) {
    for (int i = 0; i < 3 ; i++) {
        Thread thread = new MyThread() ;
        thread.start();
    }
} */
/*;      
public class  Test {


    public static void main(String[] args) {

        String str = "i am good boy" ;
        System.out.println(reverseSentence(str));

    }

    public static String reverseSentence(String str) {
        if (str == null || str.length() == 0)
            return null;
        char ch[] = str.toCharArray();
        f(ch, 0, ch.length - 1);
        int start = 0;
        int end = 0;
        while (end < ch.length) {
            if (ch[end] != ' ') {
                if (end == ch.length - 1) {
                    f(ch, start, end);
                }
                end++;
            } else if (ch[end] == ' ') {
                f(ch, start, end - 1);
                end++;
                start = end;
            }
        }
        return String.valueOf(ch);
    }

    //局部逆转函数
    public static void f(char[] ch, int start, int end) {
        if (ch == null || ch.length == 0 || start == end)
            return;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}

  */
/*  public String reverseSentence_1(String str)
    {
        if (str.length() == 0)
        {
            return str;
            if (str.trim().equals(" "))
            {
                return str;
                StringBuilder sb = new StringBuilder();
                String[] s = str.split(" ");
                for (int i = s.length - 1; i > 0; i--)
                {
                    sb.append(s[i]);
                    sb.append(" ");

                }
                sb.append(s[0]);
                return sb.toString();
            }
        }
        return reverseSentence_1( str);
    }
}

      *//*




   */
/*public String
        String string="1f4567";
        for(int i=0;i< string.length();i++){
            if(string.charAt(0)<'0'|| string.charAt(0)>'9'){
                return false;
            }
        }

        return true;

         *//*
*/
/* String  str;
        InputStreamReader stdin=new InputStreamReader(System.in);
        BufferedReader bufin=new BufferedReader(stdin);
        try{
            System.out.print("请输入字符:");
            str=bufin.readLine();
            System.out.println("你输入的字符为:"+str);

        }
        catch(Exception e){
            System.err.println("发生I/O错误！！！");
            e.printStackTrace();
        }*//*
*/
/*

    public static void main(String[] args) {
    String str ='1f4567';
*//*


*/


