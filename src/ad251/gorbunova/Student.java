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
 * Клас, що описує сутність "Студент" для загальної практичної частини.
 * Забезпечує інкапсуляцію анкетних та успішних даних студента групи.
 * 
 * @author Анастасія Горбунова
 * @version 4.0 15 Oct 2026
 */
public class Student {
    /** ПІБ студента */
    private final String name;
    /** Повний вік студента */
    private final int age;
    /** Середній академічний бал */
    private final double averageGrade;

    /**
     * Конструктор класу Student для повної ініціалізації полів.
     * 
     * @param name ПІБ студента
     * @param age вік
     * @param averageGrade середній бал успішності
     */
    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    /**
     * Виводить форматовану інформацію про поточний стан об'єкта у консоль.
     */
    public void printInfo() {
        System.out.printf("Студент: %-20s | Вік: %d | Середній бал: %.1f\n", 
                            name, 
                            age, 
                            averageGrade);
    }

    // --- Публічні геттери доступу до приватних полів (Інкапсуляція) ---
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getAverageGrade() { return averageGrade; }
}
