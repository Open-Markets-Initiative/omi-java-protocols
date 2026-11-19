package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * ackType
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum AckType {

    /**
     * NewInterest
     */
    NEW_INTEREST((byte) 1, "NewInterest"),

    /**
     * PendingCancel
     */
    PENDING_CANCEL((byte) 2, "PendingCancel"),

    /**
     * Canceled
     */
    CANCELED((byte) 3, "Canceled"),

    /**
     * PendingReplace
     */
    PENDING_REPLACE((byte) 4, "PendingReplace"),

    /**
     * Replaced
     */
    REPLACED((byte) 5, "Replaced"),

    /**
     * IndividualMarketMakerQuoteReject
     */
    INDIVIDUAL_MARKET_MAKER_QUOTE_REJECT((byte) 6, "IndividualMarketMakerQuoteReject"),

    /**
     * UnsolicitedRepricePriceAdjust
     */
    UNSOLICITED_REPRICE_PRICE_ADJUST((byte) 7, "UnsolicitedRepricePriceAdjust"),

    /**
     * UnsolicitedRepriceOrp
     */
    UNSOLICITED_REPRICE_ORP((byte) 8, "UnsolicitedRepriceOrp"),

    /**
     * UnsolicitedCancelOrp
     */
    UNSOLICITED_CANCEL_ORP((byte) 9, "UnsolicitedCancelOrp"),

    /**
     * MarketMakerQuoteNotModified
     */
    MARKET_MAKER_QUOTE_NOT_MODIFIED((byte) 10, "MarketMakerQuoteNotModified");

    private final byte wire;

    private final String description;

    AckType(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<AckType> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEW_INTEREST);
            case 2 -> Optional.of(PENDING_CANCEL);
            case 3 -> Optional.of(CANCELED);
            case 4 -> Optional.of(PENDING_REPLACE);
            case 5 -> Optional.of(REPLACED);
            case 6 -> Optional.of(INDIVIDUAL_MARKET_MAKER_QUOTE_REJECT);
            case 7 -> Optional.of(UNSOLICITED_REPRICE_PRICE_ADJUST);
            case 8 -> Optional.of(UNSOLICITED_REPRICE_ORP);
            case 9 -> Optional.of(UNSOLICITED_CANCEL_ORP);
            case 10 -> Optional.of(MARKET_MAKER_QUOTE_NOT_MODIFIED);
            default -> Optional.empty();
        };
    }
}
