package uk.ac.qub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.qub.model.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
