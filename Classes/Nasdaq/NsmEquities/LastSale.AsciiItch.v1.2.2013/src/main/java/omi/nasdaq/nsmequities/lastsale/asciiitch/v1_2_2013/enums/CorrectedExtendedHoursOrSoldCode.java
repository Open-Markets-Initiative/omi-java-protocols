package omi.nasdaq.nsmequities.lastsale.asciiitch.v1_2_2013.enums;

import java.util.Optional;

/**
 * Sale Condition Modifier Level 3, used for Extended Hours or Sold Codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CorrectedExtendedHoursOrSoldCode {

    /**
     * Extended Hours Trade
     */
    EXTENDED_HOURS_TRADE('T', "Extended Hours Trade"),

    /**
     * Extended Hours Trade - Reported Late or Out of Sequence
     */
    EXTENDED_HOURS_TRADE_REPORTED_LATE_OR_OUT_OF_SEQUENCE('U', "Extended Hours Trade - Reported Late or Out of Sequence"),

    /**
     * Sold Last - Reported Late But In Sequence
     */
    SOLD_LAST_REPORTED_LATE_BUT_IN_SEQUENCE('L', "Sold Last - Reported Late But In Sequence"),

    /**
     * Sold - Out of Sequence
     */
    SOLD_OUT_OF_SEQUENCE('Z', "Sold - Out of Sequence"),

    /**
     * Not applicable
     */
    NOT_APPLICABLE(' ', "Not applicable");

    private final char wire;

    private final String description;

    CorrectedExtendedHoursOrSoldCode(char wire, String description) {
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
    public static Optional<CorrectedExtendedHoursOrSoldCode> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'U' -> Optional.of(EXTENDED_HOURS_TRADE_REPORTED_LATE_OR_OUT_OF_SEQUENCE);
            case 'L' -> Optional.of(SOLD_LAST_REPORTED_LATE_BUT_IN_SEQUENCE);
            case 'Z' -> Optional.of(SOLD_OUT_OF_SEQUENCE);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
