package omi.nasdaq.ntxoptions.cti.itch.v1_3.enums;

import java.util.Optional;

/**
 * Short sell for a stock leg: Y = Short Sale, N = Not a Short Sale, E = Short Sale Exempt, space = Not Applicable (Not a Stock Leg)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSell {

    /**
     * Short Sale
     */
    SHORT_SALE('Y', "Short Sale"),

    /**
     * Not a Short Sale
     */
    NOT_A_SHORT_SALE('N', "Not a Short Sale"),

    /**
     * Short Sale Exempt
     */
    SHORT_SALE_EXEMPT('E', "Short Sale Exempt"),

    /**
     * Not Applicable (Not a Stock Leg)
     */
    NOT_APPLICABLE(' ', "Not Applicable (Not a Stock Leg)");

    private final char wire;

    private final String description;

    ShortSell(char wire, String description) {
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
    public static Optional<ShortSell> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(SHORT_SALE);
            case 'N' -> Optional.of(NOT_A_SHORT_SALE);
            case 'E' -> Optional.of(SHORT_SALE_EXEMPT);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
