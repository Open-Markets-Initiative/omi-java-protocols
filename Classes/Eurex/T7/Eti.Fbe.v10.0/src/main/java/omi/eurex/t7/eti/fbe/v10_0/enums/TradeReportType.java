package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the TradeReportType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeReportType {

    /**
     * Submit
     */
    SUBMIT((short) 0, "Submit"),

    /**
     * Alleged
     */
    ALLEGED((short) 1, "Alleged"),

    /**
     * Accept
     */
    ACCEPT((short) 2, "Accept"),

    /**
     * Decline
     */
    DECLINE((short) 3, "Decline"),

    /**
     * No/Was (Replaced)
     */
    NO_WAS_REPLACED((short) 5, "No/Was (Replaced)"),

    /**
     * Trade Report Cancel
     */
    TRADE_REPORT_CANCEL((short) 6, "Trade Report Cancel"),

    /**
     * (Locked-In) Trade Break
     */
    TRADE_BREAK((short) 7, "(Locked-In) Trade Break"),

    /**
     * Alleged New
     */
    ALLEGED_NEW((short) 11, "Alleged New"),

    /**
     * Alleged No/Was
     */
    ALLEGED_NO_WAS((short) 13, "Alleged No/Was"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

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
            case 0 -> Optional.of(SUBMIT);
            case 1 -> Optional.of(ALLEGED);
            case 2 -> Optional.of(ACCEPT);
            case 3 -> Optional.of(DECLINE);
            case 5 -> Optional.of(NO_WAS_REPLACED);
            case 6 -> Optional.of(TRADE_REPORT_CANCEL);
            case 7 -> Optional.of(TRADE_BREAK);
            case 11 -> Optional.of(ALLEGED_NEW);
            case 13 -> Optional.of(ALLEGED_NO_WAS);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
