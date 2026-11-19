package omi.siac.opra.input.obi.v5_0_i.enums;

import java.util.Optional;

/**
 * Equity And Index Last Sale message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EquityAndIndexLastSaleMessageType {

    /**
     * Canc
     */
    CANC('A', "Canc"),

    /**
     * Oseq
     */
    OSEQ('B', "Oseq"),

    /**
     * Cncl
     */
    CNCL('C', "Cncl"),

    /**
     * Late
     */
    LATE('D', "Late"),

    /**
     * Cnco
     */
    CNCO('E', "Cnco"),

    /**
     * Open
     */
    OPEN('F', "Open"),

    /**
     * Cnol
     */
    CNOL('G', "Cnol"),

    /**
     * Opnl
     */
    OPNL('H', "Opnl"),

    /**
     * Auto
     */
    AUTO('I', "Auto"),

    /**
     * Reop
     */
    REOP('J', "Reop"),

    /**
     * Isoi
     */
    ISOI('S', "Isoi"),

    /**
     * Slan
     */
    SLAN('a', "Slan"),

    /**
     * Slai
     */
    SLAI('b', "Slai"),

    /**
     * Slcn
     */
    SLCN('c', "Slcn"),

    /**
     * Scli
     */
    SCLI('d', "Scli"),

    /**
     * Slft
     */
    SLFT('e', "Slft"),

    /**
     * Mlet
     */
    MLET('f', "Mlet"),

    /**
     * Mlat
     */
    MLAT('g', "Mlat"),

    /**
     * Mlct
     */
    MLCT('h', "Mlct"),

    /**
     * Mlft
     */
    MLFT('i', "Mlft"),

    /**
     * Mesl
     */
    MESL('j', "Mesl"),

    /**
     * Tlat
     */
    TLAT('k', "Tlat"),

    /**
     * Masl
     */
    MASL('l', "Masl"),

    /**
     * Mfsl
     */
    MFSL('m', "Mfsl"),

    /**
     * Tlet
     */
    TLET('n', "Tlet"),

    /**
     * Tlct
     */
    TLCT('o', "Tlct"),

    /**
     * Tlft
     */
    TLFT('p', "Tlft"),

    /**
     * Tesl
     */
    TESL('q', "Tesl"),

    /**
     * Tasl
     */
    TASL('r', "Tasl"),

    /**
     * Tfsl
     */
    TFSL('s', "Tfsl"),

    /**
     * Cbmo
     */
    CBMO('t', "Cbmo"),

    /**
     * Mctp
     */
    MCTP('u', "Mctp"),

    /**
     * Exht
     */
    EXHT('v', "Exht");

    private final char wire;

    private final String description;

    EquityAndIndexLastSaleMessageType(char wire, String description) {
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
    public static Optional<EquityAndIndexLastSaleMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(CANC);
            case 'B' -> Optional.of(OSEQ);
            case 'C' -> Optional.of(CNCL);
            case 'D' -> Optional.of(LATE);
            case 'E' -> Optional.of(CNCO);
            case 'F' -> Optional.of(OPEN);
            case 'G' -> Optional.of(CNOL);
            case 'H' -> Optional.of(OPNL);
            case 'I' -> Optional.of(AUTO);
            case 'J' -> Optional.of(REOP);
            case 'S' -> Optional.of(ISOI);
            case 'a' -> Optional.of(SLAN);
            case 'b' -> Optional.of(SLAI);
            case 'c' -> Optional.of(SLCN);
            case 'd' -> Optional.of(SCLI);
            case 'e' -> Optional.of(SLFT);
            case 'f' -> Optional.of(MLET);
            case 'g' -> Optional.of(MLAT);
            case 'h' -> Optional.of(MLCT);
            case 'i' -> Optional.of(MLFT);
            case 'j' -> Optional.of(MESL);
            case 'k' -> Optional.of(TLAT);
            case 'l' -> Optional.of(MASL);
            case 'm' -> Optional.of(MFSL);
            case 'n' -> Optional.of(TLET);
            case 'o' -> Optional.of(TLCT);
            case 'p' -> Optional.of(TLFT);
            case 'q' -> Optional.of(TESL);
            case 'r' -> Optional.of(TASL);
            case 's' -> Optional.of(TFSL);
            case 't' -> Optional.of(CBMO);
            case 'u' -> Optional.of(MCTP);
            case 'v' -> Optional.of(EXHT);
            default -> Optional.empty();
        };
    }
}
