package omi.tradelogiq.lynxats.tcplevel1.itch.v1_01.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Tradelogiq's BBO will broadcast real-time updates every time Tradelogiq's top of book changes.
     */
    QUOTE_MESSAGE('W', "Tradelogiq's BBO will broadcast real-time updates every time Tradelogiq's top of book changes."),

    /**
     * Relays all transactions available from or reported by Tradelogiq's two trading books for the current business day.
     */
    TRADE_REPORT_MESSAGE('T', "Relays all transactions available from or reported by Tradelogiq's two trading books for the current business day."),

    /**
     * If trade is cancelled or busted during the day Trade Bust Message will be sent.
     */
    TRADE_BUST_MESSAGE('N', "If trade is cancelled or busted during the day Trade Bust Message will be sent."),

    /**
     * Trade amendments during the day will send this message.
     */
    TRADE_CORRECTION_MESSAGE('M', "Trade amendments during the day will send this message."),

    /**
     * The system event message is used to signal a market or a data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message is used to signal a market or a data feed handler event."),

    /**
     * At start of each trading day, OSI disseminates stock directory messages for supported securities.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At start of each trading day, OSI disseminates stock directory messages for supported securities."),

    /**
     * Extended Stock Directory are for Special stock symbols eg warrants debentures rights.
     */
    EXTENDED_STOCK_DIRECTORY_MESSAGE('r', "Extended Stock Directory are for Special stock symbols eg warrants debentures rights."),

    /**
     * This message indicates the current trading status of a stock.
     */
    STOCK_STATUS_MESSAGE('H', "This message indicates the current trading status of a stock.");

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
            case 'W' -> Optional.of(QUOTE_MESSAGE);
            case 'T' -> Optional.of(TRADE_REPORT_MESSAGE);
            case 'N' -> Optional.of(TRADE_BUST_MESSAGE);
            case 'M' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'r' -> Optional.of(EXTENDED_STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
