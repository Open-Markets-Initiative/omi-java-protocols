package omi.cboe.bzxoptions.multicasttop.pitch.v1_2_64.enums;

import java.util.Optional;

/**
 * O = Would open, Q = Need quote to open, B = Need more buyers (C1 Only), S = Need more sellers (C1 Only), C = Crossed Composite Market.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpeningCondition {

    /**
     * Would Open
     */
    WOULD_OPEN('O', "Would Open"),

    /**
     * Need Quote To Open
     */
    NEED_QUOTE_TO_OPEN('Q', "Need Quote To Open"),

    /**
     * Need More Buyers
     */
    NEED_MORE_BUYERS('B', "Need More Buyers"),

    /**
     * Need More Sellers
     */
    NEED_MORE_SELLERS('S', "Need More Sellers"),

    /**
     * Crossed Composite Market
     */
    CROSSED_COMPOSITE_MARKET('C', "Crossed Composite Market");

    private final char wire;

    private final String description;

    OpeningCondition(char wire, String description) {
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
    public static Optional<OpeningCondition> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(WOULD_OPEN);
            case 'Q' -> Optional.of(NEED_QUOTE_TO_OPEN);
            case 'B' -> Optional.of(NEED_MORE_BUYERS);
            case 'S' -> Optional.of(NEED_MORE_SELLERS);
            case 'C' -> Optional.of(CROSSED_COMPOSITE_MARKET);
            default -> Optional.empty();
        };
    }
}
