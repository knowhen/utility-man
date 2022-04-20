package cn.knowhen.utility.http;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2022-03-21  11:03
 **/
public class Data<T> extends Response {
    private T data;

    public Data(int code, String message) {
        this(code, message, null);
    }

    public Data(int code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    public static <T> Data<T> of(T data) {
        return new Data<>(200, "success", data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
