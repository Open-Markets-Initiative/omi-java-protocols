package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.session;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.BondSubscriptionField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.EtfSubscriptionField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.EtxField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.GlobalOtcSubscriptionField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.ListedSubscriptionField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.LoginSequenceNumberField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.OtcSubscriptionField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.PasswordField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.UsernameField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Field;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Message;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.PrintOptions;

/**
 * Represents the LoginMessage message from the DepthOfBook protocol.
 *
 * <p>Authenticates the subscriber and names which order data the session subscribes to.
 * A starting sequence number of 0 requests current data; a greater number than the exchange holds
 * is treated as 0, and a negative one is rejected</p>
 */
public final class LoginMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'L';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Login Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Username authenticating the session
     */
    private final UsernameField username = new UsernameField();

    /**
     * Password authenticating the session
     */
    private final PasswordField password = new PasswordField();

    /**
     * Recovery sequence number, or 0 to receive current updates. 0 to 2147483647. Written as text, not binary
     */
    private final LoginSequenceNumberField loginSequenceNumber = new LoginSequenceNumberField();

    /**
     * Reserved for future use
     */
    private final ListedSubscriptionField listedSubscription = new ListedSubscriptionField();

    /**
     * Reserved for future use
     */
    private final EtfSubscriptionField etfSubscription = new EtfSubscriptionField();

    /**
     * Reserved for future use
     */
    private final OtcSubscriptionField otcSubscription = new OtcSubscriptionField();

    /**
     * Legacy ArcaBook for Equities subscription flag. Y is yes, N is no
     */
    private final GlobalOtcSubscriptionField globalOtcSubscription = new GlobalOtcSubscriptionField();

    /**
     * Whether the session subscribes to bond trades. Y is yes, N is no
     */
    private final BondSubscriptionField bondSubscription = new BondSubscriptionField();

    /**
     * Message terminating character, 0x03
     */
    private final EtxField etx = new EtxField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(username, password, loginSequenceNumber, listedSubscription, etfSubscription, otcSubscription, globalOtcSubscription, bondSubscription, etx);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Username authenticating the session
     *
     * @return the Username field
     */
    public UsernameField username() {
        return username;
    }

    /**
     * Password authenticating the session
     *
     * @return the Password field
     */
    public PasswordField password() {
        return password;
    }

    /**
     * Recovery sequence number, or 0 to receive current updates. 0 to 2147483647. Written as text, not binary
     *
     * @return the LoginSequenceNumber field
     */
    public LoginSequenceNumberField loginSequenceNumber() {
        return loginSequenceNumber;
    }

    /**
     * Reserved for future use
     *
     * @return the ListedSubscription field
     */
    public ListedSubscriptionField listedSubscription() {
        return listedSubscription;
    }

    /**
     * Reserved for future use
     *
     * @return the EtfSubscription field
     */
    public EtfSubscriptionField etfSubscription() {
        return etfSubscription;
    }

    /**
     * Reserved for future use
     *
     * @return the OtcSubscription field
     */
    public OtcSubscriptionField otcSubscription() {
        return otcSubscription;
    }

    /**
     * Legacy ArcaBook for Equities subscription flag. Y is yes, N is no
     *
     * @return the GlobalOtcSubscription field
     */
    public GlobalOtcSubscriptionField globalOtcSubscription() {
        return globalOtcSubscription;
    }

    /**
     * Whether the session subscribes to bond trades. Y is yes, N is no
     *
     * @return the BondSubscription field
     */
    public BondSubscriptionField bondSubscription() {
        return bondSubscription;
    }

    /**
     * Message terminating character, 0x03
     *
     * @return the Etx field
     */
    public EtxField etx() {
        return etx;
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
        if (!username.parse(data, cursor)) {
            return false;
        }
        cursor += UsernameField.BYTE_LENGTH;
        if (!password.parse(data, cursor)) {
            return false;
        }
        cursor += PasswordField.BYTE_LENGTH;
        if (!loginSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += LoginSequenceNumberField.BYTE_LENGTH;
        if (!listedSubscription.parse(data, cursor)) {
            return false;
        }
        cursor += ListedSubscriptionField.BYTE_LENGTH;
        if (!etfSubscription.parse(data, cursor)) {
            return false;
        }
        cursor += EtfSubscriptionField.BYTE_LENGTH;
        if (!otcSubscription.parse(data, cursor)) {
            return false;
        }
        cursor += OtcSubscriptionField.BYTE_LENGTH;
        if (!globalOtcSubscription.parse(data, cursor)) {
            return false;
        }
        cursor += GlobalOtcSubscriptionField.BYTE_LENGTH;
        if (!bondSubscription.parse(data, cursor)) {
            return false;
        }
        cursor += BondSubscriptionField.BYTE_LENGTH;
        if (!etx.parse(data, cursor)) {
            return false;
        }
        cursor += EtxField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = username.encode(data, cursor);
        cursor = password.encode(data, cursor);
        cursor = loginSequenceNumber.encode(data, cursor);
        cursor = listedSubscription.encode(data, cursor);
        cursor = etfSubscription.encode(data, cursor);
        cursor = otcSubscription.encode(data, cursor);
        cursor = globalOtcSubscription.encode(data, cursor);
        cursor = bondSubscription.encode(data, cursor);
        cursor = etx.encode(data, cursor);
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
            case "Username" -> Optional.of(username);
            case "Password" -> Optional.of(password);
            case "LoginSequenceNumber" -> Optional.of(loginSequenceNumber);
            case "ListedSubscription" -> Optional.of(listedSubscription);
            case "EtfSubscription" -> Optional.of(etfSubscription);
            case "OtcSubscription" -> Optional.of(otcSubscription);
            case "GlobalOtcSubscription" -> Optional.of(globalOtcSubscription);
            case "BondSubscription" -> Optional.of(bondSubscription);
            case "Etx" -> Optional.of(etx);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LoginMessage message)) {
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
        if (!(other instanceof LoginMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
