package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.enums;

import java.util.Optional;

/**
 * ‘1’ The trade was reported to Bats ‘late’, ‘2’ The trade was reported to Bats out of the Main Session, ‘3’The trade was reported to Bats late and out of the Main Session ‘-’ otherwise. NOTE:2and3are not valid values on the Trade Reporting Facility.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BatsTradeTimingIndicator {

    /**
     * The Trade Was Reported To Bats Late
     */
    THE_TRADE_WAS_REPORTED_TO_BATS_LATE('1', "The Trade Was Reported To Bats Late"),

    /**
     * The Trade Was Reported To Bats Out Of The Main Session
     */
    THE_TRADE_WAS_REPORTED_TO_BATS_OUT_OF_THE_MAIN_SESSION('2', "The Trade Was Reported To Bats Out Of The Main Session"),

    /**
     * The Trade Was Reported To Bats Late And Out Of The Main Session
     */
    THE_TRADE_WAS_REPORTED_TO_BATS_LATE_AND_OUT_OF_THE_MAIN_SESSION('3', "The Trade Was Reported To Bats Late And Out Of The Main Session"),

    /**
     * Otherwise Note 2and 3are Not Valid Values On The Trade Reporting Facility
     */
    OTHERWISE_NOTE_2_AND_3_ARE_NOT_VALID_VALUES_ON_THE_TRADE_REPORTING_FACILITY('-', "Otherwise Note 2and 3are Not Valid Values On The Trade Reporting Facility");

    private final char wire;

    private final String description;

    BatsTradeTimingIndicator(char wire, String description) {
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
    public static Optional<BatsTradeTimingIndicator> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(THE_TRADE_WAS_REPORTED_TO_BATS_LATE);
            case '2' -> Optional.of(THE_TRADE_WAS_REPORTED_TO_BATS_OUT_OF_THE_MAIN_SESSION);
            case '3' -> Optional.of(THE_TRADE_WAS_REPORTED_TO_BATS_LATE_AND_OUT_OF_THE_MAIN_SESSION);
            case '-' -> Optional.of(OTHERWISE_NOTE_2_AND_3_ARE_NOT_VALID_VALUES_ON_THE_TRADE_REPORTING_FACILITY);
            default -> Optional.empty();
        };
    }
}
