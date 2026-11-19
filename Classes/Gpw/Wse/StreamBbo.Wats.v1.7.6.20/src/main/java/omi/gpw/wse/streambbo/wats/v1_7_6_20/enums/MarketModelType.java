package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Market model type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarketModelType {

    /**
     * Not applicable
     */
    NOT_APPLICABLE((short) 1, "Not applicable"),

    /**
     * A Central Limit Order Book (CLOB)
     */
    CLOB((short) 2, "A Central Limit Order Book (CLOB)"),

    /**
     * BLOCK
     */
    BLOCK((short) 3, "BLOCK"),

    /**
     * HYBRID market model
     */
    HYBRID((short) 4, "HYBRID market model"),

    /**
     * CROSS
     */
    CROSS((short) 5, "CROSS"),

    /**
     * Initial public offering
     */
    IPO((short) 6, "Initial public offering"),

    /**
     * Tender offer
     */
    TENDER_OFFER((short) 7, "Tender offer"),

    /**
     * Redistribution
     */
    REDISTRIBUTION((short) 8, "Redistribution");

    private final short wire;

    private final String description;

    MarketModelType(short wire, String description) {
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
    public static Optional<MarketModelType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOT_APPLICABLE);
            case 2 -> Optional.of(CLOB);
            case 3 -> Optional.of(BLOCK);
            case 4 -> Optional.of(HYBRID);
            case 5 -> Optional.of(CROSS);
            case 6 -> Optional.of(IPO);
            case 7 -> Optional.of(TENDER_OFFER);
            case 8 -> Optional.of(REDISTRIBUTION);
            default -> Optional.empty();
        };
    }
}
