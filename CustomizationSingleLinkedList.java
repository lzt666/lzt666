//题目描述：实现一个支持泛型的单链表
/**
 * Author: secondriver
 * Created: 2018/9/16
 */
public class CustomizationSingleLinkedList<T> {

    class Node<T> {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    //创建空链表
    public CustomizationSingleLinkedList() {
        this.head = null;
        this.size = 0;
        //TODO
    }

    //以指定数据元素来创建链表，该链表只有一个元素
    public CustomizationSingleLinkedList(T element) {
        this.head = new Node(element, null);
        this.size++;

        //TODO
    }

    /**
     * 返回链表长度
     *
     * @return
     */
    public int length() {

        //TODO
        return this.size;
    }

    /**
     * 获取链表中指定索引的元素
     *
     * @param index
     * @return
     */
    public T get(int index) {
        Node cur = getNodeByIndex(index);
        return (T) cur.data;
        //TODO

    }

    private Node getNodeByIndex(int index) {

        if (index < 0 || index >= this.length() - 1) {
            throw new IllegalArgumentException("超过了范围");
        }
        Node cur = this.head;
        int curIndex = 0;

   /* while (cur!=null){
        if (curIndex==index){
            return cur;
        }
        cur=cur.next;
        curIndex++;
    }*/

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        //TODO
        return cur;
    }

    /**
     * 查找链表中指定元素的索引
     *
     * @param element
     * @return
     */
    public int locate(T element) {


        Node cur = this.head;
        int curIndex = 0;
        while (cur != null) {
            if (element == null) {
                if (element.equals(cur.data)) {
                    return curIndex;
                }
            } else {
                if (cur.data == element) {
                    return curIndex;
                }
            }
            curIndex++;
            cur = cur.next;
        }

        //TODO
        return -1;
    }

    /**
     * 向线性表指定位置插入一个元素
     *
     * @param element
     * @param index
     */
    public void insert(T element, int index) {
        Node node = new Node(element, null);
        Node pNode = getNodeByIndex(index);
        node.next = pNode.next;
        pNode.next = node;
        this.size++;
    }
    //TODO


    /**
     * 采用尾插入法为链表添加新节点
     *
     * @param element
     */
    public void add(T element) {
        this.insert(element, this.length() - 1);
        //TODO
    }

    /**
     * 采用头插入法为链表添加新节点
     *
     * @param element
     */
    public void addAtHeader(T element) {
        this.insert(element, 0);
        //TODO
    }

    /**
     * 删除链表中指定索引处的元素
     *
     * @param index
     * @return
     */
    public T delete(int index) {
        if (index < 0 || index > this.length() - 1) {
            throw new IllegalArgumentException("  ");
        }
        /*Node cur=getNodeByIndex(index);
        if (cur==null){
            return null;
        }
        else{

        }*/
        if (index == 0) {
            Node head = getNodeByIndex(0);
            if (head != null) {
                this.head = head.next;
                return (T) head.data;
            }
        } else {
            Node preNode = getNodeByIndex(index - 1);
            Node curNode = getNodeByIndex(index);
            preNode.next = curNode.next;
            return (T) curNode.data;
        }
        return null;

        //TODO
    }

    /**
     * 删除链表中最后一个元素
     *
     * @return
     */
    public T remove() {
        return this.delete(this.size - 1);
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    public boolean empty() {
        return this.size == 0;

        //TODO
    }

    /**
     * 清空链表
     */
    public void clear() {

        this.size = 0;
        this.head = null;
        //TODO
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node cur = this.head;
        while (cur != null) {
            sb.append(cur.data);
            sb.append(",");
            cur = cur.next;
        }
        if (!this.empty()) {
            sb.setLength(sb.length() - 2);
            sb.append("]");
            return sb.toString();

        }
    return null;
    }
        public static void main (String[]args){
            CustomizationSingleLinkedList<String> list = new CustomizationSingleLinkedList<>();
            System.out.println(list);
            //TODO
        }
    }
