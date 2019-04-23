package Program;

import Base.Human;
import People.Joe;
import People.Sam;

public class FunWithPeople {
    public static  void main(String [] args) {
        Human sam = new Sam();
        Human joe = new Joe();

        sam.introduce();
        sam.performSpeaking();
        sam.performWalking();
        joe.performWalking();
        joe.performSpeaking();

        //sam = null;

    }

}
