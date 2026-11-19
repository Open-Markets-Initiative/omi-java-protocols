package omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_0_10.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Short Symbol Summary message delivers the Cboe consolidated best bid/offer and total executed volume across all applicable Cboe One Options books.
     */
    SHORT_SYMBOL_SUMMARY_MESSAGE((short) 164, "The Short Symbol Summary message delivers the Cboe consolidated best bid/offer and total executed volume across all applicable Cboe One Options books."),

    /**
     * The Long Symbol Summary message delivers the Cboe consolidated best bid/offer and total executed volume across all applicable Cboe One Options books.
     */
    LONG_SYMBOL_SUMMARY_MESSAGE((short) 163, "The Long Symbol Summary message delivers the Cboe consolidated best bid/offer and total executed volume across all applicable Cboe One Options books."),

    /**
     * The Best Quote Update message is used to update one side of the Cboe consolidated quote information for a symbol. Since the message only updates one side of the quote, the previous value for the other side of the quote remains in effect. This message does not affect the executed volume of the symbol.
     */
    BEST_QUOTE_UPDATE_MESSAGE((short) 165, "The Best Quote Update message is used to update one side of the Cboe consolidated quote information for a symbol. Since the message only updates one side of the quote, the previous value for the other side of the quote remains in effect. This message does not affect the executed volume of the symbol."),

    /**
     * The Cboe Market Status message is disseminated to reflect a change in the status of a market. All markets should be assumed to be Normal unless otherwise indicated by a Cboe Market Status message.
     */
    CBOE_MARKET_STATUS_MESSAGE((short) 166, "The Cboe Market Status message is disseminated to reflect a change in the status of a market. All markets should be assumed to be Normal unless otherwise indicated by a Cboe Market Status message."),

    /**
     * Trade messages are sent when an order is executed in whole or in part on a Cboe exchange.
     */
    TRADE_MESSAGE((short) 169, "Trade messages are sent when an order is executed in whole or in part on a Cboe exchange."),

    /**
     * The Trade Break message is sent whenever an execution on a Cboe exchange is broken. Trade breaks are rare and only affect applications that rely upon Cboe execution based data.
     */
    TRADE_BREAK_MESSAGE((short) 170, "The Trade Break message is sent whenever an execution on a Cboe exchange is broken. Trade breaks are rare and only affect applications that rely upon Cboe execution based data."),

    /**
     * The Trading Status message is used to indicate the current trading status of an options contract on a Cboe exchange.
     */
    TRADING_STATUS_MESSAGE((short) 171, "The Trading Status message is used to indicate the current trading status of an options contract on a Cboe exchange.");

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
            case 164 -> Optional.of(SHORT_SYMBOL_SUMMARY_MESSAGE);
            case 163 -> Optional.of(LONG_SYMBOL_SUMMARY_MESSAGE);
            case 165 -> Optional.of(BEST_QUOTE_UPDATE_MESSAGE);
            case 166 -> Optional.of(CBOE_MARKET_STATUS_MESSAGE);
            case 169 -> Optional.of(TRADE_MESSAGE);
            case 170 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 171 -> Optional.of(TRADING_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
