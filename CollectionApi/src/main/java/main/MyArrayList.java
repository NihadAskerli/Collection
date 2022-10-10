package main;

import java.util.Iterator;

public class MyArrayList implements Iterable<String> {
    private String[] elementData = new String[10];
    int addedElementlength = 0;

    public void encureCapacity(String element) {
        if (elementData.length == addedElementlength) {
            String[] arr2 = new String[elementData.length + elementData.length / 2];
            for (int i = 0; i < elementData.length; i++) {
                arr2[i] = elementData[i];
            }
            elementData = arr2;


        }
        elementData[addedElementlength++] = element;
    }

        public String get ( int i){

        return elementData[i];
        }
        public int size(){
        return addedElementlength;

        }
public Iterator<String> iterator(){
        Iterator<String > iter=new Iterator() {
            int i=0;
            @Override
            public boolean hasNext() {
                return elementData.length<++i;
            }

            @Override
            public Object next() {
                return elementData[++i];
            }
        };
        return iter;
}
    }


