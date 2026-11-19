package omi.siac.opra.output.obi.v6_1.enums;

import java.util.Optional;

/**
 * Indicates the expiration month and identifies the option as a Call or a Put.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExpirationMonth {

    /**
     * JANUARY
     */
    JANUARY_A('A', "JANUARY"),

    /**
     * JANUARY
     */
    JANUARY_M('M', "JANUARY"),

    /**
     * FEBRUARY
     */
    FEBRUARY_B('B', "FEBRUARY"),

    /**
     * FEBRUARY
     */
    FEBRUARY_N('N', "FEBRUARY"),

    /**
     * MARCH
     */
    MARCH_C('C', "MARCH"),

    /**
     * MARCH
     */
    MARCH_O('O', "MARCH"),

    /**
     * APRIL
     */
    APRIL_D('D', "APRIL"),

    /**
     * APRIL
     */
    APRIL_P('P', "APRIL"),

    /**
     * MAY
     */
    MAY_E('E', "MAY"),

    /**
     * MAY
     */
    MAY_Q('Q', "MAY"),

    /**
     * JUNE
     */
    JUNE_F('F', "JUNE"),

    /**
     * JUNE
     */
    JUNE_R('R', "JUNE"),

    /**
     * JULY
     */
    JULY_G('G', "JULY"),

    /**
     * JULY
     */
    JULY_S('S', "JULY"),

    /**
     * AUGUST
     */
    AUGUST_H('H', "AUGUST"),

    /**
     * AUGUST
     */
    AUGUST_T('T', "AUGUST"),

    /**
     * SEPTEMBER
     */
    SEPTEMBER_I('I', "SEPTEMBER"),

    /**
     * SEPTEMBER
     */
    SEPTEMBER_U('U', "SEPTEMBER"),

    /**
     * OCTOBER
     */
    OCTOBER_J('J', "OCTOBER"),

    /**
     * OCTOBER
     */
    OCTOBER_V('V', "OCTOBER"),

    /**
     * NOVEMBER
     */
    NOVEMBER_K('K', "NOVEMBER"),

    /**
     * NOVEMBER
     */
    NOVEMBER_W('W', "NOVEMBER"),

    /**
     * DECEMBER
     */
    DECEMBER_L('L', "DECEMBER"),

    /**
     * DECEMBER
     */
    DECEMBER_X('X', "DECEMBER");

    private final char wire;

    private final String description;

    ExpirationMonth(char wire, String description) {
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
    public static Optional<ExpirationMonth> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(JANUARY_A);
            case 'M' -> Optional.of(JANUARY_M);
            case 'B' -> Optional.of(FEBRUARY_B);
            case 'N' -> Optional.of(FEBRUARY_N);
            case 'C' -> Optional.of(MARCH_C);
            case 'O' -> Optional.of(MARCH_O);
            case 'D' -> Optional.of(APRIL_D);
            case 'P' -> Optional.of(APRIL_P);
            case 'E' -> Optional.of(MAY_E);
            case 'Q' -> Optional.of(MAY_Q);
            case 'F' -> Optional.of(JUNE_F);
            case 'R' -> Optional.of(JUNE_R);
            case 'G' -> Optional.of(JULY_G);
            case 'S' -> Optional.of(JULY_S);
            case 'H' -> Optional.of(AUGUST_H);
            case 'T' -> Optional.of(AUGUST_T);
            case 'I' -> Optional.of(SEPTEMBER_I);
            case 'U' -> Optional.of(SEPTEMBER_U);
            case 'J' -> Optional.of(OCTOBER_J);
            case 'V' -> Optional.of(OCTOBER_V);
            case 'K' -> Optional.of(NOVEMBER_K);
            case 'W' -> Optional.of(NOVEMBER_W);
            case 'L' -> Optional.of(DECEMBER_L);
            case 'X' -> Optional.of(DECEMBER_X);
            default -> Optional.empty();
        };
    }
}
