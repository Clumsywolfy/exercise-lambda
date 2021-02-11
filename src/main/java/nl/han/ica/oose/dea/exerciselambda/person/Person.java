package nl.han.ica.oose.dea.exerciselambda.person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private int adult = 18;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String checkGender(Person person){
        if (getGender().equals(Gender.FEMALE)){
            return "female";
        } else if (getGender().equals(Gender.MALE)){
            return "male";
        }
        return null;
    }

    public boolean checkAge(Person person){
        LocalDate now = LocalDate.now();
        Period age = Period.between(person.getBirthDate(), now);
        if (age.getYears() > adult) {
            return true;
        }
        return false;
    }
}
