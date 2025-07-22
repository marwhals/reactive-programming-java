package section3_flux.code;

import common.Util;
import reactor.core.publisher.Flux;

/*
    Filter / map operators
 */
public class MultipleSubscribers {


    public static void main(String[] args) {

        var flux = Flux.just(1,2,3,4,5,6);

        flux.subscribe(Util.subscriber("sub1"));
        flux.filter(i -> i > 7)
                .subscribe(Util.subscriber("sub2"));
        flux
                .filter(i -> i % 2 == 0)
                .map(i -> i + "a")
                .subscribe(Util.subscriber("sub3"));

    }

}
