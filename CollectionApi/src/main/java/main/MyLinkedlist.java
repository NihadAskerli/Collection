package main;

public class MyLinkedlist {
    private Node lasElement;
    class Node{
        private Object obj;
        private Node nenxtElement;

        public  Node(Object obj) {
            this.obj = obj;
        }

        public void setNextElement(Node nextElement) {
            this.nenxtElement =nextElement ;
        }

    }
    public void add(Object obj){
        Node n=new Node(obj);
        if(lasElement==null){
            lasElement=n;
        }else {
            lasElement.nenxtElement=n;
            lasElement=n;
//            add processini linkedliste islemesi
        }
    }
}
