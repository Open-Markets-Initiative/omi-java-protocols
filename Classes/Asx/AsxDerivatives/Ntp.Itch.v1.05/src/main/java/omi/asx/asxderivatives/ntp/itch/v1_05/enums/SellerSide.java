package omi.asx.asxderivatives.ntp.itch.v1_05.enums;

import java.util.Optional;

/**
 * Type of order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SellerSide {

    /**
     * Sell Order
     */
    SELL('S', "Sell Order"),

    /**
     * Buy Order
     */
    BUY('B', "Buy Order");

    private final char wire;

    private final String description;

    SellerSide(char wire, String description) {
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
    public static Optional<SellerSide> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SELL);
            case 'B' -> Optional.of(BUY);
            default -> Optional.empty();
        };
    }
}
