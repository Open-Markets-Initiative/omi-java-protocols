package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * orderCategory
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderCategory {

    /**
     * RESULT_OF_OPTIONS_EXERCISE
     */
    RESULT_OF_OPTIONS_EXERCISE('B', "RESULT_OF_OPTIONS_EXERCISE"),

    /**
     * RESULT_OF_ASSIGNMENT_FROM_AN_OPTIONS_EXERCISE
     */
    RESULT_OF_ASSIGNMENT_FROM_AN_OPTIONS_EXERCISE('C', "RESULT_OF_ASSIGNMENT_FROM_AN_OPTIONS_EXERCISE"),

    /**
     * RESULT_OF_AUTOMATIC_OPTIONS_EXERCISE
     */
    RESULT_OF_AUTOMATIC_OPTIONS_EXERCISE('D', "RESULT_OF_AUTOMATIC_OPTIONS_EXERCISE"),

    /**
     * RESULT_OF_MIDPOINT_ORDER
     */
    RESULT_OF_MIDPOINT_ORDER('E', "RESULT_OF_MIDPOINT_ORDER"),

    /**
     * RESULT_OF_BLOCK_BOOK_TRADE
     */
    RESULT_OF_BLOCK_BOOK_TRADE('F', "RESULT_OF_BLOCK_BOOK_TRADE"),

    /**
     * RESULT_OF_TRADE_AT_CLOSE
     */
    RESULT_OF_TRADE_AT_CLOSE('G', "RESULT_OF_TRADE_AT_CLOSE"),

    /**
     * RESULT_OF_TRADE_AT_AVERAGE
     */
    RESULT_OF_TRADE_AT_AVERAGE('H', "RESULT_OF_TRADE_AT_AVERAGE"),

    /**
     * orderCategory
     */
    NO_VALUE('0', "orderCategory");

    private final char wire;

    private final String description;

    OrderCategory(char wire, String description) {
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
    public static Optional<OrderCategory> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(RESULT_OF_OPTIONS_EXERCISE);
            case 'C' -> Optional.of(RESULT_OF_ASSIGNMENT_FROM_AN_OPTIONS_EXERCISE);
            case 'D' -> Optional.of(RESULT_OF_AUTOMATIC_OPTIONS_EXERCISE);
            case 'E' -> Optional.of(RESULT_OF_MIDPOINT_ORDER);
            case 'F' -> Optional.of(RESULT_OF_BLOCK_BOOK_TRADE);
            case 'G' -> Optional.of(RESULT_OF_TRADE_AT_CLOSE);
            case 'H' -> Optional.of(RESULT_OF_TRADE_AT_AVERAGE);
            case '0' -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
