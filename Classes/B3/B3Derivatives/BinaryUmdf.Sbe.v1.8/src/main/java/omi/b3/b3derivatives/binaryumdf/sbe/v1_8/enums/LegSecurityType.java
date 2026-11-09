package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Leg's security type.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LegSecurityType {

    /**
     * Rights, etc.
     */
    CASH((short) 1, "Rights, etc."),

    /**
     * Corporate Fixed Income.
     */
    CORP((short) 2, "Corporate Fixed Income."),

    /**
     * Common Stock.
     */
    CS((short) 3, "Common Stock."),

    /**
     * Derivative Forward or 'Termo'.
     */
    DTERM((short) 4, "Derivative Forward or 'Termo'."),

    /**
     * Exchange Traded Fund.
     */
    ETF((short) 5, "Exchange Traded Fund."),

    /**
     * Future Options.
     */
    FOPT((short) 6, "Future Options."),

    /**
     * Equity Forward or 'Termo'.
     */
    FORWARD((short) 7, "Equity Forward or 'Termo'."),

    /**
     * Futures.
     */
    FUT((short) 8, "Futures."),

    /**
     * Non-Tradable index.
     */
    INDEX((short) 9, "Non-Tradable index."),

    /**
     * INDEXOPT
     */
    INDEXOPT((short) 10, "INDEXOPT"),

    /**
     * Multileg Instrument.
     */
    MLEG((short) 11, "Multileg Instrument."),

    /**
     * Option.
     */
    OPT((short) 12, "Option."),

    /**
     * Option Exercise.
     */
    OPTEXER((short) 13, "Option Exercise."),

    /**
     * Preferred Stock.
     */
    PS((short) 14, "Preferred Stock."),

    /**
     * SECLOAN
     */
    SECLOAN((short) 15, "SECLOAN"),

    /**
     * Spot Options.
     */
    SOPT((short) 16, "Spot Options."),

    /**
     * Spot Market.
     */
    SPOT((short) 17, "Spot Market.");

    private final short wire;

    private final String description;

    LegSecurityType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<LegSecurityType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CASH);
            case 2 -> Optional.of(CORP);
            case 3 -> Optional.of(CS);
            case 4 -> Optional.of(DTERM);
            case 5 -> Optional.of(ETF);
            case 6 -> Optional.of(FOPT);
            case 7 -> Optional.of(FORWARD);
            case 8 -> Optional.of(FUT);
            case 9 -> Optional.of(INDEX);
            case 10 -> Optional.of(INDEXOPT);
            case 11 -> Optional.of(MLEG);
            case 12 -> Optional.of(OPT);
            case 13 -> Optional.of(OPTEXER);
            case 14 -> Optional.of(PS);
            case 15 -> Optional.of(SECLOAN);
            case 16 -> Optional.of(SOPT);
            case 17 -> Optional.of(SPOT);
            default -> Optional.empty();
        };
    }
}
