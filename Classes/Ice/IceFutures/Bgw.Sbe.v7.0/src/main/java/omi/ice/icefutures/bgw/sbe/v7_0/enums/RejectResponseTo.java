package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * rejectResponseTo
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RejectResponseTo {

    /**
     * Cancel
     */
    CANCEL((short) 1, "Cancel"),

    /**
     * CancelReplace
     */
    CANCEL_REPLACE((short) 2, "CancelReplace"),

    /**
     * NewOrder
     */
    NEW_ORDER((short) 3, "NewOrder");

    private final short wire;

    private final String description;

    RejectResponseTo(short wire, String description) {
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
    public static Optional<RejectResponseTo> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CANCEL);
            case 2 -> Optional.of(CANCEL_REPLACE);
            case 3 -> Optional.of(NEW_ORDER);
            default -> Optional.empty();
        };
    }
}
