package com.ashutosh.dbinheritancemappedsuperclass.MappedSuperClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class BaseUser {
    @Id
    private int id;
    private String name;
    private String email;

}
