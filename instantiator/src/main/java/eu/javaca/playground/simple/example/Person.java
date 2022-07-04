package eu.javaca.playground.simple.example;

import eu.javaca.playground.Pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Person extends Pojo {
    private String name;
    private Integer age;
    private List<Hobby> hobbies;
    private Book favouriteBook;

    @Required
    private Workplace<Worker> workplace;

    private List<String> friends;

    private List<Integer> numbers;

    private LocalDate lastUpdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public Book getFavouriteBook() {
        return favouriteBook;
    }

    public void setFavouriteBook(Book favouriteBook) {
        this.favouriteBook = favouriteBook;
    }

    public Workplace<Worker> getWorkplace() {
        return workplace;
    }

    public void setWorkplace(Workplace<Worker> workplace) {
        this.workplace = workplace;
    }

    public void addHobby(Hobby hobby) {
        if (hobbies == null) {
            hobbies = new ArrayList<>();
        }
        this.hobbies.add(hobby);
    }

    public void removeHobby(Hobby hobby) {
        if (hobbies == null) {
            return;
        }
        this.hobbies.remove(hobby);
        if (this.hobbies.isEmpty()) {
            this.hobbies = null;
        }
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}



