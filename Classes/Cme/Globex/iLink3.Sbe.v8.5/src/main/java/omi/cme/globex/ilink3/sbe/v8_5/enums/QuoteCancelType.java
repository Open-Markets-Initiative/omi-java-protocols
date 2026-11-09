package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Identifies the type of Quote Cancel. A working quote can be cancelled by providing either it's instrument, instrument group or by cancelling all.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteCancelType {

    /**
     * Cancel per Instrument
     */
    CANCELPER_INSTRUMENT((short) 1, "Cancel per Instrument"),

    /**
     * Cancel per Instrument group
     */
    CANCELPER_INSTRUMENTGROUP((short) 3, "Cancel per Instrument group"),

    /**
     * Cancel all quotes
     */
    CANCELALLQUOTES((short) 4, "Cancel all quotes"),

    /**
     * Cancel per Quote Set
     */
    CANCELPER_QUOTE_SET((short) 100, "Cancel per Quote Set");

    private final short wire;

    private final String description;

    QuoteCancelType(short wire, String description) {
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
    public static Optional<QuoteCancelType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CANCELPER_INSTRUMENT);
            case 3 -> Optional.of(CANCELPER_INSTRUMENTGROUP);
            case 4 -> Optional.of(CANCELALLQUOTES);
            case 100 -> Optional.of(CANCELPER_QUOTE_SET);
            default -> Optional.empty();
        };
    }
}
