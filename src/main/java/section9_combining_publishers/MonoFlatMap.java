package section9_combining_publishers;


import common.Util;
import section9_combining_publishers.services.PaymentService;
import section9_combining_publishers.services.UserService;

/*
    Sequential non-blocking IO calls!
    flatMap is used to flatten the inner publisher / to subscribe to the inner publisher
 */
public class MonoFlatMap {

    public static void main(String[] args) {

        /*
            We have username.
            Get user account balance
         */

        UserService.getUserId("mike")
                   .flatMap(PaymentService::getUserBalance)
                   .subscribe(Util.subscriber());

    }

}
