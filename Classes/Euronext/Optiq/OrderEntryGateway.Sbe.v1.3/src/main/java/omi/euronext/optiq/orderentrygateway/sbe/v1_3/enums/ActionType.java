package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * actionType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ActionType {

    /**
     * Declaration_Cancellation_Request
     */
    DECLARATION_CANCELLATION_REQUEST((short) 1, "Declaration_Cancellation_Request"),

    /**
     * Declaration_Refusal
     */
    DECLARATION_REFUSAL((short) 2, "Declaration_Refusal"),

    /**
     * Trade_Cancellation_Request
     */
    TRADE_CANCELLATION_REQUEST((short) 3, "Trade_Cancellation_Request");

    private final short wire;

    private final String description;

    ActionType(short wire, String description) {
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
    public static Optional<ActionType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(DECLARATION_CANCELLATION_REQUEST);
            case 2 -> Optional.of(DECLARATION_REFUSAL);
            case 3 -> Optional.of(TRADE_CANCELLATION_REQUEST);
            default -> Optional.empty();
        };
    }
}
