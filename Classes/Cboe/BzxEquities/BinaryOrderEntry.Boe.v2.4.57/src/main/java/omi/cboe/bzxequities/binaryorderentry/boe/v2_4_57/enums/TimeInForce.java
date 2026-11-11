package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Defines the TimeInForce values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Day (Default) (Early Trading Session until end of Regular Session)
     */
    DAY('0', "Day (Default) (Early Trading Session until end of Regular Session)"),

    /**
     * GTC (allowed, but treated as Day)
     */
    GTC('1', "GTC (allowed, but treated as Day)"),

    /**
     * At the Open (BZX only and Cboe listed securities only)
     */
    AT_THE_OPEN('2', "At the Open (BZX only and Cboe listed securities only)"),

    /**
     * IOC (Portion not filled immediately is cancelled)
     */
    IOC('3', "IOC (Portion not filled immediately is cancelled)"),

    /**
     * FOK (an IOC where the entire size must be filled, else the order will be cancelled back)
     */
    FOK('4', "FOK (an IOC where the entire size must be filled, else the order will be cancelled back)"),

    /**
     * GTX (Early Trading Session until end of Post-Market Session)
     */
    GTX('5', "GTX (Early Trading Session until end of Post-Market Session)"),

    /**
     * GTD (Early Trading Session; expires at earlier of ExpireTime or end of Post-Market Session)
     */
    GTD('6', "GTD (Early Trading Session; expires at earlier of ExpireTime or end of Post-Market Session)"),

    /**
     * At the Close (BZX only and applicable to Cboe Listed securities and Cboe Market Close symbols
     */
    AT_THE_CLOSE('7', "At the Close (BZX only and applicable to Cboe Listed securities and Cboe Market Close symbols"),

    /**
     * PRE (Pre-Market Trading Session until end of Regular Session)
     */
    PRE('E', "PRE (Pre-Market Trading Session until end of Regular Session)"),

    /**
     * RTP (Regular Hours and Post-Market Session)(effective 10/09/26)
     */
    RTP('P', "RTP (Regular Hours and Post-Market Session)(effective 10/09/26)"),

    /**
     * RHO (Regular Hours/Session Only)
     */
    RHO('R', "RHO (Regular Hours/Session Only)"),

    /**
     * PTD (Pre-Market Trading Session; expires at earlier of specified ExpireTime or end of Post-Market Session)
     */
    PTD('T', "PTD (Pre-Market Trading Session; expires at earlier of specified ExpireTime or end of Post-Market Session)"),

    /**
     * PTX (Pre-Market Trading Session until end of Post-Market Session)
     */
    PTX('X', "PTX (Pre-Market Trading Session until end of Post-Market Session)");

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
            case '1' -> Optional.of(GTC);
            case '2' -> Optional.of(AT_THE_OPEN);
            case '3' -> Optional.of(IOC);
            case '4' -> Optional.of(FOK);
            case '5' -> Optional.of(GTX);
            case '6' -> Optional.of(GTD);
            case '7' -> Optional.of(AT_THE_CLOSE);
            case 'E' -> Optional.of(PRE);
            case 'P' -> Optional.of(RTP);
            case 'R' -> Optional.of(RHO);
            case 'T' -> Optional.of(PTD);
            case 'X' -> Optional.of(PTX);
            default -> Optional.empty();
        };
    }
}
