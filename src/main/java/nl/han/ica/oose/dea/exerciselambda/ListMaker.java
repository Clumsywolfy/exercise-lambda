package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListMaker {

    private final int ADULT_AGE = 18;
    private Predicate<Person> isAdult = (person) -> person.isAdult(ADULT_AGE);
    private Predicate<Person> isMale = (person -> person.isGender(Gender.MALE));
    private Predicate<Person> isFemale = (person -> person.isGender(Gender.FEMALE));

    public List<Person> createMaleAdultList(List<Person> allPersons) {
       return createAdultList(allPersons, isMale);
    }

    public List<Person> createFemaleAdultList(List<Person> allPersons) {
       return createAdultList(allPersons, isFemale);
    }

    private List <Person> createAdultList(List<Person> allPersons, Predicate <Person> predicate){

        if (allPersons == null) {
            return new ArrayList<>();
        }

        return allPersons.stream()
                .filter(isAdult)
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
