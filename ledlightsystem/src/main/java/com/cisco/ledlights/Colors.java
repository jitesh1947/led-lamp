package com.cisco.ledlights;

class Colors {

    public static void setLedRedVal(boolean ledRedVal) {
        Colors.ledRedVal = ledRedVal;
    }

     static boolean ledRedVal = true; // red ON if true; white ON if false
}
