package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the SegmentIndicator values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SegmentIndicator {

    /**
     * CASH
     */
    CASH((short) 1, "CASH"),

    /**
     * Equity
     */
    EQUITY((short) 2, "Equity"),

    /**
     * REPO
     */
    REPO((short) 3, "REPO"),

    /**
     * SLB
     */
    SLB((short) 4, "SLB"),

    /**
     * SAUC
     */
    SAUC((short) 5, "SAUC"),

    /**
     * DEBT
     */
    DEBT((short) 6, "DEBT"),

    /**
     * Currency Derivatives (Full Segment)
     */
    CURRENCY_DERIVATIVES((short) 7, "Currency Derivatives (Full Segment)"),

    /**
     * Currency Asset Class(CDX)
     */
    CURRENCY_ASSET_CLASS((short) 8, "Currency Asset Class(CDX)"),

    /**
     * Interest Rate Asset Class(IRD)
     */
    INTEREST_RATE_ASSET_CLASS((short) 9, "Interest Rate Asset Class(IRD)"),

    /**
     * INX
     */
    INX((short) 10, "INX"),

    /**
     * Equity Derivatives
     */
    EQUITY_DERIVATIVES((short) 11, "Equity Derivatives"),

    /**
     * Derivatives
     */
    DERIVATIVES((short) 12, "Derivatives"),

    /**
     * EUREX
     */
    EUREX((short) 13, "EUREX"),

    /**
     * EEX
     */
    EEX((short) 14, "EEX"),

    /**
     * Commodity Derivatives
     */
    COMMODITY_DERIVATIVES((short) 15, "Commodity Derivatives"),

    /**
     * Electronic Gold Receipts (EGR)
     */
    ELECTRONIC_GOLD_RECEIPTS((short) 16, "Electronic Gold Receipts (EGR)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SegmentIndicator(short wire, String description) {
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
    public static Optional<SegmentIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CASH);
            case 2 -> Optional.of(EQUITY);
            case 3 -> Optional.of(REPO);
            case 4 -> Optional.of(SLB);
            case 5 -> Optional.of(SAUC);
            case 6 -> Optional.of(DEBT);
            case 7 -> Optional.of(CURRENCY_DERIVATIVES);
            case 8 -> Optional.of(CURRENCY_ASSET_CLASS);
            case 9 -> Optional.of(INTEREST_RATE_ASSET_CLASS);
            case 10 -> Optional.of(INX);
            case 11 -> Optional.of(EQUITY_DERIVATIVES);
            case 12 -> Optional.of(DERIVATIVES);
            case 13 -> Optional.of(EUREX);
            case 14 -> Optional.of(EEX);
            case 15 -> Optional.of(COMMODITY_DERIVATIVES);
            case 16 -> Optional.of(ELECTRONIC_GOLD_RECEIPTS);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
