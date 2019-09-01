package javaclass;


public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
if (array.length==0){
    return 0;
}
int begin=0;
int end=array.length-1;
int mid=begin;
while (array[begin]>=array[end]){
    if (end-begin==1){
        mid=end;
        break;
    }
    mid=(begin+end)/2;
    if (array[mid]>=array[begin]){
        begin=mid;
    }else if (array[mid]<=array[end]){
        end=mid;
    }
}
return array[mid];
    }
}
