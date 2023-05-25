package com.alioguzhancicek.departmentservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee")
public class Employee extends BaseModel {
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private Integer age;
    @Column
    private String position;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departmentId", referencedColumnName = "id")
    private Department department;
}
