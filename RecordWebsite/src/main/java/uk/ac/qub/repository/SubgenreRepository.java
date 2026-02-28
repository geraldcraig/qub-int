package uk.ac.qub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.qub.model.Subgenre;

import java.util.Optional;

@Repository
public interface SubgenreRepository extends JpaRepository<Subgenre, Long> {
    Optional<Subgenre> findBySubgenre(String subgenre);
}

