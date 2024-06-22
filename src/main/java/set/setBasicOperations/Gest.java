package main.java.set.setBasicOperations;

import java.util.Objects;

public class Gest {

    private String name;
    private int invitationId;

    public Gest(String name, int invitationId) {
        this.name = name;
        this.invitationId = invitationId;
    }

    public Gest() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gest gest)) return false;
        return getInvitationId() == gest.getInvitationId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvitationId());
    }

    @Override
    public String toString() {
        return "Gest{" +
                "name='" + name + '\'' +
                ", invitationId=" + invitationId +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInvitationId(int invitationId) {
        this.invitationId = invitationId;
    }

    public int getInvitationId() {
        return invitationId;
    }

}
