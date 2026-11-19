package omi.lme.lmeselect.referenceprices.lmesource.v4_18.enums;

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
     * Reference prices are published for instruments with an InstrumentID for the Official, Settlement, Closing and Index price types. Instruments are published in the Instrument Definition message.
     */
    REFERENCE_PRICE_MESSAGE(401, "Reference prices are published for instruments with an InstrumentID for the Official, Settlement, Closing and Index price types. Instruments are published in the Instrument Definition message."),

    /**
     * Indicative and closing prices for Carries and indicative prices for the Aluminium Premiums.
     */
    REFERENCE_FORWARD_CURVE_PRICE_MESSAGE(402, "Indicative and closing prices for Carries and indicative prices for the Aluminium Premiums."),

    /**
     * Exchange FX rates are published for the Cash prompt. Daily and Monthly Moving Average Exchange FX rates are published each day, with the Monthly Average Exchange FX rate published on the last business day of the month. MonthlyMovingAverage and MonthlyAverage are published only for the Exchange category.
     */
    REFERENCE_FX_RATE_MESSAGE(403, "Exchange FX rates are published for the Cash prompt. Daily and Monthly Moving Average Exchange FX rates are published each day, with the Monthly Average Exchange FX rate published on the last business day of the month. MonthlyMovingAverage and MonthlyAverage are published only for the Exchange category."),

    /**
     * Provides raw strikes. LME volatilities are quoted in Delta space, and the strikes for which LME provide volatilities correspond to plus or minus 5, 10 and 25, the 50 delta, the at the money strike and the tradable strikes for the instrument. The calculated Call Premium and Put Premium are provided for each volatility and strike price for both Traded Options and TAPOs.
     */
    REFERENCE_VOLATILITY_PRICE_MESSAGE(404, "Provides raw strikes. LME volatilities are quoted in Delta space, and the strikes for which LME provide volatilities correspond to plus or minus 5, 10 and 25, the 50 delta, the at the money strike and the tradable strikes for the instrument. The calculated Call Premium and Put Premium are provided for each volatility and strike price for both Traded Options and TAPOs.");

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
            case 401 -> Optional.of(REFERENCE_PRICE_MESSAGE);
            case 402 -> Optional.of(REFERENCE_FORWARD_CURVE_PRICE_MESSAGE);
            case 403 -> Optional.of(REFERENCE_FX_RATE_MESSAGE);
            case 404 -> Optional.of(REFERENCE_VOLATILITY_PRICE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
