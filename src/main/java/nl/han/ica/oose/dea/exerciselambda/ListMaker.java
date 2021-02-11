package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    int adult = 18;

    public List<Person> createMaleAdultList(List<Person> allPersons) {

        if (allPersons == null) {
            return new ArrayList<>();
        }
        List<Person> filteredMaleAdults = new ArrayList<>();

        for (Person person : allPersons) {
            if (checkGender(person) == Gender.MALE) {
                if (checkAge(person)) {
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
            if (checkGender(person) == Gender.FEMALE) {
                if (checkAge(person)) {
                    filteredFemaleAdults.add(person);
                }
            }
        }
        return filteredFemaleAdults;
    }
    public boolean checkAge(Person person){
        LocalDate now = LocalDate.now();
        Period age = Period.between(person.getBirthDate(), now);
        if (age.getYears() > adult) {
            return true;
        }
        return false;
    }

    public Gender checkGender(Person person){
        if (person.getGender().equals(Gender.FEMALE)){
            return Gender.FEMALE;
        } else if (person.getGender().equals(Gender.MALE)){
            return Gender.MALE;
        }
        return null;
    }
}
