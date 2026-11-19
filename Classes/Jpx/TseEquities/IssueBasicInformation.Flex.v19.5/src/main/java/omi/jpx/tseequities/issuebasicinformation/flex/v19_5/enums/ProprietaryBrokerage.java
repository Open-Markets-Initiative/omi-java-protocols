package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the prohibited ordering for the proprietary / brokerage classification of a new order.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ProprietaryBrokerage {

    /**
     * Only Proprietary Order Is Prohibited
     */
    ONLY_PROPRIETARY_ORDER_IS_PROHIBITED('1', "Only Proprietary Order Is Prohibited"),

    /**
     * Both Proprietary And Brokerage Orders Are Prohibited
     */
    BOTH_PROPRIETARY_AND_BROKERAGE_ORDERS_ARE_PROHIBITED('2', "Both Proprietary And Brokerage Orders Are Prohibited"),

    /**
     * Nothing is prohibited for this type of order.
     */
    OTHER_THAN_THE_ABOVE(' ', "Nothing is prohibited for this type of order.");

    private final char wire;

    private final String description;

    ProprietaryBrokerage(char wire, String description) {
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
    public static Optional<ProprietaryBrokerage> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(ONLY_PROPRIETARY_ORDER_IS_PROHIBITED);
            case '2' -> Optional.of(BOTH_PROPRIETARY_AND_BROKERAGE_ORDERS_ARE_PROHIBITED);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
