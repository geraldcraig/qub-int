package uk.ac.qub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.qub.model.AlbumYear;

import java.util.Optional;

@Repository
public interface AlbumYearRepository extends JpaRepository<uk.ac.qub.model.AlbumYear, Long> {
    Optional<uk.ac.qub.model.AlbumYear> findByAlbumYear(Integer albumYear);
}

