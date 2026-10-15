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

/**
 * Клас, що описує сутність "Фільм" згідно з індивідуальним Варіантом №7.
 * Демонструє роботу об'єктних моделей усередині динамічних колекцій.
 * 
 * @author Анастасія Горбунова
 * @version 4.0 15 Oct 2026
 */
public class Movie {
    /** Назва кінострічки */
    private final String title;
    /** Жанр фільму */
    private final String genre;
    /** Рік офіційного випуску */
    private final int year;
    /** Рейтинг фільму від 0.0 до 10.0 */
    private final double rating;

    /**
     * Конструктор для ініціалізації інкапсульованих даних фільму.
     * 
     * @param title назва фільму
     * @param genre жанрова приналежність
     * @param year рік виходу на екрани
     * @param rating оцінка критиків
     */
    public Movie(String title, String genre, int year, double rating) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    /**
     * Форматує та виводить унікальні атрибути об'єкта фільму в консоль.
     */
    public void printInfo() {
        System.out.printf("Фільм: %-25s | Жанр: %-12s | Рік: %d | Рейтинг: %.1f\n", 
                            title, 
                            genre, 
                            year, 
                            rating);
    }

    // Публічні інкапсульовані методи доступу
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    public double getRating() { return rating; }
}
