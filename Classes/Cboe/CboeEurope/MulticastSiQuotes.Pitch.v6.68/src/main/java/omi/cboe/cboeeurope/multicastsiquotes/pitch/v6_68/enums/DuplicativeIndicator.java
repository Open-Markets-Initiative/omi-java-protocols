package omi.cboe.cboeeurope.multicastsiquotes.pitch.v6_68.enums;

import java.util.Optional;

/**
 * MMT Level 5
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DuplicativeIndicator {

    /**
     * Duplicative Trade Report
     */
    DUPLICATIVE_TRADE_REPORT('1', "Duplicative Trade Report"),

    /**
     * Unique Trade Report
     */
    UNIQUE_TRADE_REPORT('-', "Unique Trade Report"),

    /**
     * Igrp
     */
    IGRP('2', "Igrp"),

    /**
     * Dupl Igrp
     */
    DUPL_IGRP('3', "Dupl Igrp"),

    /**
     * Xbdt
     */
    XBDT('4', "Xbdt"),

    /**
     * Dupl Xbdt
     */
    DUPL_XBDT('5', "Dupl Xbdt"),

    /**
     * Dupl Xbdt Igrp
     */
    DUPL_XBDT_IGRP('6', "Dupl Xbdt Igrp"),

    /**
     * Xbdt Igrp
     */
    XBDT_IGRP('7', "Xbdt Igrp");

    private final char wire;

    private final String description;

    DuplicativeIndicator(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<DuplicativeIndicator> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(DUPLICATIVE_TRADE_REPORT);
            case '-' -> Optional.of(UNIQUE_TRADE_REPORT);
            case '2' -> Optional.of(IGRP);
            case '3' -> Optional.of(DUPL_IGRP);
            case '4' -> Optional.of(XBDT);
            case '5' -> Optional.of(DUPL_XBDT);
            case '6' -> Optional.of(DUPL_XBDT_IGRP);
            case '7' -> Optional.of(XBDT_IGRP);
            default -> Optional.empty();
        };
    }
}
