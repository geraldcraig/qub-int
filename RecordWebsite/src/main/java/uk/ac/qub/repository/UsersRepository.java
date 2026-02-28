package uk.ac.qub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.qub.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}

