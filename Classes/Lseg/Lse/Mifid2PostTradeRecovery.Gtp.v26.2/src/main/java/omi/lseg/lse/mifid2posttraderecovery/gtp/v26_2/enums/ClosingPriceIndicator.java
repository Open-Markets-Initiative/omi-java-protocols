package omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Please refer to Description in Statistics Update message for valid values. This will be blank if no Closing Price is contained within the snapshot.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClosingPriceIndicator {

    /**
     * Ut
     */
    UT('A', "Ut"),

    /**
     * At
     */
    AT('B', "At"),

    /**
     * Mid Of Bbo
     */
    MID_OF_BBO('C', "Mid Of Bbo"),

    /**
     * Last At
     */
    LAST_AT('D', "Last At"),

    /**
     * Last Ut
     */
    LAST_UT('E', "Last Ut"),

    /**
     * Manual
     */
    MANUAL('F', "Manual"),

    /**
     * Previous Close
     */
    PREVIOUS_CLOSE('I', "Previous Close");

    private final char wire;

    private final String description;

    ClosingPriceIndicator(char wire, String description) {
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
    public static Optional<ClosingPriceIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(UT);
            case 'B' -> Optional.of(AT);
            case 'C' -> Optional.of(MID_OF_BBO);
            case 'D' -> Optional.of(LAST_AT);
            case 'E' -> Optional.of(LAST_UT);
            case 'F' -> Optional.of(MANUAL);
            case 'I' -> Optional.of(PREVIOUS_CLOSE);
            default -> Optional.empty();
        };
    }
}
