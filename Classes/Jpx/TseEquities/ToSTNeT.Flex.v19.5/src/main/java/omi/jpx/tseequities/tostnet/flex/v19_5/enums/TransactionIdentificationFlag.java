package omi.jpx.tseequities.tostnet.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the identification of the transaction.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TransactionIdentificationFlag {

    /**
     * Day Transaction
     */
    DAY_TRANSACTION('1', "Day Transaction"),

    /**
     * Ordinary Transaction T 2 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T2_VWAP_TRANSACTION('2', "Ordinary Transaction T 2 Vwap Transaction"),

    /**
     * Day Transaction Vwap Transaction
     */
    DAY_TRANSACTION_VWAP_TRANSACTION('3', "Day Transaction Vwap Transaction"),

    /**
     * A space is also set for a closing price transaction, and for a trading halt and a release from trading halt.
     */
    ORDINARY_TRANSACTION_T2(' ', "A space is also set for a closing price transaction, and for a trading halt and a release from trading halt."),

    /**
     * Ordinary Transaction T 1
     */
    ORDINARY_TRANSACTION_T1('A', "Ordinary Transaction T 1"),

    /**
     * Ordinary Transaction T 1 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T1_VWAP_TRANSACTION('B', "Ordinary Transaction T 1 Vwap Transaction"),

    /**
     * Ordinary Transaction T 3
     */
    ORDINARY_TRANSACTION_T3('C', "Ordinary Transaction T 3"),

    /**
     * Ordinary Transaction T 3 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T3_VWAP_TRANSACTION('D', "Ordinary Transaction T 3 Vwap Transaction"),

    /**
     * Ordinary Transaction T 4
     */
    ORDINARY_TRANSACTION_T4('E', "Ordinary Transaction T 4"),

    /**
     * Ordinary Transaction T 4 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T4_VWAP_TRANSACTION('F', "Ordinary Transaction T 4 Vwap Transaction"),

    /**
     * Ordinary Transaction T 5
     */
    ORDINARY_TRANSACTION_T5('G', "Ordinary Transaction T 5"),

    /**
     * Ordinary Transaction T 5 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T5_VWAP_TRANSACTION('H', "Ordinary Transaction T 5 Vwap Transaction"),

    /**
     * Ordinary Transaction T 6
     */
    ORDINARY_TRANSACTION_T6('I', "Ordinary Transaction T 6"),

    /**
     * Ordinary Transaction T 6 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T6_VWAP_TRANSACTION('J', "Ordinary Transaction T 6 Vwap Transaction"),

    /**
     * Ordinary Transaction T 7
     */
    ORDINARY_TRANSACTION_T7('K', "Ordinary Transaction T 7"),

    /**
     * Ordinary Transaction T 7 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T7_VWAP_TRANSACTION('L', "Ordinary Transaction T 7 Vwap Transaction"),

    /**
     * Ordinary Transaction T 8
     */
    ORDINARY_TRANSACTION_T8('M', "Ordinary Transaction T 8"),

    /**
     * Ordinary Transaction T 8 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T8_VWAP_TRANSACTION('N', "Ordinary Transaction T 8 Vwap Transaction"),

    /**
     * Ordinary Transaction T 9
     */
    ORDINARY_TRANSACTION_T9('O', "Ordinary Transaction T 9"),

    /**
     * Ordinary Transaction T 9 Vwap Transaction
     */
    ORDINARY_TRANSACTION_T9_VWAP_TRANSACTION('P', "Ordinary Transaction T 9 Vwap Transaction");

    private final char wire;

    private final String description;

    TransactionIdentificationFlag(char wire, String description) {
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
    public static Optional<TransactionIdentificationFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(DAY_TRANSACTION);
            case '2' -> Optional.of(ORDINARY_TRANSACTION_T2_VWAP_TRANSACTION);
            case '3' -> Optional.of(DAY_TRANSACTION_VWAP_TRANSACTION);
            case ' ' -> Optional.of(ORDINARY_TRANSACTION_T2);
            case 'A' -> Optional.of(ORDINARY_TRANSACTION_T1);
            case 'B' -> Optional.of(ORDINARY_TRANSACTION_T1_VWAP_TRANSACTION);
            case 'C' -> Optional.of(ORDINARY_TRANSACTION_T3);
            case 'D' -> Optional.of(ORDINARY_TRANSACTION_T3_VWAP_TRANSACTION);
            case 'E' -> Optional.of(ORDINARY_TRANSACTION_T4);
            case 'F' -> Optional.of(ORDINARY_TRANSACTION_T4_VWAP_TRANSACTION);
            case 'G' -> Optional.of(ORDINARY_TRANSACTION_T5);
            case 'H' -> Optional.of(ORDINARY_TRANSACTION_T5_VWAP_TRANSACTION);
            case 'I' -> Optional.of(ORDINARY_TRANSACTION_T6);
            case 'J' -> Optional.of(ORDINARY_TRANSACTION_T6_VWAP_TRANSACTION);
            case 'K' -> Optional.of(ORDINARY_TRANSACTION_T7);
            case 'L' -> Optional.of(ORDINARY_TRANSACTION_T7_VWAP_TRANSACTION);
            case 'M' -> Optional.of(ORDINARY_TRANSACTION_T8);
            case 'N' -> Optional.of(ORDINARY_TRANSACTION_T8_VWAP_TRANSACTION);
            case 'O' -> Optional.of(ORDINARY_TRANSACTION_T9);
            case 'P' -> Optional.of(ORDINARY_TRANSACTION_T9_VWAP_TRANSACTION);
            default -> Optional.empty();
        };
    }
}
