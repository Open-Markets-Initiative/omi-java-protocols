package omi.asx.asxderivatives.ntp.itch.v1_05.enums;

import java.util.Optional;

/**
 * Identifies side of the RFQ
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RfqSide {

    /**
     * Two Sided Quote
     */
    TWO_SIDED_QUOTE('T', "Two Sided Quote"),

    /**
     * Bid Quote
     */
    BID_QUOTE('B', "Bid Quote"),

    /**
     * Ask Quote
     */
    ASK_QUOTE('S', "Ask Quote"),

    /**
     * Crossing
     */
    CROSSING('X', "Crossing");

    private final char wire;

    private final String description;

    RfqSide(char wire, String description) {
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
    public static Optional<RfqSide> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TWO_SIDED_QUOTE);
            case 'B' -> Optional.of(BID_QUOTE);
            case 'S' -> Optional.of(ASK_QUOTE);
            case 'X' -> Optional.of(CROSSING);
            default -> Optional.empty();
        };
    }
}
