package ru.geelbrains.datastructure.ads.MyHW;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DequeImplTest {

    private Deque<Integer> deque;

    @Before
    public void init() {
        deque = new DequeImpl<>(5);
    }

    @Test
    public void testRightAddRemove() {
        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(3);
        Assert.assertSame(3,deque.removeRight());
    }

    @Test
    public void testLeftAddRemove() {
        deque.insertLeft(3);
        deque.insertLeft(2);
        deque.insertLeft(1);
        Assert.assertSame(1,deque.removeLeft());
    }

    @Test
    public void completeTest(){
        deque.insertLeft(1);    //1
        deque.insertLeft(2);    //2,1
        deque.insertRight(3);   //2,1,3
        deque.insertLeft(4);    //4,2,1,3
        deque.insertRight(5);   //4,2,1,3,5

        Assert.assertFalse(deque.insertRight(6));
        Assert.assertSame(4,deque.removeLeft());    //2,1,3,5
        Assert.assertSame(2,deque.removeLeft());    //1,3,5
        Assert.assertSame(5,deque.removeRight());   //1,3
        Assert.assertSame(3,deque.removeRight());   //1
        Assert.assertSame(1,deque.removeRight());   //null
        Assert.assertNull(deque.removeLeft());
    }

}
