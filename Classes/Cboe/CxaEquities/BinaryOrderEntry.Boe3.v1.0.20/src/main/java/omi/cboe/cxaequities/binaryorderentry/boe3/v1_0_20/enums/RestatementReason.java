package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * The reason for this Order Restated message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RestatementReason {

    /**
     * Iceberg Order Reload
     */
    ICEBERG_ORDER_RELOAD('r', "Iceberg Order Reload"),

    /**
     * Would Have Self Traded
     */
    WOULD_HAVE_SELF_TRADED('W', "Would Have Self Traded"),

    /**
     * Replaced By Another Port Ie Purge Amend Port
     */
    REPLACED_BY_ANOTHER_PORT_IE_PURGE_AMEND_PORT('R', "Replaced By Another Port Ie Purge Amend Port");

    private final char wire;

    private final String description;

    RestatementReason(char wire, String description) {
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
    public static Optional<RestatementReason> fromWire(char wire) {
        return switch (wire) {
            case 'r' -> Optional.of(ICEBERG_ORDER_RELOAD);
            case 'W' -> Optional.of(WOULD_HAVE_SELF_TRADED);
            case 'R' -> Optional.of(REPLACED_BY_ANOTHER_PORT_IE_PURGE_AMEND_PORT);
            default -> Optional.empty();
        };
    }
}
