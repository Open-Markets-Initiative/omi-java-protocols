package omi.nasdaq.uqdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NationalBestAskMarketCenterField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NationalBestAskPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NationalBestAskSizeField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NationalBestBidMarketCenterField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NationalBestBidPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NationalBestBidSizeField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NumberOfMarketCenterAttachmentsField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.SpecialConditionField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.SymbolLongField;
import omi.nasdaq.uqdf.output.utp.v1_5.groups.MarketCenterCloseRecapEntry;
import omi.nasdaq.uqdf.output.utp.v1_5.groups.MarketCenterCloseRecapList;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Field;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;
import omi.nasdaq.uqdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the SessionCloseRecapMessage message from the Output protocol.
 *
 * <p>At the request of the market data community, the UTP SIP generates a Session Close Recap message that reflects the National BBO quotation information at the close of the normal market session</p>
 */
public final class SessionCloseRecapMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Session Close Recap Message";

    /**
     * Security Identifier
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

    /**
     * National Best Bid Market Center
     */
    private final NationalBestBidMarketCenterField nationalBestBidMarketCenter = new NationalBestBidMarketCenterField();

    /**
     * National Best Bid Price
     */
    private final NationalBestBidPriceField nationalBestBidPrice = new NationalBestBidPriceField();

    /**
     * National Best Bid Size
     */
    private final NationalBestBidSizeField nationalBestBidSize = new NationalBestBidSizeField();

    /**
     * National Best Ask Market Center
     */
    private final NationalBestAskMarketCenterField nationalBestAskMarketCenter = new NationalBestAskMarketCenterField();

    /**
     * National Best Ask Price
     */
    private final NationalBestAskPriceField nationalBestAskPrice = new NationalBestAskPriceField();

    /**
     * National Best Ask Size
     */
    private final NationalBestAskSizeField nationalBestAskSize = new NationalBestAskSizeField();

    /**
     * Special Condition
     */
    private final SpecialConditionField specialCondition = new SpecialConditionField();

    /**
     * Number of Market Center Attachments
     */
    private final NumberOfMarketCenterAttachmentsField numberOfMarketCenterAttachments = new NumberOfMarketCenterAttachmentsField();

    /**
     * At the request of the market data community, the UTP SIP generates a Session Close Recap message that reflects the National BBO quotation information at the close of the normal market session
     */
    private final MarketCenterCloseRecapList marketCenterCloseRecap = new MarketCenterCloseRecapList();

    /**
     * Message Info
     */
    private final MessageInfo messageInfo = new MessageInfo();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(symbolLong), List.<Field>of(nationalBestBidMarketCenter), List.<Field>of(nationalBestBidPrice), List.<Field>of(nationalBestBidSize), List.<Field>of(nationalBestAskMarketCenter), List.<Field>of(nationalBestAskPrice), List.<Field>of(nationalBestAskSize), List.<Field>of(specialCondition), List.<Field>of(numberOfMarketCenterAttachments)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Identifier
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
    }

    /**
     * National Best Bid Market Center
     *
     * @return the NationalBestBidMarketCenter field
     */
    public NationalBestBidMarketCenterField nationalBestBidMarketCenter() {
        return nationalBestBidMarketCenter;
    }

    /**
     * National Best Bid Price
     *
     * @return the NationalBestBidPrice field
     */
    public NationalBestBidPriceField nationalBestBidPrice() {
        return nationalBestBidPrice;
    }

    /**
     * National Best Bid Size
     *
     * @return the NationalBestBidSize field
     */
    public NationalBestBidSizeField nationalBestBidSize() {
        return nationalBestBidSize;
    }

    /**
     * National Best Ask Market Center
     *
     * @return the NationalBestAskMarketCenter field
     */
    public NationalBestAskMarketCenterField nationalBestAskMarketCenter() {
        return nationalBestAskMarketCenter;
    }

    /**
     * National Best Ask Price
     *
     * @return the NationalBestAskPrice field
     */
    public NationalBestAskPriceField nationalBestAskPrice() {
        return nationalBestAskPrice;
    }

    /**
     * National Best Ask Size
     *
     * @return the NationalBestAskSize field
     */
    public NationalBestAskSizeField nationalBestAskSize() {
        return nationalBestAskSize;
    }

    /**
     * Special Condition
     *
     * @return the SpecialCondition field
     */
    public SpecialConditionField specialCondition() {
        return specialCondition;
    }

    /**
     * Number of Market Center Attachments
     *
     * @return the NumberOfMarketCenterAttachments field
     */
    public NumberOfMarketCenterAttachmentsField numberOfMarketCenterAttachments() {
        return numberOfMarketCenterAttachments;
    }

    /**
     * At the request of the market data community, the UTP SIP generates a Session Close Recap message that reflects the National BBO quotation information at the close of the normal market session
     *
     * <p>Encode writes this list's size to the NumberOfMarketCenterAttachments field.</p>
     *
     * @return the MarketCenterCloseRecap entries
     */
    public MarketCenterCloseRecapList marketCenterCloseRecap() {
        return marketCenterCloseRecap;
    }

    /**
     * Message Info
     *
     * @return the MessageInfo record
     */
    public MessageInfo messageInfo() {
        return messageInfo;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + marketCenterCloseRecap.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(messageInfo.sipTimestamp().value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!messageInfo.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!symbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolLongField.BYTE_LENGTH;
        if (!nationalBestBidMarketCenter.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestBidMarketCenterField.BYTE_LENGTH;
        if (!nationalBestBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestBidPriceField.BYTE_LENGTH;
        if (!nationalBestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestBidSizeField.BYTE_LENGTH;
        if (!nationalBestAskMarketCenter.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestAskMarketCenterField.BYTE_LENGTH;
        if (!nationalBestAskPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestAskPriceField.BYTE_LENGTH;
        if (!nationalBestAskSize.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestAskSizeField.BYTE_LENGTH;
        if (!specialCondition.parse(data, cursor)) {
            return false;
        }
        cursor += SpecialConditionField.BYTE_LENGTH;
        if (!numberOfMarketCenterAttachments.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfMarketCenterAttachmentsField.BYTE_LENGTH;
        if (!marketCenterCloseRecap.parse(data, cursor, end, numberOfMarketCenterAttachments.value())) {
            return false;
        }
        cursor += marketCenterCloseRecap.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (marketCenterCloseRecap.size() > 65535) {
            throw new IllegalStateException("marketCenterCloseRecap holds " + marketCenterCloseRecap.size() + " entries, more than its count field can state");
        }
        numberOfMarketCenterAttachments.value(marketCenterCloseRecap.size());
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = nationalBestBidMarketCenter.encode(data, cursor);
        cursor = nationalBestBidPrice.encode(data, cursor);
        cursor = nationalBestBidSize.encode(data, cursor);
        cursor = nationalBestAskMarketCenter.encode(data, cursor);
        cursor = nationalBestAskPrice.encode(data, cursor);
        cursor = nationalBestAskSize.encode(data, cursor);
        cursor = specialCondition.encode(data, cursor);
        cursor = numberOfMarketCenterAttachments.encode(data, cursor);
        cursor = marketCenterCloseRecap.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        messageInfo.clear();
        marketCenterCloseRecap.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfMarketCenterAttachments && !field.isRecognized()) {
                return false;
            }
        }
        return marketCenterCloseRecap.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfMarketCenterAttachments && !field.isValid()) {
                return false;
            }
        }
        if (!marketCenterCloseRecap.isValid()) {
            return false;
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
        if (!messageInfo.isDecoded()) {
            return messageInfo.failedAt();
        }
        if (!symbolLong.isDecoded()) {
            return Optional.of(symbolLong);
        }
        if (!nationalBestBidMarketCenter.isDecoded()) {
            return Optional.of(nationalBestBidMarketCenter);
        }
        if (!nationalBestBidPrice.isDecoded()) {
            return Optional.of(nationalBestBidPrice);
        }
        if (!nationalBestBidSize.isDecoded()) {
            return Optional.of(nationalBestBidSize);
        }
        if (!nationalBestAskMarketCenter.isDecoded()) {
            return Optional.of(nationalBestAskMarketCenter);
        }
        if (!nationalBestAskPrice.isDecoded()) {
            return Optional.of(nationalBestAskPrice);
        }
        if (!nationalBestAskSize.isDecoded()) {
            return Optional.of(nationalBestAskSize);
        }
        if (!specialCondition.isDecoded()) {
            return Optional.of(specialCondition);
        }
        if (!numberOfMarketCenterAttachments.isDecoded()) {
            return Optional.of(numberOfMarketCenterAttachments);
        }
        if (!marketCenterCloseRecap.isDecoded()) {
            return Optional.of(marketCenterCloseRecap.failedEntry().flatMap(MarketCenterCloseRecapEntry::failedAt).orElse(numberOfMarketCenterAttachments));
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
            case "SymbolLong" -> Optional.of(symbolLong);
            case "NationalBestBidMarketCenter" -> Optional.of(nationalBestBidMarketCenter);
            case "NationalBestBidPrice" -> Optional.of(nationalBestBidPrice);
            case "NationalBestBidSize" -> Optional.of(nationalBestBidSize);
            case "NationalBestAskMarketCenter" -> Optional.of(nationalBestAskMarketCenter);
            case "NationalBestAskPrice" -> Optional.of(nationalBestAskPrice);
            case "NationalBestAskSize" -> Optional.of(nationalBestAskSize);
            case "SpecialCondition" -> Optional.of(specialCondition);
            case "NumberOfMarketCenterAttachments" -> Optional.of(numberOfMarketCenterAttachments);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SessionCloseRecapMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(marketCenterCloseRecap.diffFields(message.marketCenterCloseRecap));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            marketCenterCloseRecap.toFormattedString(builder, options);
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
        marketCenterCloseRecap.toFormattedString(builder, nested);
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
        if (!(other instanceof SessionCloseRecapMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && marketCenterCloseRecap.equals(message.marketCenterCloseRecap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, marketCenterCloseRecap);
    }
}
