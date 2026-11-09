package omi.jnx.jnxequities.pts.ouch.v1_11.enums;

import java.util.Optional;

/**
 * Cash margin type of order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CashMarginType {

    /**
     * Cash
     */
    CASH('1', "Cash"),

    /**
     * Margin Open Negotiable
     */
    MARGIN_OPEN_NEGOTIABLE('2', "Margin Open Negotiable"),

    /**
     * Margin Close Negotiable
     */
    MARGIN_CLOSE_NEGOTIABLE('3', "Margin Close Negotiable"),

    /**
     * Margin Open Standardized
     */
    MARGIN_OPEN_STANDARDIZED('4', "Margin Open Standardized"),

    /**
     * Margin Close Standardized
     */
    MARGIN_CLOSE_STANDARDIZED('5', "Margin Close Standardized");

    private final char wire;

    private final String description;

    CashMarginType(char wire, String description) {
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
    public static Optional<CashMarginType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CASH);
            case '2' -> Optional.of(MARGIN_OPEN_NEGOTIABLE);
            case '3' -> Optional.of(MARGIN_CLOSE_NEGOTIABLE);
            case '4' -> Optional.of(MARGIN_OPEN_STANDARDIZED);
            case '5' -> Optional.of(MARGIN_CLOSE_STANDARDIZED);
            default -> Optional.empty();
        };
    }
}
