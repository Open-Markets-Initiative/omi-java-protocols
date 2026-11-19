package omi.euronext.optiq.dropcopygateway.sbe.v5_56.enums;

import java.util.Optional;

/**
 * tradingCapacity
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingCapacity {

    /**
     * Dealing_on_own_account
     */
    DEALINGONOWNACCOUNT((short) 1, "Dealing_on_own_account"),

    /**
     * Matched_principal
     */
    MATCHEDPRINCIPAL((short) 2, "Matched_principal"),

    /**
     * Any_other_capacity
     */
    ANYOTHERCAPACITY((short) 3, "Any_other_capacity");

    private final short wire;

    private final String description;

    TradingCapacity(short wire, String description) {
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
    public static Optional<TradingCapacity> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(DEALINGONOWNACCOUNT);
            case 2 -> Optional.of(MATCHEDPRINCIPAL);
            case 3 -> Optional.of(ANYOTHERCAPACITY);
            default -> Optional.empty();
        };
    }
}
