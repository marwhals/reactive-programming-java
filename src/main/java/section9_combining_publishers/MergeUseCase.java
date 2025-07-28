package section9_combining_publishers;

import com.vinsguru.common.Util;
import com.vinsguru.sec09.helper.Kayak;

public class MergeUseCase {

    public static void main(String[] args) {

        Kayak.getFlights()
                .subscribe(Util.subscriber());


        Util.sleepSeconds(3);


    }

}
