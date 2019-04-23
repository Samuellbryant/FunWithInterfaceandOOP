package ActionClasses;
import Interfaces.IWalk;
// region Can Walk Behavior

// region Can Walk Description
/*
 * This a class CanWalk, this creates a behavior for Humans who can walk.
 * This implements the IWalk interface.
 */
//endregion
public class CanWalk implements IWalk {
    //region walking method
    public void walking(){
        System.out.println(" is walking.");
    }
    //endregion
}
//endregion
