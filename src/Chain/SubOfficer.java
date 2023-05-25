package Chain;

public class SubOfficer implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public void order(String task) {
        if(next != null) {
            System.out.println("Le sous-officier passe la tâche au soldat");
            next.order(task);
        }
    }
}
