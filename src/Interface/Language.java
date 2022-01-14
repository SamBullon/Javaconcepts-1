package Interface;

public interface Language {
    void sayHi();
    default void sayBye(){
        System.out.println("By from Interface");
    }
}
