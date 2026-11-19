package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Time in force for the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Day
     */
    DAY('0', "Day"),

    /**
     * Good Til Cancel Gtc
     */
    GOOD_TIL_CANCEL_GTC('1', "Good Til Cancel Gtc"),

    /**
     * At The Open Opg
     */
    AT_THE_OPEN_OPG('2', "At The Open Opg"),

    /**
     * Immediate Or Cancel Ioc
     */
    IMMEDIATE_OR_CANCEL_IOC('3', "Immediate Or Cancel Ioc"),

    /**
     * Fill Or Kill Fok
     */
    FILL_OR_KILL_FOK('4', "Fill Or Kill Fok"),

    /**
     * Good Til Date Gtd Good Til Time Gtt
     */
    GOOD_TIL_DATE_GTD_GOOD_TIL_TIME_GTT('6', "Good Til Date Gtd Good Til Time Gtt"),

    /**
     * At The Close Atc
     */
    AT_THE_CLOSE_ATC('7', "At The Close Atc"),

    /**
     * Regular Hours Only Rho
     */
    REGULAR_HOURS_ONLY_RHO('R', "Regular Hours Only Rho");

    private final char wire;

    private final String description;

    TimeInForce(char wire, String description) {
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
    public static Optional<TimeInForce> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(DAY);
            case '1' -> Optional.of(GOOD_TIL_CANCEL_GTC);
            case '2' -> Optional.of(AT_THE_OPEN_OPG);
            case '3' -> Optional.of(IMMEDIATE_OR_CANCEL_IOC);
            case '4' -> Optional.of(FILL_OR_KILL_FOK);
            case '6' -> Optional.of(GOOD_TIL_DATE_GTD_GOOD_TIL_TIME_GTT);
            case '7' -> Optional.of(AT_THE_CLOSE_ATC);
            case 'R' -> Optional.of(REGULAR_HOURS_ONLY_RHO);
            default -> Optional.empty();
        };
    }
}
