package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the prohibition status for all orders including modification and cancel orders.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AllOrdersProhibition {

    /**
     * Prohibited For All Orders
     */
    PROHIBITED_FOR_ALL_ORDERS('1', "Prohibited For All Orders"),

    /**
     * Nothing is prohibited for this type of order.
     */
    OTHER_THAN_THE_ABOVE(' ', "Nothing is prohibited for this type of order.");

    private final char wire;

    private final String description;

    AllOrdersProhibition(char wire, String description) {
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
    public static Optional<AllOrdersProhibition> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(PROHIBITED_FOR_ALL_ORDERS);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
