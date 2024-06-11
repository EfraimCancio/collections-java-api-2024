package main.java.list.basicOperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addItem(String name, double price, int amount) {
        shoppingCart.add(new Item(name, price, amount));
    }

    public void deleteItem(String name) {
        List <Item> itensToRemove = new ArrayList<>();

        for(Item i : shoppingCart) {
            if (i.getName().equalsIgnoreCase(name)) {
                itensToRemove.add(i);
            }
        }
        shoppingCart.removeAll(itensToRemove);
    }

    public double getFullValueOfCart() {
        double fullValue = 0.0;
        for(Item i : shoppingCart) {
            fullValue += i.getPrice() * i.getAmount();
        }
        return fullValue;
    }

    public void getItensOfCart() {
         System.out.println(shoppingCart);
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.println("Itens da lista no inicio do programa: ");
        shoppingCart.getItensOfCart();

        shoppingCart.addItem("Celular", 500.00, 2);
        shoppingCart.addItem("Mouse", 30.00, 1);
        shoppingCart.addItem("Teclado", 100, 5);
        shoppingCart.addItem("Monitor", 500.00, 1);
        System.out.println("Itens da lista após a inclusão de itens: ");
        shoppingCart.getItensOfCart();
        System.out.println("Valor Total do carrinho: " + shoppingCart.getFullValueOfCart());


        shoppingCart.deleteItem("Mouse");
        System.out.println("Itens da lista após a exclusão de itens: ");
        shoppingCart.getItensOfCart();
        System.out.println("Valor Total do carrinho: " + shoppingCart.getFullValueOfCart());
    }
}
