package omi.lseg.turquoise.analytics.gtp.v24_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.BidAskSpreadField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.BuyLimitOrderCancellationsField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.BuyMarketOrderCancellationsField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.BuyOrderCancellationsField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.BuyOrderCountField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.BuyOrderSizeField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.EndTimeField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.InstrumentField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.SellLimitOrderCancellationsField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.SellMarketOrderCancellationsField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.SellOrderCancellationsField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.SellOrderCountField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.SellOrderSizeField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.SourceVenueField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.StartTimeField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.TimestampField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.VwapBuyField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.VwapSellField;
import omi.lseg.turquoise.analytics.gtp.v24_4.types.Field;
import omi.lseg.turquoise.analytics.gtp.v24_4.types.Message;
import omi.lseg.turquoise.analytics.gtp.v24_4.types.PrintOptions;

/**
 * Represents the AnalyticsMessage message from the Analytics protocol.
 *
 * <p>Used to disseminate additional statistics including order book activity statistics</p>
 */
public final class AnalyticsMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 106;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Analytics Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Venue from which market data is received for the instrument
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Time the calculation of the statistics on this message began.
     */
    private final StartTimeField startTime = new StartTimeField();

    /**
     * Time the calculation of the statistics on this message ended.
     */
    private final EndTimeField endTime = new EndTimeField();

    /**
     * Number of buy orders received within the calculation window.
     */
    private final BuyOrderCountField buyOrderCount = new BuyOrderCountField();

    /**
     * Number of sell orders received within the calculation window.
     */
    private final SellOrderCountField sellOrderCount = new SellOrderCountField();

    /**
     * Cumulative quantity of all buy orders received within the calculation window.
     */
    private final BuyOrderSizeField buyOrderSize = new BuyOrderSizeField();

    /**
     * Cumulative quantity of all sell orders received within the calculation window.
     */
    private final SellOrderSizeField sellOrderSize = new SellOrderSizeField();

    /**
     * Number of buy orders cancelled by clients within the calculation window.
     */
    private final BuyOrderCancellationsField buyOrderCancellations = new BuyOrderCancellationsField();

    /**
     * Number of sell orders cancelled by clients within the calculation window.
     */
    private final SellOrderCancellationsField sellOrderCancellations = new SellOrderCancellationsField();

    /**
     * Number of buy limit orders cancelled by clients within the calculation window.
     */
    private final BuyLimitOrderCancellationsField buyLimitOrderCancellations = new BuyLimitOrderCancellationsField();

    /**
     * Number of buy market orders cancelled by clients within the calculation window.
     */
    private final BuyMarketOrderCancellationsField buyMarketOrderCancellations = new BuyMarketOrderCancellationsField();

    /**
     * Number of sell limit orders cancelled by clients within the calculation window.
     */
    private final SellLimitOrderCancellationsField sellLimitOrderCancellations = new SellLimitOrderCancellationsField();

    /**
     * Number of sell market orders cancelled by clients within the calculation window.
     */
    private final SellMarketOrderCancellationsField sellMarketOrderCancellations = new SellMarketOrderCancellationsField();

    /**
     * Most Recent Bid/Ask spread at the time of publication of the message.
     */
    private final BidAskSpreadField bidAskSpread = new BidAskSpreadField();

    /**
     * Volume Weighted Average Price for trades triggered by an aggressing buy order. Calculated within the calculation window for trades executed in continuous trading.
     */
    private final VwapBuyField vwapBuy = new VwapBuyField();

    /**
     * Volume Weighted Average Price for trades triggered by an aggressing sell order. Calculated within the calculation window for trades executed in continuous trading.
     */
    private final VwapSellField vwapSell = new VwapSellField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, sourceVenue, startTime, endTime, buyOrderCount, sellOrderCount, buyOrderSize, sellOrderSize, buyOrderCancellations, sellOrderCancellations, buyLimitOrderCancellations, buyMarketOrderCancellations, sellLimitOrderCancellations, sellMarketOrderCancellations, bidAskSpread, vwapBuy, vwapSell);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * GTP Instrument identifier.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Venue from which market data is received for the instrument
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * Time the calculation of the statistics on this message began.
     *
     * @return the StartTime field
     */
    public StartTimeField startTime() {
        return startTime;
    }

    /**
     * Time the calculation of the statistics on this message ended.
     *
     * @return the EndTime field
     */
    public EndTimeField endTime() {
        return endTime;
    }

    /**
     * Number of buy orders received within the calculation window.
     *
     * @return the BuyOrderCount field
     */
    public BuyOrderCountField buyOrderCount() {
        return buyOrderCount;
    }

    /**
     * Number of sell orders received within the calculation window.
     *
     * @return the SellOrderCount field
     */
    public SellOrderCountField sellOrderCount() {
        return sellOrderCount;
    }

    /**
     * Cumulative quantity of all buy orders received within the calculation window.
     *
     * @return the BuyOrderSize field
     */
    public BuyOrderSizeField buyOrderSize() {
        return buyOrderSize;
    }

    /**
     * Cumulative quantity of all sell orders received within the calculation window.
     *
     * @return the SellOrderSize field
     */
    public SellOrderSizeField sellOrderSize() {
        return sellOrderSize;
    }

    /**
     * Number of buy orders cancelled by clients within the calculation window.
     *
     * @return the BuyOrderCancellations field
     */
    public BuyOrderCancellationsField buyOrderCancellations() {
        return buyOrderCancellations;
    }

    /**
     * Number of sell orders cancelled by clients within the calculation window.
     *
     * @return the SellOrderCancellations field
     */
    public SellOrderCancellationsField sellOrderCancellations() {
        return sellOrderCancellations;
    }

    /**
     * Number of buy limit orders cancelled by clients within the calculation window.
     *
     * @return the BuyLimitOrderCancellations field
     */
    public BuyLimitOrderCancellationsField buyLimitOrderCancellations() {
        return buyLimitOrderCancellations;
    }

    /**
     * Number of buy market orders cancelled by clients within the calculation window.
     *
     * @return the BuyMarketOrderCancellations field
     */
    public BuyMarketOrderCancellationsField buyMarketOrderCancellations() {
        return buyMarketOrderCancellations;
    }

    /**
     * Number of sell limit orders cancelled by clients within the calculation window.
     *
     * @return the SellLimitOrderCancellations field
     */
    public SellLimitOrderCancellationsField sellLimitOrderCancellations() {
        return sellLimitOrderCancellations;
    }

    /**
     * Number of sell market orders cancelled by clients within the calculation window.
     *
     * @return the SellMarketOrderCancellations field
     */
    public SellMarketOrderCancellationsField sellMarketOrderCancellations() {
        return sellMarketOrderCancellations;
    }

    /**
     * Most Recent Bid/Ask spread at the time of publication of the message.
     *
     * @return the BidAskSpread field
     */
    public BidAskSpreadField bidAskSpread() {
        return bidAskSpread;
    }

    /**
     * Volume Weighted Average Price for trades triggered by an aggressing buy order. Calculated within the calculation window for trades executed in continuous trading.
     *
     * @return the VwapBuy field
     */
    public VwapBuyField vwapBuy() {
        return vwapBuy;
    }

    /**
     * Volume Weighted Average Price for trades triggered by an aggressing sell order. Calculated within the calculation window for trades executed in continuous trading.
     *
     * @return the VwapSell field
     */
    public VwapSellField vwapSell() {
        return vwapSell;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!startTime.parse(data, cursor)) {
            return false;
        }
        cursor += StartTimeField.BYTE_LENGTH;
        if (!endTime.parse(data, cursor)) {
            return false;
        }
        cursor += EndTimeField.BYTE_LENGTH;
        if (!buyOrderCount.parse(data, cursor)) {
            return false;
        }
        cursor += BuyOrderCountField.BYTE_LENGTH;
        if (!sellOrderCount.parse(data, cursor)) {
            return false;
        }
        cursor += SellOrderCountField.BYTE_LENGTH;
        if (!buyOrderSize.parse(data, cursor)) {
            return false;
        }
        cursor += BuyOrderSizeField.BYTE_LENGTH;
        if (!sellOrderSize.parse(data, cursor)) {
            return false;
        }
        cursor += SellOrderSizeField.BYTE_LENGTH;
        if (!buyOrderCancellations.parse(data, cursor)) {
            return false;
        }
        cursor += BuyOrderCancellationsField.BYTE_LENGTH;
        if (!sellOrderCancellations.parse(data, cursor)) {
            return false;
        }
        cursor += SellOrderCancellationsField.BYTE_LENGTH;
        if (!buyLimitOrderCancellations.parse(data, cursor)) {
            return false;
        }
        cursor += BuyLimitOrderCancellationsField.BYTE_LENGTH;
        if (!buyMarketOrderCancellations.parse(data, cursor)) {
            return false;
        }
        cursor += BuyMarketOrderCancellationsField.BYTE_LENGTH;
        if (!sellLimitOrderCancellations.parse(data, cursor)) {
            return false;
        }
        cursor += SellLimitOrderCancellationsField.BYTE_LENGTH;
        if (!sellMarketOrderCancellations.parse(data, cursor)) {
            return false;
        }
        cursor += SellMarketOrderCancellationsField.BYTE_LENGTH;
        if (!bidAskSpread.parse(data, cursor)) {
            return false;
        }
        cursor += BidAskSpreadField.BYTE_LENGTH;
        if (!vwapBuy.parse(data, cursor)) {
            return false;
        }
        cursor += VwapBuyField.BYTE_LENGTH;
        return vwapSell.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = startTime.encode(data, cursor);
        cursor = endTime.encode(data, cursor);
        cursor = buyOrderCount.encode(data, cursor);
        cursor = sellOrderCount.encode(data, cursor);
        cursor = buyOrderSize.encode(data, cursor);
        cursor = sellOrderSize.encode(data, cursor);
        cursor = buyOrderCancellations.encode(data, cursor);
        cursor = sellOrderCancellations.encode(data, cursor);
        cursor = buyLimitOrderCancellations.encode(data, cursor);
        cursor = buyMarketOrderCancellations.encode(data, cursor);
        cursor = sellLimitOrderCancellations.encode(data, cursor);
        cursor = sellMarketOrderCancellations.encode(data, cursor);
        cursor = bidAskSpread.encode(data, cursor);
        cursor = vwapBuy.encode(data, cursor);
        cursor = vwapSell.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Instrument" -> Optional.of(instrument);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "StartTime" -> Optional.of(startTime);
            case "EndTime" -> Optional.of(endTime);
            case "BuyOrderCount" -> Optional.of(buyOrderCount);
            case "SellOrderCount" -> Optional.of(sellOrderCount);
            case "BuyOrderSize" -> Optional.of(buyOrderSize);
            case "SellOrderSize" -> Optional.of(sellOrderSize);
            case "BuyOrderCancellations" -> Optional.of(buyOrderCancellations);
            case "SellOrderCancellations" -> Optional.of(sellOrderCancellations);
            case "BuyLimitOrderCancellations" -> Optional.of(buyLimitOrderCancellations);
            case "BuyMarketOrderCancellations" -> Optional.of(buyMarketOrderCancellations);
            case "SellLimitOrderCancellations" -> Optional.of(sellLimitOrderCancellations);
            case "SellMarketOrderCancellations" -> Optional.of(sellMarketOrderCancellations);
            case "BidAskSpread" -> Optional.of(bidAskSpread);
            case "VwapBuy" -> Optional.of(vwapBuy);
            case "VwapSell" -> Optional.of(vwapSell);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AnalyticsMessage message)) {
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
        if (!(other instanceof AnalyticsMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
