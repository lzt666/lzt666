import java.util.Arrays;

public class TestDemo4 {
    public static void main(String[] args) {
        MysSequence mysSequence= new MysSequence();
        mysSequence.add(1,18);
        mysSequence.add(1,"bit");
        mysSequence.add(2,"hello");
        mysSequence.add(1,165);
        mysSequence.display();
        System.out.println(mysSequence.remove("bit"));
        mysSequence.display();
        System.out.println(mysSequence.contains("hengheng"));
        mysSequence.clear();
        mysSequence.display();
    }
    public static void bubbleSort(int []array){
        for(int i=0;i<array.length-1;i++){
            boolean swap=false;
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[i];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap=true;

                }
            }
            if (!swap){
                break;
            }
        }
    }

    public static void main1(String[] args) {
        int []array={8,6,45,32,7,51,22};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
