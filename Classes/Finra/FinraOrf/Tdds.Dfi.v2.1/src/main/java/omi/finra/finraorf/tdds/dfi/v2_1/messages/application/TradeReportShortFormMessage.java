package omi.finra.finraorf.tdds.dfi.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.PriceChangeIndicatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.ReportVolumeShortField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SaleConditionLevelField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SecuritySymbolShortField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.TradePriceDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.TradePriceShortField;
import omi.finra.finraorf.tdds.dfi.v2_1.structs.MessageHeader;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Field;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Message;
import omi.finra.finraorf.tdds.dfi.v2_1.types.PrintOptions;

/**
 * Represents the TradeReportShortFormMessage message from the Tdds protocol.
 *
 * <p>Economized trade report</p>
 */
public final class TradeReportShortFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '5';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 53;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Report Short Form Message";

    /**
     * This Security Symbol field indicates the security identifier assigned by FINRA for a given security
     */
    private final SecuritySymbolShortField securitySymbolShort = new SecuritySymbolShortField();

    /**
     * This field is used to denote the sale condition associated with a trade transaction
     */
    private final SaleConditionLevelField saleConditionLevel = new SaleConditionLevelField();

    /**
     * This field denotes the whole dollar and decimal digit composition for the Trade Price field
     */
    private final TradePriceDenominatorField tradePriceDenominator = new TradePriceDenominatorField();

    /**
     * This field indicates the trade price for the current transaction.
     */
    private final TradePriceShortField tradePriceShort = new TradePriceShortField();

    /**
     * This field denotes the number of shares reported in the current Trade Report
     */
    private final ReportVolumeShortField reportVolumeShort = new ReportVolumeShortField();

    /**
     * The Price Change Indicator field indicates if the high, low, and/or last sale prices were impacted by the current trade transaction.
     */
    private final PriceChangeIndicatorField priceChangeIndicator = new PriceChangeIndicatorField();

    /**
     * Message Header
     */
    private final MessageHeader messageHeader = new MessageHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageHeader.fields(), List.<Field>of(securitySymbolShort), List.<Field>of(saleConditionLevel), List.<Field>of(tradePriceDenominator), List.<Field>of(tradePriceShort), List.<Field>of(reportVolumeShort), List.<Field>of(priceChangeIndicator)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This Security Symbol field indicates the security identifier assigned by FINRA for a given security
     *
     * @return the SecuritySymbolShort field
     */
    public SecuritySymbolShortField securitySymbolShort() {
        return securitySymbolShort;
    }

    /**
     * This field is used to denote the sale condition associated with a trade transaction
     *
     * @return the SaleConditionLevel field
     */
    public SaleConditionLevelField saleConditionLevel() {
        return saleConditionLevel;
    }

    /**
     * This field denotes the whole dollar and decimal digit composition for the Trade Price field
     *
     * @return the TradePriceDenominator field
     */
    public TradePriceDenominatorField tradePriceDenominator() {
        return tradePriceDenominator;
    }

    /**
     * This field indicates the trade price for the current transaction.
     *
     * @return the TradePriceShort field
     */
    public TradePriceShortField tradePriceShort() {
        return tradePriceShort;
    }

    /**
     * This field denotes the number of shares reported in the current Trade Report
     *
     * @return the ReportVolumeShort field
     */
    public ReportVolumeShortField reportVolumeShort() {
        return reportVolumeShort;
    }

    /**
     * The Price Change Indicator field indicates if the high, low, and/or last sale prices were impacted by the current trade transaction.
     *
     * @return the PriceChangeIndicator field
     */
    public PriceChangeIndicatorField priceChangeIndicator() {
        return priceChangeIndicator;
    }

    /**
     * Message Header
     *
     * @return the MessageHeader record
     */
    public MessageHeader messageHeader() {
        return messageHeader;
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
        if (!messageHeader.parseFrom(data, cursor, end - 20)) {
            return false;
        }
        cursor += messageHeader.byteLength();
        if (!securitySymbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolShortField.BYTE_LENGTH;
        if (!saleConditionLevel.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionLevelField.BYTE_LENGTH;
        if (!tradePriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceDenominatorField.BYTE_LENGTH;
        if (!tradePriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceShortField.BYTE_LENGTH;
        if (!reportVolumeShort.parse(data, cursor)) {
            return false;
        }
        cursor += ReportVolumeShortField.BYTE_LENGTH;
        return priceChangeIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = messageHeader.encode(data, cursor);
        cursor = securitySymbolShort.encode(data, cursor);
        cursor = saleConditionLevel.encode(data, cursor);
        cursor = tradePriceDenominator.encode(data, cursor);
        cursor = tradePriceShort.encode(data, cursor);
        cursor = reportVolumeShort.encode(data, cursor);
        cursor = priceChangeIndicator.encode(data, cursor);
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
            case "SecuritySymbolShort" -> Optional.of(securitySymbolShort);
            case "SaleConditionLevel" -> Optional.of(saleConditionLevel);
            case "TradePriceDenominator" -> Optional.of(tradePriceDenominator);
            case "TradePriceShort" -> Optional.of(tradePriceShort);
            case "ReportVolumeShort" -> Optional.of(reportVolumeShort);
            case "PriceChangeIndicator" -> Optional.of(priceChangeIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeReportShortFormMessage message)) {
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
        if (!(other instanceof TradeReportShortFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
