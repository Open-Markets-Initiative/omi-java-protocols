package omi.otcmarkets.linknqb.depthofbook.link.v1_18.enums;

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
     * This message appears on all channels and is sent out at the start of each NQB IDQS trading session: Order Acceptance at 6 AM, Pre-Market Open at 8 AM, Market Open at 9:30 AM, After Hours at 4 PM, Market Close at 5 PM. The message can also be sent mid-day if a technical outage caused a temporary closure of the market.
     */
    TRADING_SESSION_MESSAGE((short) 20, "This message appears on all channels and is sent out at the start of each NQB IDQS trading session: Order Acceptance at 6 AM, Pre-Market Open at 8 AM, Market Open at 9:30 AM, After Hours at 4 PM, Market Close at 5 PM. The message can also be sent mid-day if a technical outage caused a temporary closure of the market."),

    /**
     * The Security Message appears on all channels and provides basic security attribute information for all OTC equity securities.
     */
    SECURITY_MESSAGE((short) 9, "The Security Message appears on all channels and provides basic security attribute information for all OTC equity securities."),

    /**
     * This message appears on the DOB channel. Indicates a new order added to the book.
     */
    ORDER_ADD_MESSAGE((short) 21, "This message appears on the DOB channel. Indicates a new order added to the book."),

    /**
     * This message appears on the DOB channel. Indicates an existing order has been modified.
     */
    ORDER_UPDATE_MESSAGE((short) 22, "This message appears on the DOB channel. Indicates an existing order has been modified."),

    /**
     * This message appears on the DOB channel. Indicates an existing order has been deleted from the book.
     */
    ORDER_DELETE_MESSAGE((short) 23, "This message appears on the DOB channel. Indicates an existing order has been deleted from the book."),

    /**
     * This message appears on the DOB channel. An Order Executed message will be published when all or some of the displayed quantity of a previously published order executes at the published price.
     */
    ORDER_EXECUTION_MESSAGE((short) 24, "This message appears on the DOB channel. An Order Executed message will be published when all or some of the displayed quantity of a previously published order executes at the published price."),

    /**
     * This message appears on the DOB channel. An Order Executed with Price message will be published when all or some of the displayed quantity of a previously published order executes at a price different than the published price.
     */
    ORDER_EXECUTION_WITH_PRICE_MESSAGE((short) 25, "This message appears on the DOB channel. An Order Executed with Price message will be published when all or some of the displayed quantity of a previously published order executes at a price different than the published price."),

    /**
     * This message appears on the DOB channel. A Trade message will be published when non-displayed quantity of a previously published reserve order executes or when an order executes that is less than Min Quote Size and does not currently have an active Order Add message.
     */
    TRADE_MESSAGE((short) 26, "This message appears on the DOB channel. A Trade message will be published when non-displayed quantity of a previously published reserve order executes or when an order executes that is less than Min Quote Size and does not currently have an active Order Add message."),

    /**
     * This message appears on all channels.
     */
    IMBALANCE_MESSAGE((short) 28, "This message appears on all channels."),

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
            case 21 -> Optional.of(ORDER_ADD_MESSAGE);
            case 22 -> Optional.of(ORDER_UPDATE_MESSAGE);
            case 23 -> Optional.of(ORDER_DELETE_MESSAGE);
            case 24 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 25 -> Optional.of(ORDER_EXECUTION_WITH_PRICE_MESSAGE);
            case 26 -> Optional.of(TRADE_MESSAGE);
            case 28 -> Optional.of(IMBALANCE_MESSAGE);
            case 74 -> Optional.of(SYSTEM_RECOVERY_EVENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
