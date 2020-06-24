package utn.edu.ParcialDemaria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class Bill {
    private Integer idBill;

    private User user;

    private Float totalPrice;

    private Date emittionDate;

    private Date expirationDate;

    private boolean billStatus;

    private Float totalCost;

    private Float totalProfit;
}
