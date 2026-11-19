package omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.enums;

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
     * Reports Exchange and Market Open Interest for open positions in futures and options contracts. Exchange open interest volumes are provided per currency, by contract code, and not aggregated across currencies, whereas market open interest volumes are aggregated across currencies and reported against USD denominated instruments.
     */
    OPEN_INTEREST_MESSAGE(420, "Reports Exchange and Market Open Interest for open positions in futures and options contracts. Exchange open interest volumes are provided per currency, by contract code, and not aggregated across currencies, whereas market open interest volumes are aggregated across currencies and reported against USD denominated instruments."),

    /**
     * Reports open interest for all futures trades by product between given dates. Open interest volumes are provided per currency, by contract code, and not aggregated across currencies.
     */
    OPEN_INTEREST_BAND_MESSAGE(421, "Reports open interest for all futures trades by product between given dates. Open interest volumes are provided per currency, by contract code, and not aggregated across currencies."),

    /**
     * Reports the number of market participants holding futures positions as a percentage of Market Open Interest.
     */
    POSITION_BAND_MESSAGE(422, "Reports the number of market participants holding futures positions as a percentage of Market Open Interest."),

    /**
     * Reports the number of market participants holding a significant percentage of warrants and positions along the front of the curve, being Tom, Cash and Cash plus one day.
     */
    WARRANT_BAND_MESSAGE(423, "Reports the number of market participants holding a significant percentage of warrants and positions along the front of the curve, being Tom, Cash and Cash plus one day."),

    /**
     * Provides the traded volume in lots for matched trades in futures and options instruments. All trades resulting from Cross Order execution, whether off-book or not, are included in the trading volume calculation.
     */
    TRADING_VOLUME_MESSAGE(424, "Provides the traded volume in lots for matched trades in futures and options instruments. All trades resulting from Cross Order execution, whether off-book or not, are included in the trading volume calculation."),

    /**
     * Published to mark the end of a refresh cycle.
     */
    REFRESH_COMPLETE_MESSAGE(203, "Published to mark the end of a refresh cycle.");

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
            case 420 -> Optional.of(OPEN_INTEREST_MESSAGE);
            case 421 -> Optional.of(OPEN_INTEREST_BAND_MESSAGE);
            case 422 -> Optional.of(POSITION_BAND_MESSAGE);
            case 423 -> Optional.of(WARRANT_BAND_MESSAGE);
            case 424 -> Optional.of(TRADING_VOLUME_MESSAGE);
            case 203 -> Optional.of(REFRESH_COMPLETE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
