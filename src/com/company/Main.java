package com.company;
import com.company.classWork7.*;
public class Main {

    public static void main(String[] args) {
//        taskAddress();
        taskBook();
        
    }

    private static void taskBook() {
        Book book = new Book(10,"Хорошая книга","Елена Маслякова","Издание представляет собой уникальное собрание рецептов пива, по которым можно приготовить его в домашних условиях. В книге собраны как старинные, так и новейшие способы приготовления пива. Прочитав эту книгу, вы станете настоящими ценителями, познакомитесь с традициями пития. Кроме того, вы узнаете о том, какие блюда можно приготовить с использованием пива и с чем лучше всего употреблять этот замечательный напиток.\n");
        System.out.println(book);
    }

    private static void taskAddress() {
        Address ad = new Address(65077,"Ukreine","Odessa","Pushkinskaya","128/9","64");
        System.out.println(ad);
    }
}
