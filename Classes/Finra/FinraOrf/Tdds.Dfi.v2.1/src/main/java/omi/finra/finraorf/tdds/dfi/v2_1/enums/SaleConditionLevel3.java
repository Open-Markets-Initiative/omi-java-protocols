package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * This field is used to denote the sale condition associated with a trade transaction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SaleConditionLevel3 {

    /**
     * Executed Outside Normal Market Hours
     */
    EXECUTED_OUTSIDE_NORMAL_MARKET_HOURS('T', "Executed Outside Normal Market Hours"),

    /**
     * Executed Outside Normal Market Hours and Trade Reported Late
     */
    EXECUTED_OUTSIDE_NORMAL_MARKET_HOURS_AND_TRADE_REPORTED_LATE('U', "Executed Outside Normal Market Hours and Trade Reported Late"),

    /**
     * Executed During Normal Market Hours and Trade Reported Late
     */
    EXECUTED_DURING_NORMAL_MARKET_HOURS_AND_TRADE_REPORTED_LATE('Z', "Executed During Normal Market Hours and Trade Reported Late"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available");

    private final char wire;

    private final String description;

    SaleConditionLevel3(char wire, String description) {
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
    public static Optional<SaleConditionLevel3> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(EXECUTED_OUTSIDE_NORMAL_MARKET_HOURS);
            case 'U' -> Optional.of(EXECUTED_OUTSIDE_NORMAL_MARKET_HOURS_AND_TRADE_REPORTED_LATE);
            case 'Z' -> Optional.of(EXECUTED_DURING_NORMAL_MARKET_HOURS_AND_TRADE_REPORTED_LATE);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
