package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * ‘B’ – Block only The system will reject all new
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Action {

    /**
     * The system will reject all new orders
     */
    BLOCK_ONLY('B', "The system will reject all new orders"),

    /**
     * The system will mass-cancel all open orders, new orders can be accepted
     */
    MASS_CANCEL_ONLY('M', "The system will mass-cancel all open orders, new orders can be accepted"),

    /**
     * Block And Mass Cancel
     */
    BLOCK_AND_MASS_CANCEL('X', "Block And Mass Cancel"),

    /**
     * Remove Blocking For The Specified Scope
     */
    REMOVE_BLOCKING_FOR_THE_SPECIFIED_SCOPE('R', "Remove Blocking For The Specified Scope");

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
            case 'B' -> Optional.of(BLOCK_ONLY);
            case 'M' -> Optional.of(MASS_CANCEL_ONLY);
            case 'X' -> Optional.of(BLOCK_AND_MASS_CANCEL);
            case 'R' -> Optional.of(REMOVE_BLOCKING_FOR_THE_SPECIFIED_SCOPE);
            default -> Optional.empty();
        };
    }
}
