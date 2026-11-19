package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Handling instruction for the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HandlingInst {

    /**
     * Direct Action Order Dao
     */
    DIRECT_ACTION_ORDER_DAO('1', "Direct Action Order Dao"),

    /**
     * Protect And Cancel
     */
    PROTECT_AND_CANCEL('5', "Protect And Cancel"),

    /**
     * Protect And Reprice
     */
    PROTECT_AND_REPRICE('6', "Protect And Reprice");

    private final char wire;

    private final String description;

    HandlingInst(char wire, String description) {
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
    public static Optional<HandlingInst> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(DIRECT_ACTION_ORDER_DAO);
            case '5' -> Optional.of(PROTECT_AND_CANCEL);
            case '6' -> Optional.of(PROTECT_AND_REPRICE);
            default -> Optional.empty();
        };
    }
}
