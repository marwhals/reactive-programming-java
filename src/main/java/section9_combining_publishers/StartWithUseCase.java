package section9_combining_publishers;

import common.Util;
import section9_combining_publishers.usecases.NameGenerator;

public class StartWithUseCase {

    public static void main(String[] args) {


        var nameGenerator = new NameGenerator();

        nameGenerator.generateNames()
                     .take(2)
                     .subscribe(Util.subscriber("sam"));


        nameGenerator.generateNames()
                     .take(2)
                     .subscribe(Util.subscriber("mike"));

        nameGenerator.generateNames()
                     .take(3)
                     .subscribe(Util.subscriber("jake"));


    }

}
