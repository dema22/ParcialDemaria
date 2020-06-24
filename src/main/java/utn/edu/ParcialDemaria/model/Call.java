package utn.edu.ParcialDemaria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class Call {
    private Integer idCall;

    private PhoneLine lineOrigin;

    private PhoneLine lineDestiny;

    private Bill bill;

    private Rate rate;

    private Float price;
    private Float cost;
    private Float profit;

    private Date dateCall;

    private Date  hourCallFinish;

    private int duration;

    private int numberOrigin;

    private int numberDestiny;
}
