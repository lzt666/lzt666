public class TestDemo3 {

    public static void printArr(int[]arr){

        for (int i:arr){
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={9,44,6,44,2,20,5,1,4,4,2,46,79,3,1};
        int []arrnew=arr.clone();
        System.out.print("arr:");
        printArr(arr);
        System.out.println("arr.length:"+arr.length);
        System.out.println("-----------------------");
        System.out.println("arrnew:");
        printArr(arrnew);
        System.out.println("arrnew.length:"+arrnew.length);
        if(arr==arrnew) {
            System.out.println("数组arr和数组arrnew的引用地址相同！！！！");
        }
            else{
                System.out.println("数组arr和数组arrnew的引用地址相同！！！！");

        }
    }

}
