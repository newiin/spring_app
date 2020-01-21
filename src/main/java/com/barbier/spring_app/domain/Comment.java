package com.barbier.spring_app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;
   @ManyToOne
   private Link link;
}
