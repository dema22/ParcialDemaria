package utn.edu.ParcialDemaria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class Locality {
    private Integer prefix;
    private String localityName;
    private Province province;
}
