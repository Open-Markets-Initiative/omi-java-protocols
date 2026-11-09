package omi.cboe.c1options.marketlevel2.csm.v1_0_4.enums;

import java.util.Optional;

/**
 * The Template ID is for decoding the message.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * Security definitions describe an exchange’s products by name and trading parameters and associates those products with a product security ID.
     */
    SECURITY_DEFINITION_MESSAGE((short) 13, "Security definitions describe an exchange\u2019s products by name and trading parameters and associates those products with a product security ID."),

    /**
     * Snapshot messages contain the current SecurityTradingStatus for a product and the complete state of the top N levels of the book
     */
    SNAPSHOT_FULL_REFRESH_MESSAGE((short) 17, "Snapshot messages contain the current SecurityTradingStatus for a product and the complete state of the top N levels of the book"),

    /**
     * IncRefresh messages contain the current SecurityTradingStatus for a product and one or more instructions that indicate how the book structure has incrementally changed since the last book update.
     */
    INCREMENTAL_REFRESH_MESSAGE((short) 18, "IncRefresh messages contain the current SecurityTradingStatus for a product and one or more instructions that indicate how the book structure has incrementally changed since the last book update."),

    /**
     * Security Status messages contain the SecurityTradingStatus for a product
     */
    SECURITY_STATUS_MESSAGE((short) 19, "Security Status messages contain the SecurityTradingStatus for a product"),

    /**
     * This message contains only a standard header. The heartbeat will repeat at a regular interval
     */
    HEARTBEAT_MESSAGE((short) 16, "This message contains only a standard header. The heartbeat will repeat at a regular interval");

    private final short wire;

    private final String description;

    TemplateId(short wire, String description) {
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
    public static Optional<TemplateId> fromWire(short wire) {
        return switch (wire) {
            case 13 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 17 -> Optional.of(SNAPSHOT_FULL_REFRESH_MESSAGE);
            case 18 -> Optional.of(INCREMENTAL_REFRESH_MESSAGE);
            case 19 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 16 -> Optional.of(HEARTBEAT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
