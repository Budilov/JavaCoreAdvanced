package ru.geekbrains.classes;

public class Application {

    public static void main(String[] args) {

        Course course = new Course(); // Создаем полосу препятствий
        Team team = new Team("Робот и звери"); // Создаем команду
        course.doIt(team); // Просим команду пройти полосу
        team.showResults();
   }
}
