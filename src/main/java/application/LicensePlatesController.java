package application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicensePlatesController {

    @GetMapping("/license")
    public DigitsPart getRandomNumber() {
        return null;
    }
}
