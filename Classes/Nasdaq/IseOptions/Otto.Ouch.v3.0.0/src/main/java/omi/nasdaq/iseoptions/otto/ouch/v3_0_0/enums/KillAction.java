package omi.nasdaq.iseoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * A=Block Entry of new requests and delete all open orders
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum KillAction {

    /**
     * Block Entry of new requests and delete all open orders
     */
    BLOCK_AND_DELETE('A', "Block Entry of new requests and delete all open orders"),

    /**
     * Kill-switch block removed (by Exchange support personnel)
     */
    BLOCK_REMOVED('R', "Kill-switch block removed (by Exchange support personnel)"),

    /**
     * Block entry of new requests
     */
    BLOCK('B', "Block entry of new requests");

    private final char wire;

    private final String description;

    KillAction(char wire, String description) {
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
    public static Optional<KillAction> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(BLOCK_AND_DELETE);
            case 'R' -> Optional.of(BLOCK_REMOVED);
            case 'B' -> Optional.of(BLOCK);
            default -> Optional.empty();
        };
    }
}
