package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Execution source code provided during order entry to describe broker service
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustOrderHandlingInst {

    /**
     * high touch
     */
    DESK('W', "high touch"),

    /**
     * Electronic
     */
    ELECTRONIC('Y', "Electronic"),

    /**
     * Vendor Provided Platform Billed By
     */
    VENDOR_PROVIDED_PLATFORM_BILLED_BY('C', "Vendor Provided Platform Billed By"),

    /**
     * Sponsored Access Via Exchange Api
     */
    SPONSORED_ACCESS_VIA_EXCHANGE_API('G', "Sponsored Access Via Exchange Api"),

    /**
     * Premium Algorithmic Trading
     */
    PREMIUM_ALGORITHMIC_TRADING('H', "Premium Algorithmic Trading"),

    /**
     * Other
     */
    OTHER('D', "Other"),

    /**
     * NULL (0x00), Apply Default
     */
    APPLY_DEFAULT('0', "NULL (0x00), Apply Default");

    private final char wire;

    private final String description;

    CustOrderHandlingInst(char wire, String description) {
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
    public static Optional<CustOrderHandlingInst> fromWire(char wire) {
        return switch (wire) {
            case 'W' -> Optional.of(DESK);
            case 'Y' -> Optional.of(ELECTRONIC);
            case 'C' -> Optional.of(VENDOR_PROVIDED_PLATFORM_BILLED_BY);
            case 'G' -> Optional.of(SPONSORED_ACCESS_VIA_EXCHANGE_API);
            case 'H' -> Optional.of(PREMIUM_ALGORITHMIC_TRADING);
            case 'D' -> Optional.of(OTHER);
            case '0' -> Optional.of(APPLY_DEFAULT);
            default -> Optional.empty();
        };
    }
}
