package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Identifies the Sale Condition Category level associated with a trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SaleConditionCategory {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Settlement Type
     */
    CATEGORY_1('1', "Settlement Type"),

    /**
     * Trade Through Exempt Reason
     */
    CATEGORY_2('2', "Trade Through Exempt Reason"),

    /**
     * Extended Hours Or Sequence Type
     */
    CATEGORY_3('3', "Extended Hours Or Sequence Type"),

    /**
     * SRO Trade Detail
     */
    CATEGORY_4('4', "SRO Trade Detail");

    private final char wire;

    private final String description;

    SaleConditionCategory(char wire, String description) {
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
    public static Optional<SaleConditionCategory> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case '1' -> Optional.of(CATEGORY_1);
            case '2' -> Optional.of(CATEGORY_2);
            case '3' -> Optional.of(CATEGORY_3);
            case '4' -> Optional.of(CATEGORY_4);
            default -> Optional.empty();
        };
    }
}
