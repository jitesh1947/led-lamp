package com.cisco.ledlights;

public class Lights {
    private boolean ledSwitchVal = false;
    boolean isLedSwitchVal() {
        return ledSwitchVal;
    }
    void setLedSwitchVal(boolean ledSwitchVal) {
        this.ledSwitchVal = ledSwitchVal;
    }

    Colors color = new Colors();
    Flashes flash = new Flashes();

    String redOn() {
        if (isLedSwitchVal() == true) return String.valueOf(Colors.ledRedVal);
        return "false";

    }

    String whiteOn() {
        if  (isLedSwitchVal() == true && Colors.ledRedVal == false) return "true";
        return "false";
    }

    String ledOff() {
        this.ledSwitchVal = false;
        flash.setLedFlashVal(false);
        return String.valueOf(isLedSwitchVal());
    }

    String redFlash() {
        if (ledSwitchVal == true && Colors.ledRedVal == true) return String.valueOf(Flashes.isLedFlashVal());
        return "false";
    }

    String whiteFlash() {
        if (ledSwitchVal == true && Colors.ledRedVal == false) return String.valueOf(Flashes.isLedFlashVal());
        return "false";
    }

    @Override
    public String toString() {
        return "Lights behaviour{" +
                "lED On/Off= " + ledSwitchVal +
                "       Red Color= " + redOn() +
                "       White Color= " + whiteOn() +
                "       Red Flash= " + redFlash() +
                "       White Flash= " + whiteFlash() +
                '}';
    }
}
