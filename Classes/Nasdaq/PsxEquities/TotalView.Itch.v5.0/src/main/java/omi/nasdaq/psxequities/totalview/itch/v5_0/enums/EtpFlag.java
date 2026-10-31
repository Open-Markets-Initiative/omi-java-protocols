package omi.nasdaq.psxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Indicates whether the security is an exchange traded product (ETP):
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EtpFlag {

    /**
     * Instrument is an ETP
     */
    ETP('Y', "Instrument is an ETP"),

    /**
     * Instrument is not an ETP
     */
    NOT_ETP('N', "Instrument is not an ETP"),

    /**
     * Not available
     */
    NA(' ', "Not available");

    private final char wire;

    private final String description;

    EtpFlag(char wire, String description) {
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
    public static Optional<EtpFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ETP);
            case 'N' -> Optional.of(NOT_ETP);
            case ' ' -> Optional.of(NA);
            default -> Optional.empty();
        };
    }
}
