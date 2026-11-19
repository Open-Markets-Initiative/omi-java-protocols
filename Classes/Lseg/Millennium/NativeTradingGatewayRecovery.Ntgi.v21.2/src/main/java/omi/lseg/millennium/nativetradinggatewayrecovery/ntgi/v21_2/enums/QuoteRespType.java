package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Defines the QuoteRespType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteRespType {

    /**
     * Hit Lift
     */
    HIT_LIFT((short) 1, "Hit Lift"),

    /**
     * Expired
     */
    EXPIRED((short) 3, "Expired"),

    /**
     * End Trade
     */
    END_TRADE((short) 7, "End Trade"),

    /**
     * Timed Out
     */
    TIMED_OUT((short) 8, "Timed Out"),

    /**
     * Cancelled
     */
    CANCELLED((short) 11, "Cancelled"),

    /**
     * Replace
     */
    REPLACE((short) 100, "Replace"),

    /**
     * Executable
     */
    EXECUTABLE((short) 101, "Executable"),

    /**
     * Make Rfq Quotes Public
     */
    MAKE_RFQ_QUOTES_PUBLIC((short) 102, "Make Rfq Quotes Public");

    private final short wire;

    private final String description;

    QuoteRespType(short wire, String description) {
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
    public static Optional<QuoteRespType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(HIT_LIFT);
            case 3 -> Optional.of(EXPIRED);
            case 7 -> Optional.of(END_TRADE);
            case 8 -> Optional.of(TIMED_OUT);
            case 11 -> Optional.of(CANCELLED);
            case 100 -> Optional.of(REPLACE);
            case 101 -> Optional.of(EXECUTABLE);
            case 102 -> Optional.of(MAKE_RFQ_QUOTES_PUBLIC);
            default -> Optional.empty();
        };
    }
}
