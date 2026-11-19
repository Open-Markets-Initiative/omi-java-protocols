package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * Administrative message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AdministrativeMessageType {

    /**
     * A variable length, free-form text message format will be used on an as-needed basis
     */
    GENERAL_ADMINISTRATIVE_MESSAGE('A', "A variable length, free-form text message format will be used on an as-needed basis"),

    /**
     * The closing trade summary will reflect the daily high, low, and closing prices as well as the total volume for the security
     */
    CLOSING_TRADE_SUMMARY_REPORT_MESSAGE('2', "The closing trade summary will reflect the daily high, low, and closing prices as well as the total volume for the security"),

    /**
     * FINRA will disseminate this message to inform customers of trading actions, such as halts or trading resumptions which affect individual OTCBB or Other OTC securities
     */
    TRADING_ACTION_MESSAGE('H', "FINRA will disseminate this message to inform customers of trading actions, such as halts or trading resumptions which affect individual OTCBB or Other OTC securities"),

    /**
     * FINRA will disseminate this message to inform customers of an extraordinary market event trading action or a market wide circuit breaker event which will affect all security symbols for either OTCBB, Other OTC or both OTCBB and Other OTC market places
     */
    MARKET_WIDE_CIRCUIT_BREAKER_EVENT_MESSAGE('M', "FINRA will disseminate this message to inform customers of an extraordinary market event trading action or a market wide circuit breaker event which will affect all security symbols for either OTCBB, Other OTC or both OTCBB and Other OTC market places");

    private final char wire;

    private final String description;

    AdministrativeMessageType(char wire, String description) {
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
    public static Optional<AdministrativeMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(GENERAL_ADMINISTRATIVE_MESSAGE);
            case '2' -> Optional.of(CLOSING_TRADE_SUMMARY_REPORT_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'M' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_EVENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
