package omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.fields.DbExecIdField;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.fields.PriceField;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.fields.PrintableFlagField;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.fields.SourceTimeNsField;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.fields.SymbolIndexField;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.fields.SymbolSeqNumField;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.fields.TradeIdField;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.fields.VolumeField;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.types.Field;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.types.Message;
import omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.types.PrintOptions;

/**
 * Represents the NonDisplayedTradeMessage message from the IntegratedFeed protocol.
 *
 * <p>An Non Displayed Trade message is sent as a result of a match between two non-displayed orders.</p>
 */
public final class NonDisplayedTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Non Displayed Trade Message";

    /**
     * The nanosecond offset from the SourceTime
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * Reserved for future use. Ignore any content. This usage will become standard across all products in future releases.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * The TradeID of the original Trade or Execution message to be cancelled.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * The order price. Use with the Price Scale from the symbol-mapping index.
     */
    private final PriceField price = new PriceField();

    /**
     * The order quantity in shares
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Printable flag values
     */
    private final PrintableFlagField printableFlag = new PrintableFlagField();

    /**
     * For Pillar-powered markets, unused, defaulted to 0. For NYSE Tape A symbols, DB ExecID is assigned by the matching engine to all orders that participated in this trade event.
     */
    private final DbExecIdField dbExecId = new DbExecIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTimeNs, symbolIndex, symbolSeqNum, tradeId, price, volume, printableFlag, dbExecId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The nanosecond offset from the SourceTime
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * Reserved for future use. Ignore any content. This usage will become standard across all products in future releases.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * The TradeID of the original Trade or Execution message to be cancelled.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * The order price. Use with the Price Scale from the symbol-mapping index.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The order quantity in shares
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Printable flag values
     *
     * @return the PrintableFlag field
     */
    public PrintableFlagField printableFlag() {
        return printableFlag;
    }

    /**
     * For Pillar-powered markets, unused, defaulted to 0. For NYSE Tape A symbols, DB ExecID is assigned by the matching engine to all orders that participated in this trade event.
     *
     * @return the DbExecId field
     */
    public DbExecIdField dbExecId() {
        return dbExecId;
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
        if (!sourceTimeNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeNsField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!printableFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PrintableFlagField.BYTE_LENGTH;
        return dbExecId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = printableFlag.encode(data, cursor);
        cursor = dbExecId.encode(data, cursor);
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
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "TradeId" -> Optional.of(tradeId);
            case "Price" -> Optional.of(price);
            case "Volume" -> Optional.of(volume);
            case "PrintableFlag" -> Optional.of(printableFlag);
            case "DbExecId" -> Optional.of(dbExecId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NonDisplayedTradeMessage message)) {
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
        if (!(other instanceof NonDisplayedTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
