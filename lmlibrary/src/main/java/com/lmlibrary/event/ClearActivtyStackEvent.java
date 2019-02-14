package com.lmlibrary.event;

import java.io.Serializable;

public class ClearActivtyStackEvent implements Serializable {
    public String className;
    public ClearActivtyStackEvent(String className){
        this.className=className;
    }

}
