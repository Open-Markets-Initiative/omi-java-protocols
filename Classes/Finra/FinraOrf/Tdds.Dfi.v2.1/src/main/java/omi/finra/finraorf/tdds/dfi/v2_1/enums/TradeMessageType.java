package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * Trade message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeMessageType {

    /**
     * Economized trade report
     */
    TRADE_REPORT_SHORT_FORM_MESSAGE('5', "Economized trade report"),

    /**
     * Complete trade report
     */
    TRADE_REPORT_LONG_FORM_MESSAGE('6', "Complete trade report"),

    /**
     * This message is used to notify TDDS customers if a trade report entered during the current business day, or up to the past three business days, has been canceled
     */
    TRADE_CANCEL_ERROR_MESSAGE('7', "This message is used to notify TDDS customers if a trade report entered during the current business day, or up to the past three business days, has been canceled"),

    /**
     * Used to notify TDDS customers if a trade report entered during the current business day, or up to the past three business days, has been modified
     */
    TRADE_CORRECTION_MESSAGE('8', "Used to notify TDDS customers if a trade report entered during the current business day, or up to the past three business days, has been modified");

    private final char wire;

    private final String description;

    TradeMessageType(char wire, String description) {
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
    public static Optional<TradeMessageType> fromWire(char wire) {
        return switch (wire) {
            case '5' -> Optional.of(TRADE_REPORT_SHORT_FORM_MESSAGE);
            case '6' -> Optional.of(TRADE_REPORT_LONG_FORM_MESSAGE);
            case '7' -> Optional.of(TRADE_CANCEL_ERROR_MESSAGE);
            case '8' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
