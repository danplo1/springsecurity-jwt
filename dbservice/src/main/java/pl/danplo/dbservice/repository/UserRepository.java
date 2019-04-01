package pl.danplo.dbservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.danplo.dbservice.model.User;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByEmail(String email);
    List<User> findAll();
}
