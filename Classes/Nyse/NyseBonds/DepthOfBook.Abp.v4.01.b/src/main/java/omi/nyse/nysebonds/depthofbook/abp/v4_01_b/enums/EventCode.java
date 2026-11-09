package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * What type of event has occurred.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Clear Book
     */
    CLEAR_BOOK('C', "Clear Book"),

    /**
     * Clear Book By Symbol
     */
    CLEAR_BOOK_BY_SYMBOL('S', "Clear Book By Symbol"),

    /**
     * Halt Symbol
     */
    HALT_SYMBOL('H', "Halt Symbol"),

    /**
     * Un Halt Symbol
     */
    UN_HALT_SYMBOL('U', "Un Halt Symbol");

    private final char wire;

    private final String description;

    EventCode(char wire, String description) {
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
    public static Optional<EventCode> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLEAR_BOOK);
            case 'S' -> Optional.of(CLEAR_BOOK_BY_SYMBOL);
            case 'H' -> Optional.of(HALT_SYMBOL);
            case 'U' -> Optional.of(UN_HALT_SYMBOL);
            default -> Optional.empty();
        };
    }
}
