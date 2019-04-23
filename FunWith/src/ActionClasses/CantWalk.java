package ActionClasses;

import Interfaces.IWalk;
//region  Can't Walk Behavior

// region Can't Walk Description
/*
* This a class CantWalk, this creates  a behavior for Humans who can't walk
* This implements the IWalk interface
*/
//endregion
public class CantWalk implements IWalk {
    //region Can't Walk Method
    public void walking (){
        System.out.println(" can't walk");
    }
    //endregion
}
//endregion