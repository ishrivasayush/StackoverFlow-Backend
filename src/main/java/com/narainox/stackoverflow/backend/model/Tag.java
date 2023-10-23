package com.narainox.stackoverflow.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_tag")
public class Tag {
    /*
    @Id
    @SequenceGenerator(
            name = "tag_sequence",
            sequenceName = "tag_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tag_sequence"
    )
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tagName;
    private String tagDescription;
}
