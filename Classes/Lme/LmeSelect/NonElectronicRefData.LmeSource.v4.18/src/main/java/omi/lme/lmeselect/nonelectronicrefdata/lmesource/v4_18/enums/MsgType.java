package omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Type of message, selecting the payload that follows the message header
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * Sent on each multicast channel at start of day, and intraday in case of a disaster recovery. The client must ignore the sequence number of the Sequence Reset message itself and set the next expected sequence number to NewSeqNo, clear all cached data for all instruments and subscribe to the refresh channels to receive the current state of the market.
     */
    SEQUENCE_RESET_MESSAGE(100, "Sent on each multicast channel at start of day, and intraday in case of a disaster recovery. The client must ignore the sequence number of the Sequence Reset message itself and set the next expected sequence number to NewSeqNo, clear all cached data for all instruments and subscribe to the refresh channels to receive the current state of the market."),

    /**
     * Describes a futures outright prompt date or option call or put strike.
     */
    INSTRUMENT_DEFINITION_MESSAGE(303, "Describes a futures outright prompt date or option call or put strike."),

    /**
     * Describes an individual outright, strategy or Trade at Reference tradable instrument on the Ring or Inter Office venue. An option tradable instrument is published only once on the day of creation and is published at the start of day on the next business day.
     */
    TRADABLE_INSTRUMENT_DEFINITION_MESSAGE(304, "Describes an individual outright, strategy or Trade at Reference tradable instrument on the Ring or Inter Office venue. An option tradable instrument is published only once on the day of creation and is published at the start of day on the next business day."),

    /**
     * Generated at the end of each Ring trading session for instruments that have traded. Two messages are published, one for each high price and low price. If no price has been received the field is set to null.
     */
    ORDER_STATISTICS_INTRADAY_MESSAGE(350, "Generated at the end of each Ring trading session for instruments that have traded. Two messages are published, one for each high price and low price. If no price has been received the field is set to null.");

    private final int wire;

    private final String description;

    MsgType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<MsgType> fromWire(int wire) {
        return switch (wire) {
            case 100 -> Optional.of(SEQUENCE_RESET_MESSAGE);
            case 303 -> Optional.of(INSTRUMENT_DEFINITION_MESSAGE);
            case 304 -> Optional.of(TRADABLE_INSTRUMENT_DEFINITION_MESSAGE);
            case 350 -> Optional.of(ORDER_STATISTICS_INTRADAY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
