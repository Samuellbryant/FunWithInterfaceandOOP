package ActionClasses;


import Interfaces.ISpeak;
//region  Can Speak Behavior

// region Can Speak Description
/*
 * This a class Cant Speak, this creates a behavior for Humans who can speak.
 * This implements the ISpeak interface.
 */
//endregion
public class CanSpeak implements ISpeak {
    //region speaking method
    public void speaking() {

        System.out.println(" is speaking.");
    }
    //endregion
}
//endregion
