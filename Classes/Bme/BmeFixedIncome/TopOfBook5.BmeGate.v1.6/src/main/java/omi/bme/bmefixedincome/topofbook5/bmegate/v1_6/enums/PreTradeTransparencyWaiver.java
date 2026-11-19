package omi.bme.bmefixedincome.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Pre-trade transparency waiver
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PreTradeTransparencyWaiver {

    /**
     * Negotiated Trade Nego
     */
    NEGOTIATED_TRADE_NEGO(' ', "Negotiated Trade Nego");

    private final char wire;

    private final String description;

    PreTradeTransparencyWaiver(char wire, String description) {
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
    public static Optional<PreTradeTransparencyWaiver> fromWire(char wire) {
        return wire == ' ' ? Optional.of(NEGOTIATED_TRADE_NEGO) : Optional.empty();
    }
}
