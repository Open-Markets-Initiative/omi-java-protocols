package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.ComplianceTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ContractDateField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExerciseStyleField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MaturityDateField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OptAttributeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PutOrCallField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SettlMethodField;
import omi.eurex.t7.eti.fbe.v10_0.fields.StrikePriceField;
import omi.eurex.t7.eti.fbe.v10_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the AddFlexibleInstrumentRequest message from the Eti protocol.
 */
public final class AddFlexibleInstrumentRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Flexible Instrument Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 62, 4 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Strike Price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Contract Date
     */
    private final ContractDateField contractDate = new ContractDateField();

    /**
     * Settl Method
     */
    private final SettlMethodField settlMethod = new SettlMethodField();

    /**
     * Opt Attribute
     */
    private final OptAttributeField optAttribute = new OptAttributeField();

    /**
     * Put Or Call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Exercise Style
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * Compliance Text
     */
    private final ComplianceTextField complianceText = new ComplianceTextField();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(strikePrice), List.<Field>of(marketSegmentId), List.<Field>of(maturityDate), List.<Field>of(contractDate), List.<Field>of(settlMethod), List.<Field>of(optAttribute), List.<Field>of(putOrCall), List.<Field>of(exerciseStyle), List.<Field>of(complianceText)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
    }

    /**
     * Strike Price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Contract Date
     *
     * @return the ContractDate field
     */
    public ContractDateField contractDate() {
        return contractDate;
    }

    /**
     * Settl Method
     *
     * @return the SettlMethod field
     */
    public SettlMethodField settlMethod() {
        return settlMethod;
    }

    /**
     * Opt Attribute
     *
     * @return the OptAttribute field
     */
    public OptAttributeField optAttribute() {
        return optAttribute;
    }

    /**
     * Put Or Call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Exercise Style
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Compliance Text
     *
     * @return the ComplianceText field
     */
    public ComplianceTextField complianceText() {
        return complianceText;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!contractDate.parse(data, cursor)) {
            return false;
        }
        cursor += ContractDateField.BYTE_LENGTH;
        if (!settlMethod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlMethodField.BYTE_LENGTH;
        if (!optAttribute.parse(data, cursor)) {
            return false;
        }
        cursor += OptAttributeField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!complianceText.parse(data, cursor)) {
            return false;
        }
        cursor += ComplianceTextField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = contractDate.encode(data, cursor);
        cursor = settlMethod.encode(data, cursor);
        cursor = optAttribute.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = complianceText.encode(data, cursor);
        if (buffer != null && buffer.length >= 66) {
            System.arraycopy(buffer, 62, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
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
        requestHeaderComp.clear();
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "ContractDate" -> Optional.of(contractDate);
            case "SettlMethod" -> Optional.of(settlMethod);
            case "OptAttribute" -> Optional.of(optAttribute);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "ComplianceText" -> Optional.of(complianceText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddFlexibleInstrumentRequest message)) {
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
        if (!(other instanceof AddFlexibleInstrumentRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
