package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the ExecType values.
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
    CANCELED('4', "Cancelled"),

    /**
     * Replaced
     */
    REPLACED('5', "Replaced"),

    /**
     * Pending Cancel (e.g. result of Order Cancel Request)
     */
    PENDING_CANCELE('6', "Pending Cancel (e.g. result of Order Cancel Request)"),

    /**
     * Suspended
     */
    SUSPENDED('9', "Suspended"),

    /**
     * Restated
     */
    RESTATED('D', "Restated"),

    /**
     * Triggered
     */
    TRIGGERED('L', "Triggered"),

    /**
     * Trade
     */
    TRADE('F', "Trade");

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
            case '4' -> Optional.of(CANCELED);
            case '5' -> Optional.of(REPLACED);
            case '6' -> Optional.of(PENDING_CANCELE);
            case '9' -> Optional.of(SUSPENDED);
            case 'D' -> Optional.of(RESTATED);
            case 'L' -> Optional.of(TRIGGERED);
            case 'F' -> Optional.of(TRADE);
            default -> Optional.empty();
        };
    }
}
