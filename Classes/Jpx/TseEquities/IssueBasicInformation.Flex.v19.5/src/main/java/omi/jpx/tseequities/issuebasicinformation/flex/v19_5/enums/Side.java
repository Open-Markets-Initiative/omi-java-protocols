package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the prohibited ordering for the side of a new order.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * Both Sell And Buy Orders Are Prohibited
     */
    BOTH_SELL_AND_BUY_ORDERS_ARE_PROHIBITED('1', "Both Sell And Buy Orders Are Prohibited"),

    /**
     * Only Sell Order Is Prohibited
     */
    ONLY_SELL_ORDER_IS_PROHIBITED('2', "Only Sell Order Is Prohibited"),

    /**
     * Only Buy Order Is Prohibited
     */
    ONLY_BUY_ORDER_IS_PROHIBITED('3', "Only Buy Order Is Prohibited"),

    /**
     * Nothing is prohibited for this type of order.
     */
    OTHER_THAN_THE_ABOVE(' ', "Nothing is prohibited for this type of order.");

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
            case '1' -> Optional.of(BOTH_SELL_AND_BUY_ORDERS_ARE_PROHIBITED);
            case '2' -> Optional.of(ONLY_SELL_ORDER_IS_PROHIBITED);
            case '3' -> Optional.of(ONLY_BUY_ORDER_IS_PROHIBITED);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
