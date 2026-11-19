package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.enums;

import java.util.Optional;

/**
 * Defines the PriceFormation values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceFormation {

    /**
     * Negotiated Trade Subject to Conditions Other Than The Current Market Price (PRIC) For MMT Level 3.8 ’Contribution to Price Formation or the Price Discovery Process’, supported values are: Not specified or P = Plain-Vanilla Trade
     */
    NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE('3', "Negotiated Trade Subject to Conditions Other Than The Current Market Price (PRIC) For MMT Level 3.8 \u2019Contribution to Price Formation or the Price Discovery Process\u2019, supported values are: Not specified or P = Plain-Vanilla Trade"),

    /**
     * Non-Price Forming Trade (NPFT)
     */
    NON_PRICE_FORMING_TRADE('T', "Non-Price Forming Trade (NPFT)");

    private final char wire;

    private final String description;

    PriceFormation(char wire, String description) {
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
    public static Optional<PriceFormation> fromWire(char wire) {
        return switch (wire) {
            case '3' -> Optional.of(NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE);
            case 'T' -> Optional.of(NON_PRICE_FORMING_TRADE);
            default -> Optional.empty();
        };
    }
}
