package application;

import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DigitsPartController {

    @Autowired
    DigitsRepository digitsRepository;

    @GetMapping("/number")
    public DigitsPart getRandomNumber() {

        int maxId = 0;
        for (DigitsPart digitsPart : digitsRepository.findAll()) {
            maxId = digitsPart.getId() > maxId ? digitsPart.getId() : maxId;
        }
        digitsRepository.save(DigitsPart.builder().id(maxId+1).view(RandomString.make()).build());
        return digitsRepository.findById(maxId+1).get();
    }

    @GetMapping("/numbers")
    public List<DigitsPart> getAllNumbers() {
        return (ArrayList<DigitsPart>) digitsRepository.findAll();
    }
}
