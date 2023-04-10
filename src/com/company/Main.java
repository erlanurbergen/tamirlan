package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       // O(1)
//        Map<Integer, String> data = new HashMap<>();
//
//        int arr[] = {1, 2, 100, 100, -9, 0};
//        System.out.println(arr[0]); //


       // O(N)
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
       // O(logN)
       // O(N^2)
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//
//        }


    }

}

abstract class User {
    private int id;
    private String login;
    private String password;

    abstract String getUserData();

    public User() {
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class Student extends User {
    private String name;
    private String surname;
    private String group;
    private double gpa;

    @Override
    String getUserData() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public Student() {
    }

    public Student(String name, String surname, String group, double gpa) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

class Teacher extends User {
    private String nickname;
    private String status;
    private String subjects[] = new String[10];
    int sizeOfSubjects = 0;

    public Teacher(String nickname, String status) {
        this.nickname = nickname;
        this.status = status;
    }

    public Teacher(int id, String login, String password, String nickname, String status) {
        super(id, login, password);
        this.nickname = nickname;
        this.status = status;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setSizeOfSubjects(int sizeOfSubjects) {
        this.sizeOfSubjects = sizeOfSubjects;
    }

    void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }


    @Override
    String getUserData() {
        return "Teacher{" +
                "nickname='" + nickname + '\'' +
                ", status='" + status + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                ", sizeOfSubjects=" + sizeOfSubjects +
                '}';
    }
}

class ERPSystem {
    private User memory[] = new User[1000];

    private int sizeOfUsers = 0;

    void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    void printAllUsers(){
        for (int i = 0; i < sizeOfUsers; i++) {
            System.out.println(memory[i].getUserData());
        }
    }

    void printUser(int index){
        Arrays.stream(memory).filter(user -> user.getId() == index).forEach(System.out::println);
    }

}