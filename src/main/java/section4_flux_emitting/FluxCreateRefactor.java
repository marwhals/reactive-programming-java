package section4_flux_emitting;


import common.Util;
import reactor.core.publisher.Flux;
import section4_flux_emitting.auxil.NameGenerator;

public class FluxCreateRefactor {

    public static void main(String[] args) {

        var generator = new NameGenerator();
        var flux = Flux.create(generator);
        flux.subscribe(Util.subscriber());

        // somewhere else!
        for (int i = 0; i < 10; i++) {
            generator.generate();
        }

    }

}
