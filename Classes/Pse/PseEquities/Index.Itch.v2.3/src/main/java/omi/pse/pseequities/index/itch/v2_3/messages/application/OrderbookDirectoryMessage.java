package omi.pse.pseequities.index.itch.v2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.pse.pseequities.index.itch.v2_3.fields.CurrencyField;
import omi.pse.pseequities.index.itch.v2_3.fields.DelistingDateField;
import omi.pse.pseequities.index.itch.v2_3.fields.DelistingTimeField;
import omi.pse.pseequities.index.itch.v2_3.fields.GroupField;
import omi.pse.pseequities.index.itch.v2_3.fields.InstrumentTypeField;
import omi.pse.pseequities.index.itch.v2_3.fields.IsinField;
import omi.pse.pseequities.index.itch.v2_3.fields.LotSizeField;
import omi.pse.pseequities.index.itch.v2_3.fields.OrderbookField;
import omi.pse.pseequities.index.itch.v2_3.fields.PriceDecimalsField;
import omi.pse.pseequities.index.itch.v2_3.fields.PriceTickSizeTableIdField;
import omi.pse.pseequities.index.itch.v2_3.fields.PriceTypeField;
import omi.pse.pseequities.index.itch.v2_3.fields.ProductCodeField;
import omi.pse.pseequities.index.itch.v2_3.fields.QuantityTickSizeTableIdField;
import omi.pse.pseequities.index.itch.v2_3.fields.SecCodeField;
import omi.pse.pseequities.index.itch.v2_3.fields.SharesField;
import omi.pse.pseequities.index.itch.v2_3.fields.TimestampField;
import omi.pse.pseequities.index.itch.v2_3.types.Field;
import omi.pse.pseequities.index.itch.v2_3.types.Message;
import omi.pse.pseequities.index.itch.v2_3.types.PrintOptions;

/**
 * Represents the OrderbookDirectoryMessage message from the Index protocol.
 *
 * <p>Orderbook Directory Message.</p>
 */
public final class OrderbookDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 89;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Orderbook Directory Message";

    /**
     * Nanoseconds since last Time Stamp seconds message.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Used to identify if the event applies to a single orderbook within the Group.
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * Indicates 'per unit' price type or price as percentage.
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * ISIN code.
     */
    private final IsinField isin = new IsinField();

    /**
     * Security code.
     */
    private final SecCodeField secCode = new SecCodeField();

    /**
     * Trading currency.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Id for symbol grouping (Board level only).
     */
    private final GroupField group = new GroupField();

    /**
     * Lot size for the orderbook.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Quantity Tick Size Table.
     */
    private final QuantityTickSizeTableIdField quantityTickSizeTableId = new QuantityTickSizeTableIdField();

    /**
     * Price Tick Size Table Id.
     */
    private final PriceTickSizeTableIdField priceTickSizeTableId = new PriceTickSizeTableIdField();

    /**
     * Decimals for price fields across all messages for this orderbook.
     */
    private final PriceDecimalsField priceDecimals = new PriceDecimalsField();

    /**
     * YYYYMMDD.
     */
    private final DelistingDateField delistingDate = new DelistingDateField();

    /**
     * HHMMSS.
     */
    private final DelistingTimeField delistingTime = new DelistingTimeField();

    /**
     * Instrument Type.
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * The number of shares outstanding.
     */
    private final SharesField shares = new SharesField();

    /**
     * The product code for the orderbook.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderbook, priceType, isin, secCode, currency, group, lotSize, quantityTickSizeTableId, priceTickSizeTableId, priceDecimals, delistingDate, delistingTime, instrumentType, shares, productCode);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Time Stamp seconds message.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Used to identify if the event applies to a single orderbook within the Group.
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * Indicates 'per unit' price type or price as percentage.
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * ISIN code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Security code.
     *
     * @return the SecCode field
     */
    public SecCodeField secCode() {
        return secCode;
    }

    /**
     * Trading currency.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Id for symbol grouping (Board level only).
     *
     * @return the Group field
     */
    public GroupField group() {
        return group;
    }

    /**
     * Lot size for the orderbook.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * Quantity Tick Size Table.
     *
     * @return the QuantityTickSizeTableId field
     */
    public QuantityTickSizeTableIdField quantityTickSizeTableId() {
        return quantityTickSizeTableId;
    }

    /**
     * Price Tick Size Table Id.
     *
     * @return the PriceTickSizeTableId field
     */
    public PriceTickSizeTableIdField priceTickSizeTableId() {
        return priceTickSizeTableId;
    }

    /**
     * Decimals for price fields across all messages for this orderbook.
     *
     * @return the PriceDecimals field
     */
    public PriceDecimalsField priceDecimals() {
        return priceDecimals;
    }

    /**
     * YYYYMMDD.
     *
     * @return the DelistingDate field
     */
    public DelistingDateField delistingDate() {
        return delistingDate;
    }

    /**
     * HHMMSS.
     *
     * @return the DelistingTime field
     */
    public DelistingTimeField delistingTime() {
        return delistingTime;
    }

    /**
     * Instrument Type.
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * The number of shares outstanding.
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
    }

    /**
     * The product code for the orderbook.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!orderbook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!secCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecCodeField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!group.parse(data, cursor)) {
            return false;
        }
        cursor += GroupField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!quantityTickSizeTableId.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityTickSizeTableIdField.BYTE_LENGTH;
        if (!priceTickSizeTableId.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTickSizeTableIdField.BYTE_LENGTH;
        if (!priceDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDecimalsField.BYTE_LENGTH;
        if (!delistingDate.parse(data, cursor)) {
            return false;
        }
        cursor += DelistingDateField.BYTE_LENGTH;
        if (!delistingTime.parse(data, cursor)) {
            return false;
        }
        cursor += DelistingTimeField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        return productCode.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderbook.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = secCode.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = group.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = quantityTickSizeTableId.encode(data, cursor);
        cursor = priceTickSizeTableId.encode(data, cursor);
        cursor = priceDecimals.encode(data, cursor);
        cursor = delistingDate.encode(data, cursor);
        cursor = delistingTime.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = shares.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
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
            case "Orderbook" -> Optional.of(orderbook);
            case "PriceType" -> Optional.of(priceType);
            case "Isin" -> Optional.of(isin);
            case "SecCode" -> Optional.of(secCode);
            case "Currency" -> Optional.of(currency);
            case "Group" -> Optional.of(group);
            case "LotSize" -> Optional.of(lotSize);
            case "QuantityTickSizeTableId" -> Optional.of(quantityTickSizeTableId);
            case "PriceTickSizeTableId" -> Optional.of(priceTickSizeTableId);
            case "PriceDecimals" -> Optional.of(priceDecimals);
            case "DelistingDate" -> Optional.of(delistingDate);
            case "DelistingTime" -> Optional.of(delistingTime);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "Shares" -> Optional.of(shares);
            case "ProductCode" -> Optional.of(productCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderbookDirectoryMessage message)) {
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
        if (!(other instanceof OrderbookDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
