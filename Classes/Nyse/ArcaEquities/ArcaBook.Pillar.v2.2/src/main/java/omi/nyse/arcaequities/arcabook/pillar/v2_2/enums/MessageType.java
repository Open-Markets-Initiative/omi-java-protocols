package omi.nyse.arcaequities.arcabook.pillar.v2_2.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * ArcaBook Add Order Message
     */
    ADD_ORDER_MESSAGE(100, "ArcaBook Add Order Message"),

    /**
     * ArcaBook Modify Order Message
     */
    MODIFY_ORDER_MESSAGE(101, "ArcaBook Modify Order Message"),

    /**
     * ArcaBook Delete Order Message
     */
    DELETE_ORDER_MESSAGE(102, "ArcaBook Delete Order Message"),

    /**
     * ArcaBook Execution Message
     */
    EXECUTION_MESSAGE(103, "ArcaBook Execution Message"),

    /**
     * ArcaBook Imbalance Message
     */
    IMBALANCE_MESSAGE(105, "ArcaBook Imbalance Message"),

    /**
     * ArcaBook Add Order Refresh Message
     */
    ADD_ORDER_REFRESH_MESSAGE(106, "ArcaBook Add Order Refresh Message"),

    /**
     * ArcaBook Attributed Add Order Message
     */
    ATTRIBUTED_ADD_ORDER_MESSAGE(107, "ArcaBook Attributed Add Order Message"),

    /**
     * ArcaBook Attributed Add Order Refresh Message
     */
    ATTRIBUTED_ADD_ORDER_REFRESH_MESSAGE(108, "ArcaBook Attributed Add Order Refresh Message");

    private final int wire;

    private final String description;

    MessageType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<MessageType> fromWire(int wire) {
        return switch (wire) {
            case 100 -> Optional.of(ADD_ORDER_MESSAGE);
            case 101 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 102 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 103 -> Optional.of(EXECUTION_MESSAGE);
            case 105 -> Optional.of(IMBALANCE_MESSAGE);
            case 106 -> Optional.of(ADD_ORDER_REFRESH_MESSAGE);
            case 107 -> Optional.of(ATTRIBUTED_ADD_ORDER_MESSAGE);
            case 108 -> Optional.of(ATTRIBUTED_ADD_ORDER_REFRESH_MESSAGE);
            default -> Optional.empty();
        };
    }
}
