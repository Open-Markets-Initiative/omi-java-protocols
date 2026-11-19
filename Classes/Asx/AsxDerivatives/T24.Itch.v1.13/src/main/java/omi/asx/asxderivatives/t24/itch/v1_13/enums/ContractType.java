package omi.asx.asxderivatives.t24.itch.v1_13.enums;

import java.util.Optional;

/**
 * Indicates the type of contract.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ContractType {

    /**
     * Future or Forward contract (CFUT)
     */
    CFUT('F', "Future or Forward contract (CFUT)"),

    /**
     * Regular Option contract (COPTA)
     */
    COPTA('O', "Regular Option contract (COPTA)"),

    /**
     * Equity Option contract (EOPTA)
     */
    EOPTA('E', "Equity Option contract (EOPTA)"),

    /**
     * Single Session Option (OOPT)
     */
    OOPT('N', "Single Session Option (OOPT)"),

    /**
     * Calendar or Intra-Spread contract (CSPRD)
     */
    CSPRD('S', "Calendar or Intra-Spread contract (CSPRD)"),

    /**
     * Arbitrage or Inter-Spread contract (SPRD)
     */
    SPRD('A', "Arbitrage or Inter-Spread contract (SPRD)"),

    /**
     * Equity CFD or Share Future (SFUT)
     */
    SFUT('D', "Equity CFD or Share Future (SFUT)");

    private final char wire;

    private final String description;

    ContractType(char wire, String description) {
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
    public static Optional<ContractType> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(CFUT);
            case 'O' -> Optional.of(COPTA);
            case 'E' -> Optional.of(EOPTA);
            case 'N' -> Optional.of(OOPT);
            case 'S' -> Optional.of(CSPRD);
            case 'A' -> Optional.of(SPRD);
            case 'D' -> Optional.of(SFUT);
            default -> Optional.empty();
        };
    }
}
