package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.AdvRiskRangeIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ListedMicField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MpvClassIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.NyseSymbolField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RoundLotSizeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.TestSymbolIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.TransactTimeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the EquitiesSymbolReferenceDataMessage message from the BinaryGateway protocol.
 *
 * <p>This message is published for each security traded on the market for which a gateway session is configured to trade and provides the information needed to enter orders for those securities.</p>
 */
public final class EquitiesSymbolReferenceDataMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 52;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Equities Symbol Reference Data Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 42, 7 };

    /**
     * Exchange application time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Identification number assigned to the security
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * NYSE/XDP Market Data symbology.
     */
    private final NyseSymbolField nyseSymbol = new NyseSymbolField();

    /**
     * Market Identifier Code (MIC) of primary market.
     */
    private final ListedMicField listedMic = new ListedMicField();

    /**
     * Round lot size.
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * ADV risk range identifier used for the Single Order Maximum Quantity as Percentage of Symbol ADV risk control.
     */
    private final AdvRiskRangeIdField advRiskRangeId = new AdvRiskRangeIdField();

    /**
     * Identification number assigned to the MPV class.
     */
    private final MpvClassIdField mpvClassId = new MpvClassIdField();

    /**
     * Test Symbol Indicator enum
     */
    private final TestSymbolIndicatorField testSymbolIndicator = new TestSymbolIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, nyseSymbol, listedMic, roundLotSize, advRiskRangeId, mpvClassId, testSymbolIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange application time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Identification number assigned to the security
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * NYSE/XDP Market Data symbology.
     *
     * @return the NyseSymbol field
     */
    public NyseSymbolField nyseSymbol() {
        return nyseSymbol;
    }

    /**
     * Market Identifier Code (MIC) of primary market.
     *
     * @return the ListedMic field
     */
    public ListedMicField listedMic() {
        return listedMic;
    }

    /**
     * Round lot size.
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * ADV risk range identifier used for the Single Order Maximum Quantity as Percentage of Symbol ADV risk control.
     *
     * @return the AdvRiskRangeId field
     */
    public AdvRiskRangeIdField advRiskRangeId() {
        return advRiskRangeId;
    }

    /**
     * Identification number assigned to the MPV class.
     *
     * @return the MpvClassId field
     */
    public MpvClassIdField mpvClassId() {
        return mpvClassId;
    }

    /**
     * Test Symbol Indicator enum
     *
     * @return the TestSymbolIndicator field
     */
    public TestSymbolIndicatorField testSymbolIndicator() {
        return testSymbolIndicator;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!nyseSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += NyseSymbolField.BYTE_LENGTH;
        if (!listedMic.parse(data, cursor)) {
            return false;
        }
        cursor += ListedMicField.BYTE_LENGTH;
        if (!roundLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotSizeField.BYTE_LENGTH;
        if (!advRiskRangeId.parse(data, cursor)) {
            return false;
        }
        cursor += AdvRiskRangeIdField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!mpvClassId.parse(data, cursor)) {
            return false;
        }
        cursor += MpvClassIdField.BYTE_LENGTH;
        return testSymbolIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = nyseSymbol.encode(data, cursor);
        cursor = listedMic.encode(data, cursor);
        cursor = roundLotSize.encode(data, cursor);
        cursor = advRiskRangeId.encode(data, cursor);
        if (buffer != null && buffer.length >= 49) {
            System.arraycopy(buffer, 42, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = mpvClassId.encode(data, cursor);
        cursor = testSymbolIndicator.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SymbolId" -> Optional.of(symbolId);
            case "NyseSymbol" -> Optional.of(nyseSymbol);
            case "ListedMic" -> Optional.of(listedMic);
            case "RoundLotSize" -> Optional.of(roundLotSize);
            case "AdvRiskRangeId" -> Optional.of(advRiskRangeId);
            case "MpvClassId" -> Optional.of(mpvClassId);
            case "TestSymbolIndicator" -> Optional.of(testSymbolIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EquitiesSymbolReferenceDataMessage message)) {
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
        if (!(other instanceof EquitiesSymbolReferenceDataMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
