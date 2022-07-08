package Singleton;

public class JDBCSingleton {
    private static JDBCSingleton jdbc;

    private JDBCSingleton(){
        }
    public static  JDBCSingleton getInstance(){
        if (jdbc==null){
        }
        return null;
    }


}
