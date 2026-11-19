package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.AskPriceSummaryFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.BidPriceSummaryFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.HighPriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.LastPriceFutureOptionsSummaryMessageFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.LowPriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.NetChangeFutureOptionsSummaryMessageFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.OpeningPriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.PreviousSettlementPriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.SettlementPriceFutureOptionsSummaryMessageFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.StrikePriceInstrumentFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.AskSizeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.BidSizeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.CallPutCodeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ContractMonthCodeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.DeliveryMonthField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.DeliveryYearUnderlyingField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.NetChangeSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.OpenInterestField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ReasonField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.TickField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.UnderlyingSymbolRootFutureOptionsField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.VolumeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FutureOptionsSummaryMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>Future Options Summary message</p>
 */
public final class FutureOptionsSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 119;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Summary Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 97, 2 };

    /**
     * Exchange on which the trade occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Option base symbol (symbol of the underlying)
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Option month code
     */
    private final ContractMonthCodeField contractMonthCode = new ContractMonthCodeField();

    /**
     * Last two digits of the option expiry year
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Expiry day of the option
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * C = Call, P = Put
     */
    private final CallPutCodeField callPutCode = new CallPutCodeField();

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Outstanding number of contracts in the series as of the previous day
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * Determined by the difference between last price and the previous different trade price
     */
    private final TickField tick = new TickField();

    /**
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

    /**
     * For the net change field
     */
    private final NetChangeSignField netChangeSign = new NetChangeSignField();

    /**
     * Base symbol of the underlying future
     */
    private final UnderlyingSymbolRootFutureOptionsField underlyingSymbolRootFutureOptions = new UnderlyingSymbolRootFutureOptionsField();

    /**
     * Delivery month for the contract
     */
    private final DeliveryMonthField deliveryMonth = new DeliveryMonthField();

    /**
     * Last digit of the delivery year of the underlying futures contract
     */
    private final DeliveryYearUnderlyingField deliveryYearUnderlying = new DeliveryYearUnderlyingField();

    /**
     * Indicates the reason of the summary message
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Branch
     */
    private final StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair = new StrikePriceInstrumentFractionPair();

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
    private final LastPriceFutureOptionsSummaryMessageFractionPair lastPriceFutureOptionsSummaryMessageFractionPair = new LastPriceFutureOptionsSummaryMessageFractionPair();

    /**
     * Branch
     */
    private final NetChangeFutureOptionsSummaryMessageFractionPair netChangeFutureOptionsSummaryMessageFractionPair = new NetChangeFutureOptionsSummaryMessageFractionPair();

    /**
     * Branch
     */
    private final OpeningPriceFractionPair openingPriceFractionPair = new OpeningPriceFractionPair();

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
    private final PreviousSettlementPriceFractionPair previousSettlementPriceFractionPair = new PreviousSettlementPriceFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, contractMonthCode, expiryYear, expiryDay, callPutCode, bidSize, askSize, openInterest, tick, volume, netChangeSign, underlyingSymbolRootFutureOptions, deliveryMonth, deliveryYearUnderlying, reason);

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
     * Option base symbol (symbol of the underlying)
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Option month code
     *
     * @return the ContractMonthCode field
     */
    public ContractMonthCodeField contractMonthCode() {
        return contractMonthCode;
    }

    /**
     * Last two digits of the option expiry year
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Expiry day of the option
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * C = Call, P = Put
     *
     * @return the CallPutCode field
     */
    public CallPutCodeField callPutCode() {
        return callPutCode;
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
     * Outstanding number of contracts in the series as of the previous day
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * Determined by the difference between last price and the previous different trade price
     *
     * @return the Tick field
     */
    public TickField tick() {
        return tick;
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
     * For the net change field
     *
     * @return the NetChangeSign field
     */
    public NetChangeSignField netChangeSign() {
        return netChangeSign;
    }

    /**
     * Base symbol of the underlying future
     *
     * @return the UnderlyingSymbolRootFutureOptions field
     */
    public UnderlyingSymbolRootFutureOptionsField underlyingSymbolRootFutureOptions() {
        return underlyingSymbolRootFutureOptions;
    }

    /**
     * Delivery month for the contract
     *
     * @return the DeliveryMonth field
     */
    public DeliveryMonthField deliveryMonth() {
        return deliveryMonth;
    }

    /**
     * Last digit of the delivery year of the underlying futures contract
     *
     * @return the DeliveryYearUnderlying field
     */
    public DeliveryYearUnderlyingField deliveryYearUnderlying() {
        return deliveryYearUnderlying;
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
     * @return the StrikePriceInstrumentFractionPair record
     */
    public StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair() {
        return strikePriceInstrumentFractionPair;
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
     * @return the LastPriceFutureOptionsSummaryMessageFractionPair record
     */
    public LastPriceFutureOptionsSummaryMessageFractionPair lastPriceFutureOptionsSummaryMessageFractionPair() {
        return lastPriceFutureOptionsSummaryMessageFractionPair;
    }

    /**
     * Branch
     *
     * @return the NetChangeFutureOptionsSummaryMessageFractionPair record
     */
    public NetChangeFutureOptionsSummaryMessageFractionPair netChangeFutureOptionsSummaryMessageFractionPair() {
        return netChangeFutureOptionsSummaryMessageFractionPair;
    }

    /**
     * Branch
     *
     * @return the OpeningPriceFractionPair record
     */
    public OpeningPriceFractionPair openingPriceFractionPair() {
        return openingPriceFractionPair;
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
     * @return the PreviousSettlementPriceFractionPair record
     */
    public PreviousSettlementPriceFractionPair previousSettlementPriceFractionPair() {
        return previousSettlementPriceFractionPair;
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
        return PADDING.clone();
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
        if (!contractMonthCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMonthCodeField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!callPutCode.parse(data, cursor)) {
            return false;
        }
        cursor += CallPutCodeField.BYTE_LENGTH;
        if (!strikePriceInstrumentFractionPair.parseFrom(data, cursor, end - 98)) {
            return false;
        }
        cursor += strikePriceInstrumentFractionPair.byteLength();
        if (!bidPriceSummaryFractionPair.parseFrom(data, cursor, end - 91)) {
            return false;
        }
        cursor += bidPriceSummaryFractionPair.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceSummaryFractionPair.parseFrom(data, cursor, end - 79)) {
            return false;
        }
        cursor += askPriceSummaryFractionPair.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!lastPriceFutureOptionsSummaryMessageFractionPair.parseFrom(data, cursor, end - 67)) {
            return false;
        }
        cursor += lastPriceFutureOptionsSummaryMessageFractionPair.byteLength();
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        if (!tick.parse(data, cursor)) {
            return false;
        }
        cursor += TickField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!netChangeSign.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeSignField.BYTE_LENGTH;
        if (!netChangeFutureOptionsSummaryMessageFractionPair.parseFrom(data, cursor, end - 43)) {
            return false;
        }
        cursor += netChangeFutureOptionsSummaryMessageFractionPair.byteLength();
        if (!openingPriceFractionPair.parseFrom(data, cursor, end - 36)) {
            return false;
        }
        cursor += openingPriceFractionPair.byteLength();
        if (!highPriceFractionPair.parseFrom(data, cursor, end - 29)) {
            return false;
        }
        cursor += highPriceFractionPair.byteLength();
        if (!lowPriceFractionPair.parseFrom(data, cursor, end - 22)) {
            return false;
        }
        cursor += lowPriceFractionPair.byteLength();
        cursor += 2; // padding
        if (!underlyingSymbolRootFutureOptions.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolRootFutureOptionsField.BYTE_LENGTH;
        if (!deliveryMonth.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryMonthField.BYTE_LENGTH;
        if (!deliveryYearUnderlying.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryYearUnderlyingField.BYTE_LENGTH;
        if (!settlementPriceFutureOptionsSummaryMessageFractionPair.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += settlementPriceFutureOptionsSummaryMessageFractionPair.byteLength();
        if (!previousSettlementPriceFractionPair.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += previousSettlementPriceFractionPair.byteLength();
        return reason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = contractMonthCode.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = callPutCode.encode(data, cursor);
        cursor = strikePriceInstrumentFractionPair.encode(data, cursor);
        cursor = bidPriceSummaryFractionPair.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceSummaryFractionPair.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = lastPriceFutureOptionsSummaryMessageFractionPair.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = tick.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChangeFutureOptionsSummaryMessageFractionPair.encode(data, cursor);
        cursor = openingPriceFractionPair.encode(data, cursor);
        cursor = highPriceFractionPair.encode(data, cursor);
        cursor = lowPriceFractionPair.encode(data, cursor);
        if (buffer != null && buffer.length >= 99) {
            System.arraycopy(buffer, 97, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = underlyingSymbolRootFutureOptions.encode(data, cursor);
        cursor = deliveryMonth.encode(data, cursor);
        cursor = deliveryYearUnderlying.encode(data, cursor);
        cursor = settlementPriceFutureOptionsSummaryMessageFractionPair.encode(data, cursor);
        cursor = previousSettlementPriceFractionPair.encode(data, cursor);
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
        strikePriceInstrumentFractionPair.clear();
        bidPriceSummaryFractionPair.clear();
        askPriceSummaryFractionPair.clear();
        lastPriceFutureOptionsSummaryMessageFractionPair.clear();
        netChangeFutureOptionsSummaryMessageFractionPair.clear();
        openingPriceFractionPair.clear();
        highPriceFractionPair.clear();
        lowPriceFractionPair.clear();
        settlementPriceFutureOptionsSummaryMessageFractionPair.clear();
        previousSettlementPriceFractionPair.clear();
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
        if (!strikePriceInstrumentFractionPair.isRecognized()) {
            return false;
        }
        if (!bidPriceSummaryFractionPair.isRecognized()) {
            return false;
        }
        if (!askPriceSummaryFractionPair.isRecognized()) {
            return false;
        }
        if (!lastPriceFutureOptionsSummaryMessageFractionPair.isRecognized()) {
            return false;
        }
        if (!netChangeFutureOptionsSummaryMessageFractionPair.isRecognized()) {
            return false;
        }
        if (!openingPriceFractionPair.isRecognized()) {
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
        return previousSettlementPriceFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!strikePriceInstrumentFractionPair.isValid()) {
            return false;
        }
        if (!bidPriceSummaryFractionPair.isValid()) {
            return false;
        }
        if (!askPriceSummaryFractionPair.isValid()) {
            return false;
        }
        if (!lastPriceFutureOptionsSummaryMessageFractionPair.isValid()) {
            return false;
        }
        if (!netChangeFutureOptionsSummaryMessageFractionPair.isValid()) {
            return false;
        }
        if (!openingPriceFractionPair.isValid()) {
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
        if (!previousSettlementPriceFractionPair.isValid()) {
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
            case "ContractMonthCode" -> Optional.of(contractMonthCode);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "CallPutCode" -> Optional.of(callPutCode);
            case "BidSize" -> Optional.of(bidSize);
            case "AskSize" -> Optional.of(askSize);
            case "OpenInterest" -> Optional.of(openInterest);
            case "Tick" -> Optional.of(tick);
            case "Volume" -> Optional.of(volume);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "UnderlyingSymbolRootFutureOptions" -> Optional.of(underlyingSymbolRootFutureOptions);
            case "DeliveryMonth" -> Optional.of(deliveryMonth);
            case "DeliveryYearUnderlying" -> Optional.of(deliveryYearUnderlying);
            case "Reason" -> Optional.of(reason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FutureOptionsSummaryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strikePriceInstrumentFractionPair.diffFields(message.strikePriceInstrumentFractionPair));
        changed.addAll(bidPriceSummaryFractionPair.diffFields(message.bidPriceSummaryFractionPair));
        changed.addAll(askPriceSummaryFractionPair.diffFields(message.askPriceSummaryFractionPair));
        changed.addAll(lastPriceFutureOptionsSummaryMessageFractionPair.diffFields(message.lastPriceFutureOptionsSummaryMessageFractionPair));
        changed.addAll(netChangeFutureOptionsSummaryMessageFractionPair.diffFields(message.netChangeFutureOptionsSummaryMessageFractionPair));
        changed.addAll(openingPriceFractionPair.diffFields(message.openingPriceFractionPair));
        changed.addAll(highPriceFractionPair.diffFields(message.highPriceFractionPair));
        changed.addAll(lowPriceFractionPair.diffFields(message.lowPriceFractionPair));
        changed.addAll(settlementPriceFutureOptionsSummaryMessageFractionPair.diffFields(message.settlementPriceFutureOptionsSummaryMessageFractionPair));
        changed.addAll(previousSettlementPriceFractionPair.diffFields(message.previousSettlementPriceFractionPair));
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
            strikePriceInstrumentFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            bidPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            askPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lastPriceFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            netChangeFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            openingPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            highPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lowPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            settlementPriceFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            previousSettlementPriceFractionPair.toFormattedString(builder, options);
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
        strikePriceInstrumentFractionPair.toFormattedString(builder, nested);
        bidPriceSummaryFractionPair.toFormattedString(builder, nested);
        askPriceSummaryFractionPair.toFormattedString(builder, nested);
        lastPriceFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, nested);
        netChangeFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, nested);
        openingPriceFractionPair.toFormattedString(builder, nested);
        highPriceFractionPair.toFormattedString(builder, nested);
        lowPriceFractionPair.toFormattedString(builder, nested);
        settlementPriceFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, nested);
        previousSettlementPriceFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && strikePriceInstrumentFractionPair.equals(message.strikePriceInstrumentFractionPair) && bidPriceSummaryFractionPair.equals(message.bidPriceSummaryFractionPair) && askPriceSummaryFractionPair.equals(message.askPriceSummaryFractionPair) && lastPriceFutureOptionsSummaryMessageFractionPair.equals(message.lastPriceFutureOptionsSummaryMessageFractionPair) && netChangeFutureOptionsSummaryMessageFractionPair.equals(message.netChangeFutureOptionsSummaryMessageFractionPair) && openingPriceFractionPair.equals(message.openingPriceFractionPair) && highPriceFractionPair.equals(message.highPriceFractionPair) && lowPriceFractionPair.equals(message.lowPriceFractionPair) && settlementPriceFutureOptionsSummaryMessageFractionPair.equals(message.settlementPriceFutureOptionsSummaryMessageFractionPair) && previousSettlementPriceFractionPair.equals(message.previousSettlementPriceFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strikePriceInstrumentFractionPair, bidPriceSummaryFractionPair, askPriceSummaryFractionPair, lastPriceFutureOptionsSummaryMessageFractionPair, netChangeFutureOptionsSummaryMessageFractionPair, openingPriceFractionPair, highPriceFractionPair, lowPriceFractionPair, settlementPriceFutureOptionsSummaryMessageFractionPair, previousSettlementPriceFractionPair);
    }
}
