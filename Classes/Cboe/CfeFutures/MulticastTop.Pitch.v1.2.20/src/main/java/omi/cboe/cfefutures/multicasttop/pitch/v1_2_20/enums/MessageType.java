package omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary.
     */
    TIME_REFERENCE_MESSAGE((short) 177, "The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary."),

    /**
     * A Time message is immediately generated and sent when there is a TOP event for a given clock second.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a TOP event for a given clock second."),

    /**
     * The Unit Clear message instructs feed recipients to clear all market snapshots for the CFE book in the unit specified in the Sequenced Unit Header message header.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all market snapshots for the CFE book in the unit specified in the Sequenced Unit Header message header."),

    /**
     * The Futures Instrument Definition message can be sent as a sequenced message or an un-sequenced message. It is sent as a sequenced message when the system starts up at the beginning of a trading session or if an instrument is created or modified during a trading day.
     */
    FUTURES_INSTRUMENT_DEFINITION_MESSAGE((short) 187, "The Futures Instrument Definition message can be sent as a sequenced message or an un-sequenced message. It is sent as a sequenced message when the system starts up at the beginning of a trading session or if an instrument is created or modified during a trading day."),

    /**
     * The Futures Variance Symbol Mapping message is used to disseminate symbol reference data for S&amp;P 500 Variance Futures (VA Futures) symbols.
     */
    FUTURES_VARIANCE_SYMBOL_MAPPING_MESSAGE((short) 250, "The Futures Variance Symbol Mapping message is used to disseminate symbol reference data for S&P 500 Variance Futures (VA Futures) symbols."),

    /**
     * The Price Limits message can be sent as a sequenced or un-sequenced message. It is sent out at the start of the session for products subject to price limits per the contract specifications.
     */
    PRICE_LIMITS_MESSAGE((short) 190, "The Price Limits message can be sent as a sequenced or un-sequenced message. It is sent out at the start of the session for products subject to price limits per the contract specifications."),

    /**
     * A Market Snapshot message provides a snapshot of the price and size for the bid and ask, last trade price, total number of contracts traded, and the current trading status of a single symbol.
     */
    MARKET_SNAPSHOT_SHORT_MESSAGE((short) 178, "A Market Snapshot message provides a snapshot of the price and size for the bid and ask, last trade price, total number of contracts traded, and the current trading status of a single symbol."),

    /**
     * A Market Snapshot message provides a snapshot of the price and size for the bid and ask, last trade price, total number of contracts traded, and the current trading status of a single symbol.
     */
    MARKET_SNAPSHOT_LONG_MESSAGE((short) 179, "A Market Snapshot message provides a snapshot of the price and size for the bid and ask, last trade price, total number of contracts traded, and the current trading status of a single symbol."),

    /**
     * Single Side Update messages provide an updated price and size for a single side of a Symbol.
     */
    SINGLE_SIDE_UPDATE_SHORT_MESSAGE((short) 180, "Single Side Update messages provide an updated price and size for a single side of a Symbol."),

    /**
     * Single Side Update messages provide an updated price and size for a single side of a Symbol.
     */
    SINGLE_SIDE_UPDATE_LONG_MESSAGE((short) 181, "Single Side Update messages provide an updated price and size for a single side of a Symbol."),

    /**
     * Two Side Update messages provide an updated price and size for both sides of a Symbol.
     */
    TWO_SIDE_UPDATE_SHORT_MESSAGE((short) 182, "Two Side Update messages provide an updated price and size for both sides of a Symbol."),

    /**
     * Two Side Update messages provide an updated price and size for both sides of a Symbol.
     */
    TWO_SIDE_UPDATE_LONG_MESSAGE((short) 183, "Two Side Update messages provide an updated price and size for both sides of a Symbol."),

    /**
     * The TOP Trade message provides information about executions of orders on the CFE book. TOP Trade messages are necessary to calculate CFE execution-based data.
     */
    TOP_TRADE_MESSAGE((short) 184, "The TOP Trade message provides information about executions of orders on the CFE book. TOP Trade messages are necessary to calculate CFE execution-based data."),

    /**
     * Settlement messages are used to provide information concerning indicative, approved, or corrected daily and final settlement prices for CFE products.
     */
    SETTLEMENT_MESSAGE((short) 185, "Settlement messages are used to provide information concerning indicative, approved, or corrected daily and final settlement prices for CFE products."),

    /**
     * The End of Day Summary message is sent immediately after trading ends for a symbol. No more Market Update messages will follow an End of Day Summary message for a particular symbol.
     */
    END_OF_DAY_SUMMARY_MESSAGE((short) 186, "The End of Day Summary message is sent immediately after trading ends for a symbol. No more Market Update messages will follow an End of Day Summary message for a particular symbol."),

    /**
     * The Trading Status message is used to indicate the current trading status of a Futures contract.
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a Futures contract."),

    /**
     * The Open Interest message is sent to communicate a symbol's open interest, usually for the prior trading date.
     */
    OPEN_INTEREST_MESSAGE((short) 211, "The Open Interest message is sent to communicate a symbol's open interest, usually for the prior trading date."),

    /**
     * The End of Session message is sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "The End of Session message is sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 177 -> Optional.of(TIME_REFERENCE_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 187 -> Optional.of(FUTURES_INSTRUMENT_DEFINITION_MESSAGE);
            case 250 -> Optional.of(FUTURES_VARIANCE_SYMBOL_MAPPING_MESSAGE);
            case 190 -> Optional.of(PRICE_LIMITS_MESSAGE);
            case 178 -> Optional.of(MARKET_SNAPSHOT_SHORT_MESSAGE);
            case 179 -> Optional.of(MARKET_SNAPSHOT_LONG_MESSAGE);
            case 180 -> Optional.of(SINGLE_SIDE_UPDATE_SHORT_MESSAGE);
            case 181 -> Optional.of(SINGLE_SIDE_UPDATE_LONG_MESSAGE);
            case 182 -> Optional.of(TWO_SIDE_UPDATE_SHORT_MESSAGE);
            case 183 -> Optional.of(TWO_SIDE_UPDATE_LONG_MESSAGE);
            case 184 -> Optional.of(TOP_TRADE_MESSAGE);
            case 185 -> Optional.of(SETTLEMENT_MESSAGE);
            case 186 -> Optional.of(END_OF_DAY_SUMMARY_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 211 -> Optional.of(OPEN_INTEREST_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
