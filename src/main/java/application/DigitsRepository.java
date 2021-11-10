package application;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitsRepository extends CrudRepository<DigitsPart, Integer> {

}
