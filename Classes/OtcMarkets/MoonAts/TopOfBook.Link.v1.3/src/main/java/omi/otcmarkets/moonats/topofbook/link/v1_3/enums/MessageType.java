package omi.otcmarkets.moonats.topofbook.link.v1_3.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * After a Spin Response Message, with status 'S', this message appears on all channels and indicates the beginning of a spin message cycle.
     */
    START_OF_SPIN_MESSAGE((short) 11, "After a Spin Response Message, with status 'S', this message appears on all channels and indicates the beginning of a spin message cycle."),

    /**
     * This message appears on all channels and indicates the end of a spin message cycle. It will be followed by a Spin Response Message, with status 'E'.
     */
    END_OF_SPIN_MESSAGE((short) 12, "This message appears on all channels and indicates the end of a spin message cycle. It will be followed by a Spin Response Message, with status 'E'."),

    /**
     * This message appears on all channels and is sent out at the start of each MOON trading session: Order Acceptance at 7:30 PM, Market Open at 8:00 PM, Market Close at 4 AM. The message can also be sent mid-day if a technical outage caused a temporary closure of the market.
     */
    TRADING_SESSION_MESSAGE((short) 20, "This message appears on all channels and is sent out at the start of each MOON trading session: Order Acceptance at 7:30 PM, Market Open at 8:00 PM, Market Close at 4 AM. The message can also be sent mid-day if a technical outage caused a temporary closure of the market."),

    /**
     * The Security Message appears on all channels and provides basic security attribute information for all OTC equity securities.
     */
    SECURITY_MESSAGE((short) 9, "The Security Message appears on all channels and provides basic security attribute information for all OTC equity securities."),

    /**
     * This message appears on the TOB channel. Provides best bid and offer aggregated top-of-book.
     */
    TOP_OF_BOOK_MESSAGE((short) 27, "This message appears on the TOB channel. Provides best bid and offer aggregated top-of-book."),

    /**
     * This message appears on all channels. This message is not available in the Overnight TradingSession.
     */
    IMBALANCE_MESSAGE((short) 28, "This message appears on all channels. This message is not available in the Overnight TradingSession."),

    /**
     * In case of a catastrophic issue at the exchange, the system sends a System Recovery Event. The first event (type 'S') instructs clients to prepare and reset caches; clients must clean all cached state. A second event (type 'B') indicates recovery begins, after which the system performs a spin for all symbols and open orders.
     */
    SYSTEM_RECOVERY_EVENT_MESSAGE((short) 74, "In case of a catastrophic issue at the exchange, the system sends a System Recovery Event. The first event (type 'S') instructs clients to prepare and reset caches; clients must clean all cached state. A second event (type 'B') indicates recovery begins, after which the system performs a spin for all symbols and open orders.");

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
            case 11 -> Optional.of(START_OF_SPIN_MESSAGE);
            case 12 -> Optional.of(END_OF_SPIN_MESSAGE);
            case 20 -> Optional.of(TRADING_SESSION_MESSAGE);
            case 9 -> Optional.of(SECURITY_MESSAGE);
            case 27 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            case 28 -> Optional.of(IMBALANCE_MESSAGE);
            case 74 -> Optional.of(SYSTEM_RECOVERY_EVENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
