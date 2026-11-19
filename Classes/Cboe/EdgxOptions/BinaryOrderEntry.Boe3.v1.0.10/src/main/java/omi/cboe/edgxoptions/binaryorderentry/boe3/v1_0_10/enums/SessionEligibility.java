package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.enums;

import java.util.Optional;

/**
 * Session Eligibility
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SessionEligibility {

    /**
     * Order Participates In Regular Trading Hours
     */
    ORDER_PARTICIPATES_IN_REGULAR_TRADING_HOURS('R', "Order Participates In Regular Trading Hours"),

    /**
     * Order Participates In Both Global And Regular Trading Hours Also
     */
    ORDER_PARTICIPATES_IN_BOTH_GLOBAL_AND_REGULAR_TRADING_HOURS_ALSO('A', "Order Participates In Both Global And Regular Trading Hours Also"),

    /**
     * Order Participates In Both Rth And Curb Session
     */
    ORDER_PARTICIPATES_IN_BOTH_RTH_AND_CURB_SESSION('B', "Order Participates In Both Rth And Curb Session");

    private final char wire;

    private final String description;

    SessionEligibility(char wire, String description) {
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
    public static Optional<SessionEligibility> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(ORDER_PARTICIPATES_IN_REGULAR_TRADING_HOURS);
            case 'A' -> Optional.of(ORDER_PARTICIPATES_IN_BOTH_GLOBAL_AND_REGULAR_TRADING_HOURS_ALSO);
            case 'B' -> Optional.of(ORDER_PARTICIPATES_IN_BOTH_RTH_AND_CURB_SESSION);
            default -> Optional.empty();
        };
    }
}
