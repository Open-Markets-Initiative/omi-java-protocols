package omi.ice.icefutures.mdf.impact.v1_1_24.enums;

import java.util.Optional;

/**
 * Legacy field that supports all single character trade types on ICE. The new 3-character “OffMarketTradeType” field replaces this field. In the future (no earlier than 2015), ICE anticipates the introduction of 3 character trade types that will only be available in the new field. Trade types that are longer than a single character will be represented with “#” in this field.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OffMarketTradeIndicator {

    /**
     * Regular
     */
    REGULAR(' ', "Regular"),

    /**
     * Block
     */
    BLOCK('K', "Block"),

    /**
     * Efs
     */
    EFS('S', "Efs"),

    /**
     * Efp
     */
    EFP('E', "Efp"),

    /**
     * Efp Efs
     */
    EFP_EFS('O', "Efp Efs"),

    /**
     * Eoo
     */
    EOO('Q', "Eoo"),

    /**
     * Efm
     */
    EFM('I', "Efm"),

    /**
     * Guaranteed Cross
     */
    GUARANTEED_CROSS('5', "Guaranteed Cross"),

    /**
     * Basis
     */
    BASIS('4', "Basis");

    private final char wire;

    private final String description;

    OffMarketTradeIndicator(char wire, String description) {
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
    public static Optional<OffMarketTradeIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR);
            case 'K' -> Optional.of(BLOCK);
            case 'S' -> Optional.of(EFS);
            case 'E' -> Optional.of(EFP);
            case 'O' -> Optional.of(EFP_EFS);
            case 'Q' -> Optional.of(EOO);
            case 'I' -> Optional.of(EFM);
            case '5' -> Optional.of(GUARANTEED_CROSS);
            case '4' -> Optional.of(BASIS);
            default -> Optional.empty();
        };
    }
}
