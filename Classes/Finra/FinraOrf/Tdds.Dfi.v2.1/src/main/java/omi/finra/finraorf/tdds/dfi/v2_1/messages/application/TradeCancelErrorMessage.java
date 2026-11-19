package omi.finra.finraorf.tdds.dfi.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.ReportFunctionField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SecuritySymbolField;
import omi.finra.finraorf.tdds.dfi.v2_1.structs.MessageHeader;
import omi.finra.finraorf.tdds.dfi.v2_1.structs.OriginalDisseminationDate;
import omi.finra.finraorf.tdds.dfi.v2_1.structs.OriginalTradeInformation;
import omi.finra.finraorf.tdds.dfi.v2_1.structs.TradeSummaryInformation;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Field;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Message;
import omi.finra.finraorf.tdds.dfi.v2_1.types.PrintOptions;

/**
 * Represents the TradeCancelErrorMessage message from the Tdds protocol.
 *
 * <p>This message is used to notify TDDS customers if a trade report entered during the current business day, or up to the past three business days, has been canceled</p>
 */
public final class TradeCancelErrorMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '7';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 162;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Error Message";

    /**
     * This Security Symbol field indicates the security identifier assigned by FINRA for a given security
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * This Function field denotes if the original trade report is being cancelled or was reported in error
     */
    private final ReportFunctionField reportFunction = new ReportFunctionField();

    /**
     * Message Header
     */
    private final MessageHeader messageHeader = new MessageHeader();

    /**
     * Original Dissemination Date
     */
    private final OriginalDisseminationDate originalDisseminationDate = new OriginalDisseminationDate();

    /**
     * Original Trade Information
     */
    private final OriginalTradeInformation originalTradeInformation = new OriginalTradeInformation();

    /**
     * Trade Summary Information
     */
    private final TradeSummaryInformation tradeSummaryInformation = new TradeSummaryInformation();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageHeader.fields(), List.<Field>of(securitySymbol), originalDisseminationDate.fields(), List.<Field>of(reportFunction), originalTradeInformation.fields(), tradeSummaryInformation.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This Security Symbol field indicates the security identifier assigned by FINRA for a given security
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * This Function field denotes if the original trade report is being cancelled or was reported in error
     *
     * @return the ReportFunction field
     */
    public ReportFunctionField reportFunction() {
        return reportFunction;
    }

    /**
     * Message Header
     *
     * @return the MessageHeader record
     */
    public MessageHeader messageHeader() {
        return messageHeader;
    }

    /**
     * Original Dissemination Date
     *
     * @return the OriginalDisseminationDate record
     */
    public OriginalDisseminationDate originalDisseminationDate() {
        return originalDisseminationDate;
    }

    /**
     * Original Trade Information
     *
     * @return the OriginalTradeInformation record
     */
    public OriginalTradeInformation originalTradeInformation() {
        return originalTradeInformation;
    }

    /**
     * Trade Summary Information
     *
     * @return the TradeSummaryInformation record
     */
    public TradeSummaryInformation tradeSummaryInformation() {
        return tradeSummaryInformation;
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
        if (!messageHeader.parseFrom(data, cursor, end - 129)) {
            return false;
        }
        cursor += messageHeader.byteLength();
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!originalDisseminationDate.parseFrom(data, cursor, end - 107)) {
            return false;
        }
        cursor += originalDisseminationDate.byteLength();
        if (!reportFunction.parse(data, cursor)) {
            return false;
        }
        cursor += ReportFunctionField.BYTE_LENGTH;
        if (!originalTradeInformation.parseFrom(data, cursor, end - 52)) {
            return false;
        }
        cursor += originalTradeInformation.byteLength();
        return tradeSummaryInformation.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = messageHeader.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = originalDisseminationDate.encode(data, cursor);
        cursor = reportFunction.encode(data, cursor);
        cursor = originalTradeInformation.encode(data, cursor);
        cursor = tradeSummaryInformation.encode(data, cursor);
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
        messageHeader.clear();
        originalDisseminationDate.clear();
        originalTradeInformation.clear();
        tradeSummaryInformation.clear();
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
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "ReportFunction" -> Optional.of(reportFunction);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelErrorMessage message)) {
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
        if (!(other instanceof TradeCancelErrorMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
