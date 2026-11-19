package omi.lseg.turquoise.mifid2posttrade.gtp.v26_3.enums;

import java.util.Optional;

/**
 * Negotiation Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NegotiationIndicator {

    /**
     * Negotiated Trade With Pre Trade Transparency Waiver
     */
    NEGOTIATED_TRADE_WITH_PRE_TRADE_TRANSPARENCY_WAIVER('8', "Negotiated Trade With Pre Trade Transparency Waiver"),

    /**
     * Not A Negotiated Trade
     */
    NOT_A_NEGOTIATED_TRADE('-', "Not A Negotiated Trade");

    private final char wire;

    private final String description;

    NegotiationIndicator(char wire, String description) {
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
    public static Optional<NegotiationIndicator> fromWire(char wire) {
        return switch (wire) {
            case '8' -> Optional.of(NEGOTIATED_TRADE_WITH_PRE_TRADE_TRANSPARENCY_WAIVER);
            case '-' -> Optional.of(NOT_A_NEGOTIATED_TRADE);
            default -> Optional.empty();
        };
    }
}
