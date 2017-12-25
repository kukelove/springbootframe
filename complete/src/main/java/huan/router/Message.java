package huan.router;

public class Message {
    public int status;
    public Object extra;
    public String describe;

    public Message(int status, Object extra, String describe) {
        this.status = status;
        this.extra = extra;
        this.describe = describe;
    }
}
