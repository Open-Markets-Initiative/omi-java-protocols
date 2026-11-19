package omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.enums;

import java.util.Optional;

/**
 * Time in force
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Early Trading Session until end of Regular Session (EDGX only effective 12/07/26: Overnight Trading Session until end of Regular Session)
     */
    DAY_DEFAULT('0', "Early Trading Session until end of Regular Session (EDGX only effective 12/07/26: Overnight Trading Session until end of Regular Session)"),

    /**
     * Gtc Allowed But Treated As Day
     */
    GTC_ALLOWED_BUT_TREATED_AS_DAY('1', "Gtc Allowed But Treated As Day"),

    /**
     * At The Open Bzx Only And Cboe Listed Securities Only
     */
    AT_THE_OPEN_BZX_ONLY_AND_CBOE_LISTED_SECURITIES_ONLY('2', "At The Open Bzx Only And Cboe Listed Securities Only"),

    /**
     * Ioc Portion Not Filled Immediately Is Cancelled
     */
    IOC_PORTION_NOT_FILLED_IMMEDIATELY_IS_CANCELLED('3', "Ioc Portion Not Filled Immediately Is Cancelled"),

    /**
     * An IOC where the entire size must be filled, else the order will be cancelled back
     */
    FOK('4', "An IOC where the entire size must be filled, else the order will be cancelled back"),

    /**
     * Early Trading Session until end of Post-Market Session (EDGX only effective 12/07/26: Overnight Trading Session until end of Post-Market Session)
     */
    GTX('5', "Early Trading Session until end of Post-Market Session (EDGX only effective 12/07/26: Overnight Trading Session until end of Post-Market Session)"),

    /**
     * Early Trading Session; expires at earlier of ExpireTime or end of Post-Market Session (EDGX only effective 12/07/26: expires at earlier of specified ExpireTime or end of Post-Market Session)
     */
    GTD('6', "Early Trading Session; expires at earlier of ExpireTime or end of Post-Market Session (EDGX only effective 12/07/26: expires at earlier of specified ExpireTime or end of Post-Market Session)"),

    /**
     * BZX only and applicable to Cboe Listed securities and Cboe Market Close symbols
     */
    AT_THE_CLOSE('7', "BZX only and applicable to Cboe Listed securities and Cboe Market Close symbols"),

    /**
     * Pre Pre Market Trading Session Until End Of Regular Session
     */
    PRE_PRE_MARKET_TRADING_SESSION_UNTIL_END_OF_REGULAR_SESSION('E', "Pre Pre Market Trading Session Until End Of Regular Session"),

    /**
     * Effective 10/09/26
     */
    RTP_REGULAR_HOURS_AND_POST_MARKET_SESSION('P', "Effective 10/09/26"),

    /**
     * Rho Regular Hours Session Only
     */
    RHO_REGULAR_HOURS_SESSION_ONLY('R', "Rho Regular Hours Session Only"),

    /**
     * Pre-Market Trading Session; expires at earlier of specified ExpireTime or end of Post-Market Session
     */
    PTD('T', "Pre-Market Trading Session; expires at earlier of specified ExpireTime or end of Post-Market Session"),

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
            case '2' -> Optional.of(AT_THE_OPEN_BZX_ONLY_AND_CBOE_LISTED_SECURITIES_ONLY);
            case '3' -> Optional.of(IOC_PORTION_NOT_FILLED_IMMEDIATELY_IS_CANCELLED);
            case '4' -> Optional.of(FOK);
            case '5' -> Optional.of(GTX);
            case '6' -> Optional.of(GTD);
            case '7' -> Optional.of(AT_THE_CLOSE);
            case 'E' -> Optional.of(PRE_PRE_MARKET_TRADING_SESSION_UNTIL_END_OF_REGULAR_SESSION);
            case 'P' -> Optional.of(RTP_REGULAR_HOURS_AND_POST_MARKET_SESSION);
            case 'R' -> Optional.of(RHO_REGULAR_HOURS_SESSION_ONLY);
            case 'T' -> Optional.of(PTD);
            case 'X' -> Optional.of(PTX_PRE_MARKET_TRADING_SESSION_UNTIL_END_OF_POST_MARKET_SESSION);
            default -> Optional.empty();
        };
    }
}
