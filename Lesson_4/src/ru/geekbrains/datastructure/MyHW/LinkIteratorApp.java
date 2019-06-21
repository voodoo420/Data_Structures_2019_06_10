package ru.geekbrains.datastructure.MyHW;

public class LinkIteratorApp {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        LinkIterator itr = new LinkIterator(list);

        itr.insertAfter("Artem", 20);       //Artem
        itr.insertBefore("Sergey", 10);     //Sergey,Artem
        itr.insertAfter("Vasya", 15);       //Sergey,Vasya,Artem
        list.display();

        itr.deleteCurrent();    //-Vasya
        list.display();

        itr.reset();            //on Sergey
        itr.nextLink();         //on Artem
        itr.deleteCurrent();    //- Artem
        list.display();


    }


}
