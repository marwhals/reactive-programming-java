package section3_flux.code;


import pub_sub_reactive_java.subscriber.SubscriberImpl;
import section3_flux.auxil.NameGenerator;

public class FluxVsList {

    public static void main(String[] args) {

//        var list = NameGenerator.getNamesList(10);
//        System.out.println(list);

        var subscriber = new SubscriberImpl();
        NameGenerator.getNamesFlux(10)
                .subscribe(subscriber);

        subscriber.getSubscription().request(3);
        subscriber.getSubscription().cancel();
    }

}
