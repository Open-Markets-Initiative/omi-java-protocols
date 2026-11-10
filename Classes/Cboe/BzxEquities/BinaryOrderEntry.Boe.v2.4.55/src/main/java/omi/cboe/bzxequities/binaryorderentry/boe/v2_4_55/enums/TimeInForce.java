package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.enums;

import java.util.Optional;

/**
 * Defines the TimeInForce values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Day Default
     */
    DAY_DEFAULT('0', "Day Default"),

    /**
     * Gtc Allowed But Treated As Day
     */
    GTC_ALLOWED_BUT_TREATED_AS_DAY('1', "Gtc Allowed But Treated As Day"),

    /**
     * At The Open Bzx Only
     */
    AT_THE_OPEN_BZX_ONLY('2', "At The Open Bzx Only"),

    /**
     * Ioc
     */
    IOC('3', "Ioc"),

    /**
     * Fok
     */
    FOK('4', "Fok"),

    /**
     * Gtx Early Trading Session Until End Of Post Market Session
     */
    GTX_EARLY_TRADING_SESSION_UNTIL_END_OF_POST_MARKET_SESSION('5', "Gtx Early Trading Session Until End Of Post Market Session"),

    /**
     * Gtd
     */
    GTD('6', "Gtd"),

    /**
     * At The Close Bzx Only
     */
    AT_THE_CLOSE_BZX_ONLY('7', "At The Close Bzx Only"),

    /**
     * Pre Pre Market Trading Session Until End Of Regular Session
     */
    PRE_PRE_MARKET_TRADING_SESSION_UNTIL_END_OF_REGULAR_SESSION('E', "Pre Pre Market Trading Session Until End Of Regular Session"),

    /**
     * Rho Regular Hours Session Only
     */
    RHO_REGULAR_HOURS_SESSION_ONLY('R', "Rho Regular Hours Session Only"),

    /**
     * Ptd Pre Market Trading Session Expires At Earlier Of Expire Time Or End Of Post Market Session
     */
    PTD_PRE_MARKET_TRADING_SESSION_EXPIRES_AT_EARLIER_OF_EXPIRE_TIME_OR_END_OF_POST_MARKET_SESSION('T', "Ptd Pre Market Trading Session Expires At Earlier Of Expire Time Or End Of Post Market Session"),

    /**
     * Ptx Pre Market Trading Session Until End Of Post Market Session
     */
    PTX_PRE_MARKET_TRADING_SESSION_UNTIL_END_OF_POST_MARKET_SESSION('X', "Ptx Pre Market Trading Session Until End Of Post Market Session");

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
            case '0' -> Optional.of(DAY_DEFAULT);
            case '1' -> Optional.of(GTC_ALLOWED_BUT_TREATED_AS_DAY);
            case '2' -> Optional.of(AT_THE_OPEN_BZX_ONLY);
            case '3' -> Optional.of(IOC);
            case '4' -> Optional.of(FOK);
            case '5' -> Optional.of(GTX_EARLY_TRADING_SESSION_UNTIL_END_OF_POST_MARKET_SESSION);
            case '6' -> Optional.of(GTD);
            case '7' -> Optional.of(AT_THE_CLOSE_BZX_ONLY);
            case 'E' -> Optional.of(PRE_PRE_MARKET_TRADING_SESSION_UNTIL_END_OF_REGULAR_SESSION);
            case 'R' -> Optional.of(RHO_REGULAR_HOURS_SESSION_ONLY);
            case 'T' -> Optional.of(PTD_PRE_MARKET_TRADING_SESSION_EXPIRES_AT_EARLIER_OF_EXPIRE_TIME_OR_END_OF_POST_MARKET_SESSION);
            case 'X' -> Optional.of(PTX_PRE_MARKET_TRADING_SESSION_UNTIL_END_OF_POST_MARKET_SESSION);
            default -> Optional.empty();
        };
    }
}
