package GenericsNew;

public class GenericsNewMain {
    public static void main(String[] args) {

        GenericsNew ob = new GenericsNew(4);
        ob.printer();
        GenericsNewGenerics<Integer> ob2 = new GenericsNewGenerics<>(4);
        ob2.printer();
        GenericsNewGenerics<Double> ob3 = new GenericsNewGenerics<>(4.0);
        ob3.printer();

    }
}
