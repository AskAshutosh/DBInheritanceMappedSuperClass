package com.ashutosh.dbinheritancemappedsuperclass.MappedSuperClass;

import com.ashutosh.dbinheritancemappedsuperclass.MappedSuperClass.BaseUser;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends BaseUser {
    private double psp;
    private int batchId;
}
