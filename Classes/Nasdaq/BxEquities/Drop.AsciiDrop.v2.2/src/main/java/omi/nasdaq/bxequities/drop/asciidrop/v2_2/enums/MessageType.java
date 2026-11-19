package omi.nasdaq.bxequities.drop.asciidrop.v2_2.enums;

import java.util.Optional;

/**
 * The event the line reports
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * New order accepted.
     */
    NEW_ORDER_ACCEPTED_MESSAGE('A', "New order accepted."),

    /**
     * Existing order executed.
     */
    EXISTING_ORDER_EXECUTED_MESSAGE('E', "Existing order executed."),

    /**
     * Existing order canceled.
     */
    EXISTING_ORDER_CANCELED_MESSAGE('X', "Existing order canceled."),

    /**
     * Previous execution broken.
     */
    PREVIOUS_EXECUTION_BROKEN_MESSAGE('B', "Previous execution broken."),

    /**
     * Existing order replaced.
     */
    EXISTING_ORDER_REPLACED_MESSAGE('U', "Existing order replaced.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NEW_ORDER_ACCEPTED_MESSAGE);
            case 'E' -> Optional.of(EXISTING_ORDER_EXECUTED_MESSAGE);
            case 'X' -> Optional.of(EXISTING_ORDER_CANCELED_MESSAGE);
            case 'B' -> Optional.of(PREVIOUS_EXECUTION_BROKEN_MESSAGE);
            case 'U' -> Optional.of(EXISTING_ORDER_REPLACED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
