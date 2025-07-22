package section3_flux.code;

import common.Util;
import reactor.core.publisher.Flux;

/*
    To create a range of items based on the given start and count
 */
public class FluxRange {

    public static void main(String[] args) {

        Flux.range(3, 10)
                .subscribe(Util.subscriber());

        // Generate 10 random first names
        Flux.range(1, 10)
                .map(i -> Util.faker().name().firstName())
                .subscribe(Util.subscriber());

    }

}
