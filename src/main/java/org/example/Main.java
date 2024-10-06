package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        System.out.println(project.calculateDigits("Hello123")); // Output: 3
        System.out.println(project.calculateDigits("No digits here!")); // Output: 0
        System.out.println(project.calculateDigits("Digits: 4567 and 89")); // Output: 6
    }
}
