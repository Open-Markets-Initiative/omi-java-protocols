package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * C = Conditional Order (CXD only); X = eXtended Firm-up Time (XFT) conditional order (CXD only)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ConditionalOrder {

    /**
     * Conditional Order (CXD only)
     */
    CONDITIONAL_ORDER('C', "Conditional Order (CXD only)"),

    /**
     * eXtended Firm-up Time (XFT) conditional order (CXD only)
     */
    EXTENDED_FIRM_UP_TIME_CONDITIONAL_ORDER('X', "eXtended Firm-up Time (XFT) conditional order (CXD only)");

    private final char wire;

    private final String description;

    ConditionalOrder(char wire, String description) {
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
    public static Optional<ConditionalOrder> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CONDITIONAL_ORDER);
            case 'X' -> Optional.of(EXTENDED_FIRM_UP_TIME_CONDITIONAL_ORDER);
            default -> Optional.empty();
        };
    }
}
