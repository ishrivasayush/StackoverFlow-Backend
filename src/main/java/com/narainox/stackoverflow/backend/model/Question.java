package com.narainox.stackoverflow.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "tbl_Question"
)
public class Question {

    /*
    @Id
    @SequenceGenerator(
                    name = "question_sequence",
                    sequenceName = "question_sequence",
                    allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_sequence"
    )
    */

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;
    private String title;
    private String description;

    @OneToMany()
    private List<Tag> tagList;
}
