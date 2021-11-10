package application;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class LicensePlate {
    public Integer id;
    public String number;

}
