package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_33.enums;

import java.util.Optional;

/**
 * Defines the DisplayIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayIndicator {

    /**
     * Displayed Order
     */
    DISPLAYED_ORDER('X', "Displayed Order"),

    /**
     * Invisible Invisible orders must meet the MiFID ESMA requirements for Large in Scale (LIS) unless routed to the Bats Dark Book.
     */
    INVISIBLE('I', "Invisible Invisible orders must meet the MiFID ESMA requirements for Large in Scale (LIS) unless routed to the Bats Dark Book.");

    private final char wire;

    private final String description;

    DisplayIndicator(char wire, String description) {
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
    public static Optional<DisplayIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'X' -> Optional.of(DISPLAYED_ORDER);
            case 'I' -> Optional.of(INVISIBLE);
            default -> Optional.empty();
        };
    }
}
