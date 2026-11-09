package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * For tag 827-ExpirationCycle=2, instrument expires as indicated in market data Security Definition (tag 35-MsgType=d) repeating block: Tag 865-EventType=7 (Last Eligible Trade Date) Tag 1145-EventTime
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExpirationCycle {

    /**
     * For tag 827-ExpirationCycle=2, instrument expires as indicated in market data Security Definition (tag 35-MsgType=d) repeating block: Tag 865-EventType=7 (Last Eligible Trade Date) Tag 1145-EventTime
     */
    NO_VALUE((short) 255, "For tag 827-ExpirationCycle=2, instrument expires as indicated in market data Security Definition (tag 35-MsgType=d) repeating block: Tag 865-EventType=7 (Last Eligible Trade Date) Tag 1145-EventTime"),

    /**
     * Expire On Trading Session Close
     */
    EXPIRE_ON_TRADING_SESSION_CLOSE((short) 0, "Expire On Trading Session Close"),

    /**
     * Expiration at given date
     */
    EXPIRATIONATGIVENDATE((short) 2, "Expiration at given date");

    private final short wire;

    private final String description;

    ExpirationCycle(short wire, String description) {
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
    public static Optional<ExpirationCycle> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(EXPIRE_ON_TRADING_SESSION_CLOSE);
            case 2 -> Optional.of(EXPIRATIONATGIVENDATE);
            default -> Optional.empty();
        };
    }
}
