package omi.cboe.cfefutures.oofmulticasttop.spin.v1_0_8.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary. All subsequent Time messages for the same unit will the use the last Midnight Reference until another Time Reference message is received for that unit. The Time Reference message includes the Trade Date, so most other sequenced messages will not include that information. Time Reference messages will be included in a spin response.
     */
    TIME_REFERENCE_MESSAGE((short) 177, "The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary. All subsequent Time messages for the same unit will the use the last Midnight Reference until another Time Reference message is received for that unit. The Time Reference message includes the Trade Date, so most other sequenced messages will not include that information. Time Reference messages will be included in a spin response."),

    /**
     * A Time message is immediately generated and sent when there is a TOP event for a given clock second. If there is no new sequenced TOP event for a given clock second, then no Time message is sent for that second. All subsequent Time Offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit. The Time field is the number of seconds relative to midnight Central Time, which is provided in the Time Reference message. The Time message also includes the Epoch Time field, which is the current time represented as the number of whole seconds since the Epoch (Midnight January 1, 1970).
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a TOP event for a given clock second. If there is no new sequenced TOP event for a given clock second, then no Time message is sent for that second. All subsequent Time Offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit. The Time field is the number of seconds relative to midnight Central Time, which is provided in the Time Reference message. The Time message also includes the Epoch Time field, which is the current time represented as the number of whole seconds since the Epoch (Midnight January 1, 1970)."),

    /**
     * An OOF Symbol Mapping message is used to map the 6 character multicast feed symbol field and options on futures name to the option contract and future underlying. The option contract is comprised of the strike price, put/call flag, options expiration date, and future underlying. The future underlying is comprised of the futures product and futures expiration date, which map to a futures symbol. This message can be sent either as a sequenced message or as an unsequenced message. It is sent as a sequenced message at system startup upon the beginning of a trading session or if an instrument is created or modified during a trading day. A new sequenced message may also be sent for a symbol that does not visibly change any attribute. A continuous loop of unsequenced symbol mapping messages (sequence = 0) is sent throughout the day at variable rates as bandwidth allows. The Time Offset field should be ignored on unsequenced messages. OOF Symbol Mapping messages are included in a spin response and will be disseminated before Complex Instrument Definition Expanded messages.
     */
    OOF_SYMBOL_MAPPING_MESSAGE((short) 249, "An OOF Symbol Mapping message is used to map the 6 character multicast feed symbol field and options on futures name to the option contract and future underlying. The option contract is comprised of the strike price, put/call flag, options expiration date, and future underlying. The future underlying is comprised of the futures product and futures expiration date, which map to a futures symbol. This message can be sent either as a sequenced message or as an unsequenced message. It is sent as a sequenced message at system startup upon the beginning of a trading session or if an instrument is created or modified during a trading day. A new sequenced message may also be sent for a symbol that does not visibly change any attribute. A continuous loop of unsequenced symbol mapping messages (sequence = 0) is sent throughout the day at variable rates as bandwidth allows. The Time Offset field should be ignored on unsequenced messages. OOF Symbol Mapping messages are included in a spin response and will be disseminated before Complex Instrument Definition Expanded messages."),

    /**
     * A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. This message can be sent either as a sequenced message or as an unsequenced message. It is sent as a sequenced message at system startup upon the beginning of a trading session or if an instrument is created or modified during a trading day. A new sequenced message may also be sent for a symbol that does not visibly change any attribute. A continuous loop of unsequenced symbol mapping messages (sequence = 0) is sent throughout the day at variable rates as bandwidth allows. The Time Offset field should be ignored on unsequenced messages. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions. Complex Instrument Definition Expanded messages are included in a spin response.
     */
    COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE((short) 154, "A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. This message can be sent either as a sequenced message or as an unsequenced message. It is sent as a sequenced message at system startup upon the beginning of a trading session or if an instrument is created or modified during a trading day. A new sequenced message may also be sent for a symbol that does not visibly change any attribute. A continuous loop of unsequenced symbol mapping messages (sequence = 0) is sent throughout the day at variable rates as bandwidth allows. The Time Offset field should be ignored on unsequenced messages. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions. Complex Instrument Definition Expanded messages are included in a spin response."),

    /**
     * The Trading Status message is used to indicate the current trading status of a symbol. A Trading Status message will be sent for all symbols as they transition through various trading states. If a Trading Status message has not been received for a symbol, then the Trading Status for the symbol should be assumed to be H = Halted. The following summarizes the Trading Status values for options in the CFE system: H = Halted state. This state is used for Supervisory Halts initiated by the Trade Desk. Orders are not being accepted in this state. Q = Queuing state. This state is used when orders are being accepted for queuing. The Queuing state is used during the pre-open for all symbols. It is also used for spread instruments that may not be tradeable due to Threshold Width. T = Trading state. This state is used when the symbol is available for trading. CFE will send a Trading Status of Q once orders can be accepted for queuing in preparation for the open. At or after the opening time, CFE will send a Trading Status of T as symbols are opened for trading. Once trading is done for the day CFE will send a Trading Status of H indicating the symbol is Halted.
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a symbol. A Trading Status message will be sent for all symbols as they transition through various trading states. If a Trading Status message has not been received for a symbol, then the Trading Status for the symbol should be assumed to be H = Halted. The following summarizes the Trading Status values for options in the CFE system: H = Halted state. This state is used for Supervisory Halts initiated by the Trade Desk. Orders are not being accepted in this state. Q = Queuing state. This state is used when orders are being accepted for queuing. The Queuing state is used during the pre-open for all symbols. It is also used for spread instruments that may not be tradeable due to Threshold Width. T = Trading state. This state is used when the symbol is available for trading. CFE will send a Trading Status of Q once orders can be accepted for queuing in preparation for the open. At or after the opening time, CFE will send a Trading Status of T as symbols are opened for trading. Once trading is done for the day CFE will send a Trading Status of H indicating the symbol is Halted."),

    /**
     * Single Side Update messages provide an updated price and size for a single side of a Symbol. The side is denoted by the Side field. One Single Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Single Side Update messages come in two variants: Single Side Update (Long) message and Single Side Update (Short) message. The Single Side Update (Short) message is used whenever possible, but the Single Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    SINGLE_SIDE_UPDATE_SHORT_MESSAGE((short) 180, "Single Side Update messages provide an updated price and size for a single side of a Symbol. The side is denoted by the Side field. One Single Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Single Side Update messages come in two variants: Single Side Update (Long) message and Single Side Update (Short) message. The Single Side Update (Short) message is used whenever possible, but the Single Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * Single Side Update messages provide an updated price and size for a single side of a Symbol. The side is denoted by the Side field. One Single Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Single Side Update messages come in two variants: Single Side Update (Long) message and Single Side Update (Short) message. The Single Side Update (Short) message is used whenever possible, but the Single Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    SINGLE_SIDE_UPDATE_LONG_MESSAGE((short) 181, "Single Side Update messages provide an updated price and size for a single side of a Symbol. The side is denoted by the Side field. One Single Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Single Side Update messages come in two variants: Single Side Update (Long) message and Single Side Update (Short) message. The Single Side Update (Short) message is used whenever possible, but the Single Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * Two Side Update messages provide an updated price and size for both sides of a Symbol. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Two Side Update messages come in two variants: Two Side Update (Long) message and Two Side Update (Short) message. The Two Side Update (Short) message is used whenever possible, but the Two Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    TWO_SIDE_UPDATE_SHORT_MESSAGE((short) 182, "Two Side Update messages provide an updated price and size for both sides of a Symbol. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Two Side Update messages come in two variants: Two Side Update (Long) message and Two Side Update (Short) message. The Two Side Update (Short) message is used whenever possible, but the Two Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * Two Side Update messages provide an updated price and size for both sides of a Symbol. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Two Side Update messages come in two variants: Two Side Update (Long) message and Two Side Update (Short) message. The Two Side Update (Short) message is used whenever possible, but the Two Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    TWO_SIDE_UPDATE_LONG_MESSAGE((short) 183, "Two Side Update messages provide an updated price and size for both sides of a Symbol. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Two Side Update messages come in two variants: Two Side Update (Long) message and Two Side Update (Short) message. The Two Side Update (Short) message is used whenever possible, but the Two Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * Settlement messages are used to provide information concerning indicative, approved, or corrected daily and final settlement prices for CFE products. An indicative daily settlement price (Issue = I) is calculated by the system and sent immediately after an instrument closes trading but before the settlement price is approved. An approved settlement price (Issue = S) is sent once the CFE Trade Desk approves a settlement price for an instrument. If there is an error in the approved settlement price, then it may be re-issued (Issue = R). Settlement messages will be included in a spin response.
     */
    SETTLEMENT_MESSAGE((short) 185, "Settlement messages are used to provide information concerning indicative, approved, or corrected daily and final settlement prices for CFE products. An indicative daily settlement price (Issue = I) is calculated by the system and sent immediately after an instrument closes trading but before the settlement price is approved. An approved settlement price (Issue = S) is sent once the CFE Trade Desk approves a settlement price for an instrument. If there is an error in the approved settlement price, then it may be re-issued (Issue = R). Settlement messages will be included in a spin response."),

    /**
     * The End of Day Summary message is sent out right after trading ends for a symbol. No more market data update messages will follow an End of Day Summary message for a particular symbol. A value of zero in the Total Volume field means that no volume traded on that symbol for the day. The Total Volume field reflects all contracts traded during the day. Block trades are included in the Total Volume field, but they are also reported separately to provide more detail. The Summary Flags field provides additional information on how to interpret the High Price and Low Price fields, especially in instruments that had no volume for the day and/or where 0 is a valid price (e.g. complex instruments). There are flags that indicate whether or not the High Price and Low Price fields are valid. If they are not valid, then there was no High (and/or Low) Price for the day. There are also flags that indicate whether the High Price was set by the highest bid and the Low Price was set by the lowest offer rather than a trade. All End of Day Summary message values will span the full trading day, including all extended hours trading and all trading segments.
     */
    END_OF_DAY_SUMMARY_MESSAGE((short) 186, "The End of Day Summary message is sent out right after trading ends for a symbol. No more market data update messages will follow an End of Day Summary message for a particular symbol. A value of zero in the Total Volume field means that no volume traded on that symbol for the day. The Total Volume field reflects all contracts traded during the day. Block trades are included in the Total Volume field, but they are also reported separately to provide more detail. The Summary Flags field provides additional information on how to interpret the High Price and Low Price fields, especially in instruments that had no volume for the day and/or where 0 is a valid price (e.g. complex instruments). There are flags that indicate whether or not the High Price and Low Price fields are valid. If they are not valid, then there was no High (and/or Low) Price for the day. There are also flags that indicate whether the High Price was set by the highest bid and the Low Price was set by the lowest offer rather than a trade. All End of Day Summary message values will span the full trading day, including all extended hours trading and all trading segments."),

    /**
     * The Login message is the first message sent to the GRP by a user's process after the connection to the GRP is established. Failure to login before sending any other message type will result in the connection being dropped by the GRP.
     */
    LOGIN_MESSAGE((short) 1, "The Login message is the first message sent to the GRP by a user's process after the connection to the GRP is established. Failure to login before sending any other message type will result in the connection being dropped by the GRP."),

    /**
     * The Login Response message is sent by the GRP to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "The Login Response message is sent by the GRP to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available.
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available."),

    /**
     * The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book. See to Spin Servers for more complete details regarding Sequence specification as well as buffering requirements.
     */
    SPIN_REQUEST_MESSAGE((short) 129, "The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book. See to Spin Servers for more complete details regarding Sequence specification as well as buffering requirements."),

    /**
     * The Spin Response message is sent in response to a user's Spin Request message indicating whether a spin will be sent.
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "The Spin Response message is sent in response to a user's Spin Request message indicating whether a spin will be sent."),

    /**
     * The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request message was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the participant's copy of the book to make it current.
     */
    SPIN_FINISHED_MESSAGE((short) 131, "The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request message was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the participant's copy of the book to make it current."),

    /**
     * The Instrument Definition Request message is used to request transmission of this unit's OOF Symbol Mappings and Complex Instrument Definitions. All OOF Symbol Mapping messages will be sent before Complex Instrument Definition Expanded messages. Refer to Spin Servers for more complete details regarding Sequence specification as well as buffering requirements.
     */
    INSTRUMENT_DEFINITION_REQUEST_MESSAGE((short) 132, "The Instrument Definition Request message is used to request transmission of this unit's OOF Symbol Mappings and Complex Instrument Definitions. All OOF Symbol Mapping messages will be sent before Complex Instrument Definition Expanded messages. Refer to Spin Servers for more complete details regarding Sequence specification as well as buffering requirements."),

    /**
     * The Instrument Definition Response message is sent in response to a user's Instrument Definition Request message indicating whether a spin will be sent.
     */
    INSTRUMENT_DEFINITION_RESPONSE_MESSAGE((short) 133, "The Instrument Definition Response message is sent in response to a user's Instrument Definition Request message indicating whether a spin will be sent."),

    /**
     * The Instrument Definition Finished message is sent to indicate that all OOF Symbol Mapping and Complex Instrument Definition Expanded messages for this unit have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request message was not rejected.
     */
    INSTRUMENT_DEFINITION_FINISHED_MESSAGE((short) 134, "The Instrument Definition Finished message is sent to indicate that all OOF Symbol Mapping and Complex Instrument Definition Expanded messages for this unit have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request message was not rejected.");

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
            case 249 -> Optional.of(OOF_SYMBOL_MAPPING_MESSAGE);
            case 154 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 180 -> Optional.of(SINGLE_SIDE_UPDATE_SHORT_MESSAGE);
            case 181 -> Optional.of(SINGLE_SIDE_UPDATE_LONG_MESSAGE);
            case 182 -> Optional.of(TWO_SIDE_UPDATE_SHORT_MESSAGE);
            case 183 -> Optional.of(TWO_SIDE_UPDATE_LONG_MESSAGE);
            case 185 -> Optional.of(SETTLEMENT_MESSAGE);
            case 186 -> Optional.of(END_OF_DAY_SUMMARY_MESSAGE);
            case 1 -> Optional.of(LOGIN_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 128 -> Optional.of(SPIN_IMAGE_AVAILABLE_MESSAGE);
            case 129 -> Optional.of(SPIN_REQUEST_MESSAGE);
            case 130 -> Optional.of(SPIN_RESPONSE_MESSAGE);
            case 131 -> Optional.of(SPIN_FINISHED_MESSAGE);
            case 132 -> Optional.of(INSTRUMENT_DEFINITION_REQUEST_MESSAGE);
            case 133 -> Optional.of(INSTRUMENT_DEFINITION_RESPONSE_MESSAGE);
            case 134 -> Optional.of(INSTRUMENT_DEFINITION_FINISHED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
