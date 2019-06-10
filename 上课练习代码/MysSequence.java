import sun.invoke.empty.Empty;

import java.util.Arrays;

public class MysSequence implements  ISequence {
    private  Object[] elem;
    private  int usedSize;
    private static final int DEFAULT_SIZE=0;
    public MysSequence(){
        this.elem=new Object[DEFAULT_SIZE];
        this.usedSize=0;
    }
public  boolean isFull() {
    if (this.usedSize ==this.elem.length) {
        return true;
    }
    return false;
}
    @Override
    public boolean add(int pos, Object data) {
        if (pos < 0 || pos > this.usedSize) {
            return false;
        }
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
        }

        for(int i=this.usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
        return true;
    }


    public boolean isEmpty(){
        return  this.usedSize==0;
    }

    @Override
    public int search(Object key) {
        if(key==null){
            return -1;
        }
        if(isEmpty()){
            throw new UnsupportedOperationException("表为空");
        }
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object key) {
       if(key==null){
    return  false;

}
        if(isEmpty()) {
            throw new UnsupportedOperationException("顺序表为空");
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getPos(int pos) {
        if(pos<0||pos>=this.usedSize){
            return null;
        }
        return this.elem[pos];
    }

    @Override
    public Object remove(Object key) {//删除之前保存需要删除的值作为返回值
        int index=search(key);
        if(index==-1){
            return null;
        }
        Object oldData=this.elem[index];
        int i=0;
        for(i=index;i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.elem[i+1]=null;
        this.usedSize--;
        return oldData;

    }

    @Override
    public int size() {
        return this.usedSize;
    }

    @Override
    public void display() {
for (int i=0;i<=this.usedSize;i++){
    System.out.print(this.elem[i]+" ");

}
        System.out.println();
    }

    @Override
    public void clear() {
    for(int i =0;i<this.usedSize;i++){
        this.elem[i]=null;
    }
    this.usedSize=0;

    }
}
