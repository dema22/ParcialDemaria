package utn.edu.ParcialDemaria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class User {
    private Integer id;

    private UserType userType;

    private Integer dni;

    private String username;

    private String name;

    private String surname;

    private String pass;
}
