package com.rolon;

import com.rolon.model.Gender;
import com.rolon.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();
        
    }

    public static List<Person> getPeople(){
      return Arrays.asList(
              new Person("Chick Corea", 79, Gender.MALE),
              new Person("Herbie Hancock",80, Gender.MALE),
              new Person("Esperanza Spalding", 36, Gender.FEMALE)
      );
    }
}
