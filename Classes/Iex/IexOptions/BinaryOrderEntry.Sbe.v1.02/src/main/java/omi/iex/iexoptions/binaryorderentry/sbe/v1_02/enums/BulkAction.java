package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * bulkAction
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BulkAction {

    /**
     * Cancel
     */
    CANCEL((short) 0, "Cancel"),

    /**
     * CancelAndBlock
     */
    CANCEL_AND_BLOCK((short) 1, "CancelAndBlock"),

    /**
     * Unblock
     */
    UNBLOCK((short) 2, "Unblock");

    private final short wire;

    private final String description;

    BulkAction(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<BulkAction> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(CANCEL);
            case 1 -> Optional.of(CANCEL_AND_BLOCK);
            case 2 -> Optional.of(UNBLOCK);
            default -> Optional.empty();
        };
    }
}
