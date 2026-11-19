package omi.nasdaq.psxequities.totalview.glimpse.v3_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * This message is sent every second for which at least one PSX GLIMPSE 3.2 / PSX TotalView-ITCH 3.2 message is being generated.
     */
    SECONDS_MESSAGE('T', "This message is sent every second for which at least one PSX GLIMPSE 3.2 / PSX TotalView-ITCH 3.2 message is being generated."),

    /**
     * This message is sent every millisecond for which at least one PSX GLIMPSE 3.2 / PSX TotalView-ITCH 3.2 message is being generated.
     */
    MILLISECONDS_MESSAGE('M', "This message is sent every millisecond for which at least one PSX GLIMPSE 3.2 / PSX TotalView-ITCH 3.2 message is being generated."),

    /**
     * PSX GLIMPSE product is designed to support the same system event messages as the PSX TotalView-ITCH feed. On PSX GLIMPSE, PSX will send out system event messages for those events that occurred up to the time of the PSX GLIMPSE snapshot request.
     */
    SYSTEM_EVENT_MESSAGE('S', "PSX GLIMPSE product is designed to support the same system event messages as the PSX TotalView-ITCH feed. On PSX GLIMPSE, PSX will send out system event messages for those events that occurred up to the time of the PSX GLIMPSE snapshot request."),

    /**
     * An Add Order Message indicates that a new order has been accepted by the PSX system and was added to the displayable book. This message will be generated for unattributed orders in the PSX system.
     */
    ADD_ORDER_MESSAGE('A', "An Add Order Message indicates that a new order has been accepted by the PSX system and was added to the displayable book. This message will be generated for unattributed orders in the PSX system."),

    /**
     * This message will be generated for attributed orders and quotations entered into the PSX system. Note: This message will not be supported for NASDAQ OMX PSX for initial market launch.
     */
    ADD_ORDER_MPID_ATTRIBUTION_MESSAGE('F', "This message will be generated for attributed orders and quotations entered into the PSX system. Note: This message will not be supported for NASDAQ OMX PSX for initial market launch."),

    /**
     * At the start of each trading day, NASDAQ OMX PSX disseminates stock directory messages for all active symbols in the system for the current trading day. Please note that the Symbol Directory spin may include halted issues.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, NASDAQ OMX PSX disseminates stock directory messages for all active symbols in the system for the current trading day. Please note that the Symbol Directory spin may include halted issues."),

    /**
     * In the GLIMPSE transmission, PSX will send out a Stock Trading Action message for only those NASDAQ, NYSE, NYSE Amex, NYSE Arca and BATS issues that were eligible for trading during the current trading session.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "In the GLIMPSE transmission, PSX will send out a Stock Trading Action message for only those NASDAQ, NYSE, NYSE Amex, NYSE Arca and BATS issues that were eligible for trading during the current trading session."),

    /**
     * Reg SHO Short Sale Price Test Restricted Indicator
     */
    REG_SHO_RESTRICTION_MESSAGE('Y', "Reg SHO Short Sale Price Test Restricted Indicator"),

    /**
     * The Snapshot message reflects the PSX TotalView-ITCH 3.2 sequence number at the time that the PSX GLIMPSE 3.2 spin was requested.
     */
    END_OF_SNAPSHOT_MESSAGE('G', "The Snapshot message reflects the PSX TotalView-ITCH 3.2 sequence number at the time that the PSX GLIMPSE 3.2 spin was requested.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(SECONDS_MESSAGE);
            case 'M' -> Optional.of(MILLISECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'F' -> Optional.of(ADD_ORDER_MPID_ATTRIBUTION_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_RESTRICTION_MESSAGE);
            case 'G' -> Optional.of(END_OF_SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
