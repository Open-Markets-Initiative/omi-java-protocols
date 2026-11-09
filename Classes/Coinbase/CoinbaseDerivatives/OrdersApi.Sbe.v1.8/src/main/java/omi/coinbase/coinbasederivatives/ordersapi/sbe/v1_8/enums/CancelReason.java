package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.enums;

import java.util.Optional;

/**
 * cancelReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CancelReason {

    /**
     * EXPIRED
     */
    EXPIRED((short) 0, "EXPIRED"),

    /**
     * CANCELED_BY_USER
     */
    CANCELED_BY_USER((short) 1, "CANCELED_BY_USER"),

    /**
     * SELF_MATCH_PREVENTION
     */
    SELF_MATCH_PREVENTION((short) 2, "SELF_MATCH_PREVENTION"),

    /**
     * CLIENT_DISCONNECT
     */
    CLIENT_DISCONNECT((short) 3, "CLIENT_DISCONNECT"),

    /**
     * PRICE_LIMIT
     */
    PRICE_LIMIT((short) 4, "PRICE_LIMIT"),

    /**
     * ADMIN_CANCEL
     */
    ADMIN_CANCEL((short) 5, "ADMIN_CANCEL"),

    /**
     * MASS_CANCEL
     */
    MASS_CANCEL((short) 6, "MASS_CANCEL"),

    /**
     * STREAM_REPLACED
     */
    STREAM_REPLACED((short) 7, "STREAM_REPLACED"),

    /**
     * ACTIVE_LIMIT_EXCEEDED
     */
    ACTIVE_LIMIT_EXCEEDED((short) 8, "ACTIVE_LIMIT_EXCEEDED");

    private final short wire;

    private final String description;

    CancelReason(short wire, String description) {
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
    public static Optional<CancelReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(EXPIRED);
            case 1 -> Optional.of(CANCELED_BY_USER);
            case 2 -> Optional.of(SELF_MATCH_PREVENTION);
            case 3 -> Optional.of(CLIENT_DISCONNECT);
            case 4 -> Optional.of(PRICE_LIMIT);
            case 5 -> Optional.of(ADMIN_CANCEL);
            case 6 -> Optional.of(MASS_CANCEL);
            case 7 -> Optional.of(STREAM_REPLACED);
            case 8 -> Optional.of(ACTIVE_LIMIT_EXCEEDED);
            default -> Optional.empty();
        };
    }
}
