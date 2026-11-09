package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * In the Short Trade format, identifies the Sale Condition Category level associated with a trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SaleConditionCategory {

    /**
     * Sale Condition Category Not Applicable
     */
    SALE_CONDITION_CATEGORY_NOT_APPLICABLE(' ', "Sale Condition Category Not Applicable"),

    /**
     * Sale Condition Category 1
     */
    SALE_CONDITION_CATEGORY_1('1', "Sale Condition Category 1"),

    /**
     * Sale Condition Category 2
     */
    SALE_CONDITION_CATEGORY_2('2', "Sale Condition Category 2"),

    /**
     * Sale Condition Category 3
     */
    SALE_CONDITION_CATEGORY_3('3', "Sale Condition Category 3"),

    /**
     * Sale Condition Category 4
     */
    SALE_CONDITION_CATEGORY_4('4', "Sale Condition Category 4");

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
            case ' ' -> Optional.of(SALE_CONDITION_CATEGORY_NOT_APPLICABLE);
            case '1' -> Optional.of(SALE_CONDITION_CATEGORY_1);
            case '2' -> Optional.of(SALE_CONDITION_CATEGORY_2);
            case '3' -> Optional.of(SALE_CONDITION_CATEGORY_3);
            case '4' -> Optional.of(SALE_CONDITION_CATEGORY_4);
            default -> Optional.empty();
        };
    }
}
