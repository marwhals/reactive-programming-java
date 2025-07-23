package section4_flux_emitting;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import common.Util;
import section4_flux_emitting.auxil.NameGenerator;

import java.util.ArrayList;

/*
    FluxSink is thread safe!
    This is just a demo. Code should not be written like this
 */
public class FluxSinkThreadSafety {

    private static final Logger log = LoggerFactory.getLogger(FluxSinkThreadSafety.class);

    public static void main(String[] args) {

        demo2();

    }

    // arraylist is not thread safe
    private static void demo1(){
        var list = new ArrayList<Integer>();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread.ofPlatform().start(runnable);
        }
        Util.sleepSeconds(3);
        log.info("list size: {}", list.size());
    }

    // flux sink is thread safe. we get all the 10000 items safely into array list
    private static void demo2(){
        var list = new ArrayList<String>();
        var generator = new NameGenerator();
        var flux = Flux.create(generator);
        flux.subscribe(list::add);

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                generator.generate();
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread.ofPlatform().start(runnable);
        }
        Util.sleepSeconds(3);
        log.info("list size: {}", list.size());
    }

}
