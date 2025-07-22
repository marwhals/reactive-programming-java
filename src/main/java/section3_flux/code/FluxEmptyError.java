package section3_flux.code;

import common.Util;
import reactor.core.publisher.Flux;

/*
    Creates an empty/error flux
 */
public class FluxEmptyError {
    public static void main(String[] args) {
        Flux.empty()
                .subscribe(Util.subscriber());
        Flux.error(new RuntimeException("oops"))
                .subscribe(Util.subscriber());
    }
}
