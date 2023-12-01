import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Book book = new Book(1L,"Test1");

        Method myMethod = book.getClass().getDeclaredMethod("myMethod",String.class);
        myMethod.setAccessible(true);
        String res = (String) myMethod.invoke(book, "My param");
        System.out.println(res);
    }
}
