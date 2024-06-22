package main.java.set.setBasicOperations;

import jdk.dynalink.linker.GuardingDynamicLinkerExporter;

import java.util.HashSet;
import java.util.Set;

public class GestSet {

    private Set<Gest> gestSet;

    public GestSet() {
        this.gestSet = new HashSet<>();
    }

    public void addGest(String name, int invitationId) {
        gestSet.add(new Gest(name, invitationId));
    }

    public void removeGestByInvitationId(int invitationId) {
        Gest gestToRemove = null;

        if(!gestSet.isEmpty()) {
            for (Gest g : gestSet) {
                if (g.getInvitationId() == invitationId) {
                    gestToRemove = g;
                    break;
                }
            }
            gestSet.remove(gestToRemove);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int countGests() {
        return gestSet.size();
    }

    public void showGests() {
        if (!gestSet.isEmpty()) {
            System.out.println(gestSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {

        GestSet gestSet1 = new GestSet();

        System.out.println("Existem " + gestSet1.countGests() + " convidado(s) dentro do Set de Convidados");

        gestSet1.addGest("Efraim", 20);
        gestSet1.addGest("Biel", 30);
        gestSet1.addGest("Maria", 40);
        gestSet1.addGest("João", 50);
        gestSet1.addGest("Marcos", 60);
        gestSet1.addGest("Luiz", 70);

        System.out.println("Existem " + gestSet1.countGests() + " convidado(s) dentro do Set de Convidados");

        gestSet1.removeGestByInvitationId(60);
        gestSet1.removeGestByInvitationId(70);
        System.out.println("Existem " + gestSet1.countGests() + " convidado(s) dentro do Set de Convidados após a remoção");

        System.out.println("Convidados no conjunto após a remoção:");
        gestSet1.showGests();
    }
}
