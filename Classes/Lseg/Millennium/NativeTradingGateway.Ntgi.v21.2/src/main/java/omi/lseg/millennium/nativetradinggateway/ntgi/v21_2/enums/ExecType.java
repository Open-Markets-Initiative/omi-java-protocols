package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * The reason the Execution Report is being sent.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecType {

    /**
     * New
     */
    NEW('0', "New"),

    /**
     * Cancelled
     */
    CANCELLED('4', "Cancelled"),

    /**
     * Replaced
     */
    REPLACED('5', "Replaced"),

    /**
     * Rejected
     */
    REJECTED('8', "Rejected"),

    /**
     * Expired
     */
    EXPIRED('C', "Expired"),

    /**
     * Restated
     */
    RESTATED('D', "Restated"),

    /**
     * Trade
     */
    TRADE('F', "Trade"),

    /**
     * Trade Cancel
     */
    TRADE_CANCEL('H', "Trade Cancel"),

    /**
     * Suspended
     */
    SUSPENDED('9', "Suspended");

    private final char wire;

    private final String description;

    ExecType(char wire, String description) {
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
    public static Optional<ExecType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NEW);
            case '4' -> Optional.of(CANCELLED);
            case '5' -> Optional.of(REPLACED);
            case '8' -> Optional.of(REJECTED);
            case 'C' -> Optional.of(EXPIRED);
            case 'D' -> Optional.of(RESTATED);
            case 'F' -> Optional.of(TRADE);
            case 'H' -> Optional.of(TRADE_CANCEL);
            case '9' -> Optional.of(SUSPENDED);
            default -> Optional.empty();
        };
    }
}
