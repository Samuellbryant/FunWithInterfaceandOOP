package Base;

import Interfaces.ISpeak;
import Interfaces.IWalk;

public abstract class Human {
   // region
    protected ISpeak speak;
    protected IWalk walk;

    String name = getClass().getSimpleName();
    protected String gender;
    // region performSpeaking
    public void performSpeaking() {


            System.out.print(this.name);
        speak.speaking();

    }
    //endregion
    public void performWalking(){
        System.out.print(this.name);
        walk.walking();
        }

    public String getName(){
        return this.name;
    }


    public abstract void introduce();


    public void breathe(){
        System.out.println( this.name+ "  is breathing " );
    }


}
