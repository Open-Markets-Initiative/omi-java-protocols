package omi.cme.ebs.ilink3.sbe.v8_9.enums;

import java.util.Optional;

/**
 * A boolean value indicating if new quotes should be rejected for the sender comp for whom quotes are being cancelled on behalf; also to be used to reset such a block on mass quotes being sent by the blocked sender comp
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteEntryOpen {

    /**
     * A boolean value indicating if new quotes should be rejected for the sender comp for whom quotes are being cancelled on behalf; also to be used to reset such a block on mass quotes being sent by the blocked sender comp
     */
    NO_VALUE((short) 255, "A boolean value indicating if new quotes should be rejected for the sender comp for whom quotes are being cancelled on behalf; also to be used to reset such a block on mass quotes being sent by the blocked sender comp"),

    /**
     * False, No
     */
    FALSE((short) 0, "False, No"),

    /**
     * True, Yes
     */
    TRUE((short) 1, "True, Yes");

    private final short wire;

    private final String description;

    QuoteEntryOpen(short wire, String description) {
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
    public static Optional<QuoteEntryOpen> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(FALSE);
            case 1 -> Optional.of(TRUE);
            default -> Optional.empty();
        };
    }
}
