package omi.nasdaq.nsmequities.noiview.asciiitch.v2_0_2010_1.enums;

import java.util.Optional;

/**
 * Indicates the current trading state for the stock.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingState {

    /**
     * Halted Or Paused On Nasdaq And All Utp Participants
     */
    HALTED_OR_PAUSED_ON_NASDAQ_AND_ALL_UTP_PARTICIPANTS('H', "Halted Or Paused On Nasdaq And All Utp Participants"),

    /**
     * Halted Or Paused On Nasdaq Omx
     */
    HALTED_OR_PAUSED_ON_NASDAQ_OMX('V', "Halted Or Paused On Nasdaq Omx"),

    /**
     * Quotation Only Period For Cross Sro Halt Or Pause
     */
    QUOTATION_ONLY_PERIOD_FOR_CROSS_SRO_HALT_OR_PAUSE('Q', "Quotation Only Period For Cross Sro Halt Or Pause"),

    /**
     * Quotation Only Period For Nasdaq Omx Only Halt Or Pause
     */
    QUOTATION_ONLY_PERIOD_FOR_NASDAQ_OMX_ONLY_HALT_OR_PAUSE('R', "Quotation Only Period For Nasdaq Omx Only Halt Or Pause"),

    /**
     * Trading On Nasdaq Omx
     */
    TRADING_ON_NASDAQ_OMX('T', "Trading On Nasdaq Omx");

    private final char wire;

    private final String description;

    TradingState(char wire, String description) {
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
    public static Optional<TradingState> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HALTED_OR_PAUSED_ON_NASDAQ_AND_ALL_UTP_PARTICIPANTS);
            case 'V' -> Optional.of(HALTED_OR_PAUSED_ON_NASDAQ_OMX);
            case 'Q' -> Optional.of(QUOTATION_ONLY_PERIOD_FOR_CROSS_SRO_HALT_OR_PAUSE);
            case 'R' -> Optional.of(QUOTATION_ONLY_PERIOD_FOR_NASDAQ_OMX_ONLY_HALT_OR_PAUSE);
            case 'T' -> Optional.of(TRADING_ON_NASDAQ_OMX);
            default -> Optional.empty();
        };
    }
}
