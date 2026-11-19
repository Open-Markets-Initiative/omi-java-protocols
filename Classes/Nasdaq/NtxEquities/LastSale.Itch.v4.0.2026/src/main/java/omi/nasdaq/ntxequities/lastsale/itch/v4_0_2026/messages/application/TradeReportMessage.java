package omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.ClientTimestampField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.IssueSymbolField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.OriginatingMarketCenterIdentifierField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.SaleConditionModifierField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.SecurityClassField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.TimestampField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.TrackingNumberField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.TradeControlNumberField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.TradePriceField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.fields.TradeSizeField;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.types.Field;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.types.Message;
import omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.types.PrintOptions;

/**
 * Represents the TradeReportMessage message from the LastSale protocol.
 *
 * <p>The following message is used to relay trade transactions that are reported for the current business day. Please note that Nasdaq only reports one-side of a trade execution on the Last Sale feeds.</p>
 */
public final class TradeReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'e';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 56;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Report Message";

    /**
     * Nasdaq internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * TRF Reported timestamp. Set to 0 for non-TRF trades.
     */
    private final ClientTimestampField clientTimestamp = new ClientTimestampField();

    /**
     * Denotes the Nasdaq market system that generated the trade report message.
     */
    private final OriginatingMarketCenterIdentifierField originatingMarketCenterIdentifier = new OriginatingMarketCenterIdentifierField();

    /**
     * Denotes the Nasdaq-assigned issue symbol of the security for which the trade report is being generated.
     */
    private final IssueSymbolField issueSymbol = new IssueSymbolField();

    /**
     * Indicates the primary listing market for the issue.
     */
    private final SecurityClassField securityClass = new SecurityClassField();

    /**
     * Indicates the source's internal control number associated with the given trade transaction.
     */
    private final TradeControlNumberField tradeControlNumber = new TradeControlNumberField();

    /**
     * Denotes the report price on the trade transaction.
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Indicates the reported number of shares on the trade transaction.
     */
    private final TradeSizeField tradeSize = new TradeSizeField();

    /**
     * Denotes the settlement type of the transaction.
     */
    private final SaleConditionModifierField saleConditionModifier = new SaleConditionModifierField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, clientTimestamp, originatingMarketCenterIdentifier, issueSymbol, securityClass, tradeControlNumber, tradePrice, tradeSize, saleConditionModifier);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nasdaq internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * TRF Reported timestamp. Set to 0 for non-TRF trades.
     *
     * @return the ClientTimestamp field
     */
    public ClientTimestampField clientTimestamp() {
        return clientTimestamp;
    }

    /**
     * Denotes the Nasdaq market system that generated the trade report message.
     *
     * @return the OriginatingMarketCenterIdentifier field
     */
    public OriginatingMarketCenterIdentifierField originatingMarketCenterIdentifier() {
        return originatingMarketCenterIdentifier;
    }

    /**
     * Denotes the Nasdaq-assigned issue symbol of the security for which the trade report is being generated.
     *
     * @return the IssueSymbol field
     */
    public IssueSymbolField issueSymbol() {
        return issueSymbol;
    }

    /**
     * Indicates the primary listing market for the issue.
     *
     * @return the SecurityClass field
     */
    public SecurityClassField securityClass() {
        return securityClass;
    }

    /**
     * Indicates the source's internal control number associated with the given trade transaction.
     *
     * @return the TradeControlNumber field
     */
    public TradeControlNumberField tradeControlNumber() {
        return tradeControlNumber;
    }

    /**
     * Denotes the report price on the trade transaction.
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Indicates the reported number of shares on the trade transaction.
     *
     * @return the TradeSize field
     */
    public TradeSizeField tradeSize() {
        return tradeSize;
    }

    /**
     * Denotes the settlement type of the transaction.
     *
     * @return the SaleConditionModifier field
     */
    public SaleConditionModifierField saleConditionModifier() {
        return saleConditionModifier;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!clientTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += ClientTimestampField.BYTE_LENGTH;
        if (!originatingMarketCenterIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatingMarketCenterIdentifierField.BYTE_LENGTH;
        if (!issueSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += IssueSymbolField.BYTE_LENGTH;
        if (!securityClass.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityClassField.BYTE_LENGTH;
        if (!tradeControlNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TradeControlNumberField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSizeField.BYTE_LENGTH;
        return saleConditionModifier.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = clientTimestamp.encode(data, cursor);
        cursor = originatingMarketCenterIdentifier.encode(data, cursor);
        cursor = issueSymbol.encode(data, cursor);
        cursor = securityClass.encode(data, cursor);
        cursor = tradeControlNumber.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeSize.encode(data, cursor);
        cursor = saleConditionModifier.encode(data, cursor);
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "ClientTimestamp" -> Optional.of(clientTimestamp);
            case "OriginatingMarketCenterIdentifier" -> Optional.of(originatingMarketCenterIdentifier);
            case "IssueSymbol" -> Optional.of(issueSymbol);
            case "SecurityClass" -> Optional.of(securityClass);
            case "TradeControlNumber" -> Optional.of(tradeControlNumber);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradeSize" -> Optional.of(tradeSize);
            case "SaleConditionModifier" -> Optional.of(saleConditionModifier);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeReportMessage message)) {
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
        if (!(other instanceof TradeReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
