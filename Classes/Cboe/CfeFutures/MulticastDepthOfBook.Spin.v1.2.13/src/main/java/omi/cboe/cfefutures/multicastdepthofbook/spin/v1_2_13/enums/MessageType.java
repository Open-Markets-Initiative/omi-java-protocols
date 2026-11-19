package omi.cboe.cfefutures.multicastdepthofbook.spin.v1_2_13.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Login message is the first message sent to the Spin Server by a user's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format of the Login message for the Spin Server is identical to that of the GRP.
     */
    LOGIN_MESSAGE((short) 1, "The Login message is the first message sent to the Spin Server by a user's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format of the Login message for the Spin Server is identical to that of the GRP."),

    /**
     * The Login Response message is sent by the Spin Server to a user's process in response to a Login message.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "The Login Response message is sent by the Spin Server to a user's process in response to a Login message."),

    /**
     * The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available.
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available."),

    /**
     * The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book.
     */
    SPIN_REQUEST_MESSAGE((short) 129, "The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book."),

    /**
     * The Spin Response message is sent in response to a participant's Spin Request message indicating whether a spin will be sent.
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "The Spin Response message is sent in response to a participant's Spin Request message indicating whether a spin will be sent."),

    /**
     * The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the participant's copy of the book to make it current.
     */
    SPIN_FINISHED_MESSAGE((short) 131, "The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the participant's copy of the book to make it current."),

    /**
     * The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary.
     */
    TIME_REFERENCE_MESSAGE((short) 177, "The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary."),

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second."),

    /**
     * The Futures Instrument Definition message can be sent as a sequenced message or an un-sequenced message. It is sent as a sequenced message when the system starts up at the beginning of a trading session or an the instrument is created or modified during a trading day.
     */
    FUTURES_INSTRUMENT_DEFINITION_MESSAGE((short) 187, "The Futures Instrument Definition message can be sent as a sequenced message or an un-sequenced message. It is sent as a sequenced message when the system starts up at the beginning of a trading session or an the instrument is created or modified during a trading day."),

    /**
     * The Futures Variance Symbol Mapping message is used to disseminate symbol reference data for S&amp;P 500 Variance Futures (VA Futures) symbols.
     */
    FUTURES_VARIANCE_SYMBOL_MAPPING_MESSAGE((short) 250, "The Futures Variance Symbol Mapping message is used to disseminate symbol reference data for S&P 500 Variance Futures (VA Futures) symbols."),

    /**
     * An Add Order message represents a newly accepted visible order on the CFE book.
     */
    ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the CFE book."),

    /**
     * An Add Order message represents a newly accepted visible order on the CFE book.
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order message represents a newly accepted visible order on the CFE book."),

    /**
     * The Trading Status message is used to indicate the current trading status of a Futures contract.
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a Futures contract."),

    /**
     * Settlement messages are used to provide information concerning indicative, approved, or corrected daily and final settlement prices for CFE products.
     */
    SETTLEMENT_MESSAGE((short) 185, "Settlement messages are used to provide information concerning indicative, approved, or corrected daily and final settlement prices for CFE products."),

    /**
     * The Price Limits message is sent out at the start of a session for products subject to price limits per the contract specifications.
     */
    PRICE_LIMITS_MESSAGE((short) 190, "The Price Limits message is sent out at the start of a session for products subject to price limits per the contract specifications."),

    /**
     * The End of Day Summary message is sent immediately after trading ends for a symbol. No more Market Update messages will follow an End of Day Summary message for a particular symbol.
     */
    END_OF_DAY_SUMMARY_MESSAGE((short) 186, "The End of Day Summary message is sent immediately after trading ends for a symbol. No more Market Update messages will follow an End of Day Summary message for a particular symbol.");

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
            case 1 -> Optional.of(LOGIN_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 128 -> Optional.of(SPIN_IMAGE_AVAILABLE_MESSAGE);
            case 129 -> Optional.of(SPIN_REQUEST_MESSAGE);
            case 130 -> Optional.of(SPIN_RESPONSE_MESSAGE);
            case 131 -> Optional.of(SPIN_FINISHED_MESSAGE);
            case 177 -> Optional.of(TIME_REFERENCE_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 187 -> Optional.of(FUTURES_INSTRUMENT_DEFINITION_MESSAGE);
            case 250 -> Optional.of(FUTURES_VARIANCE_SYMBOL_MAPPING_MESSAGE);
            case 33 -> Optional.of(ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(ADD_ORDER_SHORT_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 185 -> Optional.of(SETTLEMENT_MESSAGE);
            case 190 -> Optional.of(PRICE_LIMITS_MESSAGE);
            case 186 -> Optional.of(END_OF_DAY_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
