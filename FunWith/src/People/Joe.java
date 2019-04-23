package People;

import ActionClasses.CantWalk;
import ActionClasses.CanSpeak;
import Base.Human;

public class Joe extends Human {
    private String favoriteThing;
    public Joe (){
        walk = new CantWalk();
        speak = new CanSpeak();

        gender = "male";
        favoriteThing="Climbing";
        this.breathe();

    }

    @Override
    public void introduce(){
        System.out.println("His Name is "+this.getName() + " his is a "+gender+ " and his favorite thing is " + favoriteThing+".");

    }


}
