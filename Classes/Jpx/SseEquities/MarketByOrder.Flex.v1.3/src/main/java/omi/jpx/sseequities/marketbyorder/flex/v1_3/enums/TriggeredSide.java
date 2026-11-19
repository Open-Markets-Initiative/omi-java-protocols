package omi.jpx.sseequities.marketbyorder.flex.v1_3.enums;

import java.util.Optional;

/**
 * Indicates the side whose order triggered the execution
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TriggeredSide {

    /**
     * Sell Order
     */
    SELL_ORDER('S', "Sell Order"),

    /**
     * Buy Order
     */
    BUY_ORDER('B', "Buy Order"),

    /**
     * Itayose Execution
     */
    ITAYOSE_EXECUTION(' ', "Itayose Execution");

    private final char wire;

    private final String description;

    TriggeredSide(char wire, String description) {
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
    public static Optional<TriggeredSide> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SELL_ORDER);
            case 'B' -> Optional.of(BUY_ORDER);
            case ' ' -> Optional.of(ITAYOSE_EXECUTION);
            default -> Optional.empty();
        };
    }
}
