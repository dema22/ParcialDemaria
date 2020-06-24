package utn.edu.ParcialDemaria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class PhoneLine {

    private Integer idLine;

    private User user;

    private Locality locality;

    private LineType lineType;

    private String lineNumber;
}
