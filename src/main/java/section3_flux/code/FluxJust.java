package section3_flux.code;

import common.Util;
import reactor.core.publisher.Flux;

/*
    Creates a Flux with arbitrary items in memory
 */
public class FluxJust {
    public static void main(String[] args) {
        Flux.just(1, 2, 3, "sam")
                .subscribe(Util.subscriber());

    }

}
