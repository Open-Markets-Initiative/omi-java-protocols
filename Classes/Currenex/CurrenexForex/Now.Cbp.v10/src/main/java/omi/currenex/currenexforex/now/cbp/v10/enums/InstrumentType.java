package omi.currenex.currenexforex.now.cbp.v10.enums;

import java.util.Optional;

/**
 * 1=Foreign Exchange,2=Cash Metals
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentType {

    /**
     * Foreign Exchange
     */
    FOREIGN_EXCHANGE('1', "Foreign Exchange"),

    /**
     * Cash Metals
     */
    CASH_METALS('2', "Cash Metals");

    private final char wire;

    private final String description;

    InstrumentType(char wire, String description) {
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
    public static Optional<InstrumentType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(FOREIGN_EXCHANGE);
            case '2' -> Optional.of(CASH_METALS);
            default -> Optional.empty();
        };
    }
}
