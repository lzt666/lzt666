package javaclass;

public class getGreyCode {
    public String[] getGray(int n){
if (n==1){
    return new String[]{"0","1"};
}else{
    String[] temp=getGray(n-1);
    String[] result=new String[temp.length*2];
    for (int i=0;i<temp.length;i++)
        result[i]="0"+temp[i];
    int i,j;
    for (i=0,j=temp.length-1;i<temp.length&&j>=0;i++,j--)
        result[i+temp.length]="1"+temp[j];
    return result;
}
    }
}
