package section9_combining_publishers;

import common.Util;
import section9_combining_publishers.services.OrderService;
import section9_combining_publishers.services.User;
import section9_combining_publishers.services.UserService;


/*
    Sequential non-blocking IO calls!
    flatMap is used to flatten the inner publisher / to subscribe to the inner publisher
 */
public class FluxFlatMap {

    public static void main(String[] args) {

        /*
            Get all the orders from order service!
         */

        UserService.getAllUsers()
                   .map(User::id)
                   .flatMap(OrderService::getUserOrders)
                   .subscribe(Util.subscriber());

        Util.sleepSeconds(5);

    }

}
