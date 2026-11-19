package omi.nasdaq.utdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Settlement Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Level1 {

    /**
     * Regular Trade
     */
    REGULAR_TRADE('@', "Regular Trade"),

    /**
     * Cash
     */
    CASH('C', "Cash"),

    /**
     * Next Day
     */
    NEXT_DAY('N', "Next Day"),

    /**
     * Seller
     */
    SELLER('R', "Seller"),

    /**
     * Yellow Flag
     */
    YELLOW_FLAG('Y', "Yellow Flag"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available");

    private final char wire;

    private final String description;

    Level1(char wire, String description) {
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
    public static Optional<Level1> fromWire(char wire) {
        return switch (wire) {
            case '@' -> Optional.of(REGULAR_TRADE);
            case 'C' -> Optional.of(CASH);
            case 'N' -> Optional.of(NEXT_DAY);
            case 'R' -> Optional.of(SELLER);
            case 'Y' -> Optional.of(YELLOW_FLAG);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
