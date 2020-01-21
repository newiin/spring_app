package com.barbier.spring_app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data
public class Vote extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private int vote;



    //  user
//  link
}
