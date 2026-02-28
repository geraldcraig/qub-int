package uk.ac.qub.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "albums")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "albumyear_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private AlbumYear year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "subgenre_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Subgenre subGenre;

    @ManyToOne
    @JoinColumn(name = "image_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Image image;


    // Constructors, getters, and setters
}

