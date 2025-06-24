package mono_java;

import reactor.core.publisher.Mono;
import pub_sub_reactive_java.subscriber.SubscriberImpl;


public class MonoJust {

    public static void main(String[] args) {
        var mono = Mono.just("a string");
        var subscriber = new SubscriberImpl();
        mono.subscribe(subscriber);

        subscriber.getSubscription().request(10);

        // adding these will have no effect as producer already sent complete
        subscriber.getSubscription().request(10);
        subscriber.getSubscription().cancel();
    }

}
