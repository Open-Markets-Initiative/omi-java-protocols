package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum OrderReplacedPriceSlideInstruction.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum OrderReplacedPriceSlideInstruction {

    /**
     * No Display-Price Slide instruction.
     */
    NO_PRICE_SLIDE((byte) 0, "No Display-Price Slide instruction."),

    /**
     * Single price slide applied to both locking and crossing quotations.
     */
    SINGLE_PRICE_SLIDE_ON_LOCK_AND_CROSS((byte) 1, "Single price slide applied to both locking and crossing quotations."),

    /**
     * Multiple price slides applied to both locking and crossing quotations.
     */
    MULTIPLE_PRICE_SLIDES_ON_LOCK_AND_CROSS((byte) 2, "Multiple price slides applied to both locking and crossing quotations."),

    /**
     * Single price slide applied only to locking quotations.
     */
    SINGLE_PRICE_SLIDE_LOCK_ONLY((byte) 3, "Single price slide applied only to locking quotations.");

    private final byte wire;

    private final String description;

    OrderReplacedPriceSlideInstruction(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<OrderReplacedPriceSlideInstruction> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_PRICE_SLIDE);
            case 1 -> Optional.of(SINGLE_PRICE_SLIDE_ON_LOCK_AND_CROSS);
            case 2 -> Optional.of(MULTIPLE_PRICE_SLIDES_ON_LOCK_AND_CROSS);
            case 3 -> Optional.of(SINGLE_PRICE_SLIDE_LOCK_ONLY);
            default -> Optional.empty();
        };
    }
}
