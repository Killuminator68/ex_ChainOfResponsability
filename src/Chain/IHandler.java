package Chain;

public interface IHandler {
    void setNext(IHandler handler);
    void order(String task);
}
