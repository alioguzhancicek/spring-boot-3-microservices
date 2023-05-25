package com.alioguzhancicek.departmentservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "department")
public class Department extends BaseModel {
    @Column
    private String name;
    @Column
    private String email;
}
