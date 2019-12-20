package com.jumia.test.jumia.entity;


import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Admin extends User{

    private String job;
}
