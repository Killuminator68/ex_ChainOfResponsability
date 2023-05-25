package Chain;

public class General implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public void order(String task) {
        if(next != null) {
            System.out.println("Le général passe la tâche à l'officier");
            next.order(task);
        }
    }
}