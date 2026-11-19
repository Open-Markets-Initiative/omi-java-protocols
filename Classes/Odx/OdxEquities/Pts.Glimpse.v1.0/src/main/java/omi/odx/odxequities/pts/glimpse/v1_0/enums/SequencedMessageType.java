package omi.odx.odxequities.pts.glimpse.v1_0.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Reflects the number of seconds past midnight
     */
    TIMESTAMP_SECONDS_MESSAGE('T', "Reflects the number of seconds past midnight"),

    /**
     * System Event Messages signal data feed, system and market events
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages signal data feed, system and market events"),

    /**
     * Price Tick Size Messages define a set of price tick size tables
     */
    PRICE_TICK_SIZE_MESSAGE('L', "Price Tick Size Messages define a set of price tick size tables"),

    /**
     * Orderbook Directory Messages provide information about orderbooks available in the ODX PTS execution system
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Orderbook Directory Messages provide information about orderbooks available in the ODX PTS execution system"),

    /**
     * A Trading State Message indicates the current trading status of an orderbook
     */
    TRADING_STATE_MESSAGE('H', "A Trading State Message indicates the current trading status of an orderbook"),

    /**
     * A Short Selling Price Restriction State Message indicates the current short selling price restriction status of an orderbook
     */
    SHORT_SELLING_PRICE_RESTRICTION_STATE_MESSAGE('Y', "A Short Selling Price Restriction State Message indicates the current short selling price restriction status of an orderbook"),

    /**
     * An Order Added Message indicates that an order exists in the ODX PTS execution system displayable book
     */
    ORDER_ADDED_MESSAGE('A', "An Order Added Message indicates that an order exists in the ODX PTS execution system displayable book"),

    /**
     * An Order Added with Attributes Message is generated for orders with market specific attributes present in the system
     */
    ORDER_ADDED_WITH_ATTRIBUTES_MESSAGE('F', "An Order Added with Attributes Message is generated for orders with market specific attributes present in the system"),

    /**
     * The End of Snapshot Message provides the next sequence number of the real-time Itch market data feed at the time the snapshot was taken
     */
    END_OF_SNAPSHOT_MESSAGE('G', "The End of Snapshot Message provides the next sequence number of the real-time Itch market data feed at the time the snapshot was taken");

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
            case 'T' -> Optional.of(TIMESTAMP_SECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'L' -> Optional.of(PRICE_TICK_SIZE_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_STATE_MESSAGE);
            case 'Y' -> Optional.of(SHORT_SELLING_PRICE_RESTRICTION_STATE_MESSAGE);
            case 'A' -> Optional.of(ORDER_ADDED_MESSAGE);
            case 'F' -> Optional.of(ORDER_ADDED_WITH_ATTRIBUTES_MESSAGE);
            case 'G' -> Optional.of(END_OF_SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
