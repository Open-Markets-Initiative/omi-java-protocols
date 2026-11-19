package omi.otcmarkets.moonats.retransmission.link.v1_3.enums;

import java.util.Optional;

/**
 * Indicates if any MOC shares are left unmatched.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MocSharesUnmatched {

    /**
     * Buy MOC shares not matched.
     */
    BUY_MOC_NOT_MATCHED('B', "Buy MOC shares not matched."),

    /**
     * Sell MOC shares not matched.
     */
    SELL_MOC_NOT_MATCHED('S', "Sell MOC shares not matched."),

    /**
     * no MOC shares not matched.
     */
    NO_MOC_UNMATCHED('O', "no MOC shares not matched.");

    private final char wire;

    private final String description;

    MocSharesUnmatched(char wire, String description) {
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
    public static Optional<MocSharesUnmatched> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY_MOC_NOT_MATCHED);
            case 'S' -> Optional.of(SELL_MOC_NOT_MATCHED);
            case 'O' -> Optional.of(NO_MOC_UNMATCHED);
            default -> Optional.empty();
        };
    }
}
