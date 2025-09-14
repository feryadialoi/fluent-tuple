package dev.feryadialoi.fluenttuple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuplesTest {

    @Test
    void testOfTuple2() {
        Tuple2<Integer, Integer> tuple2 = Tuples.of(1, 2);
        assertEquals(1, tuple2.t1().intValue());
        assertEquals(2, tuple2.t2().intValue());
    }

    @Test
    void testOfTuple3() {
        Tuple3<Integer, Integer, Integer> tuple3 = Tuples.of(1, 2, 3);
        assertEquals(1, tuple3.t1().intValue());
        assertEquals(2, tuple3.t2().intValue());
        assertEquals(3, tuple3.t3().intValue());
    }

    @Test
    void testOfTuple4() {
        Tuple4<Integer, Integer, Integer, Integer> tuple4 = Tuples.of(1, 2, 3, 4);
        assertEquals(1, tuple4.t1().intValue());
        assertEquals(2, tuple4.t2().intValue());
        assertEquals(3, tuple4.t3().intValue());
        assertEquals(4, tuple4.t4().intValue());
    }

    @Test
    void testOfTuple5() {
        Tuple5<Integer, Integer, Integer, Integer, Integer> tuple5 = Tuples.of(1, 2, 3, 4, 5);
        assertEquals(1, tuple5.t1().intValue());
        assertEquals(2, tuple5.t2().intValue());
        assertEquals(3, tuple5.t3().intValue());
        assertEquals(4, tuple5.t4().intValue());
        assertEquals(5, tuple5.t5().intValue());
    }

    @Test
    void testOfTuple6() {
        Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> tuple6 = Tuples.of(1, 2, 3, 4, 5, 6);
        assertEquals(1, tuple6.t1().intValue());
        assertEquals(2, tuple6.t2().intValue());
        assertEquals(3, tuple6.t3().intValue());
        assertEquals(4, tuple6.t4().intValue());
        assertEquals(5, tuple6.t5().intValue());
        assertEquals(6, tuple6.t6().intValue());
    }

    @Test
    void testOfTuple7() {
        Tuple7<Integer, Integer, Integer, Integer, Integer, Integer, Integer> tuple7 = Tuples.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(1, tuple7.t1().intValue());
        assertEquals(2, tuple7.t2().intValue());
        assertEquals(3, tuple7.t3().intValue());
        assertEquals(4, tuple7.t4().intValue());
        assertEquals(5, tuple7.t5().intValue());
        assertEquals(6, tuple7.t6().intValue());
        assertEquals(7, tuple7.t7().intValue());
    }

}