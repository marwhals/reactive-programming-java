package section3_flux.client;

import common.AbstractHttpClient;
import reactor.core.publisher.Flux;

public class ExternalServiceClient extends AbstractHttpClient {

    public Flux<String> getNames() {
        return this.httpClient.get()
                .uri("/name/stream")
                .responseContent()
                .asString();
    }

    public Flux<Integer> getPriceChanges() {
        return this.httpClient.get()
                .uri("/stock/stream")
                .responseContent()
                .asString()
                .map(Integer::parseInt);
    }

}
