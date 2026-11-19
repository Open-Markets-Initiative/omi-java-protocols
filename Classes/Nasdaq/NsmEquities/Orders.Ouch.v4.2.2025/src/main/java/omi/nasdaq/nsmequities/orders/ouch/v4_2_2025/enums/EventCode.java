package omi.nasdaq.nsmequities.orders.ouch.v4_2_2025.enums;

import java.util.Optional;

/**
 * See Event Codes below.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start of Day — This is always the first message each day. It indicates that NASDAQ is open and ready to start accepting orders.
     */
    START_OF_DAY__THIS_IS_ALWAYS_THE_FIRST_MESSAGE_EACH_DAY('S', "Start of Day \u2014 This is always the first message each day. It indicates that NASDAQ is open and ready to start accepting orders."),

    /**
     * End of Day — This indicates that NASDAQ is now closed and will not accept any new orders or replaces in this session. There will be no further executions during this session; however, it is still possible to receive Broken Trade Messages and Canceled Order Messages
     */
    END_OF_DAY__THIS_INDICATES_THAT_NASDAQ_IS_NOW_CLOSED_AND_WILL_NOT_ACCEPT_ANY_NEW_ORDERS_OR_REPLACES_IN_THIS_SESSION('E', "End of Day \u2014 This indicates that NASDAQ is now closed and will not accept any new orders or replaces in this session. There will be no further executions during this session; however, it is still possible to receive Broken Trade Messages and Canceled Order Messages");

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
            case 'S' -> Optional.of(START_OF_DAY__THIS_IS_ALWAYS_THE_FIRST_MESSAGE_EACH_DAY);
            case 'E' -> Optional.of(END_OF_DAY__THIS_INDICATES_THAT_NASDAQ_IS_NOW_CLOSED_AND_WILL_NOT_ACCEPT_ANY_NEW_ORDERS_OR_REPLACES_IN_THIS_SESSION);
            default -> Optional.empty();
        };
    }
}
