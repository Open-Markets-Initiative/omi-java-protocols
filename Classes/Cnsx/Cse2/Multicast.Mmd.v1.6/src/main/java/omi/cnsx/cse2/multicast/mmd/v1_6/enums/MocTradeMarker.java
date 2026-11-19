package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * To indicate which trades are MOC or LOC trades. "Y" = MOC or LOC trade, "N" = Not MOC or LOC trade.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MocTradeMarker {

    /**
     * Moc Or Loc Trade
     */
    MOC_OR_LOC_TRADE('Y', "Moc Or Loc Trade"),

    /**
     * Not Moc Or Loc Trade
     */
    NOT_MOC_OR_LOC_TRADE('N', "Not Moc Or Loc Trade");

    private final char wire;

    private final String description;

    MocTradeMarker(char wire, String description) {
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
    public static Optional<MocTradeMarker> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(MOC_OR_LOC_TRADE);
            case 'N' -> Optional.of(NOT_MOC_OR_LOC_TRADE);
            default -> Optional.empty();
        };
    }
}
