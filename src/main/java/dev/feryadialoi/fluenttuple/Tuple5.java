package dev.feryadialoi.fluenttuple;

public record Tuple5<T1, T2, T3, T4, T5>(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
    public Tuple4<T1, T2, T3, T4> toTuple4() {
        return new Tuple4<>(t1, t2, t3, t4);
    }

    public Tuple3<T1, T2, T3> toTuple3() {
        return new Tuple3<>(t1, t2, t3);
    }

    public Tuple2<T1, T2> toTuple2() {
        return new Tuple2<>(t1, t2);
    }
}
