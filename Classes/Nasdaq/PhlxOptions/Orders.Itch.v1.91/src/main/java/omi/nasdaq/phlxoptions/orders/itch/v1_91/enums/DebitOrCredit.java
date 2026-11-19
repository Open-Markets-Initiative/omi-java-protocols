package omi.nasdaq.phlxoptions.orders.itch.v1_91.enums;

import java.util.Optional;

/**
 * Price Debit or Credit value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DebitOrCredit {

    /**
     * Net Debit
     */
    NET_DEBIT('D', "Net Debit"),

    /**
     * Net Credit
     */
    NET_CREDIT('C', "Net Credit"),

    /**
     * Even (or Market Order)
     */
    EVEN_OR_MARKET_ORDER(' ', "Even (or Market Order)"),

    /**
     * Anonymous
     */
    ANONYMOUS('*', "Anonymous");

    private final char wire;

    private final String description;

    DebitOrCredit(char wire, String description) {
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
    public static Optional<DebitOrCredit> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(NET_DEBIT);
            case 'C' -> Optional.of(NET_CREDIT);
            case ' ' -> Optional.of(EVEN_OR_MARKET_ORDER);
            case '*' -> Optional.of(ANONYMOUS);
            default -> Optional.empty();
        };
    }
}
