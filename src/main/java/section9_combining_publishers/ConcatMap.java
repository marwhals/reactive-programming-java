package section9_combining_publishers;

import common.Util;
import reactor.core.publisher.Flux;
import section9_combining_publishers.services.ExternalServiceClient;

/*
    Ensure that the external service is up and running
 */
public class ConcatMap {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();

        Flux.range(1, 10)
            .concatMap(client::getProduct)
            .subscribe(Util.subscriber());

        Util.sleepSeconds(20);

    }

}
