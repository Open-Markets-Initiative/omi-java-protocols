package omi.cme.globex.mdp3.sbe.v1_12.enums;

import java.util.Optional;

/**
 * Subscription Request Type indicates to the type of response expected
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SubscriptionReqType {

    /**
     * Snapshot
     */
    SNAPSHOT((short) 0, "Snapshot"),

    /**
     * Snapshot and updates
     */
    SNAPSHOT_AND_UPDATES((short) 1, "Snapshot and updates"),

    /**
     * Disable previous subscription
     */
    UNSUBSCRIBE((short) 2, "Disable previous subscription");

    private final short wire;

    private final String description;

    SubscriptionReqType(short wire, String description) {
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
    public static Optional<SubscriptionReqType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SNAPSHOT);
            case 1 -> Optional.of(SNAPSHOT_AND_UPDATES);
            case 2 -> Optional.of(UNSUBSCRIBE);
            default -> Optional.empty();
        };
    }
}
