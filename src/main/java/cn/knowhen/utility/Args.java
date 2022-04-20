package cn.knowhen.utility;

import java.util.function.Supplier;

/**
 * @author: when
 * @create: 2022-03-21  11:07
 **/
public class Args {
    public static <T> T nonNull(T obj, String message) {
        if (obj == null)
            throw new IllegalArgumentException(message);
        return obj;
    }

    public static void check(boolean condition) {
        if (!condition) {
            throw new IllegalArgumentException();
        }
    }

    public static void check(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void check(boolean condition, Supplier<? extends RuntimeException> supplier) {
        if (!condition) {
            throw supplier.get();
        }
    }
}
