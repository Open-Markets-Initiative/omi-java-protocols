package omi.euronext.optiq.dropcopygateway.sbe.v6_69.enums;

import java.util.Optional;

/**
 * imbalanceQtySide
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ImbalanceQtySide {

    /**
     * No_imbalance
     */
    NOIMBALANCE((short) 0, "No_imbalance"),

    /**
     * Buy
     */
    BUY((short) 1, "Buy"),

    /**
     * Sell
     */
    SELL((short) 2, "Sell"),

    /**
     * imbalanceQtySide
     */
    NO_VALUE((short) 255, "imbalanceQtySide");

    private final short wire;

    private final String description;

    ImbalanceQtySide(short wire, String description) {
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
    public static Optional<ImbalanceQtySide> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOIMBALANCE);
            case 1 -> Optional.of(BUY);
            case 2 -> Optional.of(SELL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
