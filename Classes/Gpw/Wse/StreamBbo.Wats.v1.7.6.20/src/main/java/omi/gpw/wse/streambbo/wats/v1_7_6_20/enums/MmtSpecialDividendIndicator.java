package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Special Dividend Indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtSpecialDividendIndicator {

    /**
     * E = Special Dividend Trade
     */
    SPECIAL_DIVIDEND_TRADE((short) 1, "E = Special Dividend Trade"),

    /**
     * - = No Special Dividend Trade
     */
    NO_SPECIAL_DIVIDEND_TRADE((short) 2, "- = No Special Dividend Trade");

    private final short wire;

    private final String description;

    MmtSpecialDividendIndicator(short wire, String description) {
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
    public static Optional<MmtSpecialDividendIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SPECIAL_DIVIDEND_TRADE);
            case 2 -> Optional.of(NO_SPECIAL_DIVIDEND_TRADE);
            default -> Optional.empty();
        };
    }
}
