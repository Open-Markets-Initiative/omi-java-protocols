package omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums;

import java.util.Optional;

/**
 * Indicates the reason of the summary message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Reason {

    /**
     * Start Of Day
     */
    START_OF_DAY('S', "Start Of Day"),

    /**
     * End Of Day
     */
    END_OF_DAY('E', "End Of Day"),

    /**
     * Instrument New Or Update
     */
    INSTRUMENT_NEW_OR_UPDATE('U', "Instrument New Or Update"),

    /**
     * Trade Cancellation
     */
    TRADE_CANCELLATION('C', "Trade Cancellation");

    private final char wire;

    private final String description;

    Reason(char wire, String description) {
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
    public static Optional<Reason> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(START_OF_DAY);
            case 'E' -> Optional.of(END_OF_DAY);
            case 'U' -> Optional.of(INSTRUMENT_NEW_OR_UPDATE);
            case 'C' -> Optional.of(TRADE_CANCELLATION);
            default -> Optional.empty();
        };
    }
}
