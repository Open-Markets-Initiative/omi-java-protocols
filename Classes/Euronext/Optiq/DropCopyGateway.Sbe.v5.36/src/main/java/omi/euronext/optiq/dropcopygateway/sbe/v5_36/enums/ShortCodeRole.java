package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * shortCodeRole
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ShortCodeRole {

    /**
     * Executing_Firm
     */
    EXECUTING_FIRM((short) 1, "Executing_Firm"),

    /**
     * Client_ID
     */
    CLIENT_ID((short) 3, "Client_ID"),

    /**
     * Executing_Trader
     */
    EXECUTING_TRADER((short) 12, "Executing_Trader"),

    /**
     * Contra_Firm
     */
    CONTRA_FIRM((short) 17, "Contra_Firm"),

    /**
     * Correspondent_Broker
     */
    CORRESPONDENT_BROKER((short) 26, "Correspondent_Broker"),

    /**
     * Investment_Decision_Maker
     */
    INVESTMENT_DECISION_MAKER((short) 122, "Investment_Decision_Maker"),

    /**
     * shortCodeRole
     */
    NO_VALUE((short) 255, "shortCodeRole");

    private final short wire;

    private final String description;

    ShortCodeRole(short wire, String description) {
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
    public static Optional<ShortCodeRole> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(EXECUTING_FIRM);
            case 3 -> Optional.of(CLIENT_ID);
            case 12 -> Optional.of(EXECUTING_TRADER);
            case 17 -> Optional.of(CONTRA_FIRM);
            case 26 -> Optional.of(CORRESPONDENT_BROKER);
            case 122 -> Optional.of(INVESTMENT_DECISION_MAKER);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
