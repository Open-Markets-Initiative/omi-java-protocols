package omi.miax.pearloptions.topofmarket.mach.v2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.CorrectionNumberField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.NanosecondsField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.ProductIdField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.ReferenceCorrectionNumberField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.ReferenceTradeIdField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.TradeConditionField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.TradeIdField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.TradePriceField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.fields.TradeSizeField;
import omi.miax.pearloptions.topofmarket.mach.v2_3.types.Field;
import omi.miax.pearloptions.topofmarket.mach.v2_3.types.Message;
import omi.miax.pearloptions.topofmarket.mach.v2_3.types.PrintOptions;

/**
 * Represents the LastSaleMessage message from the TopOfMarket protocol.
 *
 * <p>This is the message format that will be used to disseminate Trades that are resulting from executions on MIAX during the current trading session.</p>
 */
public final class LastSaleMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Last Sale Message";

    /**
     * Time at which this product is added/updated on MIAX system today.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * MIAX Product ID mapped to a given option. It is assigned per trading session and is valid for that session.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Unique Trade ID assigned to every Trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade correction number. 0 for New trades. Greater than or equal to 0 for trades resulting from corrections/adjustments.
     */
    private final CorrectionNumberField correctionNumber = new CorrectionNumberField();

    /**
     * 0 (zero) if new trade. Trade ID of the original trade if this trade originated as a correction of the original trade.
     */
    private final ReferenceTradeIdField referenceTradeId = new ReferenceTradeIdField();

    /**
     * Correction Number of the trade that was just corrected/adjusted. 0 for new trades.
     */
    private final ReferenceCorrectionNumberField referenceCorrectionNumber = new ReferenceCorrectionNumberField();

    /**
     * Price at which this product traded
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Number of contracts executed in this trade
     */
    private final TradeSizeField tradeSize = new TradeSizeField();

    /**
     * Trade Condition Value
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, productId, tradeId, correctionNumber, referenceTradeId, referenceCorrectionNumber, tradePrice, tradeSize, tradeCondition);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time at which this product is added/updated on MIAX system today.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * MIAX Product ID mapped to a given option. It is assigned per trading session and is valid for that session.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * Unique Trade ID assigned to every Trade.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade correction number. 0 for New trades. Greater than or equal to 0 for trades resulting from corrections/adjustments.
     *
     * @return the CorrectionNumber field
     */
    public CorrectionNumberField correctionNumber() {
        return correctionNumber;
    }

    /**
     * 0 (zero) if new trade. Trade ID of the original trade if this trade originated as a correction of the original trade.
     *
     * @return the ReferenceTradeId field
     */
    public ReferenceTradeIdField referenceTradeId() {
        return referenceTradeId;
    }

    /**
     * Correction Number of the trade that was just corrected/adjusted. 0 for new trades.
     *
     * @return the ReferenceCorrectionNumber field
     */
    public ReferenceCorrectionNumberField referenceCorrectionNumber() {
        return referenceCorrectionNumber;
    }

    /**
     * Price at which this product traded
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Number of contracts executed in this trade
     *
     * @return the TradeSize field
     */
    public TradeSizeField tradeSize() {
        return tradeSize;
    }

    /**
     * Trade Condition Value
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!correctionNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectionNumberField.BYTE_LENGTH;
        if (!referenceTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceTradeIdField.BYTE_LENGTH;
        if (!referenceCorrectionNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceCorrectionNumberField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSizeField.BYTE_LENGTH;
        return tradeCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = correctionNumber.encode(data, cursor);
        cursor = referenceTradeId.encode(data, cursor);
        cursor = referenceCorrectionNumber.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeSize.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "ProductId" -> Optional.of(productId);
            case "TradeId" -> Optional.of(tradeId);
            case "CorrectionNumber" -> Optional.of(correctionNumber);
            case "ReferenceTradeId" -> Optional.of(referenceTradeId);
            case "ReferenceCorrectionNumber" -> Optional.of(referenceCorrectionNumber);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradeSize" -> Optional.of(tradeSize);
            case "TradeCondition" -> Optional.of(tradeCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LastSaleMessage message)) {
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
        if (!(other instanceof LastSaleMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
