package Chain;

public class Officer implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public void order(String task) {
        if(next != null) {
            System.out.println("L'officier transmet la tâche au sous-officier");
            next.order(task);
        }
    }
}
