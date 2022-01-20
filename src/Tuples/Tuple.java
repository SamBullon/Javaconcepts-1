package Tuples;

import java.util.Objects;
import java.util.function.Function;

class Tuple2 <T1, T2> {
    // declaramos elementos de tupla: tipo y variables (atritbutos vacios)
    public final T1 t1;
    public final T2 t2;

    //Tuple2 recibe parametros a traves del constructor
    //los valores tp1 y tp2 se asignan a los atributos t1 y t2
    private Tuple2(T1 tp1, T2 tp2){
        this.t1 = tp1;
        this.t2 = tp2;
    }

    // t1 objeto de tipo T1, t2 objeto de tipo T2
    public static <T1, T2> Tuple2<T1, T2> of(T1 t1, T2 t2){
        Objects.requireNonNull(t1);
        Objects.requireNonNull(t2);
        //retorna y construye 2 objetos pegados
        return new Tuple2<>(t1, t2);
    }
    //do operation on T1
    //pasando clase function en T1 y R
    public <R> Tuple2<R, T2> apply_1(Function<T1, R> function){
        Objects.requireNonNull(function);
        return Tuple2.of(function.apply(t1), t2);
    }

}
