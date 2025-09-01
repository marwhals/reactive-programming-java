package section9_combining_publishers;

import common.Util;
import section9_combining_publishers.usecases.Kayak;

public class MergeUseCase {

    public static void main(String[] args) {
        Kayak.getFlights()
                .subscribe(Util.subscriber());


        Util.sleepSeconds(3);
    }

}
