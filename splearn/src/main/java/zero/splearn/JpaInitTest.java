package zero.splearn;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import zero.splearn.entity.Person;
import zero.splearn.repository.PersonRepository;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class JpaInitTest implements CommandLineRunner {

    private final PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {

        personRepository.save(new Person("John", 30));

        List<Person> people = personRepository.findAll();

        log.info("People: {}", people);
    }
}
