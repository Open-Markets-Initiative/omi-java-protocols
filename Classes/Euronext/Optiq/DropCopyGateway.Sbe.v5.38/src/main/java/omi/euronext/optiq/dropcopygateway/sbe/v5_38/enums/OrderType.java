package omi.euronext.optiq.dropcopygateway.sbe.v5_38.enums;

import java.util.Optional;

/**
 * orderType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderType {

    /**
     * Market
     */
    MARKET((short) 1, "Market"),

    /**
     * Limit
     */
    LIMIT((short) 2, "Limit"),

    /**
     * Stop_market_or_Stop_market_on_quote
     */
    STOPMARKETOR_STOPMARKETONQUOTE((short) 3, "Stop_market_or_Stop_market_on_quote"),

    /**
     * Stop_limit_or_Stop_limit_on_quote
     */
    STOPLIMITOR_STOPLIMITONQUOTE((short) 4, "Stop_limit_or_Stop_limit_on_quote"),

    /**
     * Primary_Peg
     */
    PRIMARY_PEG((short) 5, "Primary_Peg"),

    /**
     * Market_to_limit
     */
    MARKETTOLIMIT((short) 6, "Market_to_limit"),

    /**
     * Market_Peg
     */
    MARKET_PEG((short) 7, "Market_Peg"),

    /**
     * Mid_Point_Peg
     */
    MID_POINT_PEG((short) 8, "Mid_Point_Peg"),

    /**
     * Average_Price
     */
    AVERAGE_PRICE((short) 9, "Average_Price"),

    /**
     * Iceberg
     */
    ICEBERG((short) 10, "Iceberg"),

    /**
     * Implied
     */
    IMPLIED((short) 12, "Implied"),

    /**
     * Post_trade_Implied
     */
    POSTTRADE_IMPLIED((short) 13, "Post_trade_Implied");

    private final short wire;

    private final String description;

    OrderType(short wire, String description) {
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
    public static Optional<OrderType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MARKET);
            case 2 -> Optional.of(LIMIT);
            case 3 -> Optional.of(STOPMARKETOR_STOPMARKETONQUOTE);
            case 4 -> Optional.of(STOPLIMITOR_STOPLIMITONQUOTE);
            case 5 -> Optional.of(PRIMARY_PEG);
            case 6 -> Optional.of(MARKETTOLIMIT);
            case 7 -> Optional.of(MARKET_PEG);
            case 8 -> Optional.of(MID_POINT_PEG);
            case 9 -> Optional.of(AVERAGE_PRICE);
            case 10 -> Optional.of(ICEBERG);
            case 12 -> Optional.of(IMPLIED);
            case 13 -> Optional.of(POSTTRADE_IMPLIED);
            default -> Optional.empty();
        };
    }
}
