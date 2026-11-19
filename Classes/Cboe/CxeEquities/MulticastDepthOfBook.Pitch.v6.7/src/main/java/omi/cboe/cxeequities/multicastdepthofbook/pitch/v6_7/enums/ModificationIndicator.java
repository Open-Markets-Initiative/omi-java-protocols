package omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_7.enums;

import java.util.Optional;

/**
 * MMT Level 3.4
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ModificationIndicator {

    /**
     * Indicates A Modification Of A Previously Reported Trade
     */
    INDICATES_A_MODIFICATION_OF_A_PREVIOUSLY_REPORTED_TRADE('A', "Indicates A Modification Of A Previously Reported Trade"),

    /**
     * Indicates A Cancellation Of A Previously Reported Trade
     */
    INDICATES_A_CANCELLATION_OF_A_PREVIOUSLY_REPORTED_TRADE('C', "Indicates A Cancellation Of A Previously Reported Trade"),

    /**
     * Not Specified
     */
    NOT_SPECIFIED('-', "Not Specified");

    private final char wire;

    private final String description;

    ModificationIndicator(char wire, String description) {
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
    public static Optional<ModificationIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(INDICATES_A_MODIFICATION_OF_A_PREVIOUSLY_REPORTED_TRADE);
            case 'C' -> Optional.of(INDICATES_A_CANCELLATION_OF_A_PREVIOUSLY_REPORTED_TRADE);
            case '-' -> Optional.of(NOT_SPECIFIED);
            default -> Optional.empty();
        };
    }
}
