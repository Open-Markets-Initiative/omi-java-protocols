package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Identifies the type of PartyDetailID. Required when NoPartyDetails(1671) &gt; 0
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum PartyDetailRole {

    /**
     * Executing Firm
     */
    EXECUTING_FIRM(1, "Executing Firm"),

    /**
     * Customer Account
     */
    CUSTOMER_ACCOUNT(24, "Customer Account"),

    /**
     * Take Up Firm
     */
    TAKE_UP_FIRM(96, "Take Up Firm"),

    /**
     * Operator
     */
    OPERATOR(118, "Operator"),

    /**
     * Take Up Account
     */
    TAKE_UP_ACCOUNT(1000, "Take Up Account");

    private final int wire;

    private final String description;

    PartyDetailRole(int wire, String description) {
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
    public static Optional<PartyDetailRole> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(EXECUTING_FIRM);
            case 24 -> Optional.of(CUSTOMER_ACCOUNT);
            case 96 -> Optional.of(TAKE_UP_FIRM);
            case 118 -> Optional.of(OPERATOR);
            case 1000 -> Optional.of(TAKE_UP_ACCOUNT);
            default -> Optional.empty();
        };
    }
}
