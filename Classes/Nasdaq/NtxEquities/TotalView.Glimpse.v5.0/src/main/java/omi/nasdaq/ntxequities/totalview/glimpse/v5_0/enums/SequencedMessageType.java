package omi.nasdaq.ntxequities.totalview.glimpse.v5_0.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * Add Order - No MPID Attribution Message.
     */
    ADD_ORDER_MESSAGE('A', "Add Order - No MPID Attribution Message."),

    /**
     * Add Order - No MPID Attribution Message.
     */
    ADD_ORDER_MPID_ATTRIBUTION_MESSAGE('F', "Add Order - No MPID Attribution Message."),

    /**
     * Stock Directory Message
     */
    STOCK_DIRECTORY_MESSAGE('R', "Stock Directory Message"),

    /**
     * Stock Trading Action Message.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Stock Trading Action Message."),

    /**
     * Reg SHO Short Sale Price Test Restricted Indicator
     */
    REG_SHO_RESTRICTION_MESSAGE('Y', "Reg SHO Short Sale Price Test Restricted Indicator"),

    /**
     * Retail Interest message
     */
    RETAIL_INTEREST_MESSAGE('N', "Retail Interest message"),

    /**
     * End of Snapshot message
     */
    END_OF_SNAPSHOT_MESSAGE('G', "End of Snapshot message"),

    /**
     * Operational Halt
     */
    OPERATIONAL_HALT_MESSAGE('h', "Operational Halt");

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
            case 'N' -> Optional.of(RETAIL_INTEREST_MESSAGE);
            case 'G' -> Optional.of(END_OF_SNAPSHOT_MESSAGE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
