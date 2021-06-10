package com.cisco.ledlights;

class Flashes {
    static boolean isLedFlashVal() {
        return Flashes.ledFlashVal;
    }
    static void setLedFlashVal(boolean ledFlashVal) {
        Flashes.ledFlashVal = ledFlashVal;
    }

    private static boolean ledFlashVal = false;
}
