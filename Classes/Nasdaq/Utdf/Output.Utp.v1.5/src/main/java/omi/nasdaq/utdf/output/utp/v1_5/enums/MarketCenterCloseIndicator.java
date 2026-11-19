package omi.nasdaq.utdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Market Center Close Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCenterCloseIndicator {

    /**
     * Based on M sale Condition
     */
    BASED_ON_M_SALE_CONDITION('M', "Based on M sale Condition"),

    /**
     * Not Based on M sale Condition
     */
    NOT_BASED_ON_M_SALE_CONDITION(' ', "Not Based on M sale Condition");

    private final char wire;

    private final String description;

    MarketCenterCloseIndicator(char wire, String description) {
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
    public static Optional<MarketCenterCloseIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(BASED_ON_M_SALE_CONDITION);
            case ' ' -> Optional.of(NOT_BASED_ON_M_SALE_CONDITION);
            default -> Optional.empty();
        };
    }
}
