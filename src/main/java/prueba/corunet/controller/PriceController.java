package prueba.corunet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.corunet.usecase.GetPrice;

@RestController
@RequestMapping(value = "/price-api")
@AllArgsConstructor
public class PriceController {

    private GetPrice getPrice;

    // TODO Think the layers and prepare the params
    @GetMapping(value = "prices")
    public GetPrice.Response getAllPrices(
            @RequestBody GetPrice.Request request
    ) {
        return getPrice.execute(request);
    }
}
