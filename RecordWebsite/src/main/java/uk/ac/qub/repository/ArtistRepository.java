package uk.ac.qub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.qub.model.Artist;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<uk.ac.qub.model.Artist, Long> {
    Optional<uk.ac.qub.model.Artist> findByName(String name);
}

