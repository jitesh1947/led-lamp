package com.cisco.ledlights

import org.junit.Test
import spock.lang.Specification

class LightsTestSpec extends Specification {
    def "RedOn"() {
        given:
        Lights lt = new Lights();

        when:
        lt.setLedSwitchVal(true);
        Colors.setLedRedVal(true);

        then:
        lt.redOn() == "true"
    }

    def "TestWhiteOn"() {
        given:
        Lights lt = new Lights();

        when:
        lt.setLedSwitchVal(true);
        Colors.setLedRedVal(false);

        then:
        lt.whiteOn() == "true"
    }

    def "LedOff"() {
        given:
        Lights lt = new Lights();

        when:
        lt.ledOff();

        then:
        lt.ledOff() == "false"
    }

    def "RedFlash"() {
        given:
        Lights lt = new Lights();

        when:
        lt.setLedSwitchVal(true);
        Colors.setLedRedVal(true);
        Flashes.setLedFlashVal(true);

        then:
        lt.redFlash() == "true"
    }

    def "WhiteFlash"() {
        given:
        Lights lt = new Lights();

        when:
        lt.setLedSwitchVal(true);
        Colors.setLedRedVal(false);
        Flashes.setLedFlashVal(true);

        then:
        lt.whiteFlash() == "true"
    }

    def "ToString"() {
        given:
        Lights lt = new Lights();

        when:
        lt.setLedSwitchVal(true);
        Colors.setLedRedVal(false);
        Flashes.setLedFlashVal(true);

        then:
        lt.toString() == "Lights behaviour{lED On/Off= true       Red Color= false" +
                "       White Color= true       Red Flash= false       White Flash= true}"

    }

}
