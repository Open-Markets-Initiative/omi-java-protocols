package omi.currenex.currenexforex.now.cbp.v10.enums;

import java.util.Optional;

/**
 * Subscribe to price updates with full depth of the book
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubscribeToNowDepthOfBook {

    /**
     * Subscribe
     */
    SUBSCRIBE('0', "Subscribe"),

    /**
     * Do Not Subscribe
     */
    DO_NOT_SUBSCRIBE('1', "Do Not Subscribe");

    private final char wire;

    private final String description;

    SubscribeToNowDepthOfBook(char wire, String description) {
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
    public static Optional<SubscribeToNowDepthOfBook> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(SUBSCRIBE);
            case '1' -> Optional.of(DO_NOT_SUBSCRIBE);
            default -> Optional.empty();
        };
    }
}
