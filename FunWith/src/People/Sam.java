package People;

import ActionClasses.CanWalk;
import ActionClasses.CantSpeak;
import Base.Human;
public class Sam extends Human {
    private String disability;


    public Sam() {
        walk = new CanWalk();
        speak = new CantSpeak();

        gender = "male";
        disability="cp";
        this.breathe();

    }
    @Override
    public void introduce(){
        System.out.println("His name is "+ this.getName()+"  he am a "+ gender+ " and he has "+ disability+".");
    }

}
