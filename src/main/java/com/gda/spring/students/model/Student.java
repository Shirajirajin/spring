package com.gda.spring.students.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data

@NoArgsConstructor
@Entity // to jest encja bazodanowa
public class Student {


    @Id
    // dodatkowa tabela "hibernate_sequence" - sztuczne identyfikatory
    // identity - generuj identyfikator z bazy, pobierz go i przypisz do pola
    // sequence - pobierz identyfikator, przypisz go do pola, zapisz obiekt
    // table    -
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String surname;
    private int age; // "not null"
    private boolean alive; // "not null"
    //    WYKOMENTOWANE
//    @Formula(value = "(SELECT AVG(g.value) FROM Grade g WHERE g.student_id = id)")
//    private Double average; // nullable - nie ma "not null"
//
//    @EqualsAndHashCode.Exclude
//    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
//    @Cascade(value = {org.hibernate.annotations.CascadeType.REMOVE})
//    private Set<Grade> gradeList;
    public Student(String name, String surname, int age, boolean alive) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.alive = alive;
    }
    public Student(Long id, String name, String surname, int age, boolean alive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.alive = alive;
    }
}


