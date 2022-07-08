package Singleton;

public class JDBCSingletonDemo {
    static  int count=1;
    static int choice;

    public static void main(String[] args) {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
    }
}
