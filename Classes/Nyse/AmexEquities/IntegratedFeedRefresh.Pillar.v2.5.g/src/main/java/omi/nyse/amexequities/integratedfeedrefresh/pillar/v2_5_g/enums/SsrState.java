package omi.nyse.amexequities.integratedfeedrefresh.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * The current SSR state, which this msg updates if the Security Status field contains an SSR Code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SsrState {

    /**
     * No Short Sale Restriction In Effect
     */
    NO_SHORT_SALE_RESTRICTION_IN_EFFECT('~', "No Short Sale Restriction In Effect"),

    /**
     * Short Sale Restriction In Effect
     */
    SHORT_SALE_RESTRICTION_IN_EFFECT('E', "Short Sale Restriction In Effect");

    private final char wire;

    private final String description;

    SsrState(char wire, String description) {
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
    public static Optional<SsrState> fromWire(char wire) {
        return switch (wire) {
            case '~' -> Optional.of(NO_SHORT_SALE_RESTRICTION_IN_EFFECT);
            case 'E' -> Optional.of(SHORT_SALE_RESTRICTION_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
