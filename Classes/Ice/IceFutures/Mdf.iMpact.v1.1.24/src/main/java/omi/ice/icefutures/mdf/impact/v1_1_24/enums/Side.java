package omi.ice.icefutures.mdf.impact.v1_1_24.enums;

import java.util.Optional;

/**
 * 1 = Bid, 2 = Offer
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * None
     */
    NONE(' ', "None"),

    /**
     * Bid
     */
    BID('1', "Bid"),

    /**
     * Offer
     */
    OFFER('2', "Offer");

    private final char wire;

    private final String description;

    Side(char wire, String description) {
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
    public static Optional<Side> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NONE);
            case '1' -> Optional.of(BID);
            case '2' -> Optional.of(OFFER);
            default -> Optional.empty();
        };
    }
}
