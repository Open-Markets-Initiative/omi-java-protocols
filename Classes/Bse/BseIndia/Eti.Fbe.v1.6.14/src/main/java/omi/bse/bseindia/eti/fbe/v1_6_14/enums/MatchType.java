package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the MatchType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MatchType {

    /**
     * Auto Match Incoming
     */
    AUTOMATCHINCOMING((short) 4, "Auto Match Incoming"),

    /**
     * Call Auction
     */
    CALL_AUCTION((short) 7, "Call Auction"),

    /**
     * Auto Match Resting
     */
    AUTOMATCHRESTING((short) 11, "Auto Match Resting"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    MatchType(short wire, String description) {
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
    public static Optional<MatchType> fromWire(short wire) {
        return switch (wire) {
            case 4 -> Optional.of(AUTOMATCHINCOMING);
            case 7 -> Optional.of(CALL_AUCTION);
            case 11 -> Optional.of(AUTOMATCHRESTING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
