package omi.jpx.fseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the type of the quote.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteFlag {

    /**
     * Quote 1 only.
     */
    QUOTE_BEFORE_OPENING('0', "Quote 1 only."),

    /**
     * General Quote
     */
    GENERAL_QUOTE('1', "General Quote"),

    /**
     * Quote 1 only. It is set when it keeps changing in Q1 by a single order under Zaraba session.
     */
    GENERAL_QUOTE_UNDER_TRANSACTION('2', "Quote 1 only. It is set when it keeps changing in Q1 by a single order under Zaraba session."),

    /**
     * Quote 1 only.
     */
    SPECIAL_QUOTE('3', "Quote 1 only."),

    /**
     * Quote 1 only.
     */
    SEQUENTIAL_TRADE_QUOTE('4', "Quote 1 only."),

    /**
     * Quote 1 only.
     */
    TEMPORARY_QUOTE_AT_THE_BEGINNING_OF_PRE_CLOSING('5', "Quote 1 only."),

    /**
     * Quote 1 only. It is set in case ask orders are executed by special execution method.
     */
    QUOTE_AFTER_SPECIAL_EXECUTION('6', "Quote 1 only. It is set in case ask orders are executed by special execution method."),

    /**
     * Quote 1 only. It is set when Trading Halt or Trading Suspension occurs while Special Quote is displayed.
     */
    SPECIAL_QUOTE_BEFORE_TRADING_HALT('7', "Quote 1 only. It is set when Trading Halt or Trading Suspension occurs while Special Quote is displayed."),

    /**
     * Quote 1 only. It is set when Trading Halt or Trading Suspension occurs while Sequential Trade Quote is displayed.
     */
    SEQUENTIAL_TRADE_QUOTE_BEFORE_TRADING_HALT('8', "Quote 1 only. It is set when Trading Halt or Trading Suspension occurs while Sequential Trade Quote is displayed."),

    /**
     * No Quotes Or All Quotes Are Cancelled
     */
    NO_QUOTES_OR_ALL_QUOTES_ARE_CANCELLED(' ', "No Quotes Or All Quotes Are Cancelled");

    private final char wire;

    private final String description;

    QuoteFlag(char wire, String description) {
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
    public static Optional<QuoteFlag> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(QUOTE_BEFORE_OPENING);
            case '1' -> Optional.of(GENERAL_QUOTE);
            case '2' -> Optional.of(GENERAL_QUOTE_UNDER_TRANSACTION);
            case '3' -> Optional.of(SPECIAL_QUOTE);
            case '4' -> Optional.of(SEQUENTIAL_TRADE_QUOTE);
            case '5' -> Optional.of(TEMPORARY_QUOTE_AT_THE_BEGINNING_OF_PRE_CLOSING);
            case '6' -> Optional.of(QUOTE_AFTER_SPECIAL_EXECUTION);
            case '7' -> Optional.of(SPECIAL_QUOTE_BEFORE_TRADING_HALT);
            case '8' -> Optional.of(SEQUENTIAL_TRADE_QUOTE_BEFORE_TRADING_HALT);
            case ' ' -> Optional.of(NO_QUOTES_OR_ALL_QUOTES_ARE_CANCELLED);
            default -> Optional.empty();
        };
    }
}
