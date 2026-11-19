package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Type sent by the venue.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum VenueType {

    /**
     * Unspecified
     */
    UNSPECIFIED((short) 0, "Unspecified"),

    /**
     * Mtf
     */
    MTF((short) 1, "Mtf"),

    /**
     * Otf
     */
    OTF((short) 2, "Otf"),

    /**
     * Regulated Market
     */
    REGULATED_MARKET((short) 3, "Regulated Market");

    private final short wire;

    private final String description;

    VenueType(short wire, String description) {
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
    public static Optional<VenueType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNSPECIFIED);
            case 1 -> Optional.of(MTF);
            case 2 -> Optional.of(OTF);
            case 3 -> Optional.of(REGULATED_MARKET);
            default -> Optional.empty();
        };
    }
}
