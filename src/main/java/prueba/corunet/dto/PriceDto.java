package prueba.corunet.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceDto {

    private int productId;             // ID of the Product which is associated to this Price. E.G.: 35455
    private int brandId;               // ID of the Brand which is associated to this Price. E.G.: Zara
    private int priceId;               // ID of the Price to be applied. E.G.: 1
    private LocalDateTime startDate;   // Starting date of this Price. E.G.: 2020-06-14 00:00:00
    private LocalDateTime endDate;     // Ending date of this Price. E.G.: 2020-12-31 23:59:59
    private BigDecimal price;          // The Price's amount. E.G.: 35.50

}
