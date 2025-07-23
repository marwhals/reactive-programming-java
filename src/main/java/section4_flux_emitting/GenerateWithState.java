package section4_flux_emitting;

import common.Util;
import reactor.core.publisher.Flux;

public class GenerateWithState {

    public static void main(String[] args) {

        Flux.generate(
                    () -> 0,
                    (counter, sink) -> {
                        var country = Util.faker().country().name();
                        sink.next(country);
                        counter++;
                        if (counter == 10 || country.equalsIgnoreCase("canada")) {
                            sink.complete();
                        }
                        return counter;
                    }
            )
            .subscribe(Util.subscriber());
    }

}
