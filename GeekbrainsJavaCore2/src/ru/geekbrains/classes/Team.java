package ru.geekbrains.classes;

import ru.geekbrains.classes.animals.Cat;
import ru.geekbrains.classes.animals.Dog;

public class Team {
    private String name;
    public Participant[] participants;

    public Team(String name){

        this.name = name;
        this.participants = new Participant[] {
                new Cat("Барсик", 10, 12, 0),
                new Dog("Дружок", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Robot("Вертер", 50, 50, 50),
        };

    }

    public void list(){
        System.out.println("На дистанцию вышла команда \"" + this.name + "\" в составе:");
        for (Participant participant : participants) {
           System.out.println(participant.getName());
        }

    }
    public void showResults(){
        System.out.println("Итоги:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }

    }
}
