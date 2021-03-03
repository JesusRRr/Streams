package com.rolon;

import com.rolon.model.Gender;
import com.rolon.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();
        people.forEach(System.out::println);

        //Filter By Age
        people.stream()
                .filter(person -> person.getAge()<40)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static List<Person> getPeople(){
      return Arrays.asList(
              new Person("Chick Corea", 79, Gender.MALE),
              new Person("Herbie Hancock",80, Gender.MALE),
              new Person("Esperanza Spalding", 36, Gender.FEMALE),
              new Person("Jorja Smith", 23, Gender.FEMALE),
              new Person("Diana Krall", 56, Gender.FEMALE),
              new Person("Carlos Santana",73,Gender.MALE)
      );
    }
}
