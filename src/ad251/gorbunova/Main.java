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

/* Імпорт стандартних колекцій Java Collections Framework*/
import java.util.ArrayList;   // Динамічний лінійний список студентів групи
import java.util.HashMap;     // Асоціативна хеш-мапа для індексного пошуку за кодом
import java.util.HashSet;     // Множина для збереження унікальних навчальних дисциплін
import java.util.List;        // Інтерфейс впорядкованих послідовностей даних
import java.util.Map;         // Інтерфейс для структур зберігання пар "ключ - значення"
import java.util.Set;         // Інтерфейс унікальних контейнерів без дублікатів

/**
 * Головний керуючий клас-оркестратор Лабораторної роботи №4.
 * Координує виконання спільної практичної частини та індивідуального Варіанту №7.
 * 
 * @author Анастасія Горбунова
 * @version 4.0 15 Oct 2026
 */
public class Main {

    /**
     * Головна точка входу в додаток.
     * 
     * @param args аргументи командного рядка CLI
     */
    public static void main(String[] args) {
        System.out.print("=== Лабораторна робота №4 (Облікові структури даних) ===\n\n");
        System.out.print("Тема: Робота з обліковими структурами даних\n\n");

        // =====================================================================
        // 1. ЗАГАЛЬНА ПРАКТИЧНА ЧАСТИНА (Робота зі списками Student через List)
        // =====================================================================
        System.out.print("--- 1. Тестування структури List<Student> ---\n");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Олена Коваль", 20, 91.5));
        students.add(new Student("Андрій Петренко", 21, 87.2));
        students.add(new Student("Марія Шевченко", 19, 95.1));

        for (Student student : students) {
            student.printInfo();
        }

        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageGrade();
        }
        System.out.printf("Середній бал навчальної групи: %.2f\n\n", (sum / students.size()));

}
