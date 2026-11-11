package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.BestAskImpliedPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.BestAskImpliedQtyField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.BestBidImpliedPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.BestBidImpliedQtyField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.ClosePriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.DayOpenPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.DefinitionFlagsField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.HighPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.IndicativeOpenPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.LastTradePriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.LastTradeQtyField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.LastTradeTimeField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.LimitDownPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.LimitUpPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.LowPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.NextAskImpliedPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.NextAskImpliedQtyField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.NextBidImpliedPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.NextBidImpliedQtyField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.OpenInterestField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.PriorSettlementPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.SettlementPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.SnapshotSeqNumField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.TradeVolumeField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.VwapPriceOptionalField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.types.Field;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.types.Message;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.types.PrintOptions;

/**
 * Represents the EndOfSnapshotMessage message from the MarketDataApi protocol.
 *
 * <p>EndOfSnapshotMessage</p>
 */
public final class EndOfSnapshotMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 160;

    /**
     * This message's declared name.
     */
    public static final String NAME = "End Of Snapshot Message";

    /**
     * snapshotSeqNum
     */
    private final SnapshotSeqNumField snapshotSeqNum = new SnapshotSeqNumField();

    /**
     * tradeVolume
     */
    private final TradeVolumeField tradeVolume = new TradeVolumeField();

    /**
     * indicativeOpenPrice
     */
    private final IndicativeOpenPriceField indicativeOpenPrice = new IndicativeOpenPriceField();

    /**
     * dayOpenPrice
     */
    private final DayOpenPriceField dayOpenPrice = new DayOpenPriceField();

    /**
     * closePrice
     */
    private final ClosePriceField closePrice = new ClosePriceField();

    /**
     * lowPrice
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * highPrice
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * vwapPrice
     */
    private final VwapPriceOptionalField vwapPriceOptional = new VwapPriceOptionalField();

    /**
     * settlementPrice
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * lastTradePrice
     */
    private final LastTradePriceField lastTradePrice = new LastTradePriceField();

    /**
     * lastTradeTime
     */
    private final LastTradeTimeField lastTradeTime = new LastTradeTimeField();

    /**
     * bestBidImpliedPrice
     */
    private final BestBidImpliedPriceField bestBidImpliedPrice = new BestBidImpliedPriceField();

    /**
     * bestAskImpliedPrice
     */
    private final BestAskImpliedPriceField bestAskImpliedPrice = new BestAskImpliedPriceField();

    /**
     * nextBidImpliedPrice
     */
    private final NextBidImpliedPriceField nextBidImpliedPrice = new NextBidImpliedPriceField();

    /**
     * nextAskImpliedPrice
     */
    private final NextAskImpliedPriceField nextAskImpliedPrice = new NextAskImpliedPriceField();

    /**
     * limitDownPrice
     */
    private final LimitDownPriceField limitDownPrice = new LimitDownPriceField();

    /**
     * limitUpPrice
     */
    private final LimitUpPriceField limitUpPrice = new LimitUpPriceField();

    /**
     * lastTradeQty
     */
    private final LastTradeQtyField lastTradeQty = new LastTradeQtyField();

    /**
     * openInterest
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * bestBidImpliedQty
     */
    private final BestBidImpliedQtyField bestBidImpliedQty = new BestBidImpliedQtyField();

    /**
     * bestAskImpliedQty
     */
    private final BestAskImpliedQtyField bestAskImpliedQty = new BestAskImpliedQtyField();

    /**
     * nextBidImpliedQty
     */
    private final NextBidImpliedQtyField nextBidImpliedQty = new NextBidImpliedQtyField();

    /**
     * nextAskImpliedQty
     */
    private final NextAskImpliedQtyField nextAskImpliedQty = new NextAskImpliedQtyField();

    /**
     * priorSettlementPrice
     */
    private final PriorSettlementPriceField priorSettlementPrice = new PriorSettlementPriceField();

    /**
     * InstrumentDefinitionFlags bit set
     */
    private final DefinitionFlagsField definitionFlags = new DefinitionFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(snapshotSeqNum, tradeVolume, indicativeOpenPrice, dayOpenPrice, closePrice, lowPrice, highPrice, vwapPriceOptional, settlementPrice, lastTradePrice, lastTradeTime, bestBidImpliedPrice, bestAskImpliedPrice, nextBidImpliedPrice, nextAskImpliedPrice, limitDownPrice, limitUpPrice, lastTradeQty, openInterest, bestBidImpliedQty, bestAskImpliedQty, nextBidImpliedQty, nextAskImpliedQty, priorSettlementPrice, definitionFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * snapshotSeqNum
     *
     * @return the SnapshotSeqNum field
     */
    public SnapshotSeqNumField snapshotSeqNum() {
        return snapshotSeqNum;
    }

    /**
     * tradeVolume
     *
     * @return the TradeVolume field
     */
    public TradeVolumeField tradeVolume() {
        return tradeVolume;
    }

    /**
     * indicativeOpenPrice
     *
     * @return the IndicativeOpenPrice field
     */
    public IndicativeOpenPriceField indicativeOpenPrice() {
        return indicativeOpenPrice;
    }

    /**
     * dayOpenPrice
     *
     * @return the DayOpenPrice field
     */
    public DayOpenPriceField dayOpenPrice() {
        return dayOpenPrice;
    }

    /**
     * closePrice
     *
     * @return the ClosePrice field
     */
    public ClosePriceField closePrice() {
        return closePrice;
    }

    /**
     * lowPrice
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * highPrice
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * vwapPrice
     *
     * @return the VwapPriceOptional field
     */
    public VwapPriceOptionalField vwapPriceOptional() {
        return vwapPriceOptional;
    }

    /**
     * settlementPrice
     *
     * @return the SettlementPrice field
     */
    public SettlementPriceField settlementPrice() {
        return settlementPrice;
    }

    /**
     * lastTradePrice
     *
     * @return the LastTradePrice field
     */
    public LastTradePriceField lastTradePrice() {
        return lastTradePrice;
    }

    /**
     * lastTradeTime
     *
     * @return the LastTradeTime field
     */
    public LastTradeTimeField lastTradeTime() {
        return lastTradeTime;
    }

    /**
     * bestBidImpliedPrice
     *
     * @return the BestBidImpliedPrice field
     */
    public BestBidImpliedPriceField bestBidImpliedPrice() {
        return bestBidImpliedPrice;
    }

    /**
     * bestAskImpliedPrice
     *
     * @return the BestAskImpliedPrice field
     */
    public BestAskImpliedPriceField bestAskImpliedPrice() {
        return bestAskImpliedPrice;
    }

    /**
     * nextBidImpliedPrice
     *
     * @return the NextBidImpliedPrice field
     */
    public NextBidImpliedPriceField nextBidImpliedPrice() {
        return nextBidImpliedPrice;
    }

    /**
     * nextAskImpliedPrice
     *
     * @return the NextAskImpliedPrice field
     */
    public NextAskImpliedPriceField nextAskImpliedPrice() {
        return nextAskImpliedPrice;
    }

    /**
     * limitDownPrice
     *
     * @return the LimitDownPrice field
     */
    public LimitDownPriceField limitDownPrice() {
        return limitDownPrice;
    }

    /**
     * limitUpPrice
     *
     * @return the LimitUpPrice field
     */
    public LimitUpPriceField limitUpPrice() {
        return limitUpPrice;
    }

    /**
     * lastTradeQty
     *
     * @return the LastTradeQty field
     */
    public LastTradeQtyField lastTradeQty() {
        return lastTradeQty;
    }

    /**
     * openInterest
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * bestBidImpliedQty
     *
     * @return the BestBidImpliedQty field
     */
    public BestBidImpliedQtyField bestBidImpliedQty() {
        return bestBidImpliedQty;
    }

    /**
     * bestAskImpliedQty
     *
     * @return the BestAskImpliedQty field
     */
    public BestAskImpliedQtyField bestAskImpliedQty() {
        return bestAskImpliedQty;
    }

    /**
     * nextBidImpliedQty
     *
     * @return the NextBidImpliedQty field
     */
    public NextBidImpliedQtyField nextBidImpliedQty() {
        return nextBidImpliedQty;
    }

    /**
     * nextAskImpliedQty
     *
     * @return the NextAskImpliedQty field
     */
    public NextAskImpliedQtyField nextAskImpliedQty() {
        return nextAskImpliedQty;
    }

    /**
     * priorSettlementPrice
     *
     * @return the PriorSettlementPrice field
     */
    public PriorSettlementPriceField priorSettlementPrice() {
        return priorSettlementPrice;
    }

    /**
     * InstrumentDefinitionFlags bit set
     *
     * @return the DefinitionFlags field
     */
    public DefinitionFlagsField definitionFlags() {
        return definitionFlags;
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
        return Optional.ofNullable(lastTradeTime.value());
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
        if (!snapshotSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SnapshotSeqNumField.BYTE_LENGTH;
        if (!tradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TradeVolumeField.BYTE_LENGTH;
        if (!indicativeOpenPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeOpenPriceField.BYTE_LENGTH;
        if (!dayOpenPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DayOpenPriceField.BYTE_LENGTH;
        if (!closePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClosePriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!vwapPriceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += VwapPriceOptionalField.BYTE_LENGTH;
        if (!settlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceField.BYTE_LENGTH;
        if (!lastTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradePriceField.BYTE_LENGTH;
        if (!lastTradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeTimeField.BYTE_LENGTH;
        if (!bestBidImpliedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidImpliedPriceField.BYTE_LENGTH;
        if (!bestAskImpliedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestAskImpliedPriceField.BYTE_LENGTH;
        if (!nextBidImpliedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NextBidImpliedPriceField.BYTE_LENGTH;
        if (!nextAskImpliedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NextAskImpliedPriceField.BYTE_LENGTH;
        if (!limitDownPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitDownPriceField.BYTE_LENGTH;
        if (!limitUpPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitUpPriceField.BYTE_LENGTH;
        if (!lastTradeQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeQtyField.BYTE_LENGTH;
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        if (!bestBidImpliedQty.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidImpliedQtyField.BYTE_LENGTH;
        if (!bestAskImpliedQty.parse(data, cursor)) {
            return false;
        }
        cursor += BestAskImpliedQtyField.BYTE_LENGTH;
        if (!nextBidImpliedQty.parse(data, cursor)) {
            return false;
        }
        cursor += NextBidImpliedQtyField.BYTE_LENGTH;
        if (!nextAskImpliedQty.parse(data, cursor)) {
            return false;
        }
        cursor += NextAskImpliedQtyField.BYTE_LENGTH;
        if (!priorSettlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PriorSettlementPriceField.BYTE_LENGTH;
        return definitionFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = snapshotSeqNum.encode(data, cursor);
        cursor = tradeVolume.encode(data, cursor);
        cursor = indicativeOpenPrice.encode(data, cursor);
        cursor = dayOpenPrice.encode(data, cursor);
        cursor = closePrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = vwapPriceOptional.encode(data, cursor);
        cursor = settlementPrice.encode(data, cursor);
        cursor = lastTradePrice.encode(data, cursor);
        cursor = lastTradeTime.encode(data, cursor);
        cursor = bestBidImpliedPrice.encode(data, cursor);
        cursor = bestAskImpliedPrice.encode(data, cursor);
        cursor = nextBidImpliedPrice.encode(data, cursor);
        cursor = nextAskImpliedPrice.encode(data, cursor);
        cursor = limitDownPrice.encode(data, cursor);
        cursor = limitUpPrice.encode(data, cursor);
        cursor = lastTradeQty.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = bestBidImpliedQty.encode(data, cursor);
        cursor = bestAskImpliedQty.encode(data, cursor);
        cursor = nextBidImpliedQty.encode(data, cursor);
        cursor = nextAskImpliedQty.encode(data, cursor);
        cursor = priorSettlementPrice.encode(data, cursor);
        cursor = definitionFlags.encode(data, cursor);
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
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
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
            case "SnapshotSeqNum" -> Optional.of(snapshotSeqNum);
            case "TradeVolume" -> Optional.of(tradeVolume);
            case "IndicativeOpenPrice" -> Optional.of(indicativeOpenPrice);
            case "DayOpenPrice" -> Optional.of(dayOpenPrice);
            case "ClosePrice" -> Optional.of(closePrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "HighPrice" -> Optional.of(highPrice);
            case "VwapPriceOptional" -> Optional.of(vwapPriceOptional);
            case "SettlementPrice" -> Optional.of(settlementPrice);
            case "LastTradePrice" -> Optional.of(lastTradePrice);
            case "LastTradeTime" -> Optional.of(lastTradeTime);
            case "BestBidImpliedPrice" -> Optional.of(bestBidImpliedPrice);
            case "BestAskImpliedPrice" -> Optional.of(bestAskImpliedPrice);
            case "NextBidImpliedPrice" -> Optional.of(nextBidImpliedPrice);
            case "NextAskImpliedPrice" -> Optional.of(nextAskImpliedPrice);
            case "LimitDownPrice" -> Optional.of(limitDownPrice);
            case "LimitUpPrice" -> Optional.of(limitUpPrice);
            case "LastTradeQty" -> Optional.of(lastTradeQty);
            case "OpenInterest" -> Optional.of(openInterest);
            case "BestBidImpliedQty" -> Optional.of(bestBidImpliedQty);
            case "BestAskImpliedQty" -> Optional.of(bestAskImpliedQty);
            case "NextBidImpliedQty" -> Optional.of(nextBidImpliedQty);
            case "NextAskImpliedQty" -> Optional.of(nextAskImpliedQty);
            case "PriorSettlementPrice" -> Optional.of(priorSettlementPrice);
            case "DefinitionFlags" -> Optional.of(definitionFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EndOfSnapshotMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
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
        if (!(other instanceof EndOfSnapshotMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
