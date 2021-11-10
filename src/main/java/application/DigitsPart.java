package application;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@Builder
public class DigitsPart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    private String view;


//    public List<Integer> digitsPart;
//
//    public List getNextDigitsPart() {
//        if(digitsPart.get(digitsPart.size() - 1) == 9) {
//            //will have an overload
//            //todo: return list full of zeros
//            return Arrays.asList(0, 0, 0);
//        }
//        else {
//            return convertToList(convertToInt() + 1);
//        }
//    }
//
//    public Integer convertToInt() {
//        int result = 0;
//        int countOfPowers = digitsPart.size();
//        for(int i = digitsPart.size() - 1; i >= 0; i--) {
//            result += digitsPart.get(i) * 10^(i);
//        }
//        return result;
//    }
//
//    public List convertToList(int number) {
//        List<Integer> result = new ArrayList<>();
//        while(number % 10 != 0) {
//            int digit = number / 10;
//            result.add(digit);
//            number = (number - digit) / 10;
//        }
//        return result;
//    }
}
