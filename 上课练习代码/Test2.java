public class Test2 {
    public static void leftRotateString(String str,int n){
        char[] arr=str.toCharArray();
        char[]arr1=new char[arr.length];
        int i=0;
        for(int j=n;j<arr.length;j++){
            arr1[i]=arr[j];
            i++;
        }
        for(int j=0;j<n;j++){
            arr1[i]=arr[j];
            i++;
        }
        String str1=new String(arr1);
        System.out.println(str1);

    }

    public static void main(String[] args) {
        leftRotateString("abcdefgh",2);
    }

}
