package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Indicates the type of Quote Request
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteRequestType {

    /**
     * Manual Named If Any Market Maker I Ds Are Specified Else Anonymous
     */
    MANUAL_NAMED_IF_ANY_MARKET_MAKER_I_DS_ARE_SPECIFIED_ELSE_ANONYMOUS((short) 0, "Manual Named If Any Market Maker I Ds Are Specified Else Anonymous"),

    /**
     * Automatic Named If Any Market Maker I Ds Are Specified Else Anonymous
     */
    AUTOMATIC_NAMED_IF_ANY_MARKET_MAKER_I_DS_ARE_SPECIFIED_ELSE_ANONYMOUS((short) 1, "Automatic Named If Any Market Maker I Ds Are Specified Else Anonymous"),

    /**
     * Manual Named
     */
    MANUAL_NAMED((short) 2, "Manual Named"),

    /**
     * Manual Anonymous
     */
    MANUAL_ANONYMOUS((short) 3, "Manual Anonymous"),

    /**
     * Automatic Named
     */
    AUTOMATIC_NAMED((short) 4, "Automatic Named"),

    /**
     * Automatic Anonymous
     */
    AUTOMATIC_ANONYMOUS((short) 5, "Automatic Anonymous");

    private final short wire;

    private final String description;

    QuoteRequestType(short wire, String description) {
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
    public static Optional<QuoteRequestType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(MANUAL_NAMED_IF_ANY_MARKET_MAKER_I_DS_ARE_SPECIFIED_ELSE_ANONYMOUS);
            case 1 -> Optional.of(AUTOMATIC_NAMED_IF_ANY_MARKET_MAKER_I_DS_ARE_SPECIFIED_ELSE_ANONYMOUS);
            case 2 -> Optional.of(MANUAL_NAMED);
            case 3 -> Optional.of(MANUAL_ANONYMOUS);
            case 4 -> Optional.of(AUTOMATIC_NAMED);
            case 5 -> Optional.of(AUTOMATIC_ANONYMOUS);
            default -> Optional.empty();
        };
    }
}
