package com.example.interface_class;

import android.util.Log;

public  class implement_in_class implements interface_declare {

    @Override
    public String provideName() {
        return "This is my name";
    }

    @Override
    public int giveMeAge(int d) {
        return d*100;
    }



    @Override
    public void leaveMessage(String message) {
        Log.i("myTag", "WHAATWOW ");
    }
}

