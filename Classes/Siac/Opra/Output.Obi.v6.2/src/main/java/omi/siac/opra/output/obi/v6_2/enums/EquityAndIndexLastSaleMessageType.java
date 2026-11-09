package omi.siac.opra.output.obi.v6_2.enums;

import java.util.Optional;

/**
 * Message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EquityAndIndexLastSaleMessageType {

    /**
     * Transaction previously reported (other than as the last or opening report for the particular option contract) is now to be cancelled.
     */
    CANC('A', "Transaction previously reported (other than as the last or opening report for the particular option contract) is now to be cancelled."),

    /**
     * Transaction is being reported late and is out of sequence; i.e., later transactions have been reported for the particular option contract.
     */
    OSEQ('B', "Transaction is being reported late and is out of sequence; i.e., later transactions have been reported for the particular option contract."),

    /**
     * Transaction is the last reported for the particular option contract and is now cancelled.
     */
    CNCL('C', "Transaction is the last reported for the particular option contract and is now cancelled."),

    /**
     * Transaction is being reported late, but is in the correct sequence; i.e., no later transactions have been reported for the particular option contract.
     */
    LATE('D', "Transaction is being reported late, but is in the correct sequence; i.e., no later transactions have been reported for the particular option contract."),

    /**
     * Transaction was the first one (opening) reported this day for the particular option contract. Although later transactions have been reported, this transaction is now to be cancelled.
     */
    CNCO('E', "Transaction was the first one (opening) reported this day for the particular option contract. Although later transactions have been reported, this transaction is now to be cancelled."),

    /**
     * Transaction is a late report of the opening trade and is out of sequence; i.e., other transactions have been reported for the particular option contract.
     */
    OPEN('F', "Transaction is a late report of the opening trade and is out of sequence; i.e., other transactions have been reported for the particular option contract."),

    /**
     * Transaction was the only one reported this day for the particular option contract and is now to be cancelled.
     */
    CNOL('G', "Transaction was the only one reported this day for the particular option contract and is now to be cancelled."),

    /**
     * Transaction is a late report of the opening trade, but is in the correct sequence; i.e., no other transactions have been reported for the particular option contract.
     */
    OPNL('H', "Transaction is a late report of the opening trade, but is in the correct sequence; i.e., no other transactions have been reported for the particular option contract."),

    /**
     * Transaction was executed electronically. Prefix appears solely for information; process as a regular transaction.
     */
    AUTO('I', "Transaction was executed electronically. Prefix appears solely for information; process as a regular transaction."),

    /**
     * Transaction is a reopening of an option contract in which trading has been previously halted. Prefix appears solely for information; process as a regular transaction.
     */
    REOP('J', "Transaction is a reopening of an option contract in which trading has been previously halted. Prefix appears solely for information; process as a regular transaction."),

    /**
     * Transaction is an option contract for which the terms have been adjusted to reflect a stock dividend, stock split, or similar event. Prefix appears solely for information; process as a regular transaction.
     */
    AJST('K', "Transaction is an option contract for which the terms have been adjusted to reflect a stock dividend, stock split, or similar event. Prefix appears solely for information; process as a regular transaction."),

    /**
     * Transaction represents a trade in two options in the same class (a buy and a sell in the same class). Prefix appears solely for information; process as a regular transaction.
     */
    SPRD('L', "Transaction represents a trade in two options in the same class (a buy and a sell in the same class). Prefix appears solely for information; process as a regular transaction."),

    /**
     * Transaction represents a trade in two options in the same class (a buy and a sell in a put and a call). Prefix appears solely for information; process as a regular transaction.
     */
    STDL('M', "Transaction represents a trade in two options in the same class (a buy and a sell in a put and a call). Prefix appears solely for information; process as a regular transaction."),

    /**
     * Transaction is the execution of a sale at a price agreed upon by the floor personnel involved, where a condition of the trade is that it reported following a non-stopped trade of the same series at the same price.
     */
    STPD('N', "Transaction is the execution of a sale at a price agreed upon by the floor personnel involved, where a condition of the trade is that it reported following a non-stopped trade of the same series at the same price."),

    /**
     * Cancel stopped transaction.
     */
    CSTP('O', "Cancel stopped transaction."),

    /**
     * Transaction represents the option portion of an order involving a single option leg (buy or sell of a call or put) and stock. Prefix appears solely for information: process as a regular transaction.
     */
    BWRT('P', "Transaction represents the option portion of an order involving a single option leg (buy or sell of a call or put) and stock. Prefix appears solely for information: process as a regular transaction."),

    /**
     * Transaction represents the buying of a call and the selling of a put for the same underlying stock or index. Prefix appears solely for information; process as a regular transaction.
     */
    CMBO('Q', "Transaction represents the buying of a call and the selling of a put for the same underlying stock or index. Prefix appears solely for information; process as a regular transaction."),

    /**
     * Transaction was the execution of an order which was "stopped" at a price that did not constitute a Trade-Through on another market at the time of the stop. Process like a normal transaction.
     */
    SPIM('R', "Transaction was the execution of an order which was \"stopped\" at a price that did not constitute a Trade-Through on another market at the time of the stop. Process like a normal transaction."),

    /**
     * Transaction was the execution of an order identified as an Intermarket Sweep Order. Process like normal transaction.
     */
    ISOI('S', "Transaction was the execution of an order identified as an Intermarket Sweep Order. Process like normal transaction."),

    /**
     * Transaction reflects the execution of a "benchmark trade". A "Benchmark Trade" is a trade resulting from the matching of "Benchmark Orders". A "Benchmark Order" is an order for which the price is not based, directly or indirectly, on the quote price of the option at the time of the order's execution and for which the material terms were not reasonably determinable at the time a commitment to trade the order was made. Process like a normal transaction except don't update "last".
     */
    BNMT('T', "Transaction reflects the execution of a \"benchmark trade\". A \"Benchmark Trade\" is a trade resulting from the matching of \"Benchmark Orders\". A \"Benchmark Order\" is an order for which the price is not based, directly or indirectly, on the quote price of the option at the time of the order's execution and for which the material terms were not reasonably determinable at the time a commitment to trade the order was made. Process like a normal transaction except don't update \"last\"."),

    /**
     * Transaction is Trade Through Exempt. The transaction should be treated like a regular sale.
     */
    XMPT('X', "Transaction is Trade Through Exempt. The transaction should be treated like a regular sale.");

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
            case 'K' -> Optional.of(AJST);
            case 'L' -> Optional.of(SPRD);
            case 'M' -> Optional.of(STDL);
            case 'N' -> Optional.of(STPD);
            case 'O' -> Optional.of(CSTP);
            case 'P' -> Optional.of(BWRT);
            case 'Q' -> Optional.of(CMBO);
            case 'R' -> Optional.of(SPIM);
            case 'S' -> Optional.of(ISOI);
            case 'T' -> Optional.of(BNMT);
            case 'X' -> Optional.of(XMPT);
            default -> Optional.empty();
        };
    }
}
