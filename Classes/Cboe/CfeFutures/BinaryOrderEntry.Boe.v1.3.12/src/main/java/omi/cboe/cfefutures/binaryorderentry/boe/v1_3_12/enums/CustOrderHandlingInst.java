package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

import java.util.Optional;

/**
 * Defines the CustOrderHandlingInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustOrderHandlingInst {

    /**
     * Desk (high touch)
     */
    DESK('W', "Desk (high touch)"),

    /**
     * Electronic (default)
     */
    ELECTRONIC('Y', "Electronic (default)"),

    /**
     * Vendor-provided platform, billed by Executing Broker
     */
    VENDOR_PROVIDED_PLATFORM_BILLED_BY_EXECUTING_BROKER('C', "Vendor-provided platform, billed by Executing Broker"),

    /**
     * Sponsored Access via Exchange API or FIX, provided by executing broker
     */
    SPONSORED_ACCESS_VIA_EXCHANGE_API_OR_FIX_PROVIDED_BY('G', "Sponsored Access via Exchange API or FIX, provided by executing broker"),

    /**
     * Premium algorithmic trading provider, billed by executing broker
     */
    PREMIUM_ALGORITHMIC_TRADING_PROVIDER_BILLED_BY_EXECUTING('H', "Premium algorithmic trading provider, billed by executing broker"),

    /**
     * Other, including other-provided screen
     */
    OTHER_INCLUDING_OTHER_PROVIDED_SCREEN('D', "Other, including other-provided screen");

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
            case 'C' -> Optional.of(VENDOR_PROVIDED_PLATFORM_BILLED_BY_EXECUTING_BROKER);
            case 'G' -> Optional.of(SPONSORED_ACCESS_VIA_EXCHANGE_API_OR_FIX_PROVIDED_BY);
            case 'H' -> Optional.of(PREMIUM_ALGORITHMIC_TRADING_PROVIDER_BILLED_BY_EXECUTING);
            case 'D' -> Optional.of(OTHER_INCLUDING_OTHER_PROVIDED_SCREEN);
            default -> Optional.empty();
        };
    }
}
