package omi.cboe.c1options.complex.spin.v2_1_61.enums;

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
     * The Login Response message is sent by the Spin Server to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "The Login Response message is sent by the Spin Server to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available.
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available."),

    /**
     * The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book.
     */
    SPIN_REQUEST_MESSAGE((short) 129, "The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book."),

    /**
     * The Spin Response message is sent in response to a user's Spin Request message indicating whether a spin will be sent.
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "The Spin Response message is sent in response to a user's Spin Request message indicating whether a spin will be sent."),

    /**
     * The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the customer's copy of the book to make it current.
     */
    SPIN_FINISHED_MESSAGE((short) 131, "The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the customer's copy of the book to make it current."),

    /**
     * The Instrument Definition Request message is used by a user's process to request transmission of this unit's Symbol Mappings and Complex Instrument Definitions. All Symbol Mapping messages will be sent before Complex Instrument Definition Expanded and Exchange Designated Complex Instrument Definition messages.
     */
    INSTRUMENT_DEFINITION_REQUEST_MESSAGE((short) 132, "The Instrument Definition Request message is used by a user's process to request transmission of this unit's Symbol Mappings and Complex Instrument Definitions. All Symbol Mapping messages will be sent before Complex Instrument Definition Expanded and Exchange Designated Complex Instrument Definition messages."),

    /**
     * The Instrument Definition Response message is sent in response to a user's Instrument Definition Request message indicating whether a spin will be sent.
     */
    INSTRUMENT_DEFINITION_RESPONSE_MESSAGE((short) 133, "The Instrument Definition Response message is sent in response to a user's Instrument Definition Request message indicating whether a spin will be sent."),

    /**
     * The Instrument Definition Finished message is sent to indicate that all Symbol Mapping and Complex Instrument Definition Expanded messages for this unit have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request was not rejected.
     */
    INSTRUMENT_DEFINITION_FINISHED_MESSAGE((short) 134, "The Instrument Definition Finished message is sent to indicate that all Symbol Mapping and Complex Instrument Definition Expanded messages for this unit have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request was not rejected."),

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit. On C1 only, the Time message will also include the Epoch Time field, which is the current time represented as the number of whole seconds since the Epoch (midnight January 1, 1970).
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit. On C1 only, the Time message will also include the Epoch Time field, which is the current time represented as the number of whole seconds since the Epoch (midnight January 1, 1970)."),

    /**
     * A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows."),

    /**
     * A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. It is sent as a sequenced message the first time a Complex Instrument Definition Expanded message is sent for a symbol. These messages will also be sent continuously through the day as an unsequenced message (sequence = 0) at variable rates as bandwidth allows. The Time offset field should be ignored on an unsequenced Complex Instrument Definition Expanded message. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions, one of which may be an equity leg.
     */
    COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE((short) 154, "A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. It is sent as a sequenced message the first time a Complex Instrument Definition Expanded message is sent for a symbol. These messages will also be sent continuously through the day as an unsequenced message (sequence = 0) at variable rates as bandwidth allows. The Time offset field should be ignored on an unsequenced Complex Instrument Definition Expanded message. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions, one of which may be an equity leg."),

    /**
     * C1 Options Only. The Exchange Designated Complex Instrument Definition (EDCID) message represents supplemental information associated with an exchange-designated complex instrument and is sent as a sequenced message the first time it is sent. These messages are also sent continuously throughout the day as an unsequenced message (sequence = 0) at variable rates as bandwidth allows. The Time offset field should be ignored on unsequenced EDCID messages. This message is sent in addition to a Complex Instrument Definition Expanded message for each exchange-designated complex instrument. The EDCID message contains two or more repeating groups of leg definitions. There is a limit of 16 leg definitions.
     */
    EXCHANGE_DESIGNATED_COMPLEX_INSTRUMENT_DEFINITION_MESSAGE((short) 159, "C1 Options Only. The Exchange Designated Complex Instrument Definition (EDCID) message represents supplemental information associated with an exchange-designated complex instrument and is sent as a sequenced message the first time it is sent. These messages are also sent continuously throughout the day as an unsequenced message (sequence = 0) at variable rates as bandwidth allows. The Time offset field should be ignored on unsequenced EDCID messages. This message is sent in addition to a Complex Instrument Definition Expanded message for each exchange-designated complex instrument. The EDCID message contains two or more repeating groups of leg definitions. There is a limit of 16 leg definitions."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe complex book. It includes a day-specific Order Id assigned by Cboe to the complex order.
     */
    ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the Cboe complex book. It includes a day-specific Order Id assigned by Cboe to the complex order."),

    /**
     * An Add Order Short message represents a newly accepted visible order on the Cboe complex book whose Price fits in a Binary Signed Short Price and Quantity fits in an unsigned 16-bit integer.
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order Short message represents a newly accepted visible order on the Cboe complex book whose Price fits in a Binary Signed Short Price and Quantity fits in an unsigned 16-bit integer."),

    /**
     * The Trading Status message is used to indicate the current trading status of a complex instrument. A Trading Status message will be sent whenever a complex instrument trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) and Curb sessions. The GTH Trading Status field will be used to represent the status of series that trade during the GTH session (C1 Only). The GTH session runs from 8:15 p.m. to 9:25 a.m. ET for SPX and VIX series (C1 only).
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a complex instrument. A Trading Status message will be sent whenever a complex instrument trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) and Curb sessions. The GTH Trading Status field will be used to represent the status of series that trade during the GTH session (C1 Only). The GTH session runs from 8:15 p.m. to 9:25 a.m. ET for SPX and VIX series (C1 only).");

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
            case 132 -> Optional.of(INSTRUMENT_DEFINITION_REQUEST_MESSAGE);
            case 133 -> Optional.of(INSTRUMENT_DEFINITION_RESPONSE_MESSAGE);
            case 134 -> Optional.of(INSTRUMENT_DEFINITION_FINISHED_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 154 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE);
            case 159 -> Optional.of(EXCHANGE_DESIGNATED_COMPLEX_INSTRUMENT_DEFINITION_MESSAGE);
            case 33 -> Optional.of(ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(ADD_ORDER_SHORT_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
