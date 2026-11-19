package omi.euronext.optiq.dropcopygateway.sbe.v5_56.enums;

import java.util.Optional;

/**
 * marginTradingFlag
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarginTradingFlag {

    /**
     * False
     */
    FALSE((short) 0, "False"),

    /**
     * True
     */
    TRUE((short) 1, "True"),

    /**
     * marginTradingFlag
     */
    NO_VALUE((short) 255, "marginTradingFlag");

    private final short wire;

    private final String description;

    MarginTradingFlag(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MarginTradingFlag> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FALSE);
            case 1 -> Optional.of(TRUE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
