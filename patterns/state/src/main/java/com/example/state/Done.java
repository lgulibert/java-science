package com.example.state;

import com.example.Context;
import com.example.State;

/**
 * Created by alee2 on 8/6/18.
 *
 * @author alee2
 */
public class Done implements State {

    @Override
    public void doStateAction(Context context) {
        System.out.println("Done");
        System.out.println("----");
    }
}
