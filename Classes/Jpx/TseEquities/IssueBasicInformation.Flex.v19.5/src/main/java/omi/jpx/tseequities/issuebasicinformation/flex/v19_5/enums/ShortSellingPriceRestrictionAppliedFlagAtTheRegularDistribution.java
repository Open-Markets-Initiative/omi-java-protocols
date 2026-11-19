package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the issue that applied the Short Selling Price Restriction at the regular distribution on the applicable business day.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution {

    /**
     * The Issue That Short Selling Regulation Is Applied
     */
    THE_ISSUE_THAT_SHORT_SELLING_REGULATION_IS_APPLIED('1', "The Issue That Short Selling Regulation Is Applied"),

    /**
     * The issue that Short Selling Regulation is NOT applied.
     */
    OTHER_THAN_THE_ABOVE(' ', "The issue that Short Selling Regulation is NOT applied.");

    private final char wire;

    private final String description;

    ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution(char wire, String description) {
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
    public static Optional<ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(THE_ISSUE_THAT_SHORT_SELLING_REGULATION_IS_APPLIED);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
