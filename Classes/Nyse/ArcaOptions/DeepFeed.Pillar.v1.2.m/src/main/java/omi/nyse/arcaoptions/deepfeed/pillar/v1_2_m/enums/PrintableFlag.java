package omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.enums;

import java.util.Optional;

/**
 * Indicates whether trade is included in total volume.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PrintableFlag {

    /**
     * Trade Not Included In Total Volume
     */
    TRADE_NOT_INCLUDED_IN_TOTAL_VOLUME((short) 0, "Trade Not Included In Total Volume"),

    /**
     * Trade Included In Total Volume
     */
    TRADE_INCLUDED_IN_TOTAL_VOLUME((short) 1, "Trade Included In Total Volume");

    private final short wire;

    private final String description;

    PrintableFlag(short wire, String description) {
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
    public static Optional<PrintableFlag> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(TRADE_NOT_INCLUDED_IN_TOTAL_VOLUME);
            case 1 -> Optional.of(TRADE_INCLUDED_IN_TOTAL_VOLUME);
            default -> Optional.empty();
        };
    }
}
