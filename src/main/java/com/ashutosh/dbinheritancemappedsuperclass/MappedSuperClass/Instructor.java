package com.ashutosh.dbinheritancemappedsuperclass.MappedSuperClass;

import com.ashutosh.dbinheritancemappedsuperclass.MappedSuperClass.BaseUser;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Instructor extends BaseUser {
    private double averageRating;
}
