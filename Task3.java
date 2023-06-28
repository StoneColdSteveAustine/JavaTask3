package org.example;

import org.example.Task3.Books;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        Books book_1 = new Books("Мастер и Маргарита", "Булгаков", 395.20, 1988, 313);
        Books book_2 = new Books("Вино из одуванчиков", "Брэдберри", 240.95, 2021, 276);
        Books book_3 = new Books("Мы", "Замятин", 390.50, 1974, 416);
        Books book_4 = new Books("Фауст", "Гете", 250.99, 2000, 340);
        Books book_5 = new Books("Мертвые души", "Гоголь", 315.90, 1980, 268);
        Books book_6 = new Books("Божественная комедия", "Данте", 420.55, 2012, 423);
        Books book_7 = new Books("Так говорил Заратустра", "Ницше", 330.95, 2023, 356);
        Books book_8 = new Books("Пармская обитель", "Стендаль", 200.99, 2016, 213);

        List<Books> booksList = new ArrayList<>();

        booksList.add(book_1);
        booksList.add(book_2);
        booksList.add(book_3);
        booksList.add(book_4);
        booksList.add(book_5);
        booksList.add(book_6);
        booksList.add(book_7);
        booksList.add(book_8);
        System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Books books : booksList) {
            if (isPrime(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }


}
