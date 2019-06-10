public class TestDemo2 {
    public  static void sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
    }

    public static void printArr(int[]arr,String msg){
        System.out.println(msg);
        for (int i:arr){
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={8,9,4,6,8,7,2,3,1,5,5,8,9,7,};
        printArr(arr,"排序前");
        sort(arr);
        printArr(arr,"排序后");
    }
}
