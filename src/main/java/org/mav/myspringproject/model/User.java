package org.mav.myspringproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String lastName;
    private Integer age;
    private Address address;
}
