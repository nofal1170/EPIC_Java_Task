package assignment7;

import org.w3c.dom.Node;

public class assignment7Application {
    //based on session 17 src/session17/MyLinkedList.java
    //TODO was to unzip a tuple with 2 linked lists and this is what i did
    public static <T, U> Tuple<MyLinkedList<T>, MyLinkedList<U>> unZip(MyLinkedList<Tuple<T, U>> zippedList) {
        MyLinkedList<T> firstList = new MyLinkedList<>();
        MyLinkedList<U> secondList = new MyLinkedList<>();

        Node node = zippedList.first;
        while (node != null) {
            Tuple<T, U> tuple = (Tuple<T, U>) node.data;
            firstList.add(tuple.getFirst());
            secondList.add(tuple.getSecond());
            node = node.next;
        }

        return new Tuple<>(firstList, secondList);
    }

}
