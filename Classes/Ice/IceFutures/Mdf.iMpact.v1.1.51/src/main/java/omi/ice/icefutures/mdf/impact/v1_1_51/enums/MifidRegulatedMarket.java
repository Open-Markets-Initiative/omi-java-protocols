package omi.ice.icefutures.mdf.impact.v1_1_51.enums;

import java.util.Optional;

/**
 * Indicates MIFID-II market. ‘Y’ or ‘N’
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MifidRegulatedMarket {

    /**
     * Mifid Regulated Market
     */
    YES('Y', "Mifid Regulated Market"),

    /**
     * Not Mifid Regulated Market
     */
    NO('N', "Not Mifid Regulated Market");

    private final char wire;

    private final String description;

    MifidRegulatedMarket(char wire, String description) {
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
    public static Optional<MifidRegulatedMarket> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
