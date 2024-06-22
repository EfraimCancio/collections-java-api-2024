package main.java.set.setSearch;

import java.util.HashSet;
import java.util.Set;

public class ContactSet {

    private Set<Contact> contactSet;

    public ContactSet() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int celNumber) {
     contactSet.add(new Contact(name, celNumber));
    }

    public void showContact() {
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();

        for(Contact c : contactSet) {
            if(c.getName().startsWith(name)) {
                contactsByName.add(c);
            }
        }
        return contactsByName;
    }

    public Contact updateContact(String name, int newNumber) {
        Contact updateContact = null;

        for(Contact c : contactSet) {
            if(c.getName().equalsIgnoreCase(name)) {
                c.setCelNumber(newNumber);
                updateContact = c;
                break;
            }
        }

        return updateContact;
    }

    public static void main(String[] args) {

        ContactSet contactSet1 = new ContactSet();

        contactSet1.addContact("Pedro Luiz", 987654321);
        contactSet1.addContact("Pedro Algusto", 987654321);
        contactSet1.addContact("Maria Angelica", 987654321);
        contactSet1.addContact("Pedro", 987654321);
        contactSet1.addContact("Efras", 987654321);


        System.out.println("Lista depois das inserções: ");
        contactSet1.showContact();


        System.out.println("Buscar contatos por nome: ");



        contactSet1.updateContact("Pedro Luiz", 321654987);

        System.out.println("Lista depois do update: ");
        contactSet1.showContact();
    }
}
