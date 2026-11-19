package omi.euronext.optiq.dropcopygateway.sbe.v6_65.enums;

import java.util.Optional;

/**
 * guaranteeFlag
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum GuaranteeFlagOptional {

    /**
     * Cleared_but_not_Guaranteed
     */
    CLEAREDBUTNOT_GUARANTEED((short) 1, "Cleared_but_not_Guaranteed"),

    /**
     * Cleared_and_Guaranteed
     */
    CLEAREDAND_GUARANTEED((short) 2, "Cleared_and_Guaranteed"),

    /**
     * guaranteeFlag
     */
    NO_VALUE((short) 255, "guaranteeFlag");

    private final short wire;

    private final String description;

    GuaranteeFlagOptional(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<GuaranteeFlagOptional> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CLEAREDBUTNOT_GUARANTEED);
            case 2 -> Optional.of(CLEAREDAND_GUARANTEED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
