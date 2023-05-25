package Chain;

public class Soldier implements IHandler {

    @Override
    public void setNext(IHandler handler) {
        // Il n'y a pas de gestionnaire suivant pour le soldat
    }

    @Override
    public void order(String task) {
        System.out.println("Je suis un soldat, et je fais le ménage");
    }
}
