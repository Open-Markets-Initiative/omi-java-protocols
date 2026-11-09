package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * Current disclosure status of the issuer.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DisclosureStatus {

    /**
     * No disclosure status
     */
    NO_DISCLOSURE((short) 0, "No disclosure status"),

    /**
     * Current information
     */
    CURRENT_INFORMATION((short) 2, "Current information"),

    /**
     * Limited information
     */
    LIMITED_INFORMATION((short) 3, "Limited information"),

    /**
     * No information
     */
    NO_INFORMATION((short) 4, "No information");

    private final short wire;

    private final String description;

    DisclosureStatus(short wire, String description) {
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
    public static Optional<DisclosureStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_DISCLOSURE);
            case 2 -> Optional.of(CURRENT_INFORMATION);
            case 3 -> Optional.of(LIMITED_INFORMATION);
            case 4 -> Optional.of(NO_INFORMATION);
            default -> Optional.empty();
        };
    }
}
