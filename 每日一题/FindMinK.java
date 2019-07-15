

package javaclass;

import java.util.ArrayList;

public class FindMinK {
    // 解决一：o(n)的算法：只有当我们可以修改输入的数组时可用
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int length = input.length;
        int start = 0;
        int end = length - 1;
        if (input == null || k > length || k <= 0)
            return list;
        else {
            // 基于快速排序的分割方法
            int index = Partition(input, length, start, end);
            // 这样调整以后，位于数组中左边的k个数字就是最小的k个数字(这k个数字不一定排序)
            while (index != k - 1) {
                // 如果比k大，在左边调整
                if (index > k - 1) {
                    end = index - 1;
                    index = Partition(input, length, start, end);
                } else {
                    // 如果比k小，调整右边
                    start = index + 1;
                    index = Partition(input, length, start, end);
                }
            }
            for (int i = 0; i < k; i++) {
                list.add(input[i]);
            }
            return list;
        }
    }

    // 在数组中选择一个数，比选择的数字小的数字移到数组的左边，比选择数字大的移动到数组的右边
    static int Partition(int[] data, int length, int start, int end) {
        if (data.length == 0 || length <= 0 || start < 0 || end >= length) {

            return -1;
        }
        // 选择从最后一个数为基准元素开始一次排序
        int index = start - 1;
        for (int i = start; i < end; ++i) {
            if (data[i] < data[end]) // 以最后一个元素为基准点进行划分
            {
                ++index;
                if (index != i) {
                    // 交换
                    int temp = data[i];
                    data[i] = data[index];
                    data[index] = temp;
                }
            }
        }

        ++index;
        // 交换
        int temp = data[index];
        data[index] = data[end];
        data[end] = temp;
        // System.out.print("index=" + index + " ");
        return index; // 返回一次排序后开始选择的数此刻所在最终位置索引

    }

    public static void main(String[] args) {
        int[] input = { 3, 9, 6, 8, -10, 7, -11, 19, 30, 12, 23};
        int k = 5;
        FindMinK g = new FindMinK();
        ArrayList<Integer> list = g.GetLeastNumbers_Solution(input, k);
        if (list != null) {
            for (int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + " ");
        } else {
            System.out.print(" ");
        }
    }
}
/*
import java.util.ArrayList;
import java.util.*;
public class FindMinK {

        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> leastk = new ArrayList<Integer>();
            if(input==null || input.length==0 || input.length<k) return leastk;
            for(int i =0;i<k;i++) {
                //冒泡排序，每次排序过程确定一个最小值
                for(int j = input.length-1;j>i;j--){
                    if (input[j - 1] > input[j]) { //交换，把小的顶到前面去
                        int temp = input[j];
                        input[j] = input[j - 1];
                        input[j - 1]= temp;
                    }
                }
                leastk.add(input[i]);
            }
            return leastk;
        }


    }



        */
/*public ArrayList<Integer>GetLeastNumbers_Solution(int[] input, int k) {
            ArrayList<Integer> array = new ArrayList<Integer>();
            if(input==null||input.length==0||k<=0||k>input.length){
                return array;
            }
            for(int i=k/2-1;i>=0;i--){
                buildMaxHeapSort(input,i,k);
            }
            for(int j=k;j<input.length;j++){
                if(input[j]<input[0]){
                    swap(input,0,j);
                    buildMaxHeapSort(input,0,k);
                }
            }
            for(int i=k-1;i>=0;i--){
                array.add(input[i]);
            }
            return array;
        }

        public void buildMaxHeapSort(int[] input,int i,int k){
            int leftchild=2*i;
            int rightchild=2*i+1;
            int larget=i;
            if(leftchild<k&&input[i]<input[leftchild]){
                larget=leftchild;
            }
            if(rightchild<k&&input[larget]<input[rightchild]){
                larget=rightchild;
            }
            if(larget!=i){
                swap(input,i,larget);
                buildMaxHeapSort(input,larget,k);
            }
        }

        public void swap(int[] input,int a,int b){
            int temp=input[a];
            input[a]=input[b];
            input[b]=temp;
        }
    }*//*



*/
/* public static void scheme2(int[] ins, int k) {
    int[] ks = new int[k];
    // 最先遍历的k个数放入数组中 o(k)
    for (int i = 0; i < k; i++) {
        ks[i] = ins[i];
    }
    //构建前k个数的最大堆
    headSort(ks);
    //n-k个数和前面和k中最大数比较
    for (int i = k; i < ins.length; i++) {
        //如果堆顶大于n-k中数,则交换位置
        if (ks[0] > ins[i]) {
            ks[0] = ins[i];
            //调整堆,堆顶被替换了,加入被替换的值非常小,会一直下沉到叶子节点.
            maxHeap(ks, ks.length, 0);
        }

    }
    // 输出最小的K个数
    for (int i = 0; i < k; i++) {
        System.out.print(ks[i] + " ");
    }



}

    private static void maxHeap(int[] ks, int length, int i) {
    }

    private static void headSort(int[] ks) {
    }*//*

   */
/* public static ArrayList<Integer> minK(int[] input, int k) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        if (input.length == 0 || input.length < k || k<= 0) {
            return out;
        }
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < input.length; i++) {
            if (set.size() < k) {
                set.add(input[i]);
            } else {
                int max = set.last();
                if (input[i] < max) {
                    set.remove(max);
                    set.add(input[i]);
                }
            }
        }
        out.addAll(set);
        return out;
    }

    public static void main(String[] args) {
        int k=6;
        int[]in=new int[]{3,6,9,8,-10,7,-11,19,30,12,23,5};


    }
}


*/

