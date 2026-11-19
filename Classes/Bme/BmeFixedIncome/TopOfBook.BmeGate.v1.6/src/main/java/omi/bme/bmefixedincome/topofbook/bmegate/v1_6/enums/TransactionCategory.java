package omi.bme.bmefixedincome.topofbook.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Transaction Category
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TransactionCategory {

    /**
     * Normal Category
     */
    NORMAL_CATEGORY(' ', "Normal Category"),

    /**
     * Package Trade Excluding Exchange For Physicals Tpac
     */
    PACKAGE_TRADE_EXCLUDING_EXCHANGE_FOR_PHYSICALS_TPAC('Z', "Package Trade Excluding Exchange For Physicals Tpac");

    private final char wire;

    private final String description;

    TransactionCategory(char wire, String description) {
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
    public static Optional<TransactionCategory> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NORMAL_CATEGORY);
            case 'Z' -> Optional.of(PACKAGE_TRADE_EXCLUDING_EXCHANGE_FOR_PHYSICALS_TPAC);
            default -> Optional.empty();
        };
    }
}
