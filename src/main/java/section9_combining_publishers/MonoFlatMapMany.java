package section9_combining_publishers;

import common.Util;
import section9_combining_publishers.services.OrderService;
import section9_combining_publishers.services.UserService;


/*
    Sequential non-blocking IO calls!
    flatMap is used to flatten the inner publisher / to subscribe to the inner publisher
    Mono is supposed to be 1 item - what if the flatMap returns multiple items!?
 */
public class MonoFlatMapMany {

    public static void main(String[] args) {

        /*
            We have username
            get all user orders!
         */

        UserService.getUserId("jake")
                   .flatMapMany(OrderService::getUserOrders)
                   .subscribe(Util.subscriber());


        Util.sleepSeconds(3);
    }

}
