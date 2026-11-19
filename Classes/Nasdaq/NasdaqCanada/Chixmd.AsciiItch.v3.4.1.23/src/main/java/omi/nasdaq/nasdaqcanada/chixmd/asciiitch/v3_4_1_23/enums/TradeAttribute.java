package omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.enums;

import java.util.Optional;

/**
 * C = Market On Close
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeAttribute {

    /**
     * Bypass (intentional crosses only), Trade Message
     */
    BYPASS('B', "Bypass (intentional crosses only), Trade Message"),

    /**
     * Market On Close on the Order Execution Message; CXD Conditional on the Trade Message
     */
    MARKET_ON_CLOSE_OR_CXD_CONDITIONAL('C', "Market On Close on the Order Execution Message; CXD Conditional on the Trade Message"),

    /**
     * M-ELO, Trade Message
     */
    M_ELO('L', "M-ELO, Trade Message"),

    /**
     * CXD PureStream, Trade Message
     */
    CXD_PURE_STREAM('P', "CXD PureStream, Trade Message");

    private final char wire;

    private final String description;

    TradeAttribute(char wire, String description) {
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
    public static Optional<TradeAttribute> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BYPASS);
            case 'C' -> Optional.of(MARKET_ON_CLOSE_OR_CXD_CONDITIONAL);
            case 'L' -> Optional.of(M_ELO);
            case 'P' -> Optional.of(CXD_PURE_STREAM);
            default -> Optional.empty();
        };
    }
}
