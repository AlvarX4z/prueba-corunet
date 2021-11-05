package prueba.corunet.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceEntity {

    @Id
    private int id;
    private int brandId;
    private Timestamp startDate;
    private Timestamp endDate;
    private int priceList;
    private int productId;
    private int priority;
    private BigDecimal price;
    private String currency;

}
