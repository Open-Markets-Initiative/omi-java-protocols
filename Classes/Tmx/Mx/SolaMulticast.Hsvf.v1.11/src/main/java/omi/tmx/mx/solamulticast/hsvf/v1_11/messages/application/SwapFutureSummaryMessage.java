package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.AskPriceSummaryFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.BidPriceSummaryFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.FixedRateFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.HighPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.HistoricalCouponBFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.LastPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.LowPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.NetChangeSwapFutureSummaryMessageFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.NetPresentValueAFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.OpenPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.PreviousResetRateFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.PreviousSettlementPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.PriceAlignmentInterestCFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.SettlementPriceFutureOptionsSummaryMessageFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AskSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.BidSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryMonthSwapFutureField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.NetChangeSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.OpenInterestField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ReasonField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.TenorField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.VolumeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the SwapFutureSummaryMessage message from the SolaMulticast protocol.
 *
 * <p>Swap Future Summary message</p>
 */
public final class SwapFutureSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 153;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Swap Future Summary Message";

    /**
     * Exchange on which the trade occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Swap future base symbol
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Expiry month code of the swap future Refer to Month Codes
     */
    private final ExpiryMonthSwapFutureField expiryMonthSwapFuture = new ExpiryMonthSwapFutureField();

    /**
     * Two last digits of the expiry year of the swap future
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Expiry day of the swap future
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * The tenor of the swap future
     */
    private final TenorField tenor = new TenorField();

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * For the net change field
     */
    private final NetChangeSignField netChangeSign = new NetChangeSignField();

    /**
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

    /**
     * This field contains the outstanding number of contracts in the swap Updated on a trade by trade basis Refer to Indicator Code
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * Indicates the reason of the summary message
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Branch
     */
    private final FixedRateFractionPair fixedRateFractionPair = new FixedRateFractionPair();

    /**
     * Branch
     */
    private final BidPriceSummaryFractionPair bidPriceSummaryFractionPair = new BidPriceSummaryFractionPair();

    /**
     * Branch
     */
    private final AskPriceSummaryFractionPair askPriceSummaryFractionPair = new AskPriceSummaryFractionPair();

    /**
     * Branch
     */
    private final LastPriceFractionPair lastPriceFractionPair = new LastPriceFractionPair();

    /**
     * Branch
     */
    private final OpenPriceFractionPair openPriceFractionPair = new OpenPriceFractionPair();

    /**
     * Branch
     */
    private final HighPriceFractionPair highPriceFractionPair = new HighPriceFractionPair();

    /**
     * Branch
     */
    private final LowPriceFractionPair lowPriceFractionPair = new LowPriceFractionPair();

    /**
     * Branch
     */
    private final SettlementPriceFutureOptionsSummaryMessageFractionPair settlementPriceFutureOptionsSummaryMessageFractionPair = new SettlementPriceFutureOptionsSummaryMessageFractionPair();

    /**
     * Branch
     */
    private final NetPresentValueAFractionPair netPresentValueAFractionPair = new NetPresentValueAFractionPair();

    /**
     * Branch
     */
    private final HistoricalCouponBFractionPair historicalCouponBFractionPair = new HistoricalCouponBFractionPair();

    /**
     * Branch
     */
    private final PriceAlignmentInterestCFractionPair priceAlignmentInterestCFractionPair = new PriceAlignmentInterestCFractionPair();

    /**
     * Branch
     */
    private final NetChangeSwapFutureSummaryMessageFractionPair netChangeSwapFutureSummaryMessageFractionPair = new NetChangeSwapFutureSummaryMessageFractionPair();

    /**
     * Branch
     */
    private final PreviousSettlementPriceFractionPair previousSettlementPriceFractionPair = new PreviousSettlementPriceFractionPair();

    /**
     * Branch
     */
    private final PreviousResetRateFractionPair previousResetRateFractionPair = new PreviousResetRateFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, expiryMonthSwapFuture, expiryYear, expiryDay, tenor, bidSize, askSize, netChangeSign, volume, openInterest, reason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the trade occurred Q = Montreal
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Swap future base symbol
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Expiry month code of the swap future Refer to Month Codes
     *
     * @return the ExpiryMonthSwapFuture field
     */
    public ExpiryMonthSwapFutureField expiryMonthSwapFuture() {
        return expiryMonthSwapFuture;
    }

    /**
     * Two last digits of the expiry year of the swap future
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Expiry day of the swap future
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * The tenor of the swap future
     *
     * @return the Tenor field
     */
    public TenorField tenor() {
        return tenor;
    }

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * For the net change field
     *
     * @return the NetChangeSign field
     */
    public NetChangeSignField netChangeSign() {
        return netChangeSign;
    }

    /**
     * Number of contracts for the trade
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * This field contains the outstanding number of contracts in the swap Updated on a trade by trade basis Refer to Indicator Code
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * Indicates the reason of the summary message
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
    }

    /**
     * Branch
     *
     * @return the FixedRateFractionPair record
     */
    public FixedRateFractionPair fixedRateFractionPair() {
        return fixedRateFractionPair;
    }

    /**
     * Branch
     *
     * @return the BidPriceSummaryFractionPair record
     */
    public BidPriceSummaryFractionPair bidPriceSummaryFractionPair() {
        return bidPriceSummaryFractionPair;
    }

    /**
     * Branch
     *
     * @return the AskPriceSummaryFractionPair record
     */
    public AskPriceSummaryFractionPair askPriceSummaryFractionPair() {
        return askPriceSummaryFractionPair;
    }

    /**
     * Branch
     *
     * @return the LastPriceFractionPair record
     */
    public LastPriceFractionPair lastPriceFractionPair() {
        return lastPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the OpenPriceFractionPair record
     */
    public OpenPriceFractionPair openPriceFractionPair() {
        return openPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the HighPriceFractionPair record
     */
    public HighPriceFractionPair highPriceFractionPair() {
        return highPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the LowPriceFractionPair record
     */
    public LowPriceFractionPair lowPriceFractionPair() {
        return lowPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the SettlementPriceFutureOptionsSummaryMessageFractionPair record
     */
    public SettlementPriceFutureOptionsSummaryMessageFractionPair settlementPriceFutureOptionsSummaryMessageFractionPair() {
        return settlementPriceFutureOptionsSummaryMessageFractionPair;
    }

    /**
     * Branch
     *
     * @return the NetPresentValueAFractionPair record
     */
    public NetPresentValueAFractionPair netPresentValueAFractionPair() {
        return netPresentValueAFractionPair;
    }

    /**
     * Branch
     *
     * @return the HistoricalCouponBFractionPair record
     */
    public HistoricalCouponBFractionPair historicalCouponBFractionPair() {
        return historicalCouponBFractionPair;
    }

    /**
     * Branch
     *
     * @return the PriceAlignmentInterestCFractionPair record
     */
    public PriceAlignmentInterestCFractionPair priceAlignmentInterestCFractionPair() {
        return priceAlignmentInterestCFractionPair;
    }

    /**
     * Branch
     *
     * @return the NetChangeSwapFutureSummaryMessageFractionPair record
     */
    public NetChangeSwapFutureSummaryMessageFractionPair netChangeSwapFutureSummaryMessageFractionPair() {
        return netChangeSwapFutureSummaryMessageFractionPair;
    }

    /**
     * Branch
     *
     * @return the PreviousSettlementPriceFractionPair record
     */
    public PreviousSettlementPriceFractionPair previousSettlementPriceFractionPair() {
        return previousSettlementPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the PreviousResetRateFractionPair record
     */
    public PreviousResetRateFractionPair previousResetRateFractionPair() {
        return previousResetRateFractionPair;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!rootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RootSymbolField.BYTE_LENGTH;
        if (!expiryMonthSwapFuture.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryMonthSwapFutureField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!tenor.parse(data, cursor)) {
            return false;
        }
        cursor += TenorField.BYTE_LENGTH;
        if (!fixedRateFractionPair.parseFrom(data, cursor, end - 133)) {
            return false;
        }
        cursor += fixedRateFractionPair.byteLength();
        if (!bidPriceSummaryFractionPair.parseFrom(data, cursor, end - 126)) {
            return false;
        }
        cursor += bidPriceSummaryFractionPair.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceSummaryFractionPair.parseFrom(data, cursor, end - 114)) {
            return false;
        }
        cursor += askPriceSummaryFractionPair.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!lastPriceFractionPair.parseFrom(data, cursor, end - 102)) {
            return false;
        }
        cursor += lastPriceFractionPair.byteLength();
        if (!openPriceFractionPair.parseFrom(data, cursor, end - 95)) {
            return false;
        }
        cursor += openPriceFractionPair.byteLength();
        if (!highPriceFractionPair.parseFrom(data, cursor, end - 88)) {
            return false;
        }
        cursor += highPriceFractionPair.byteLength();
        if (!lowPriceFractionPair.parseFrom(data, cursor, end - 81)) {
            return false;
        }
        cursor += lowPriceFractionPair.byteLength();
        if (!settlementPriceFutureOptionsSummaryMessageFractionPair.parseFrom(data, cursor, end - 74)) {
            return false;
        }
        cursor += settlementPriceFutureOptionsSummaryMessageFractionPair.byteLength();
        if (!netPresentValueAFractionPair.parseFrom(data, cursor, end - 62)) {
            return false;
        }
        cursor += netPresentValueAFractionPair.byteLength();
        if (!historicalCouponBFractionPair.parseFrom(data, cursor, end - 50)) {
            return false;
        }
        cursor += historicalCouponBFractionPair.byteLength();
        if (!priceAlignmentInterestCFractionPair.parseFrom(data, cursor, end - 38)) {
            return false;
        }
        cursor += priceAlignmentInterestCFractionPair.byteLength();
        if (!netChangeSign.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeSignField.BYTE_LENGTH;
        if (!netChangeSwapFutureSummaryMessageFractionPair.parseFrom(data, cursor, end - 30)) {
            return false;
        }
        cursor += netChangeSwapFutureSummaryMessageFractionPair.byteLength();
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!previousSettlementPriceFractionPair.parseFrom(data, cursor, end - 15)) {
            return false;
        }
        cursor += previousSettlementPriceFractionPair.byteLength();
        if (!previousResetRateFractionPair.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += previousResetRateFractionPair.byteLength();
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        return reason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = expiryMonthSwapFuture.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = tenor.encode(data, cursor);
        cursor = fixedRateFractionPair.encode(data, cursor);
        cursor = bidPriceSummaryFractionPair.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceSummaryFractionPair.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = lastPriceFractionPair.encode(data, cursor);
        cursor = openPriceFractionPair.encode(data, cursor);
        cursor = highPriceFractionPair.encode(data, cursor);
        cursor = lowPriceFractionPair.encode(data, cursor);
        cursor = settlementPriceFutureOptionsSummaryMessageFractionPair.encode(data, cursor);
        cursor = netPresentValueAFractionPair.encode(data, cursor);
        cursor = historicalCouponBFractionPair.encode(data, cursor);
        cursor = priceAlignmentInterestCFractionPair.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChangeSwapFutureSummaryMessageFractionPair.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = previousSettlementPriceFractionPair.encode(data, cursor);
        cursor = previousResetRateFractionPair.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = reason.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        fixedRateFractionPair.clear();
        bidPriceSummaryFractionPair.clear();
        askPriceSummaryFractionPair.clear();
        lastPriceFractionPair.clear();
        openPriceFractionPair.clear();
        highPriceFractionPair.clear();
        lowPriceFractionPair.clear();
        settlementPriceFutureOptionsSummaryMessageFractionPair.clear();
        netPresentValueAFractionPair.clear();
        historicalCouponBFractionPair.clear();
        priceAlignmentInterestCFractionPair.clear();
        netChangeSwapFutureSummaryMessageFractionPair.clear();
        previousSettlementPriceFractionPair.clear();
        previousResetRateFractionPair.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!fixedRateFractionPair.isRecognized()) {
            return false;
        }
        if (!bidPriceSummaryFractionPair.isRecognized()) {
            return false;
        }
        if (!askPriceSummaryFractionPair.isRecognized()) {
            return false;
        }
        if (!lastPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!openPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!highPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!lowPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!settlementPriceFutureOptionsSummaryMessageFractionPair.isRecognized()) {
            return false;
        }
        if (!netPresentValueAFractionPair.isRecognized()) {
            return false;
        }
        if (!historicalCouponBFractionPair.isRecognized()) {
            return false;
        }
        if (!priceAlignmentInterestCFractionPair.isRecognized()) {
            return false;
        }
        if (!netChangeSwapFutureSummaryMessageFractionPair.isRecognized()) {
            return false;
        }
        if (!previousSettlementPriceFractionPair.isRecognized()) {
            return false;
        }
        return previousResetRateFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!fixedRateFractionPair.isValid()) {
            return false;
        }
        if (!bidPriceSummaryFractionPair.isValid()) {
            return false;
        }
        if (!askPriceSummaryFractionPair.isValid()) {
            return false;
        }
        if (!lastPriceFractionPair.isValid()) {
            return false;
        }
        if (!openPriceFractionPair.isValid()) {
            return false;
        }
        if (!highPriceFractionPair.isValid()) {
            return false;
        }
        if (!lowPriceFractionPair.isValid()) {
            return false;
        }
        if (!settlementPriceFutureOptionsSummaryMessageFractionPair.isValid()) {
            return false;
        }
        if (!netPresentValueAFractionPair.isValid()) {
            return false;
        }
        if (!historicalCouponBFractionPair.isValid()) {
            return false;
        }
        if (!priceAlignmentInterestCFractionPair.isValid()) {
            return false;
        }
        if (!netChangeSwapFutureSummaryMessageFractionPair.isValid()) {
            return false;
        }
        if (!previousSettlementPriceFractionPair.isValid()) {
            return false;
        }
        if (!previousResetRateFractionPair.isValid()) {
            return false;
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "ExchangeId" -> Optional.of(exchangeId);
            case "RootSymbol" -> Optional.of(rootSymbol);
            case "ExpiryMonthSwapFuture" -> Optional.of(expiryMonthSwapFuture);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "Tenor" -> Optional.of(tenor);
            case "BidSize" -> Optional.of(bidSize);
            case "AskSize" -> Optional.of(askSize);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "Volume" -> Optional.of(volume);
            case "OpenInterest" -> Optional.of(openInterest);
            case "Reason" -> Optional.of(reason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SwapFutureSummaryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fixedRateFractionPair.diffFields(message.fixedRateFractionPair));
        changed.addAll(bidPriceSummaryFractionPair.diffFields(message.bidPriceSummaryFractionPair));
        changed.addAll(askPriceSummaryFractionPair.diffFields(message.askPriceSummaryFractionPair));
        changed.addAll(lastPriceFractionPair.diffFields(message.lastPriceFractionPair));
        changed.addAll(openPriceFractionPair.diffFields(message.openPriceFractionPair));
        changed.addAll(highPriceFractionPair.diffFields(message.highPriceFractionPair));
        changed.addAll(lowPriceFractionPair.diffFields(message.lowPriceFractionPair));
        changed.addAll(settlementPriceFutureOptionsSummaryMessageFractionPair.diffFields(message.settlementPriceFutureOptionsSummaryMessageFractionPair));
        changed.addAll(netPresentValueAFractionPair.diffFields(message.netPresentValueAFractionPair));
        changed.addAll(historicalCouponBFractionPair.diffFields(message.historicalCouponBFractionPair));
        changed.addAll(priceAlignmentInterestCFractionPair.diffFields(message.priceAlignmentInterestCFractionPair));
        changed.addAll(netChangeSwapFutureSummaryMessageFractionPair.diffFields(message.netChangeSwapFutureSummaryMessageFractionPair));
        changed.addAll(previousSettlementPriceFractionPair.diffFields(message.previousSettlementPriceFractionPair));
        changed.addAll(previousResetRateFractionPair.diffFields(message.previousResetRateFractionPair));
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            fixedRateFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            bidPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            askPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lastPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            openPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            highPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lowPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            settlementPriceFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            netPresentValueAFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            historicalCouponBFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            priceAlignmentInterestCFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            netChangeSwapFutureSummaryMessageFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            previousSettlementPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            previousResetRateFractionPair.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        fixedRateFractionPair.toFormattedString(builder, nested);
        bidPriceSummaryFractionPair.toFormattedString(builder, nested);
        askPriceSummaryFractionPair.toFormattedString(builder, nested);
        lastPriceFractionPair.toFormattedString(builder, nested);
        openPriceFractionPair.toFormattedString(builder, nested);
        highPriceFractionPair.toFormattedString(builder, nested);
        lowPriceFractionPair.toFormattedString(builder, nested);
        settlementPriceFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, nested);
        netPresentValueAFractionPair.toFormattedString(builder, nested);
        historicalCouponBFractionPair.toFormattedString(builder, nested);
        priceAlignmentInterestCFractionPair.toFormattedString(builder, nested);
        netChangeSwapFutureSummaryMessageFractionPair.toFormattedString(builder, nested);
        previousSettlementPriceFractionPair.toFormattedString(builder, nested);
        previousResetRateFractionPair.toFormattedString(builder, nested);
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwapFutureSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && fixedRateFractionPair.equals(message.fixedRateFractionPair) && bidPriceSummaryFractionPair.equals(message.bidPriceSummaryFractionPair) && askPriceSummaryFractionPair.equals(message.askPriceSummaryFractionPair) && lastPriceFractionPair.equals(message.lastPriceFractionPair) && openPriceFractionPair.equals(message.openPriceFractionPair) && highPriceFractionPair.equals(message.highPriceFractionPair) && lowPriceFractionPair.equals(message.lowPriceFractionPair) && settlementPriceFutureOptionsSummaryMessageFractionPair.equals(message.settlementPriceFutureOptionsSummaryMessageFractionPair) && netPresentValueAFractionPair.equals(message.netPresentValueAFractionPair) && historicalCouponBFractionPair.equals(message.historicalCouponBFractionPair) && priceAlignmentInterestCFractionPair.equals(message.priceAlignmentInterestCFractionPair) && netChangeSwapFutureSummaryMessageFractionPair.equals(message.netChangeSwapFutureSummaryMessageFractionPair) && previousSettlementPriceFractionPair.equals(message.previousSettlementPriceFractionPair) && previousResetRateFractionPair.equals(message.previousResetRateFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fixedRateFractionPair, bidPriceSummaryFractionPair, askPriceSummaryFractionPair, lastPriceFractionPair, openPriceFractionPair, highPriceFractionPair, lowPriceFractionPair, settlementPriceFutureOptionsSummaryMessageFractionPair, netPresentValueAFractionPair, historicalCouponBFractionPair, priceAlignmentInterestCFractionPair, netChangeSwapFutureSummaryMessageFractionPair, previousSettlementPriceFractionPair, previousResetRateFractionPair);
    }
}
