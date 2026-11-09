package omi.jpx.osederivatives.geniuminet.itch.v5_0_6.enums;

import java.util.Optional;

/**
 * Y=Yes, N=No
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OccurredAtCross {

    /**
     * Trade occurred at continuous market
     */
    NO('N', "Trade occurred at continuous market"),

    /**
     * Trade occurred at the cross
     */
    YES('Y', "Trade occurred at the cross");

    private final char wire;

    private final String description;

    OccurredAtCross(char wire, String description) {
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
    public static Optional<OccurredAtCross> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NO);
            case 'Y' -> Optional.of(YES);
            default -> Optional.empty();
        };
    }
}
