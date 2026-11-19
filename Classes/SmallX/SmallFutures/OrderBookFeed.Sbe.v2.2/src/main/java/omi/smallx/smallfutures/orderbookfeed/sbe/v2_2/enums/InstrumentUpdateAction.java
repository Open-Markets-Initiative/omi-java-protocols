package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Type of instrument update action
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentUpdateAction {

    /**
     * Instrument is added
     */
    ADD('A', "Instrument is added"),

    /**
     * Instrument is deleted
     */
    DELETE('D', "Instrument is deleted"),

    /**
     * Instrument is modified
     */
    MODIFY('M', "Instrument is modified");

    private final char wire;

    private final String description;

    InstrumentUpdateAction(char wire, String description) {
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
    public static Optional<InstrumentUpdateAction> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADD);
            case 'D' -> Optional.of(DELETE);
            case 'M' -> Optional.of(MODIFY);
            default -> Optional.empty();
        };
    }
}
