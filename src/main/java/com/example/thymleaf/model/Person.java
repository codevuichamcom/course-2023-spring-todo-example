package com.example.thymleaf.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
public class Person {
     int id;
     String name;
     int age;
     String email;
}
