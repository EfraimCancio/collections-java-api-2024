package main.java.set.setBasicOperations;

import java.util.HashSet;
import java.util.Set;

public class SetOfUniqueWords {

    private Set<String> words;

    public SetOfUniqueWords( ) {
        this.words = new HashSet<>();
    }

    @Override
    public String toString() {
        return "SetOfUniqueWords{" +
                "words=" + words +
                '}';
    }

    public void addWord(String word) {
        if (!checkWord(word)) {
            this.words.add(word);
        } else {
            System.out.println("Essa palavra já existe no conjunto!");

        }
    }

    public void removeWord (String word) {
        this.words.remove(word);
    }

    public Boolean checkWord (String word) {
       return this.words.contains(word);
    }


    public static void main(String[] args) {

        SetOfUniqueWords setOfUniqueWords = new SetOfUniqueWords();

        setOfUniqueWords.addWord("Efraim");
        System.out.println("Primeira palavra adicionada => " + setOfUniqueWords);

        setOfUniqueWords.addWord("Efraim");
        setOfUniqueWords.addWord("Maria");
        setOfUniqueWords.addWord("Bruno");
        setOfUniqueWords.addWord("Caio");
        setOfUniqueWords.addWord("Biel");
        setOfUniqueWords.addWord("Biel");

        System.out.println("Coleção apos todas as adiçõe => " + setOfUniqueWords);


        setOfUniqueWords.removeWord("Caio");
        setOfUniqueWords.removeWord("Biel");
        System.out.println("Coleção apos primeira remoção => " + setOfUniqueWords);

        setOfUniqueWords.removeWord("Biel");
        setOfUniqueWords.removeWord("Efraim");
        System.out.println("Coleção apos a segunda remoção => " + setOfUniqueWords);


    }
}
