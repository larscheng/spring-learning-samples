package com.larscheng.www.pojo;

import java.util.*;

/**
 * @author: larscheng
 * @date: 2020/4/2 下午4:59
 * @description:
 */
public class Student {

    private String name;

    private School school;

    private int age;

    private String[] books;

    private List<String> hobbies;

    private Set<String> friends;

    private Map<String,String> favourites;

    private String love;

    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<String> getFriends() {
        return friends;
    }

    public void setFriends(Set<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getFavourites() {
        return favourites;
    }

    public void setFavourites(Map<String, String> favourites) {
        this.favourites = favourites;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                ", age=" + age +
                ", books=" + Arrays.toString(books) +
                ", hobbies=" + hobbies +
                ", friends=" + friends +
                ", favourites=" + favourites +
                ", love='" + love + '\'' +
                ", properties=" + properties +
                '}';
    }
}
