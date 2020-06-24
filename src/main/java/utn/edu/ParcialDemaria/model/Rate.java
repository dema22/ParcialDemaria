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

public class Rate {

    private Integer idRate;

    private Locality localityOrigin;

    private Locality localityDestiny;

    private Float pricePerMinute;

    private Date startDate;

    private Date expirationDate;

    private Float cost;

}
