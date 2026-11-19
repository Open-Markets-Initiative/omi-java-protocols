package omi.lme.lmeselect.level3.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Type of Quote Request.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteRequestType {

    /**
     * Manual A Single Quote Request
     */
    MANUAL_A_SINGLE_QUOTE_REQUEST((short) 1, "Manual A Single Quote Request"),

    /**
     * Auto A Streaming Quote Request
     */
    AUTO_A_STREAMING_QUOTE_REQUEST((short) 2, "Auto A Streaming Quote Request");

    private final short wire;

    private final String description;

    QuoteRequestType(short wire, String description) {
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
    public static Optional<QuoteRequestType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MANUAL_A_SINGLE_QUOTE_REQUEST);
            case 2 -> Optional.of(AUTO_A_STREAMING_QUOTE_REQUEST);
            default -> Optional.empty();
        };
    }
}
