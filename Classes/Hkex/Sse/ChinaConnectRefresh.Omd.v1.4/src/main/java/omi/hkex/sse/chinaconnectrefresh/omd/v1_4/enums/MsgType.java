package omi.hkex.sse.chinaconnectrefresh.omd.v1_4.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * The Market Definition message is generated at the start of the business day for each market (SSE or SZSE). Market Definition messages for different markets are sent via different channels.
     */
    MARKET_DEFINITION_MESSAGE(610, "The Market Definition message is generated at the start of the business day for each market (SSE or SZSE). Market Definition messages for different markets are sent via different channels."),

    /**
     * This message is published to mark the end of a refresh.
     */
    REFRESH_COMPLETE_MESSAGE(203, "This message is published to mark the end of a refresh."),

    /**
     * The Security Definition message contains all the reference data for a security. Security Definition messages for different markets (SSE and SZSE) are sent via different channels.
     */
    SECURITY_DEFINITION_MESSAGE(611, "The Security Definition message contains all the reference data for a security. Security Definition messages for different markets (SSE and SZSE) are sent via different channels."),

    /**
     * The Security Status message is generated at the start of the business day if the security is halted, and whenever a security state or trading phase changes. Security Status messages for different markets (SSE and SZSE) are sent via different channels.
     */
    SECURITY_STATUS_MESSAGE(621, "The Security Status message is generated at the start of the business day if the security is halted, and whenever a security state or trading phase changes. Security Status messages for different markets (SSE and SZSE) are sent via different channels."),

    /**
     * The Statistics message provides statistics including turnover. Statistics messages for different markets (SSE and SZSE) are sent via different channels.
     */
    STATISTICS_MESSAGE(660, "The Statistics message provides statistics including turnover. Statistics messages for different markets (SSE and SZSE) are sent via different channels."),

    /**
     * The Top Of Book (TOB) message is generated when the top price level has been modified. TOB messages for different markets (SSE and SZSE) are sent via different channels.
     */
    TOP_OF_BOOK_MESSAGE(655, "The Top Of Book (TOB) message is generated when the top price level has been modified. TOB messages for different markets (SSE and SZSE) are sent via different channels.");

    private final int wire;

    private final String description;

    MsgType(int wire, String description) {
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
    public static Optional<MsgType> fromWire(int wire) {
        return switch (wire) {
            case 610 -> Optional.of(MARKET_DEFINITION_MESSAGE);
            case 203 -> Optional.of(REFRESH_COMPLETE_MESSAGE);
            case 611 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 621 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 660 -> Optional.of(STATISTICS_MESSAGE);
            case 655 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
