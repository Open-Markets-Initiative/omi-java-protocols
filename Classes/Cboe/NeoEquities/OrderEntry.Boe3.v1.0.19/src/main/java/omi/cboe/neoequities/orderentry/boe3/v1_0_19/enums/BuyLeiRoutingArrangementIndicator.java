package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * LEIRoutingArrangementIndicator for Buy side
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuyLeiRoutingArrangementIndicator {

    /**
     * No
     */
    NO('N', "No"),

    /**
     * Yes
     */
    YES('Y', "Yes");

    private final char wire;

    private final String description;

    BuyLeiRoutingArrangementIndicator(char wire, String description) {
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
    public static Optional<BuyLeiRoutingArrangementIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NO);
            case 'Y' -> Optional.of(YES);
            default -> Optional.empty();
        };
    }
}
