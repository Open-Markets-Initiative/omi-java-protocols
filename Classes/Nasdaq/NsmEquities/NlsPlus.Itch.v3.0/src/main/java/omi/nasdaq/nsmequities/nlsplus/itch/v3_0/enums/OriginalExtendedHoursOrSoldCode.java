package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Used for Extended Hours or Sold codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OriginalExtendedHoursOrSoldCode {

    /**
     * Extended Hours Trade
     */
    EXTENDED_HOURS_TRADE('T', "Extended Hours Trade"),

    /**
     * Extended Hours Trade, Reported Late or Out of Sequence
     */
    EXTENDED_HOURS_TRADE_REPORTED_LATE('U', "Extended Hours Trade, Reported Late or Out of Sequence"),

    /**
     * Sold Last, Reported Late But In Sequence
     */
    SOLD_LAST('L', "Sold Last, Reported Late But In Sequence"),

    /**
     * Sold, Out of Sequence
     */
    SOLD_OUT_OF_SEQUENCE('Z', "Sold, Out of Sequence"),

    /**
     * Not applicable
     */
    NOT_APPLICABLE(' ', "Not applicable");

    private final char wire;

    private final String description;

    OriginalExtendedHoursOrSoldCode(char wire, String description) {
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
    public static Optional<OriginalExtendedHoursOrSoldCode> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'U' -> Optional.of(EXTENDED_HOURS_TRADE_REPORTED_LATE);
            case 'L' -> Optional.of(SOLD_LAST);
            case 'Z' -> Optional.of(SOLD_OUT_OF_SEQUENCE);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
