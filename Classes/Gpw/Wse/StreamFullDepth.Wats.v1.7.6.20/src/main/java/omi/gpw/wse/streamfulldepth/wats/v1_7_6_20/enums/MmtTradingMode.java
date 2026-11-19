package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Trading Mode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtTradingMode {

    /**
     * 1 = Undefined Auction
     */
    UNDEFINED_AUCTION((short) 1, "1 = Undefined Auction"),

    /**
     * O = Scheduled Opening Auction
     */
    SCHEDULED_OPENING_AUCTION((short) 2, "O = Scheduled Opening Auction"),

    /**
     * K = Scheduled Closing Auction
     */
    SCHEDULED_CLOSING_AUCTION((short) 3, "K = Scheduled Closing Auction"),

    /**
     * I = Scheduled Intraday Auction
     */
    SCHEDULED_INTRADAY_AUCTION((short) 4, "I = Scheduled Intraday Auction"),

    /**
     * U = Unscheduled Auction
     */
    UNSCHEDULED_AUCTION((short) 5, "U = Unscheduled Auction"),

    /**
     * 2 = Continuous Trading
     */
    CONTINUOUS_TRADING((short) 6, "2 = Continuous Trading"),

    /**
     * 3 = At Market Close Trading
     */
    AT_MARKET_CLOSE_TRADING((short) 7, "3 = At Market Close Trading"),

    /**
     * 4 = Out Of Main Session Trading
     */
    OUT_OF_MAIN_SESSION_TRADING((short) 8, "4 = Out Of Main Session Trading"),

    /**
     * 5 = Trade Reporting (On Exchange)
     */
    TRADE_REPORTING_ON_EXCHANGE((short) 9, "5 = Trade Reporting (On Exchange)"),

    /**
     * 6 = Trade Reporting (Off Exchange)
     */
    TRADE_REPORTING_OFF_EXCHANGE((short) 10, "6 = Trade Reporting (Off Exchange)"),

    /**
     * 7 = Trade Reporting (Systematic Internaliser)
     */
    TRADE_REPORTING_SYSTEMATIC_INTERNALISER((short) 11, "7 = Trade Reporting (Systematic Internaliser)");

    private final short wire;

    private final String description;

    MmtTradingMode(short wire, String description) {
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
    public static Optional<MmtTradingMode> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(UNDEFINED_AUCTION);
            case 2 -> Optional.of(SCHEDULED_OPENING_AUCTION);
            case 3 -> Optional.of(SCHEDULED_CLOSING_AUCTION);
            case 4 -> Optional.of(SCHEDULED_INTRADAY_AUCTION);
            case 5 -> Optional.of(UNSCHEDULED_AUCTION);
            case 6 -> Optional.of(CONTINUOUS_TRADING);
            case 7 -> Optional.of(AT_MARKET_CLOSE_TRADING);
            case 8 -> Optional.of(OUT_OF_MAIN_SESSION_TRADING);
            case 9 -> Optional.of(TRADE_REPORTING_ON_EXCHANGE);
            case 10 -> Optional.of(TRADE_REPORTING_OFF_EXCHANGE);
            case 11 -> Optional.of(TRADE_REPORTING_SYSTEMATIC_INTERNALISER);
            default -> Optional.empty();
        };
    }
}
