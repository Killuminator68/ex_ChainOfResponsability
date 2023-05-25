package Chain;

public class Main {
    public static void main(String[] args) {
        // Création des handlers
        IHandler general = new General();
        IHandler officer = new Officer();
        IHandler subOfficer = new SubOfficer();
        IHandler soldier = new Soldier();

        // Configuration de la chaîne
        general.setNext(officer);
        officer.setNext(subOfficer);
        subOfficer.setNext(soldier);

        // Envoi de la tâche
        general.order("Faire le ménage");
    }
}

