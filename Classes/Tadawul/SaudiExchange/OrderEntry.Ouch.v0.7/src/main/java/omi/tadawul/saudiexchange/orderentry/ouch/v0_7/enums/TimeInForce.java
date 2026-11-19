package omi.tadawul.saudiexchange.orderentry.ouch.v0_7.enums;

import java.util.Optional;

/**
 * 0 = immediate, 99997 = at the opening (session order), 99998 = market hours (i.e. day). Any other values are not supported and the order will be rejected
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum TimeInForce {

    /**
     * Immediate
     */
    IMMEDIATE(0x0L, "Immediate"),

    /**
     * At The Opening Session Order
     */
    AT_THE_OPENING_SESSION_ORDER(0x1869DL, "At The Opening Session Order"),

    /**
     * Market Hours Ie Day
     */
    MARKET_HOURS_IE_DAY(0x1869EL, "Market Hours Ie Day");

    private final long wire;

    private final String description;

    TimeInForce(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<TimeInForce> fromWire(long wire) {
        if (wire == 0L) {
            return Optional.of(IMMEDIATE);
        }
        if (wire == 99997L) {
            return Optional.of(AT_THE_OPENING_SESSION_ORDER);
        }
        if (wire == 99998L) {
            return Optional.of(MARKET_HOURS_IE_DAY);
        }
        return Optional.empty();
    }
}
