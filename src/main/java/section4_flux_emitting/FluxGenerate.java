package section4_flux_emitting;

import common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

/*
    Flux generate
    - Invokes the given lambda expression again and again based on downstream demand.
    - We can emit only one value at a time
    - Will stop when complete method is invoked
    - Will stop when error method is invoked
    - Will stop downstream cancels
 */

public class FluxGenerate {

    private static final Logger log = LoggerFactory.getLogger(FluxGenerate.class);

    public static void main(String[] args) {
        Flux.generate(synchronousSink -> {
                log.info("invoked");
                synchronousSink.next(1);
                // synchronousSink.next(2);
                // synchronousSink.complete();
                synchronousSink.error(new RuntimeException("oops"));
            })
            .take(4)
            .subscribe(Util.subscriber());
    }

}