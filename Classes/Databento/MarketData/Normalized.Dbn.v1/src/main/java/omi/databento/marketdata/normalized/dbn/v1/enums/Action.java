package omi.databento.marketdata.normalized.dbn.v1.enums;

import java.util.Optional;

/**
 * The event action
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Action {

    /**
     * A new order was added to the book
     */
    ADD('A', "A new order was added to the book"),

    /**
     * An order was fully or partially cancelled
     */
    CANCEL('C', "An order was fully or partially cancelled"),

    /**
     * An existing order was filled; does not affect the book
     */
    FILL('F', "An existing order was filled; does not affect the book"),

    /**
     * An existing order was modified: price and/or size
     */
    MODIFY('M', "An existing order was modified: price and/or size"),

    /**
     * Has no effect on the book, but may carry flags or other information
     */
    NONE('N', "Has no effect on the book, but may carry flags or other information"),

    /**
     * Reset the book; clear all orders for an instrument
     */
    CLEAR('R', "Reset the book; clear all orders for an instrument"),

    /**
     * An aggressing order traded; does not affect the book
     */
    TRADE('T', "An aggressing order traded; does not affect the book");

    private final char wire;

    private final String description;

    Action(char wire, String description) {
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
    public static Optional<Action> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADD);
            case 'C' -> Optional.of(CANCEL);
            case 'F' -> Optional.of(FILL);
            case 'M' -> Optional.of(MODIFY);
            case 'N' -> Optional.of(NONE);
            case 'R' -> Optional.of(CLEAR);
            case 'T' -> Optional.of(TRADE);
            default -> Optional.empty();
        };
    }
}
