package mono_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class LazyStream {

    private final static Logger log = LoggerFactory.getLogger(LazyStream.class);

    public static void main(String[] args) {
        Stream.of(1)
                .peek(i -> log.info("received : {}", i))
                .toList(); //Terminal operator
    }

}
