package main.java.list.search;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {

    private List<Integer> sumNumbers;

    @Override
    public String toString() {
        return "SumNumbers{" +
                "sumNumbers=" + sumNumbers +
                '}';
    }

    public SumNumbers() {
        this.sumNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        sumNumbers.add(number);
    }

    public int calculateSun() {
        int total = 0;
        for (int n : sumNumbers) {
            total += n;
        }
        return total;
    }

    public int findBigNumber() {
        int result = 0;
        for(int n : sumNumbers){
            if(n > result) {
                result = n;
            }
        }
        return result;
    }
    public int findSmallNumber() {
        int result= Integer.MAX_VALUE;
        for(int n : sumNumbers){
            if(n < result) {
                result = n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Entrou no main");

        SumNumbers listSunNumbers = new SumNumbers();
        listSunNumbers.addNumber(3);
        listSunNumbers.addNumber(10);
        listSunNumbers.addNumber(15);
        listSunNumbers.addNumber(25);

        System.out.println("Lista após a adição dos numeros: " + listSunNumbers);
        System.out.println("Soma dos numeros: " + listSunNumbers.calculateSun());
        System.out.println("O maior número é: " + listSunNumbers.findBigNumber());
        System.out.println("O menor número é: " + listSunNumbers.findSmallNumber());

    }
}
