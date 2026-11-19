package omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.enums;

import java.util.Optional;

/**
 * Side of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * Buy
     */
    BUY('1', "Buy"),

    /**
     * Sell
     */
    SELL('2', "Sell"),

    /**
     * Sell Short Client Affirms Ability To Borrow
     */
    SELL_SHORT_CLIENT_AFFIRMS_ABILITY_TO_BORROW('5', "Sell Short Client Affirms Ability To Borrow"),

    /**
     * Sell Short Exempt
     */
    SELL_SHORT_EXEMPT('6', "Sell Short Exempt");

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
            case '1' -> Optional.of(BUY);
            case '2' -> Optional.of(SELL);
            case '5' -> Optional.of(SELL_SHORT_CLIENT_AFFIRMS_ABILITY_TO_BORROW);
            case '6' -> Optional.of(SELL_SHORT_EXEMPT);
            default -> Optional.empty();
        };
    }
}
