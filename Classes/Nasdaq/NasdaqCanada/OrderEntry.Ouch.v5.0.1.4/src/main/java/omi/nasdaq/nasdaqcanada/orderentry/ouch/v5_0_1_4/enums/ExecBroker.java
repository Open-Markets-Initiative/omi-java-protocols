package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * See Appendix F
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecBroker {

    /**
     * Unspecified
     */
    UNSPECIFIED(' ', "Unspecified"),

    /**
     * CHIX
     */
    CHIX('A', "CHIX"),

    /**
     * CX2
     */
    CX_2('B', "CX2"),

    /**
     * CXD
     */
    CXD('C', "CXD"),

    /**
     * TSX
     */
    TSX('D', "TSX"),

    /**
     * PURE
     */
    PURE('E', "PURE"),

    /**
     * ALPH
     */
    ALPH('F', "ALPH"),

    /**
     * MATCH
     */
    MATCH('G', "MATCH"),

    /**
     * OMGA
     */
    OMGA('H', "OMGA"),

    /**
     * LYNX
     */
    LYNX('I', "LYNX"),

    /**
     * AEQN
     */
    AEQN('J', "AEQN"),

    /**
     * AEQL
     */
    AEQL('K', "AEQL"),

    /**
     * CSE2
     */
    CSE_2('L', "CSE2"),

    /**
     * ALPX
     */
    ALPX('M', "ALPX"),

    /**
     * ALPD
     */
    ALPD('N', "ALPD"),

    /**
     * ICX
     */
    ICX('O', "ICX");

    private final char wire;

    private final String description;

    ExecBroker(char wire, String description) {
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
    public static Optional<ExecBroker> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(UNSPECIFIED);
            case 'A' -> Optional.of(CHIX);
            case 'B' -> Optional.of(CX_2);
            case 'C' -> Optional.of(CXD);
            case 'D' -> Optional.of(TSX);
            case 'E' -> Optional.of(PURE);
            case 'F' -> Optional.of(ALPH);
            case 'G' -> Optional.of(MATCH);
            case 'H' -> Optional.of(OMGA);
            case 'I' -> Optional.of(LYNX);
            case 'J' -> Optional.of(AEQN);
            case 'K' -> Optional.of(AEQL);
            case 'L' -> Optional.of(CSE_2);
            case 'M' -> Optional.of(ALPX);
            case 'N' -> Optional.of(ALPD);
            case 'O' -> Optional.of(ICX);
            default -> Optional.empty();
        };
    }
}
