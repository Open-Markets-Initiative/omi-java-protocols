package omi.bme.meff.retail5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Request type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IoiQltyInd {

    /**
     * High Rfq Requested
     */
    HIGH_RFQ_REQUESTED('H', "High Rfq Requested"),

    /**
     * Medium Order Requested
     */
    MEDIUM_ORDER_REQUESTED('M', "Medium Order Requested");

    private final char wire;

    private final String description;

    IoiQltyInd(char wire, String description) {
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
    public static Optional<IoiQltyInd> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HIGH_RFQ_REQUESTED);
            case 'M' -> Optional.of(MEDIUM_ORDER_REQUESTED);
            default -> Optional.empty();
        };
    }
}
