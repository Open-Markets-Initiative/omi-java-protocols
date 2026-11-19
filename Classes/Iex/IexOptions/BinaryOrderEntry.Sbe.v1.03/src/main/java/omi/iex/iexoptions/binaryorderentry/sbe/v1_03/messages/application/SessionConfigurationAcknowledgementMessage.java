package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AiqDefaultField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.CancelOnDisconnectField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.DefaultAttributedQuoteField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.DefaultCancelInsteadOfSlideField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.DefaultMpidField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MemberField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MicField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrderUnsolicitedAckSubscriptionField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.QuoteUnsolicitedAckSubscriptionField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TradingRingOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TransactTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.UserSessionStatusField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.UserSessionTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.PrintOptions;

/**
 * Represents the SessionConfigurationAcknowledgementMessage message from the BinaryOrderEntry protocol.
 *
 * <p>SessionConfigurationAcknowledgementMessage</p>
 */
public final class SessionConfigurationAcknowledgementMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Session Configuration Acknowledgement Message";

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * userSessionType
     */
    private final UserSessionTypeField userSessionType = new UserSessionTypeField();

    /**
     * userSessionStatus
     */
    private final UserSessionStatusField userSessionStatus = new UserSessionStatusField();

    /**
     * member
     */
    private final MemberField member = new MemberField();

    /**
     * defaultMpid
     */
    private final DefaultMpidField defaultMpid = new DefaultMpidField();

    /**
     * mic
     */
    private final MicField mic = new MicField();

    /**
     * cancelOnDisconnect
     */
    private final CancelOnDisconnectField cancelOnDisconnect = new CancelOnDisconnectField();

    /**
     * aiqDefault
     */
    private final AiqDefaultField aiqDefault = new AiqDefaultField();

    /**
     * orderUnsolicitedAckSubscription
     */
    private final OrderUnsolicitedAckSubscriptionField orderUnsolicitedAckSubscription = new OrderUnsolicitedAckSubscriptionField();

    /**
     * quoteUnsolicitedAckSubscription
     */
    private final QuoteUnsolicitedAckSubscriptionField quoteUnsolicitedAckSubscription = new QuoteUnsolicitedAckSubscriptionField();

    /**
     * defaultAttributedQuote
     */
    private final DefaultAttributedQuoteField defaultAttributedQuote = new DefaultAttributedQuoteField();

    /**
     * defaultCancelInsteadOfSlide
     */
    private final DefaultCancelInsteadOfSlideField defaultCancelInsteadOfSlide = new DefaultCancelInsteadOfSlideField();

    /**
     * tradingRing
     */
    private final TradingRingOptionalField tradingRingOptional = new TradingRingOptionalField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, userSessionType, userSessionStatus, member, defaultMpid, mic, cancelOnDisconnect, aiqDefault, orderUnsolicitedAckSubscription, quoteUnsolicitedAckSubscription, defaultAttributedQuote, defaultCancelInsteadOfSlide, tradingRingOptional);

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
     * userSessionType
     *
     * @return the UserSessionType field
     */
    public UserSessionTypeField userSessionType() {
        return userSessionType;
    }

    /**
     * userSessionStatus
     *
     * @return the UserSessionStatus field
     */
    public UserSessionStatusField userSessionStatus() {
        return userSessionStatus;
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
     * defaultMpid
     *
     * @return the DefaultMpid field
     */
    public DefaultMpidField defaultMpid() {
        return defaultMpid;
    }

    /**
     * mic
     *
     * @return the Mic field
     */
    public MicField mic() {
        return mic;
    }

    /**
     * cancelOnDisconnect
     *
     * @return the CancelOnDisconnect field
     */
    public CancelOnDisconnectField cancelOnDisconnect() {
        return cancelOnDisconnect;
    }

    /**
     * aiqDefault
     *
     * @return the AiqDefault field
     */
    public AiqDefaultField aiqDefault() {
        return aiqDefault;
    }

    /**
     * orderUnsolicitedAckSubscription
     *
     * @return the OrderUnsolicitedAckSubscription field
     */
    public OrderUnsolicitedAckSubscriptionField orderUnsolicitedAckSubscription() {
        return orderUnsolicitedAckSubscription;
    }

    /**
     * quoteUnsolicitedAckSubscription
     *
     * @return the QuoteUnsolicitedAckSubscription field
     */
    public QuoteUnsolicitedAckSubscriptionField quoteUnsolicitedAckSubscription() {
        return quoteUnsolicitedAckSubscription;
    }

    /**
     * defaultAttributedQuote
     *
     * @return the DefaultAttributedQuote field
     */
    public DefaultAttributedQuoteField defaultAttributedQuote() {
        return defaultAttributedQuote;
    }

    /**
     * defaultCancelInsteadOfSlide
     *
     * @return the DefaultCancelInsteadOfSlide field
     */
    public DefaultCancelInsteadOfSlideField defaultCancelInsteadOfSlide() {
        return defaultCancelInsteadOfSlide;
    }

    /**
     * tradingRing
     *
     * @return the TradingRingOptional field
     */
    public TradingRingOptionalField tradingRingOptional() {
        return tradingRingOptional;
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
        if (!userSessionType.parse(data, cursor)) {
            return false;
        }
        cursor += UserSessionTypeField.BYTE_LENGTH;
        if (!userSessionStatus.parse(data, cursor)) {
            return false;
        }
        cursor += UserSessionStatusField.BYTE_LENGTH;
        if (!member.parse(data, cursor)) {
            return false;
        }
        cursor += MemberField.BYTE_LENGTH;
        if (!defaultMpid.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultMpidField.BYTE_LENGTH;
        if (!mic.parse(data, cursor)) {
            return false;
        }
        cursor += MicField.BYTE_LENGTH;
        if (!cancelOnDisconnect.parse(data, cursor)) {
            return false;
        }
        cursor += CancelOnDisconnectField.BYTE_LENGTH;
        if (!aiqDefault.parse(data, cursor)) {
            return false;
        }
        cursor += AiqDefaultField.BYTE_LENGTH;
        if (!orderUnsolicitedAckSubscription.parse(data, cursor)) {
            return false;
        }
        cursor += OrderUnsolicitedAckSubscriptionField.BYTE_LENGTH;
        if (!quoteUnsolicitedAckSubscription.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteUnsolicitedAckSubscriptionField.BYTE_LENGTH;
        if (!defaultAttributedQuote.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultAttributedQuoteField.BYTE_LENGTH;
        if (!defaultCancelInsteadOfSlide.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultCancelInsteadOfSlideField.BYTE_LENGTH;
        return tradingRingOptional.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = userSessionType.encode(data, cursor);
        cursor = userSessionStatus.encode(data, cursor);
        cursor = member.encode(data, cursor);
        cursor = defaultMpid.encode(data, cursor);
        cursor = mic.encode(data, cursor);
        cursor = cancelOnDisconnect.encode(data, cursor);
        cursor = aiqDefault.encode(data, cursor);
        cursor = orderUnsolicitedAckSubscription.encode(data, cursor);
        cursor = quoteUnsolicitedAckSubscription.encode(data, cursor);
        cursor = defaultAttributedQuote.encode(data, cursor);
        cursor = defaultCancelInsteadOfSlide.encode(data, cursor);
        cursor = tradingRingOptional.encode(data, cursor);
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
            case "UserSessionType" -> Optional.of(userSessionType);
            case "UserSessionStatus" -> Optional.of(userSessionStatus);
            case "Member" -> Optional.of(member);
            case "DefaultMpid" -> Optional.of(defaultMpid);
            case "Mic" -> Optional.of(mic);
            case "CancelOnDisconnect" -> Optional.of(cancelOnDisconnect);
            case "AiqDefault" -> Optional.of(aiqDefault);
            case "OrderUnsolicitedAckSubscription" -> Optional.of(orderUnsolicitedAckSubscription);
            case "QuoteUnsolicitedAckSubscription" -> Optional.of(quoteUnsolicitedAckSubscription);
            case "DefaultAttributedQuote" -> Optional.of(defaultAttributedQuote);
            case "DefaultCancelInsteadOfSlide" -> Optional.of(defaultCancelInsteadOfSlide);
            case "TradingRingOptional" -> Optional.of(tradingRingOptional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SessionConfigurationAcknowledgementMessage message)) {
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
        if (!(other instanceof SessionConfigurationAcknowledgementMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
