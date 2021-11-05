package prueba.corunet.usecase;

import lombok.Builder;
import lombok.Data;
import prueba.corunet.domain.Price;
import prueba.corunet.dto.PriceDto;
import prueba.corunet.service.PriceService;

import java.util.List;

public class GetPrice {

    private PriceService priceService;

    public Response execute(Request request) {
        // TODO Prepare this function in order to pass it to an interface and from it to a Service layer. Afterwards, prepare Domain Mapper to Entity?
        return null;
    }

    @Data
    @Builder
    public static class Request {

        private Price price;

    }

    @Data
    @Builder
    public static class Response {

        private List<PriceDto> prices;

    }

}
