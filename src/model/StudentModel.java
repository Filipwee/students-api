package com.avantsoft.filipeinterview.model;

public class StudentModel {

    private Long id;
    private String name;
    private double grade;
    private char uniqueLetter;

    public StudentModel(long l, String name, double grade, char uniqueLetter) {
        this.id = l;
        this.name = name;
        this.grade = grade;
        this.uniqueLetter = uniqueLetter;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public char getUniqueLetter() {
        return uniqueLetter;
    }

}
