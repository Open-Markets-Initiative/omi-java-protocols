package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.enums;

import java.util.Optional;

/**
 * Defines the IntraFirmTradeInd values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IntraFirmTradeInd {

    /**
     * Not an intra-group transaction (default)
     */
    NOT_AN_INTRAGROUP_TRANSACTION('N', "Not an intra-group transaction (default)"),

    /**
     * Is an intra-group transaction
     */
    IS_AN_INTRAGROUP_TRANSACTION('Y', "Is an intra-group transaction");

    private final char wire;

    private final String description;

    IntraFirmTradeInd(char wire, String description) {
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
    public static Optional<IntraFirmTradeInd> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NOT_AN_INTRAGROUP_TRANSACTION);
            case 'Y' -> Optional.of(IS_AN_INTRAGROUP_TRANSACTION);
            default -> Optional.empty();
        };
    }
}
