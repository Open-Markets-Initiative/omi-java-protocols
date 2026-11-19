package omi.memx.memxequities.commonheader.tcp.v1_2.enums;

import java.util.Optional;

/**
 * The code for the rejection type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoginRejectCode {

    /**
     * Malformed Token
     */
    MALFORMED_TOKEN('T', "Malformed Token"),

    /**
     * Token type unsupported by this server
     */
    TOKEN_TYPE_UNSUPPORTED('U', "Token type unsupported by this server"),

    /**
     * Token type invalid on any server
     */
    TOKEN_TYPE_INVALID('V', "Token type invalid on any server"),

    /**
     * Authorization failed
     */
    AUTHORIZATION_FAILED('A', "Authorization failed");

    private final char wire;

    private final String description;

    LoginRejectCode(char wire, String description) {
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
    public static Optional<LoginRejectCode> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(MALFORMED_TOKEN);
            case 'U' -> Optional.of(TOKEN_TYPE_UNSUPPORTED);
            case 'V' -> Optional.of(TOKEN_TYPE_INVALID);
            case 'A' -> Optional.of(AUTHORIZATION_FAILED);
            default -> Optional.empty();
        };
    }
}
