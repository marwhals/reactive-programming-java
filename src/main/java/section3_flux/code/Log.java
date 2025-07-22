package section3_flux.code;

import common.Util;
import reactor.core.publisher.Flux;

public class Log {

    public static void main(String[] args) {
        Flux.range(1, 5)
                .log()
                .map(i -> Util.faker().name().firstName())
                .log()
                .subscribe(Util.subscriber());
    }

}
