package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AllowIsoDayField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AllowIsoiocField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AllowMarketOrdersField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.DefaultAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.DefaultClearingAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.DefaultOptionalDataField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MarketParticipantIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MaxDuplicativeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MaxNotionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MaxQtyField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MemberField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MpidStatusField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TransactTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.PrintOptions;

/**
 * Represents the MpidConfigurationAcknowledgementMessage message from the BinaryOrderEntry protocol.
 *
 * <p>MPIDConfigurationAcknowledgementMessage</p>
 */
public final class MpidConfigurationAcknowledgementMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 76;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mpid Configuration Acknowledgement Message";

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdField marketParticipantId = new MarketParticipantIdField();

    /**
     * mpidStatus
     */
    private final MpidStatusField mpidStatus = new MpidStatusField();

    /**
     * member
     */
    private final MemberField member = new MemberField();

    /**
     * maxQty
     */
    private final MaxQtyField maxQty = new MaxQtyField();

    /**
     * maxNotional
     */
    private final MaxNotionalField maxNotional = new MaxNotionalField();

    /**
     * defaultAccount
     */
    private final DefaultAccountField defaultAccount = new DefaultAccountField();

    /**
     * defaultOptionalData
     */
    private final DefaultOptionalDataField defaultOptionalData = new DefaultOptionalDataField();

    /**
     * defaultClearingAccount
     */
    private final DefaultClearingAccountField defaultClearingAccount = new DefaultClearingAccountField();

    /**
     * allowMarketOrders
     */
    private final AllowMarketOrdersField allowMarketOrders = new AllowMarketOrdersField();

    /**
     * allowISOIOC
     */
    private final AllowIsoiocField allowIsoioc = new AllowIsoiocField();

    /**
     * allowISODay
     */
    private final AllowIsoDayField allowIsoDay = new AllowIsoDayField();

    /**
     * maxDuplicative
     */
    private final MaxDuplicativeField maxDuplicative = new MaxDuplicativeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, marketParticipantId, mpidStatus, member, maxQty, maxNotional, defaultAccount, defaultOptionalData, defaultClearingAccount, allowMarketOrders, allowIsoioc, allowIsoDay, maxDuplicative);

    private byte[] buffer;

    private boolean decoded;

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * marketParticipantId
     *
     * @return the MarketParticipantId field
     */
    public MarketParticipantIdField marketParticipantId() {
        return marketParticipantId;
    }

    /**
     * mpidStatus
     *
     * @return the MpidStatus field
     */
    public MpidStatusField mpidStatus() {
        return mpidStatus;
    }

    /**
     * member
     *
     * @return the Member field
     */
    public MemberField member() {
        return member;
    }

    /**
     * maxQty
     *
     * @return the MaxQty field
     */
    public MaxQtyField maxQty() {
        return maxQty;
    }

    /**
     * maxNotional
     *
     * @return the MaxNotional field
     */
    public MaxNotionalField maxNotional() {
        return maxNotional;
    }

    /**
     * defaultAccount
     *
     * @return the DefaultAccount field
     */
    public DefaultAccountField defaultAccount() {
        return defaultAccount;
    }

    /**
     * defaultOptionalData
     *
     * @return the DefaultOptionalData field
     */
    public DefaultOptionalDataField defaultOptionalData() {
        return defaultOptionalData;
    }

    /**
     * defaultClearingAccount
     *
     * @return the DefaultClearingAccount field
     */
    public DefaultClearingAccountField defaultClearingAccount() {
        return defaultClearingAccount;
    }

    /**
     * allowMarketOrders
     *
     * @return the AllowMarketOrders field
     */
    public AllowMarketOrdersField allowMarketOrders() {
        return allowMarketOrders;
    }

    /**
     * allowISOIOC
     *
     * @return the AllowIsoioc field
     */
    public AllowIsoiocField allowIsoioc() {
        return allowIsoioc;
    }

    /**
     * allowISODay
     *
     * @return the AllowIsoDay field
     */
    public AllowIsoDayField allowIsoDay() {
        return allowIsoDay;
    }

    /**
     * maxDuplicative
     *
     * @return the MaxDuplicative field
     */
    public MaxDuplicativeField maxDuplicative() {
        return maxDuplicative;
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!marketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdField.BYTE_LENGTH;
        if (!mpidStatus.parse(data, cursor)) {
            return false;
        }
        cursor += MpidStatusField.BYTE_LENGTH;
        if (!member.parse(data, cursor)) {
            return false;
        }
        cursor += MemberField.BYTE_LENGTH;
        if (!maxQty.parse(data, cursor)) {
            return false;
        }
        cursor += MaxQtyField.BYTE_LENGTH;
        if (!maxNotional.parse(data, cursor)) {
            return false;
        }
        cursor += MaxNotionalField.BYTE_LENGTH;
        if (!defaultAccount.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultAccountField.BYTE_LENGTH;
        if (!defaultOptionalData.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultOptionalDataField.BYTE_LENGTH;
        if (!defaultClearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultClearingAccountField.BYTE_LENGTH;
        if (!allowMarketOrders.parse(data, cursor)) {
            return false;
        }
        cursor += AllowMarketOrdersField.BYTE_LENGTH;
        if (!allowIsoioc.parse(data, cursor)) {
            return false;
        }
        cursor += AllowIsoiocField.BYTE_LENGTH;
        if (!allowIsoDay.parse(data, cursor)) {
            return false;
        }
        cursor += AllowIsoDayField.BYTE_LENGTH;
        return maxDuplicative.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = marketParticipantId.encode(data, cursor);
        cursor = mpidStatus.encode(data, cursor);
        cursor = member.encode(data, cursor);
        cursor = maxQty.encode(data, cursor);
        cursor = maxNotional.encode(data, cursor);
        cursor = defaultAccount.encode(data, cursor);
        cursor = defaultOptionalData.encode(data, cursor);
        cursor = defaultClearingAccount.encode(data, cursor);
        cursor = allowMarketOrders.encode(data, cursor);
        cursor = allowIsoioc.encode(data, cursor);
        cursor = allowIsoDay.encode(data, cursor);
        cursor = maxDuplicative.encode(data, cursor);
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
            case "MarketParticipantId" -> Optional.of(marketParticipantId);
            case "MpidStatus" -> Optional.of(mpidStatus);
            case "Member" -> Optional.of(member);
            case "MaxQty" -> Optional.of(maxQty);
            case "MaxNotional" -> Optional.of(maxNotional);
            case "DefaultAccount" -> Optional.of(defaultAccount);
            case "DefaultOptionalData" -> Optional.of(defaultOptionalData);
            case "DefaultClearingAccount" -> Optional.of(defaultClearingAccount);
            case "AllowMarketOrders" -> Optional.of(allowMarketOrders);
            case "AllowIsoioc" -> Optional.of(allowIsoioc);
            case "AllowIsoDay" -> Optional.of(allowIsoDay);
            case "MaxDuplicative" -> Optional.of(maxDuplicative);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MpidConfigurationAcknowledgementMessage message)) {
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
        if (!(other instanceof MpidConfigurationAcknowledgementMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
