public interface ISequence {
    boolean add(int pos,Object data);//在pos位置插入val
    int search(Object key);//查找关键字key，找到返回key的下标，没有返回null
    boolean contains(Object key);
Object getPos(int pos);
Object remove(Object key);
int size();
void  display();
void clear();
}
