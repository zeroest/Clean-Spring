package zero.splearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zero.splearn.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}