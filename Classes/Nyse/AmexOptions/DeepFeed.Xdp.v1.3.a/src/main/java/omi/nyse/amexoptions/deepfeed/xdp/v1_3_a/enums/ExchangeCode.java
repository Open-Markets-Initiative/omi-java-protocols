package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * Exchanges where it is listed
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExchangeCode {

    /**
     * NYSE
     */
    NYSE('N', "NYSE"),

    /**
     * NYSE Arca
     */
    NYSE_ARCA('P', "NYSE Arca"),

    /**
     * NASDAQ
     */
    NASDAQ('Q', "NASDAQ"),

    /**
     * NYSE MKT
     */
    NYSE_MKT('A', "NYSE MKT"),

    /**
     * GLOBAL OTC
     */
    GLOBAL_OTC('1', "GLOBAL OTC"),

    /**
     * ARCA LOCAL NON-TAPE-B INDEX
     */
    ARCA_LOCAL_NON_TAPE_B_INDEX('2', "ARCA LOCAL NON-TAPE-B INDEX");

    private final char wire;

    private final String description;

    ExchangeCode(char wire, String description) {
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
    public static Optional<ExchangeCode> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'A' -> Optional.of(NYSE_MKT);
            case '1' -> Optional.of(GLOBAL_OTC);
            case '2' -> Optional.of(ARCA_LOCAL_NON_TAPE_B_INDEX);
            default -> Optional.empty();
        };
    }
}
