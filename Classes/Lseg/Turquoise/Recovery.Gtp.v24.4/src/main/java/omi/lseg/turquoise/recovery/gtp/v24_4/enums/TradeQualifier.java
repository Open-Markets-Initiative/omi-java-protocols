package omi.lseg.turquoise.recovery.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Qualifier of the trade.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeQualifier {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Trade At Last
     */
    TRADE_AT_LAST('T', "Trade At Last");

    private final char wire;

    private final String description;

    TradeQualifier(char wire, String description) {
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
    public static Optional<TradeQualifier> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'T' -> Optional.of(TRADE_AT_LAST);
            default -> Optional.empty();
        };
    }
}
