package omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.BoardLotSizeField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.CurrencyField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.DescriptionField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.ExpiryDateField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.FrequencyField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.InstrumentIdField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.MarketField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.SecurityTypeField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.ShortableField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.StockField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.fields.TimestampField;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.types.Field;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.types.Message;
import omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.types.PrintOptions;

/**
 * Represents the ExtendedStockDirectoryMessage message from the SnapshotRecovery protocol.
 *
 * <p>The symbol spin carries the Extended Stock Directory of bonds, debentures, rights, notes and warrants alongside the Stock Directory.</p>
 */
public final class ExtendedStockDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'r';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Extended Stock Directory Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 27, 9, 68, 3 };

    /**
     * Indicates the listing market of security
     */
    private final MarketField market = new MarketField();

    /**
     * Denotes the security symbol on Omega ATS and Lynx ATS
     */
    private final StockField stock = new StockField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Indicates a board lot size
     */
    private final BoardLotSizeField boardLotSize = new BoardLotSizeField();

    /**
     * Internal instrument identifier for Omega ATS and Lynx ATS
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Indicates the short status of a security
     */
    private final ShortableField shortable = new ShortableField();

    /**
     * Dividend frequency of the security
     */
    private final FrequencyField frequency = new FrequencyField();

    /**
     * Indicates currency for the symbol
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Instrument class of the security
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Date of expiry in the format YYYYMMDD
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Description of Security
     */
    private final DescriptionField description = new DescriptionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(market, stock, timestampField, boardLotSize, instrumentId, shortable, frequency, currency, securityType, expiryDate, description);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates the listing market of security
     *
     * @return the Market field
     */
    public MarketField market() {
        return market;
    }

    /**
     * Denotes the security symbol on Omega ATS and Lynx ATS
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Indicates a board lot size
     *
     * @return the BoardLotSize field
     */
    public BoardLotSizeField boardLotSize() {
        return boardLotSize;
    }

    /**
     * Internal instrument identifier for Omega ATS and Lynx ATS
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Indicates the short status of a security
     *
     * @return the Shortable field
     */
    public ShortableField shortable() {
        return shortable;
    }

    /**
     * Dividend frequency of the security
     *
     * @return the Frequency field
     */
    public FrequencyField frequency() {
        return frequency;
    }

    /**
     * Indicates currency for the symbol
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Instrument class of the security
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Date of expiry in the format YYYYMMDD
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Description of Security
     *
     * @return the Description field
     */
    public DescriptionField description() {
        return description;
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
        if (!market.parse(data, cursor)) {
            return false;
        }
        cursor += MarketField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!boardLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += BoardLotSizeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!shortable.parse(data, cursor)) {
            return false;
        }
        cursor += ShortableField.BYTE_LENGTH;
        if (!frequency.parse(data, cursor)) {
            return false;
        }
        cursor += FrequencyField.BYTE_LENGTH;
        cursor += 9; // padding
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        if (!description.parse(data, cursor)) {
            return false;
        }
        cursor += DescriptionField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = market.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = boardLotSize.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = shortable.encode(data, cursor);
        cursor = frequency.encode(data, cursor);
        if (buffer != null && buffer.length >= 36) {
            System.arraycopy(buffer, 27, data, cursor, 9); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 9, (byte) 0); // padding
        }
        cursor += 9;
        cursor = currency.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = description.encode(data, cursor);
        if (buffer != null && buffer.length >= 71) {
            System.arraycopy(buffer, 68, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
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
            case "Market" -> Optional.of(market);
            case "Stock" -> Optional.of(stock);
            case "Timestamp" -> Optional.of(timestampField);
            case "BoardLotSize" -> Optional.of(boardLotSize);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Shortable" -> Optional.of(shortable);
            case "Frequency" -> Optional.of(frequency);
            case "Currency" -> Optional.of(currency);
            case "SecurityType" -> Optional.of(securityType);
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "Description" -> Optional.of(description);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExtendedStockDirectoryMessage message)) {
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
        if (!(other instanceof ExtendedStockDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
