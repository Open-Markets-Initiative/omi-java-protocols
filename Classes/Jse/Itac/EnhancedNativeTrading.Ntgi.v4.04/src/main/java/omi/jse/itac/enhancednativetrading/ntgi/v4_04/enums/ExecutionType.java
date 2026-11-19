package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Execution Type of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecutionType {

    /**
     * New
     */
    NEW('0', "New"),

    /**
     * Cancelled
     */
    CANCELLED('4', "Cancelled"),

    /**
     * Amended Modified
     */
    AMENDED_MODIFIED('5', "Amended Modified"),

    /**
     * Rejected
     */
    REJECTED('8', "Rejected"),

    /**
     * Suspended
     */
    SUSPENDED('9', "Suspended"),

    /**
     * Expired
     */
    EXPIRED('C', "Expired"),

    /**
     * Trade
     */
    TRADE('F', "Trade"),

    /**
     * Trade Correct
     */
    TRADE_CORRECT('G', "Trade Correct"),

    /**
     * Trade Cancel
     */
    TRADE_CANCEL('H', "Trade Cancel"),

    /**
     * Restated
     */
    RESTATED('D', "Restated"),

    /**
     * Triggered
     */
    TRIGGERED('L', "Triggered");

    private final char wire;

    private final String description;

    ExecutionType(char wire, String description) {
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
    public static Optional<ExecutionType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NEW);
            case '4' -> Optional.of(CANCELLED);
            case '5' -> Optional.of(AMENDED_MODIFIED);
            case '8' -> Optional.of(REJECTED);
            case '9' -> Optional.of(SUSPENDED);
            case 'C' -> Optional.of(EXPIRED);
            case 'F' -> Optional.of(TRADE);
            case 'G' -> Optional.of(TRADE_CORRECT);
            case 'H' -> Optional.of(TRADE_CANCEL);
            case 'D' -> Optional.of(RESTATED);
            case 'L' -> Optional.of(TRIGGERED);
            default -> Optional.empty();
        };
    }
}
