package omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Venue from which market data is received for the instrument
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum SourceVenue {

    /**
     * Trade Echo
     */
    TRADE_ECHO(11, "Trade Echo");

    private final int wire;

    private final String description;

    SourceVenue(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<SourceVenue> fromWire(int wire) {
        return wire == 11 ? Optional.of(TRADE_ECHO) : Optional.empty();
    }
}
