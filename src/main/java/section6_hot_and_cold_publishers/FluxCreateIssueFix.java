package section6_hot_and_cold_publishers;

import common.Util;
import reactor.core.publisher.Flux;
import section4_flux_emitting.auxil.NameGenerator;

/*
    To fix the issue we faced in FluxCreateRefactor
 */
public class FluxCreateIssueFix {

    public static void main(String[] args) {

        var generator = new NameGenerator();
        var flux = Flux.create(generator).share();
        flux.subscribe(Util.subscriber("sub1"));
        flux.subscribe(Util.subscriber("sub2"));

        // somewhere else!
        for (int i = 0; i < 10; i++) {
            generator.generate();
        }

    }

}
