package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * UMIRAccountType for Buy side
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuyUmirAccountType {

    /**
     * Inventory
     */
    INVENTORY('I', "Inventory"),

    /**
     * Non Client
     */
    NON_CLIENT('N', "Non Client"),

    /**
     * Client
     */
    CLIENT('C', "Client"),

    /**
     * Specialist
     */
    SPECIALIST('S', "Specialist"),

    /**
     * Options Firm Account
     */
    OPTIONS_FIRM_ACCOUNT('F', "Options Firm Account"),

    /**
     * Options Market Maker
     */
    OPTIONS_MARKET_MAKER('M', "Options Market Maker"),

    /**
     * Bundled
     */
    BUNDLED('B', "Bundled"),

    /**
     * Multi Client
     */
    MULTI_CLIENT('X', "Multi Client");

    private final char wire;

    private final String description;

    BuyUmirAccountType(char wire, String description) {
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
    public static Optional<BuyUmirAccountType> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(INVENTORY);
            case 'N' -> Optional.of(NON_CLIENT);
            case 'C' -> Optional.of(CLIENT);
            case 'S' -> Optional.of(SPECIALIST);
            case 'F' -> Optional.of(OPTIONS_FIRM_ACCOUNT);
            case 'M' -> Optional.of(OPTIONS_MARKET_MAKER);
            case 'B' -> Optional.of(BUNDLED);
            case 'X' -> Optional.of(MULTI_CLIENT);
            default -> Optional.empty();
        };
    }
}
