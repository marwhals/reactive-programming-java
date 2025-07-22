package section3_flux.code;

import common.Util;
import section3_flux.client.ExternalServiceClient;

/*
    To demo non-blocking IO with streaming messages
    Ensure that the external service is up and running.
 */
public class NonBlockingStreamingMessages {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();

        client.getNames()
                .subscribe(Util.subscriber("sub1"));

        client.getNames()
                .subscribe(Util.subscriber("sub2"));

        Util.sleepSeconds(6);

    }

}
