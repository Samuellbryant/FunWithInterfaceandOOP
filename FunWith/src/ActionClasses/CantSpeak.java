package ActionClasses;

import Interfaces.ISpeak;
//region  Can't Speak Behavior

// region Can't Speak Description
/*
 * This a class Cant Speak, this creates a behavior for Humans who can't speak.
 * This implements the ISpeak interface.
 */
//endregion
public class CantSpeak implements ISpeak {
    //region walking method
    public void  speaking(){
       System.out.println(" can't speak.");
   }
   //endregion
}
// endregion
