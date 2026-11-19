package omi.jpx.osederivatives.geniuminet.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * Client-generated enter order request.
     */
    ENTER_ORDER('O', "Client-generated enter order request."),

    /**
     * Client-generated enter market maker order request.
     */
    ENTER_MM_ORDER('P', "Client-generated enter market maker order request."),

    /**
     * Client-generated replace order request.
     */
    REPLACE_ORDER('U', "Client-generated replace order request."),

    /**
     * Client-generated cancel order request.
     */
    CANCEL_ORDER('X', "Client-generated cancel order request."),

    /**
     * Client-generated request to cancel an order by system-assigned order ID.
     */
    CANCEL_BY_ORDER_ID('Y', "Client-generated request to cancel an order by system-assigned order ID."),

    /**
     * Client-generated request to cancel multiple orders.
     */
    MASS_CANCEL('M', "Client-generated request to cancel multiple orders.");

    private final char wire;

    private final String description;

    UnsequencedMessageType(char wire, String description) {
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
    public static Optional<UnsequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(ENTER_ORDER);
            case 'P' -> Optional.of(ENTER_MM_ORDER);
            case 'U' -> Optional.of(REPLACE_ORDER);
            case 'X' -> Optional.of(CANCEL_ORDER);
            case 'Y' -> Optional.of(CANCEL_BY_ORDER_ID);
            case 'M' -> Optional.of(MASS_CANCEL);
            default -> Optional.empty();
        };
    }
}
