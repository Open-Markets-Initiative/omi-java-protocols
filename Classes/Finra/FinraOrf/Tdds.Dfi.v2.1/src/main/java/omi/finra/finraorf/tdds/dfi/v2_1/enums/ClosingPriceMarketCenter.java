package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * This field indicates the market center responsible for the closing price
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClosingPriceMarketCenter {

    /**
     * OOTC
     */
    OOTC('u', "OOTC"),

    /**
     * Not applicable
     */
    NOT_APPLICABLE(' ', "Not applicable");

    private final char wire;

    private final String description;

    ClosingPriceMarketCenter(char wire, String description) {
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
    public static Optional<ClosingPriceMarketCenter> fromWire(char wire) {
        return switch (wire) {
            case 'u' -> Optional.of(OOTC);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
