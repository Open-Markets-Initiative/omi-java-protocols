package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.enums;

import java.util.Optional;

/**
 * Block, unblock or cancel open orders of this PRM Account, previous value kept if ?
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BlockAndCancel {

    /**
     * Block
     */
    BLOCK('B', "Block"),

    /**
     * Unblock
     */
    UNBLOCK('U', "Unblock"),

    /**
     * Block And Cancel
     */
    BLOCK_AND_CANCEL('C', "Block And Cancel"),

    /**
     * Previous Value Kept
     */
    PREVIOUS_VALUE_KEPT('?', "Previous Value Kept");

    private final char wire;

    private final String description;

    BlockAndCancel(char wire, String description) {
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
    public static Optional<BlockAndCancel> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BLOCK);
            case 'U' -> Optional.of(UNBLOCK);
            case 'C' -> Optional.of(BLOCK_AND_CANCEL);
            case '?' -> Optional.of(PREVIOUS_VALUE_KEPT);
            default -> Optional.empty();
        };
    }
}
