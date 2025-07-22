package section3_flux.code;

import common.Util;
import reactor.core.publisher.Flux;

import java.util.List;

//    Create flux from iterable or array

public class FluxFromIterableOrArray {

    public static void main(String[] args) {

        var list = List.of("a", "b", "c");
        Flux.fromIterable(list)
                .subscribe(Util.subscriber());

        Integer[] arr = {1,2,3,4,5,6};
        Flux.fromArray(arr)
                .subscribe(Util.subscriber());

    }

}
