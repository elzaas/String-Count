package org.example;
public class Project {
    public int calculateDigits(String sentence) {
        if (sentence == null) {
            return 0; // возвращаем 0, если строка null
        }

        int count = 0; // инициализируем счётчик

        // Проходим по каждому символу в строке
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i); // получаем символ по индексу
            if (Character.isDigit(c)) { // проверяем, является ли символ цифрой
                count++; // увеличиваем счётчик, если это цифра
            }
        }

        return count; // возвращаем количество цифр();
    }
}
