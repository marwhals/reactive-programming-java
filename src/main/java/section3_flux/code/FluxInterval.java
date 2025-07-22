package section3_flux.code;

import common.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

/*
    Emit a message based on an interval
 */
public class FluxInterval {

    public static void main(String[] args) {

        Flux.interval(Duration.ofMillis(500))
                .map(i -> Util.faker().name().firstName())
                .subscribe(Util.subscriber());

        Util.sleepSeconds(5);

    }

}
