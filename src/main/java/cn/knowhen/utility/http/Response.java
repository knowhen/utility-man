package cn.knowhen.utility.http;

/**
 * @author: when
 * @create: 2022-03-21  11:02
 **/
public class Response {

    private int code;
    private String message;

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Response of(int code, String message) {
        return new Response(code, message);
    }

    public static Response ok() {
        return new Response(200, "success");
    }

    public static Response fail(String message) {
        return new Response(500, message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
