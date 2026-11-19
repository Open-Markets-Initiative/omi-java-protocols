package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_33.enums;

import java.util.Optional;

/**
 * Defines the TradeReportType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeReportType {

    /**
     * (Submit) for all new trade reports
     */
    SUBMIT_FOR_ALL_NEW_TRADE_REPORTS((short) 0, "(Submit) for all new trade reports"),

    /**
     * (Trade Report Cancel) to cancel any acknowledged, but not confirmed trade reports entered where TradeHan- dlingInstruction = 2
     */
    TRADE_REPORT_CANCEL_TO_CANCEL_ANY_ACKNOWLEDGED_BUT((short) 6, "(Trade Report Cancel) to cancel any acknowledged, but not confirmed trade reports entered where TradeHan- dlingInstruction = 2");

    private final short wire;

    private final String description;

    TradeReportType(short wire, String description) {
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
    public static Optional<TradeReportType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SUBMIT_FOR_ALL_NEW_TRADE_REPORTS);
            case 6 -> Optional.of(TRADE_REPORT_CANCEL_TO_CANCEL_ANY_ACKNOWLEDGED_BUT);
            default -> Optional.empty();
        };
    }
}
