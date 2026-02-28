package uk.ac.qub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "subgenre", uniqueConstraints = @UniqueConstraint(columnNames = "subgenre"))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subgenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String subgenre;

    // Constructors, getters, and setters
}

