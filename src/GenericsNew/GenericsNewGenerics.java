package GenericsNew;

public class GenericsNewGenerics <T> {
    T ob;

    GenericsNewGenerics(T ob){
        this.ob = ob;
    }

    void printer(){
        System.out.println(ob);
    }
}
