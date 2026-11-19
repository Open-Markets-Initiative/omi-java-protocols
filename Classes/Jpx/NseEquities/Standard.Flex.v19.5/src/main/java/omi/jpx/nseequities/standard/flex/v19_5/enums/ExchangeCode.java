package omi.jpx.nseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Exchange the information belongs to. This section is a space in Control Message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExchangeCode {

    /**
     * Tokyo Stock Exchange
     */
    TOKYO_STOCK_EXCHANGE('1', "Tokyo Stock Exchange"),

    /**
     * Nagoya Stock Exchange
     */
    NAGOYA_STOCK_EXCHANGE('3', "Nagoya Stock Exchange"),

    /**
     * Fukuoka Stock Exchange
     */
    FUKUOKA_STOCK_EXCHANGE('6', "Fukuoka Stock Exchange"),

    /**
     * Sapporo Securities Exchange
     */
    SAPPORO_SECURITIES_EXCHANGE('8', "Sapporo Securities Exchange"),

    /**
     * Do not use for the time being
     */
    OTHER('0', "Do not use for the time being"),

    /**
     * This section is a space in Control Message
     */
    CONTROL_MESSAGE(' ', "This section is a space in Control Message");

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
            case '1' -> Optional.of(TOKYO_STOCK_EXCHANGE);
            case '3' -> Optional.of(NAGOYA_STOCK_EXCHANGE);
            case '6' -> Optional.of(FUKUOKA_STOCK_EXCHANGE);
            case '8' -> Optional.of(SAPPORO_SECURITIES_EXCHANGE);
            case '0' -> Optional.of(OTHER);
            case ' ' -> Optional.of(CONTROL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
