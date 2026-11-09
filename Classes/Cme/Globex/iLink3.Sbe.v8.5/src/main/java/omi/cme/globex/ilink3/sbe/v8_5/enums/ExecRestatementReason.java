package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Used to communicate unsolicited cancels
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExecRestatementReason {

    /**
     * Used to communicate unsolicited cancels
     */
    NO_VALUE((short) 255, "Used to communicate unsolicited cancels"),

    /**
     * Market Exchange Option
     */
    MARKET_EXCHANGE_OPTION((short) 8, "Market Exchange Option"),

    /**
     * Cancelled Not Best
     */
    CANCELLED_NOT_BEST((short) 9, "Cancelled Not Best"),

    /**
     * Cancel On Disconnect
     */
    CANCEL_ON_DISCONNECT((short) 100, "Cancel On Disconnect"),

    /**
     * Self Match Prevention Oldest Order Cancelled
     */
    SELF_MATCH_PREVENTION_OLDEST_ORDER_CANCELLED((short) 103, "Self Match Prevention Oldest Order Cancelled"),

    /**
     * Cancel On Globex Credit Controls Violation
     */
    CANCEL_ON_GLOBEX_CREDIT_CONTROLS_VIOLATION((short) 104, "Cancel On Globex Credit Controls Violation"),

    /**
     * Cancel From Firmsoft
     */
    CANCEL_FROM_FIRMSOFT((short) 105, "Cancel From Firmsoft"),

    /**
     * Cancel From Risk Management API
     */
    CANCEL_FROM_RISK_MANAGEMENT_API((short) 106, "Cancel From Risk Management API"),

    /**
     * Self Match Prevention Newest Order Cancelled
     */
    SELF_MATCH_PREVENTION_NEWEST_ORDER_CANCELLED((short) 107, "Self Match Prevention Newest Order Cancelled"),

    /**
     * Cancel due to vol quoted option order rested qty less than min order size
     */
    CANCELDUETOVOLQUOTEDOPTIONORDERRESTEDQTYLESSTHANMINORDERSIZE((short) 108, "Cancel due to vol quoted option order rested qty less than min order size");

    private final short wire;

    private final String description;

    ExecRestatementReason(short wire, String description) {
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
    public static Optional<ExecRestatementReason> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 8 -> Optional.of(MARKET_EXCHANGE_OPTION);
            case 9 -> Optional.of(CANCELLED_NOT_BEST);
            case 100 -> Optional.of(CANCEL_ON_DISCONNECT);
            case 103 -> Optional.of(SELF_MATCH_PREVENTION_OLDEST_ORDER_CANCELLED);
            case 104 -> Optional.of(CANCEL_ON_GLOBEX_CREDIT_CONTROLS_VIOLATION);
            case 105 -> Optional.of(CANCEL_FROM_FIRMSOFT);
            case 106 -> Optional.of(CANCEL_FROM_RISK_MANAGEMENT_API);
            case 107 -> Optional.of(SELF_MATCH_PREVENTION_NEWEST_ORDER_CANCELLED);
            case 108 -> Optional.of(CANCELDUETOVOLQUOTEDOPTIONORDERRESTEDQTYLESSTHANMINORDERSIZE);
            default -> Optional.empty();
        };
    }
}
