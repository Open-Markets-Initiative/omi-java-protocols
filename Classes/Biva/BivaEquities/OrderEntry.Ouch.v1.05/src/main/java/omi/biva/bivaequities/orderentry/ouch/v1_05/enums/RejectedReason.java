package omi.biva.bivaequities.orderentry.ouch.v1_05.enums;

import java.util.Optional;

/**
 * The reason the order was rejected
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectedReason {

    /**
     * Secboard Instrument Board Or Market Not Tradeable
     */
    SECBOARD_INSTRUMENT_BOARD_OR_MARKET_NOT_TRADEABLE('H', "Secboard Instrument Board Or Market Not Tradeable"),

    /**
     * Invalid Quantity Or Quantity Exceeds Maximum Limit
     */
    INVALID_QUANTITY_OR_QUANTITY_EXCEEDS_MAXIMUM_LIMIT('Z', "Invalid Quantity Or Quantity Exceeds Maximum Limit"),

    /**
     * Invalid Orderbook Identifier
     */
    INVALID_ORDERBOOK_IDENTIFIER('S', "Invalid Orderbook Identifier"),

    /**
     * Order Not Allowed At This Time
     */
    ORDER_NOT_ALLOWED_AT_THIS_TIME('R', "Order Not Allowed At This Time"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('X', "Invalid Price"),

    /**
     * Invalid Minimum Quantity
     */
    INVALID_MINIMUM_QUANTITY('N', "Invalid Minimum Quantity"),

    /**
     * Invalid Order Type
     */
    INVALID_ORDER_TYPE('Y', "Invalid Order Type"),

    /**
     * Flow Control In Place For User
     */
    FLOW_CONTROL_IN_PLACE_FOR_USER('F', "Flow Control In Place For User"),

    /**
     * Unknown
     */
    UNKNOWN('W', "Unknown");

    private final char wire;

    private final String description;

    RejectedReason(char wire, String description) {
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
    public static Optional<RejectedReason> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(SECBOARD_INSTRUMENT_BOARD_OR_MARKET_NOT_TRADEABLE);
            case 'Z' -> Optional.of(INVALID_QUANTITY_OR_QUANTITY_EXCEEDS_MAXIMUM_LIMIT);
            case 'S' -> Optional.of(INVALID_ORDERBOOK_IDENTIFIER);
            case 'R' -> Optional.of(ORDER_NOT_ALLOWED_AT_THIS_TIME);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'N' -> Optional.of(INVALID_MINIMUM_QUANTITY);
            case 'Y' -> Optional.of(INVALID_ORDER_TYPE);
            case 'F' -> Optional.of(FLOW_CONTROL_IN_PLACE_FOR_USER);
            case 'W' -> Optional.of(UNKNOWN);
            default -> Optional.empty();
        };
    }
}
