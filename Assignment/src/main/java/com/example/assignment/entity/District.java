package com.example.assignment.entity;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "districts")
public class District {
    @Id
    private String id;
    private String name;
    @CreationTimestamp
    private Date createdAt;
}
