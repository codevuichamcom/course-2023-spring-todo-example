package com.example.thymleaf.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@ToString
public class Todo {
    int id;
    String title;
    String detail;
}
