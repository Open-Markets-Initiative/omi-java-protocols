package omi.nse.nsecom.orderentry.nnf.v3_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.Batch2StartTimeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BranchIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BrokerIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BrokerNameField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BrokerStatusField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ClearingStatusField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ColourField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.HostSwitchContextField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastPasswordChangeDateField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.MemberTypeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.NewPasswordField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.PasswordField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.SequenceNumberField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ShowIndexField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.StBrokerEligibilityPerMktField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TraderNameField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.UserIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.UserTypeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.VersionNumberField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.WsClassNameField;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Message;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.PrintOptions;

/**
 * Represents the SignOffTraderOutMessage message from the OrderEntry protocol.
 *
 * <p>5585 MS_SIGNON 278 I, carried in the MS_SIGNON structure</p>
 */
public final class SignOffTraderOutMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 238;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Sign Off Trader Out Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 4, 8, 20, 8, 71, 1, 133, 1, 190, 16, 206, 16, 222, 16 };

    /**
     * UserID
     */
    private final UserIdField userId = new UserIdField();

    /**
     * The password should be of exact eight characters in length.The password should be alphanumeric i.e password should contain 1 upper case letter,1 lower case letter,1 numeral and 1 special character from the list @#$%&amp;*&#47;\. Note: The trader sh
     */
    private final PasswordField password = new PasswordField();

    /**
     * This field should be entered only when the trader wishes to change the password or the password has expired
     */
    private final NewPasswordField newPassword = new NewPasswordField();

    /**
     * This field should be set to blank while sending to the host
     */
    private final TraderNameField traderName = new TraderNameField();

    /**
     * LastPasswordChangeDate
     */
    private final LastPasswordChangeDateField lastPasswordChangeDate = new LastPasswordChangeDateField();

    /**
     * This field should contain the trading member ID
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * This field should contain the Branch ID to which the broker belongs
     */
    private final BranchIdField branchId = new BranchIdField();

    /**
     * This field should contain the version number of the trading system
     */
    private final VersionNumberField versionNumber = new VersionNumberField();

    /**
     * This field should be set to numerical zero
     */
    private final Batch2StartTimeField batch2StartTime = new Batch2StartTimeField();

    /**
     * This field should be set to blank
     */
    private final HostSwitchContextField hostSwitchContext = new HostSwitchContextField();

    /**
     * This field should be set to blank
     */
    private final ColourField colour = new ColourField();

    /**
     * This field can take one of the following values. • ‘0’ denotes Dealer • ‘4’ denotes Corporate Manager • ‘5’ denotes Branch Manager This field should be set to zero while sending to the host
     */
    private final UserTypeField userType = new UserTypeField();

    /**
     * This field should be set to numerical zero while sending the request to host
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * WsClassName
     */
    private final WsClassNameField wsClassName = new WsClassNameField();

    /**
     * This field should be set to blank
     */
    private final BrokerStatusField brokerStatus = new BrokerStatusField();

    /**
     * Should be =‘T’ for Trim-NNF protocol
     */
    private final ShowIndexField showIndex = new ShowIndexField();

    /**
     * St Broker Eligibility Per Mkt
     */
    private final StBrokerEligibilityPerMktField stBrokerEligibilityPerMkt = new StBrokerEligibilityPerMktField();

    /**
     * This field should be set to numerical zero
     */
    private final MemberTypeField memberType = new MemberTypeField();

    /**
     * This field should be set to blank
     */
    private final ClearingStatusField clearingStatus = new ClearingStatusField();

    /**
     * This field should contain the broker’s name
     */
    private final BrokerNameField brokerName = new BrokerNameField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(userId, password, newPassword, traderName, lastPasswordChangeDate, brokerId, branchId, versionNumber, batch2StartTime, hostSwitchContext, colour, userType, sequenceNumber, wsClassName, brokerStatus, showIndex, stBrokerEligibilityPerMkt, memberType, clearingStatus, brokerName);

    private byte[] buffer;

    private boolean decoded;

    /**
     * UserID
     *
     * @return the UserId field
     */
    public UserIdField userId() {
        return userId;
    }

    /**
     * The password should be of exact eight characters in length.The password should be alphanumeric i.e password should contain 1 upper case letter,1 lower case letter,1 numeral and 1 special character from the list @#$%&amp;*&#47;\. Note: The trader sh
     *
     * @return the Password field
     */
    public PasswordField password() {
        return password;
    }

    /**
     * This field should be entered only when the trader wishes to change the password or the password has expired
     *
     * @return the NewPassword field
     */
    public NewPasswordField newPassword() {
        return newPassword;
    }

    /**
     * This field should be set to blank while sending to the host
     *
     * @return the TraderName field
     */
    public TraderNameField traderName() {
        return traderName;
    }

    /**
     * LastPasswordChangeDate
     *
     * @return the LastPasswordChangeDate field
     */
    public LastPasswordChangeDateField lastPasswordChangeDate() {
        return lastPasswordChangeDate;
    }

    /**
     * This field should contain the trading member ID
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * This field should contain the Branch ID to which the broker belongs
     *
     * @return the BranchId field
     */
    public BranchIdField branchId() {
        return branchId;
    }

    /**
     * This field should contain the version number of the trading system
     *
     * @return the VersionNumber field
     */
    public VersionNumberField versionNumber() {
        return versionNumber;
    }

    /**
     * This field should be set to numerical zero
     *
     * @return the Batch2StartTime field
     */
    public Batch2StartTimeField batch2StartTime() {
        return batch2StartTime;
    }

    /**
     * This field should be set to blank
     *
     * @return the HostSwitchContext field
     */
    public HostSwitchContextField hostSwitchContext() {
        return hostSwitchContext;
    }

    /**
     * This field should be set to blank
     *
     * @return the Colour field
     */
    public ColourField colour() {
        return colour;
    }

    /**
     * This field can take one of the following values. • ‘0’ denotes Dealer • ‘4’ denotes Corporate Manager • ‘5’ denotes Branch Manager This field should be set to zero while sending to the host
     *
     * @return the UserType field
     */
    public UserTypeField userType() {
        return userType;
    }

    /**
     * This field should be set to numerical zero while sending the request to host
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * WsClassName
     *
     * @return the WsClassName field
     */
    public WsClassNameField wsClassName() {
        return wsClassName;
    }

    /**
     * This field should be set to blank
     *
     * @return the BrokerStatus field
     */
    public BrokerStatusField brokerStatus() {
        return brokerStatus;
    }

    /**
     * Should be =‘T’ for Trim-NNF protocol
     *
     * @return the ShowIndex field
     */
    public ShowIndexField showIndex() {
        return showIndex;
    }

    /**
     * St Broker Eligibility Per Mkt
     *
     * @return the StBrokerEligibilityPerMkt field
     */
    public StBrokerEligibilityPerMktField stBrokerEligibilityPerMkt() {
        return stBrokerEligibilityPerMkt;
    }

    /**
     * This field should be set to numerical zero
     *
     * @return the MemberType field
     */
    public MemberTypeField memberType() {
        return memberType;
    }

    /**
     * This field should be set to blank
     *
     * @return the ClearingStatus field
     */
    public ClearingStatusField clearingStatus() {
        return clearingStatus;
    }

    /**
     * This field should contain the broker’s name
     *
     * @return the BrokerName field
     */
    public BrokerNameField brokerName() {
        return brokerName;
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
        if (!userId.parse(data, cursor)) {
            return false;
        }
        cursor += UserIdField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!password.parse(data, cursor)) {
            return false;
        }
        cursor += PasswordField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!newPassword.parse(data, cursor)) {
            return false;
        }
        cursor += NewPasswordField.BYTE_LENGTH;
        if (!traderName.parse(data, cursor)) {
            return false;
        }
        cursor += TraderNameField.BYTE_LENGTH;
        if (!lastPasswordChangeDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastPasswordChangeDateField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!branchId.parse(data, cursor)) {
            return false;
        }
        cursor += BranchIdField.BYTE_LENGTH;
        if (!versionNumber.parse(data, cursor)) {
            return false;
        }
        cursor += VersionNumberField.BYTE_LENGTH;
        if (!batch2StartTime.parse(data, cursor)) {
            return false;
        }
        cursor += Batch2StartTimeField.BYTE_LENGTH;
        if (!hostSwitchContext.parse(data, cursor)) {
            return false;
        }
        cursor += HostSwitchContextField.BYTE_LENGTH;
        if (!colour.parse(data, cursor)) {
            return false;
        }
        cursor += ColourField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!userType.parse(data, cursor)) {
            return false;
        }
        cursor += UserTypeField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!wsClassName.parse(data, cursor)) {
            return false;
        }
        cursor += WsClassNameField.BYTE_LENGTH;
        if (!brokerStatus.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerStatusField.BYTE_LENGTH;
        if (!showIndex.parse(data, cursor)) {
            return false;
        }
        cursor += ShowIndexField.BYTE_LENGTH;
        if (!stBrokerEligibilityPerMkt.parse(data, cursor)) {
            return false;
        }
        cursor += StBrokerEligibilityPerMktField.BYTE_LENGTH;
        if (!memberType.parse(data, cursor)) {
            return false;
        }
        cursor += MemberTypeField.BYTE_LENGTH;
        if (!clearingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingStatusField.BYTE_LENGTH;
        if (!brokerName.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerNameField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = userId.encode(data, cursor);
        if (buffer != null && buffer.length >= 12) {
            System.arraycopy(buffer, 4, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = password.encode(data, cursor);
        if (buffer != null && buffer.length >= 28) {
            System.arraycopy(buffer, 20, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = newPassword.encode(data, cursor);
        cursor = traderName.encode(data, cursor);
        cursor = lastPasswordChangeDate.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        if (buffer != null && buffer.length >= 72) {
            System.arraycopy(buffer, 71, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = branchId.encode(data, cursor);
        cursor = versionNumber.encode(data, cursor);
        cursor = batch2StartTime.encode(data, cursor);
        cursor = hostSwitchContext.encode(data, cursor);
        cursor = colour.encode(data, cursor);
        if (buffer != null && buffer.length >= 134) {
            System.arraycopy(buffer, 133, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = userType.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = wsClassName.encode(data, cursor);
        cursor = brokerStatus.encode(data, cursor);
        cursor = showIndex.encode(data, cursor);
        cursor = stBrokerEligibilityPerMkt.encode(data, cursor);
        cursor = memberType.encode(data, cursor);
        cursor = clearingStatus.encode(data, cursor);
        cursor = brokerName.encode(data, cursor);
        if (buffer != null && buffer.length >= 238) {
            System.arraycopy(buffer, 190, data, cursor, 48); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 48, (byte) 0); // padding
        }
        cursor += 48;
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
            case "UserId" -> Optional.of(userId);
            case "Password" -> Optional.of(password);
            case "NewPassword" -> Optional.of(newPassword);
            case "TraderName" -> Optional.of(traderName);
            case "LastPasswordChangeDate" -> Optional.of(lastPasswordChangeDate);
            case "BrokerId" -> Optional.of(brokerId);
            case "BranchId" -> Optional.of(branchId);
            case "VersionNumber" -> Optional.of(versionNumber);
            case "Batch2StartTime" -> Optional.of(batch2StartTime);
            case "HostSwitchContext" -> Optional.of(hostSwitchContext);
            case "Colour" -> Optional.of(colour);
            case "UserType" -> Optional.of(userType);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "WsClassName" -> Optional.of(wsClassName);
            case "BrokerStatus" -> Optional.of(brokerStatus);
            case "ShowIndex" -> Optional.of(showIndex);
            case "StBrokerEligibilityPerMkt" -> Optional.of(stBrokerEligibilityPerMkt);
            case "MemberType" -> Optional.of(memberType);
            case "ClearingStatus" -> Optional.of(clearingStatus);
            case "BrokerName" -> Optional.of(brokerName);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SignOffTraderOutMessage message)) {
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
        if (!(other instanceof SignOffTraderOutMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
