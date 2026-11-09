package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Indicates the type of short sale. Will not be used for Buy orders but Sell orders should have this tag populated for MiFID
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ShortSaleType {

    /**
     * Indicates the type of short sale. Will not be used for Buy orders but Sell orders should have this tag populated for MiFID
     */
    NO_VALUE((short) 255, "Indicates the type of short sale. Will not be used for Buy orders but Sell orders should have this tag populated for MiFID"),

    /**
     * Long Sell
     */
    LONG_SELL((short) 0, "Long Sell"),

    /**
     * Short Sale With No Exemption SESH
     */
    SHORT_SALE_WITH_NO_EXEMPTION_SESH((short) 1, "Short Sale With No Exemption SESH"),

    /**
     * Short Sale With Exemption SSEX
     */
    SHORT_SALE_WITH_EXEMPTION_SSEX((short) 2, "Short Sale With Exemption SSEX"),

    /**
     * Undisclosed Sell Information Not Available UNDI
     */
    UNDISCLOSED_SELL_INFORMATION_NOT_AVAILABLE_UNDI((short) 3, "Undisclosed Sell Information Not Available UNDI");

    private final short wire;

    private final String description;

    ShortSaleType(short wire, String description) {
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
    public static Optional<ShortSaleType> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(LONG_SELL);
            case 1 -> Optional.of(SHORT_SALE_WITH_NO_EXEMPTION_SESH);
            case 2 -> Optional.of(SHORT_SALE_WITH_EXEMPTION_SSEX);
            case 3 -> Optional.of(UNDISCLOSED_SELL_INFORMATION_NOT_AVAILABLE_UNDI);
            default -> Optional.empty();
        };
    }
}
