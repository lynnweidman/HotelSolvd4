package interfaces;

import java.util.List;

public interface Print<T> {
    public static void print(List list) {
        list.forEach(System.out::println);
    }

}
