package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplUsageOrdersField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplUsageQuotesField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplicationSystemNameField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplicationSystemVendorField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplicationSystemVersionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.DefaultCstmApplVerIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FixEngineNameField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FixEngineVendorField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FixEngineVersionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.HeartBtIntField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OrderRoutingIndicatorField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdSessionIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PasswordField;
import omi.eurex.t7.eti.fbe.v6_1.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the LogonRequest message from the Eti protocol.
 */
public final class LogonRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 274;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Logon Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 271, 3 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Heart Bt Int
     */
    private final HeartBtIntField heartBtInt = new HeartBtIntField();

    /**
     * Party Id Session Id
     */
    private final PartyIdSessionIdField partyIdSessionId = new PartyIdSessionIdField();

    /**
     * Default Cstm Appl Ver Id
     */
    private final DefaultCstmApplVerIdField defaultCstmApplVerId = new DefaultCstmApplVerIdField();

    /**
     * Password
     */
    private final PasswordField password = new PasswordField();

    /**
     * Appl Usage Orders
     */
    private final ApplUsageOrdersField applUsageOrders = new ApplUsageOrdersField();

    /**
     * Appl Usage Quotes
     */
    private final ApplUsageQuotesField applUsageQuotes = new ApplUsageQuotesField();

    /**
     * Order Routing Indicator
     */
    private final OrderRoutingIndicatorField orderRoutingIndicator = new OrderRoutingIndicatorField();

    /**
     * Fix Engine Name
     */
    private final FixEngineNameField fixEngineName = new FixEngineNameField();

    /**
     * Fix Engine Version
     */
    private final FixEngineVersionField fixEngineVersion = new FixEngineVersionField();

    /**
     * Fix Engine Vendor
     */
    private final FixEngineVendorField fixEngineVendor = new FixEngineVendorField();

    /**
     * Application System Name
     */
    private final ApplicationSystemNameField applicationSystemName = new ApplicationSystemNameField();

    /**
     * Application System Version
     */
    private final ApplicationSystemVersionField applicationSystemVersion = new ApplicationSystemVersionField();

    /**
     * Application System Vendor
     */
    private final ApplicationSystemVendorField applicationSystemVendor = new ApplicationSystemVendorField();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(heartBtInt), List.<Field>of(partyIdSessionId), List.<Field>of(defaultCstmApplVerId), List.<Field>of(password), List.<Field>of(applUsageOrders), List.<Field>of(applUsageQuotes), List.<Field>of(orderRoutingIndicator), List.<Field>of(fixEngineName), List.<Field>of(fixEngineVersion), List.<Field>of(fixEngineVendor), List.<Field>of(applicationSystemName), List.<Field>of(applicationSystemVersion), List.<Field>of(applicationSystemVendor)).flatMap(List::stream).toList();

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
     * Heart Bt Int
     *
     * @return the HeartBtInt field
     */
    public HeartBtIntField heartBtInt() {
        return heartBtInt;
    }

    /**
     * Party Id Session Id
     *
     * @return the PartyIdSessionId field
     */
    public PartyIdSessionIdField partyIdSessionId() {
        return partyIdSessionId;
    }

    /**
     * Default Cstm Appl Ver Id
     *
     * @return the DefaultCstmApplVerId field
     */
    public DefaultCstmApplVerIdField defaultCstmApplVerId() {
        return defaultCstmApplVerId;
    }

    /**
     * Password
     *
     * @return the Password field
     */
    public PasswordField password() {
        return password;
    }

    /**
     * Appl Usage Orders
     *
     * @return the ApplUsageOrders field
     */
    public ApplUsageOrdersField applUsageOrders() {
        return applUsageOrders;
    }

    /**
     * Appl Usage Quotes
     *
     * @return the ApplUsageQuotes field
     */
    public ApplUsageQuotesField applUsageQuotes() {
        return applUsageQuotes;
    }

    /**
     * Order Routing Indicator
     *
     * @return the OrderRoutingIndicator field
     */
    public OrderRoutingIndicatorField orderRoutingIndicator() {
        return orderRoutingIndicator;
    }

    /**
     * Fix Engine Name
     *
     * @return the FixEngineName field
     */
    public FixEngineNameField fixEngineName() {
        return fixEngineName;
    }

    /**
     * Fix Engine Version
     *
     * @return the FixEngineVersion field
     */
    public FixEngineVersionField fixEngineVersion() {
        return fixEngineVersion;
    }

    /**
     * Fix Engine Vendor
     *
     * @return the FixEngineVendor field
     */
    public FixEngineVendorField fixEngineVendor() {
        return fixEngineVendor;
    }

    /**
     * Application System Name
     *
     * @return the ApplicationSystemName field
     */
    public ApplicationSystemNameField applicationSystemName() {
        return applicationSystemName;
    }

    /**
     * Application System Version
     *
     * @return the ApplicationSystemVersion field
     */
    public ApplicationSystemVersionField applicationSystemVersion() {
        return applicationSystemVersion;
    }

    /**
     * Application System Vendor
     *
     * @return the ApplicationSystemVendor field
     */
    public ApplicationSystemVendorField applicationSystemVendor() {
        return applicationSystemVendor;
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 256)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!heartBtInt.parse(data, cursor)) {
            return false;
        }
        cursor += HeartBtIntField.BYTE_LENGTH;
        if (!partyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdSessionIdField.BYTE_LENGTH;
        if (!defaultCstmApplVerId.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultCstmApplVerIdField.BYTE_LENGTH;
        if (!password.parse(data, cursor)) {
            return false;
        }
        cursor += PasswordField.BYTE_LENGTH;
        if (!applUsageOrders.parse(data, cursor)) {
            return false;
        }
        cursor += ApplUsageOrdersField.BYTE_LENGTH;
        if (!applUsageQuotes.parse(data, cursor)) {
            return false;
        }
        cursor += ApplUsageQuotesField.BYTE_LENGTH;
        if (!orderRoutingIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRoutingIndicatorField.BYTE_LENGTH;
        if (!fixEngineName.parse(data, cursor)) {
            return false;
        }
        cursor += FixEngineNameField.BYTE_LENGTH;
        if (!fixEngineVersion.parse(data, cursor)) {
            return false;
        }
        cursor += FixEngineVersionField.BYTE_LENGTH;
        if (!fixEngineVendor.parse(data, cursor)) {
            return false;
        }
        cursor += FixEngineVendorField.BYTE_LENGTH;
        if (!applicationSystemName.parse(data, cursor)) {
            return false;
        }
        cursor += ApplicationSystemNameField.BYTE_LENGTH;
        if (!applicationSystemVersion.parse(data, cursor)) {
            return false;
        }
        cursor += ApplicationSystemVersionField.BYTE_LENGTH;
        if (!applicationSystemVendor.parse(data, cursor)) {
            return false;
        }
        cursor += ApplicationSystemVendorField.BYTE_LENGTH;

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
        cursor = heartBtInt.encode(data, cursor);
        cursor = partyIdSessionId.encode(data, cursor);
        cursor = defaultCstmApplVerId.encode(data, cursor);
        cursor = password.encode(data, cursor);
        cursor = applUsageOrders.encode(data, cursor);
        cursor = applUsageQuotes.encode(data, cursor);
        cursor = orderRoutingIndicator.encode(data, cursor);
        cursor = fixEngineName.encode(data, cursor);
        cursor = fixEngineVersion.encode(data, cursor);
        cursor = fixEngineVendor.encode(data, cursor);
        cursor = applicationSystemName.encode(data, cursor);
        cursor = applicationSystemVersion.encode(data, cursor);
        cursor = applicationSystemVendor.encode(data, cursor);
        if (buffer != null && buffer.length >= 274) {
            System.arraycopy(buffer, 271, data, cursor, 3); // padding
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
            case "HeartBtInt" -> Optional.of(heartBtInt);
            case "PartyIdSessionId" -> Optional.of(partyIdSessionId);
            case "DefaultCstmApplVerId" -> Optional.of(defaultCstmApplVerId);
            case "Password" -> Optional.of(password);
            case "ApplUsageOrders" -> Optional.of(applUsageOrders);
            case "ApplUsageQuotes" -> Optional.of(applUsageQuotes);
            case "OrderRoutingIndicator" -> Optional.of(orderRoutingIndicator);
            case "FixEngineName" -> Optional.of(fixEngineName);
            case "FixEngineVersion" -> Optional.of(fixEngineVersion);
            case "FixEngineVendor" -> Optional.of(fixEngineVendor);
            case "ApplicationSystemName" -> Optional.of(applicationSystemName);
            case "ApplicationSystemVersion" -> Optional.of(applicationSystemVersion);
            case "ApplicationSystemVendor" -> Optional.of(applicationSystemVendor);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LogonRequest message)) {
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
        if (!(other instanceof LogonRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
