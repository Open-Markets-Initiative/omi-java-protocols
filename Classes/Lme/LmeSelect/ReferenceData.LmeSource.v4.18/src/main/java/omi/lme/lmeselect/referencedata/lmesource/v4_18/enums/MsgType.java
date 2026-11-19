package omi.lme.lmeselect.referencedata.lmesource.v4_18.enums;

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
     * Published for a new contract prior to its first trading date, to enable participants to configure risk management parameters before the contract becomes tradable.
     */
    CONTRACT_DEFINITION_MESSAGE(300, "Published for a new contract prior to its first trading date, to enable participants to configure risk management parameters before the contract becomes tradable."),

    /**
     * Describes individual outright tradable instruments available from LMEsource.
     */
    OUTRIGHT_DEFINITION_MESSAGE(301, "Describes individual outright tradable instruments available from LMEsource."),

    /**
     * Describes individual strategy tradable instruments available from LMEsource.
     */
    STRATEGY_DEFINITION_MESSAGE(302, "Describes individual strategy tradable instruments available from LMEsource."),

    /**
     * Describes the upper and lower price limits for an outright tradable instrument. Where Daily Price Limits are enabled for a contract they are published for electronic tradable instruments, and the same limits also apply to non-electronic tradable instruments.
     */
    PRICE_LIMITS_MESSAGE(305, "Describes the upper and lower price limits for an outright tradable instrument. Where Daily Price Limits are enabled for a contract they are published for electronic tradable instruments, and the same limits also apply to non-electronic tradable instruments."),

    /**
     * Generated when the market moves to the Post-Trade session for instruments that have traded. LMEsource publishes the LMEselect Opening and Closing Prices, LMEselect Trading High and LMEselect Trading Low for all contracts that have traded during the day. Off book trades resulting from Cross Order execution are not used in the calculation.
     */
    TRADE_STATISTICS_END_OF_DAY_MESSAGE(351, "Generated when the market moves to the Post-Trade session for instruments that have traded. LMEsource publishes the LMEselect Opening and Closing Prices, LMEselect Trading High and LMEselect Trading Low for all contracts that have traded during the day. Off book trades resulting from Cross Order execution are not used in the calculation.");

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
            case 300 -> Optional.of(CONTRACT_DEFINITION_MESSAGE);
            case 301 -> Optional.of(OUTRIGHT_DEFINITION_MESSAGE);
            case 302 -> Optional.of(STRATEGY_DEFINITION_MESSAGE);
            case 305 -> Optional.of(PRICE_LIMITS_MESSAGE);
            case 351 -> Optional.of(TRADE_STATISTICS_END_OF_DAY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
