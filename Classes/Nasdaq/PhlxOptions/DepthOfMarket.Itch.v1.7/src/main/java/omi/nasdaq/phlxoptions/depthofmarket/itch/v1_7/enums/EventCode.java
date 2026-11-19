package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.enums;

import java.util.Optional;

/**
 * System Event Code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * After ~4:00am
     */
    START_OF_MESSAGES_THIS_IS_ALWAYS_THE_FIRST_MESSAGE_SENT_IN_ANY_TRADING_DAY('O', "After ~4:00am"),

    /**
     * 7:00am
     */
    START_OF_SYSTEM_HOURS_THIS_MESSAGE_INDICATES_THAT_PHLX__IS_OPEN_AND_READY_TO_START_ACCEPTING_ORDERS('S', "7:00am"),

    /**
     * 9:30:00am
     */
    START_OF_OPENING_PROCESS_THIS_MESSAGE_IS_INTENDED_TO_INDICATE_THAT_PHLX__HAS_STARTED_ITS_OPENING_AUCTION_PROCESS('Q', "9:30:00am"),

    /**
     * 4:00:00pm
     */
    END_OF_NORMAL_HOURS_PROCESSING_THIS_MESSAGE_IS_INTENDED_TO_INDICATE_THAT_PHLX__WILL_NO_LONGER_ACCEPT_ANY_NEW_ORDERS_OR_CHANGES_TO_EXISTING_ORDERS_FOR_OPTIONS_THAT_TRADE_DURING_NORMAL_TRADING_HOURS('N', "4:00:00pm"),

    /**
     * 4:15:00pm
     */
    END_OF_LATE_HOURS_PROCESSING_THIS_MESSAGE_IS_INTENDED_TO_INDICATE_THAT_PHLX__WILL_NO_LONGER_ACCEPT_ANY_NEW_ORDERS_OR_CHANGES_TO_EXISTING_ORDERS_FOR_OPTIONS_THAT_TRADE_DURING_EXTENDED_HOURS('L', "4:15:00pm"),

    /**
     * ~5:15pm
     */
    END_OF_SYSTEM_HOURS_THIS_MESSAGE_INDICATES_THAT_PHLX__OPTIONS_SYSTEM_IS_NOW_CLOSED('E', "~5:15pm"),

    /**
     * ~5:20pm
     */
    END_OF_MESSAGES_THIS_IS_ALWAYS_THE_LAST_MESSAGE_SENT_IN_ANY_TRADING_DAY('C', "~5:20pm"),

    /**
     * 12:00 Noon
     */
    END_OF_WCO_EARLY_CLOSING_THIS_MESSAGE_IS_INTENDED_TO_INDICATE_THAT_THE_EXCHANGE_WILL_NO_LONGER_ACCEPT_ANY_NEW_ORDERS_OR_CHANGES_TO_EXISTING_ORDERS_ON_LAST_TRADING_DATE_OF_WCO_OPTIONS('W', "12:00 Noon");

    private final char wire;

    private final String description;

    EventCode(char wire, String description) {
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
    public static Optional<EventCode> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(START_OF_MESSAGES_THIS_IS_ALWAYS_THE_FIRST_MESSAGE_SENT_IN_ANY_TRADING_DAY);
            case 'S' -> Optional.of(START_OF_SYSTEM_HOURS_THIS_MESSAGE_INDICATES_THAT_PHLX__IS_OPEN_AND_READY_TO_START_ACCEPTING_ORDERS);
            case 'Q' -> Optional.of(START_OF_OPENING_PROCESS_THIS_MESSAGE_IS_INTENDED_TO_INDICATE_THAT_PHLX__HAS_STARTED_ITS_OPENING_AUCTION_PROCESS);
            case 'N' -> Optional.of(END_OF_NORMAL_HOURS_PROCESSING_THIS_MESSAGE_IS_INTENDED_TO_INDICATE_THAT_PHLX__WILL_NO_LONGER_ACCEPT_ANY_NEW_ORDERS_OR_CHANGES_TO_EXISTING_ORDERS_FOR_OPTIONS_THAT_TRADE_DURING_NORMAL_TRADING_HOURS);
            case 'L' -> Optional.of(END_OF_LATE_HOURS_PROCESSING_THIS_MESSAGE_IS_INTENDED_TO_INDICATE_THAT_PHLX__WILL_NO_LONGER_ACCEPT_ANY_NEW_ORDERS_OR_CHANGES_TO_EXISTING_ORDERS_FOR_OPTIONS_THAT_TRADE_DURING_EXTENDED_HOURS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS_THIS_MESSAGE_INDICATES_THAT_PHLX__OPTIONS_SYSTEM_IS_NOW_CLOSED);
            case 'C' -> Optional.of(END_OF_MESSAGES_THIS_IS_ALWAYS_THE_LAST_MESSAGE_SENT_IN_ANY_TRADING_DAY);
            case 'W' -> Optional.of(END_OF_WCO_EARLY_CLOSING_THIS_MESSAGE_IS_INTENDED_TO_INDICATE_THAT_THE_EXCHANGE_WILL_NO_LONGER_ACCEPT_ANY_NEW_ORDERS_OR_CHANGES_TO_EXISTING_ORDERS_ON_LAST_TRADING_DATE_OF_WCO_OPTIONS);
            default -> Optional.empty();
        };
    }
}
