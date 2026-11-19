package omi.nasdaq.psxequities.totalview.glimpse.v5_0.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * PSX GLIMPSE product is designed to support the same system event messages as the PSX TotalView-ITCH feed. On PSX GLIMPSE, PSX will send out system event messages for those events that occurred up to the time of the PSX GLIMPSE snapshot request.
     */
    SYSTEM_EVENT_MESSAGE('S', "PSX GLIMPSE product is designed to support the same system event messages as the PSX TotalView-ITCH feed. On PSX GLIMPSE, PSX will send out system event messages for those events that occurred up to the time of the PSX GLIMPSE snapshot request."),

    /**
     * Add Order - No MPID Attribution Message. This message will be generated for unattributed orders accepted by the PSX system.
     */
    ADD_ORDER_MESSAGE('A', "Add Order - No MPID Attribution Message. This message will be generated for unattributed orders accepted by the PSX system."),

    /**
     * Add Order with MPID Attribution Message. This message will be generated for attributed orders and quotations accepted by the PSX system. Note: This message will not be supported for NASDAQ OMX PSX for initial market launch.
     */
    ADD_ORDER_MPID_ATTRIBUTION_MESSAGE('F', "Add Order with MPID Attribution Message. This message will be generated for attributed orders and quotations accepted by the PSX system. Note: This message will not be supported for NASDAQ OMX PSX for initial market launch."),

    /**
     * At the start of each trading day, NASDAQ OMX PSX disseminates stock directory messages for all active symbols in the system for the current trading day. Please note that the Symbol Directory spin may include halted issues. Firms must process the Trading Action message for current trading state information.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, NASDAQ OMX PSX disseminates stock directory messages for all active symbols in the system for the current trading day. Please note that the Symbol Directory spin may include halted issues. Firms must process the Trading Action message for current trading state information."),

    /**
     * In the GLIMPSE transmission, PSX will send out a Stock Trading Action message for only those NASDAQ, NYSE, NYSE Amex, NYSE Arca and BATS issues that were eligible for trading during the current trading session.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "In the GLIMPSE transmission, PSX will send out a Stock Trading Action message for only those NASDAQ, NYSE, NYSE Amex, NYSE Arca and BATS issues that were eligible for trading during the current trading session."),

    /**
     * Reg SHO Short Sale Price Test Restricted Indicator
     */
    REG_SHO_RESTRICTION_MESSAGE('Y', "Reg SHO Short Sale Price Test Restricted Indicator"),

    /**
     * The Snapshot message reflects the PSX TotalView-ITCH 5.0 sequence number at the time that the PSX GLIMPSE 5.0 spin was requested.
     */
    END_OF_SNAPSHOT_MESSAGE('G', "The Snapshot message reflects the PSX TotalView-ITCH 5.0 sequence number at the time that the PSX GLIMPSE 5.0 spin was requested.");

    private final char wire;

    private final String description;

    SequencedMessageType(char wire, String description) {
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
    public static Optional<SequencedMessageType> fromWire(char wire) {
        return switch (wire) {
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
