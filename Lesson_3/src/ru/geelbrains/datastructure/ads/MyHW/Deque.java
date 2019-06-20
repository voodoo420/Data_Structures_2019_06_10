package ru.geelbrains.datastructure.ads.MyHW;

import ru.geelbrains.datastructure.ads.queue.Queue;

public interface Deque <E> extends Queue<E> {

    boolean insertLeft(E value);

    boolean insertRight(E value);

    E removeLeft();

    E removeRight();

}
