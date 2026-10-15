/*
 * Copyright (c) 2026. Anastasiia Gorbunova
 * National University "Odesa Polytechnic"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://apache.org
 */
package ad251.gorbunova;

/* Підключення системних утиліт та колекцій за стандартом Oracle */
import java.util.ArrayList;   // Реалізація динамічного списку на базі масиву
import java.util.HashSet;   // Реалізація хеш-множини для зберігання унікальних елементів
import java.util.List;      // Базовий інтерфейс для роботи зі впорядкованими списками
import java.util.Set;       // Базовий інтерфейс для роботи з унікальними множинами даних

/**
 * Сервісний менеджер-аналізатор колекцій об'єктів (індивідуальне завдання Варіант №7).
 * Використовує механізм узагальнень (Generics) для забезпечення типобезпеки.
 * 
 * @author Анастасія Горбунова
 * @version 4.0 15 Oct 2026
 */
public class MovieManager {
    /** Динамічний лінійний список для збереження послідовності об'єктів */
    private final List<Movie> movieList = new ArrayList<>();
    /** Хеш-множина для автоматичного відсікання дублікатів та унікальних жанрів */
    private final Set<String> uniqueGenres = new HashSet<>();

    /**
     * Додає об'єкт фільму до списку та реєструє його жанр у унікальній множині.
     * 
     * @param movie екземпляр класу Movie
     */
    public void addMovie(Movie movie) {
        movieList.add(movie);
        uniqueGenres.add(movie.getGenre());
    }

    /**
     * Проводить ітераційний перебір списку за допомогою циклу for-each.
     */
    public void printAllMovies() {
        System.out.print("Повний список кінофільмів у базі даних List:\n");
        for (Movie movie : movieList) {
            movie.printInfo();
        }
    }

    /**
     * Реалізує лінійний алгоритм пошуку об'єкта з максимальним рейтингом у List.
     */
    public void displayHighestRatedMovie() {
        if (movieList.isEmpty()) {
            return;
        }

        Movie bestMovie = movieList.get(0);
        for (Movie movie : movieList) {
            if (movie.getRating() > bestMovie.getRating()) {
                bestMovie = movie;
            }
        }
        System.out.print("\nФільм із найвищим рейтингом за Варіантом №7:\n  --> ");
        bestMovie.printInfo();
    }

    /**
     * Виводить унікальну хеш-таблицю жанрів.
     */
    public void printGenres() {
        System.out.print("\nMножина унікальних жанрів у базі Set:\n  " + uniqueGenres + "\n");
    }
}
