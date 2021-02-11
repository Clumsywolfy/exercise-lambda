package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    private Person person;

    public List<Person> createMaleAdultList(List<Person> allPersons) {

        if (allPersons == null) {
            return new ArrayList<>();
        }
        List<Person> filteredMaleAdults = new ArrayList<>();

        for (Person person : allPersons) {
            if (person.checkGender(person) == "male") {
                if (person.checkAge(person)) {
                    filteredMaleAdults.add(person);
                }
            }
        }
        return filteredMaleAdults;
    }

    public List<Person> createFemaleAdultList(List<Person> allPersons) {

        if (allPersons == null) {
            return new ArrayList<>();
        }
        List<Person> filteredFemaleAdults = new ArrayList<>();

        for (Person person : allPersons) {
            if (person.checkGender(person) == "female") {
                if (person.checkAge(person)) {
                    filteredFemaleAdults.add(person);
                }
            }
        }
        return filteredFemaleAdults;
    }

    private List<Person> createAdultList(List<Person> allPersons, Gender gender) {

        if (allPersons == null) {
            return new ArrayList<>();
        }

        if(gender == "female"){

        }

        if (gender == "male"){

        }
    }
}
