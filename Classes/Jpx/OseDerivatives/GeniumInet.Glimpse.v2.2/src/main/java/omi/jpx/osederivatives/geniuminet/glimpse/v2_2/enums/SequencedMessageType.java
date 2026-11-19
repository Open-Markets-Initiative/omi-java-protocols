package omi.jpx.osederivatives.geniuminet.glimpse.v2_2.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Provides data on the seconds when each message is disseminated.
     */
    SECONDS_MESSAGE('T', "Provides data on the seconds when each message is disseminated."),

    /**
     * Provides detailed data about the series that can be traded on a given business day.
     */
    SERIES_INFORMATION_BASIC_MESSAGE('R', "Provides detailed data about the series that can be traded on a given business day."),

    /**
     * Provides detailed data about the legs of combination trading instruments that can be traded on a given trading day.
     */
    SERIES_INFORMATION_BASIC_COMBINATION_MESSAGE('M', "Provides detailed data about the legs of combination trading instruments that can be traded on a given trading day."),

    /**
     * Provides the tick size of a trading instrument.
     */
    TICK_SIZE_DATA_MESSAGE('L', "Provides the tick size of a trading instrument."),

    /**
     * Provides system event update data.
     */
    SYSTEM_EVENT_DATA_MESSAGE('S', "Provides system event update data."),

    /**
     * Provides the trading status data of a trading instrument.
     */
    TRADING_STATUS_DATA_MESSAGE('O', "Provides the trading status data of a trading instrument."),

    /**
     * Provides quote data related to a new order.
     */
    NEW_ORDER_MESSAGE('A', "Provides quote data related to a new order."),

    /**
     * Provides an execution notice. The Order ID of the order which is already in the order book is set.
     */
    EXECUTION_NOTICE_MESSAGE('E', "Provides an execution notice. The Order ID of the order which is already in the order book is set."),

    /**
     * Provides an execution notice with trade information.
     */
    EXECUTION_NOTICE_WITH_TRADE_INFORMATION_MESSAGE('C', "Provides an execution notice with trade information."),

    /**
     * Provided when an order is deleted and does not exist in the order book.
     */
    DELETED_ORDER_MESSAGE('D', "Provided when an order is deleted and does not exist in the order book."),

    /**
     * Provides the equilibrium price for the order reception hours.
     */
    EP_MESSAGE('Z', "Provides the equilibrium price for the order reception hours."),

    /**
     * Sent after completing the transmission of snapshot data.
     */
    SNAPSHOT_COMPLETION_MESSAGE('G', "Sent after completing the transmission of snapshot data.");

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
            case 'T' -> Optional.of(SECONDS_MESSAGE);
            case 'R' -> Optional.of(SERIES_INFORMATION_BASIC_MESSAGE);
            case 'M' -> Optional.of(SERIES_INFORMATION_BASIC_COMBINATION_MESSAGE);
            case 'L' -> Optional.of(TICK_SIZE_DATA_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_DATA_MESSAGE);
            case 'O' -> Optional.of(TRADING_STATUS_DATA_MESSAGE);
            case 'A' -> Optional.of(NEW_ORDER_MESSAGE);
            case 'E' -> Optional.of(EXECUTION_NOTICE_MESSAGE);
            case 'C' -> Optional.of(EXECUTION_NOTICE_WITH_TRADE_INFORMATION_MESSAGE);
            case 'D' -> Optional.of(DELETED_ORDER_MESSAGE);
            case 'Z' -> Optional.of(EP_MESSAGE);
            case 'G' -> Optional.of(SNAPSHOT_COMPLETION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
