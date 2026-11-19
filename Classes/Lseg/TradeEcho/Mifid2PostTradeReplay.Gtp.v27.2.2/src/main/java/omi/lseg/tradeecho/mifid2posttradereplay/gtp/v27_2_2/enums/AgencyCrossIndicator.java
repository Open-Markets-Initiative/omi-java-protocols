package omi.lseg.tradeecho.mifid2posttradereplay.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Agency cross indicator short code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AgencyCrossIndicator {

    /**
     * Agency Cross Trade
     */
    AGENCY_CROSS_TRADE('X', "Agency Cross Trade"),

    /**
     * Matched Principal Trade
     */
    MATCHED_PRINCIPAL_TRADE('M', "Matched Principal Trade"),

    /**
     * No Agency Cross Trade
     */
    NO_AGENCY_CROSS_TRADE('-', "No Agency Cross Trade");

    private final char wire;

    private final String description;

    AgencyCrossIndicator(char wire, String description) {
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
    public static Optional<AgencyCrossIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'X' -> Optional.of(AGENCY_CROSS_TRADE);
            case 'M' -> Optional.of(MATCHED_PRINCIPAL_TRADE);
            case '-' -> Optional.of(NO_AGENCY_CROSS_TRADE);
            default -> Optional.empty();
        };
    }
}
