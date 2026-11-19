package omi.bme.bmeequities.orderentry.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.AccountBolsaField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.AccountField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.AccountTypeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.AlgorithmicTradeIndicatorField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.AllocTextField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.AutomaticOrderFilterFlagField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ClientDataIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ClientDataReferenceField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ClientIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.DeaFlagField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.DecisorIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ExecutorIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.FirmMnemonicField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.GiveInMemberField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.LastCapacityField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.LiquidityProvisionActivityField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.PersistenceField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ReceivedDeptIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.RequestIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SelfMatchPreventionIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SelfMatchPreventionTypeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.StatusField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the OrderAndQuoteClientDataParametersAckNackMessage message from the OrderEntry protocol.
 *
 * <p>Sent by the server to confirm an Order and Quote Client Data Parameters message</p>
 */
public final class OrderAndQuoteClientDataParametersAckNackMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 102;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order And Quote Client Data Parameters Ack Nack Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Request ID (for application feedback)
     */
    private final RequestIdField requestId = new RequestIdField();

    /**
     * Request accepted or rejected
     */
    private final StatusField status = new StatusField();

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     */
    private final ClientDataIdField clientDataId = new ClientDataIdField();

    /**
     * Algorithmic flag indicator
     */
    private final AlgorithmicTradeIndicatorField algorithmicTradeIndicator = new AlgorithmicTradeIndicatorField();

    /**
     * Mifid II ClientID
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Client code
     */
    private final AccountBolsaField accountBolsa = new AccountBolsaField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Direct Electronic Access indicator
     */
    private final DeaFlagField deaFlag = new DeaFlagField();

    /**
     * MIFID II DecisorID
     */
    private final DecisorIdField decisorId = new DecisorIdField();

    /**
     * Mifid II ExecutorID
     */
    private final ExecutorIdField executorId = new ExecutorIdField();

    /**
     * Liquidity Provision Activity Flag
     */
    private final LiquidityProvisionActivityField liquidityProvisionActivity = new LiquidityProvisionActivityField();

    /**
     * Give-in member
     */
    private final GiveInMemberField giveInMember = new GiveInMemberField();

    /**
     * Firm Mnemonic
     */
    private final FirmMnemonicField firmMnemonic = new FirmMnemonicField();

    /**
     * Alloc Text
     */
    private final AllocTextField allocText = new AllocTextField();

    /**
     * Last Capacity
     */
    private final LastCapacityField lastCapacity = new LastCapacityField();

    /**
     * Self Match Prevention Id
     */
    private final SelfMatchPreventionIdField selfMatchPreventionId = new SelfMatchPreventionIdField();

    /**
     * Automatic Order Filter Flag
     */
    private final AutomaticOrderFilterFlagField automaticOrderFilterFlag = new AutomaticOrderFilterFlagField();

    /**
     * Received Dept Id
     */
    private final ReceivedDeptIdField receivedDeptId = new ReceivedDeptIdField();

    /**
     * Persistence type
     */
    private final PersistenceField persistence = new PersistenceField();

    /**
     * Capacity Indicator
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Self Match Prevention Type
     */
    private final SelfMatchPreventionTypeField selfMatchPreventionType = new SelfMatchPreventionTypeField();

    /**
     * Free to use by clients
     */
    private final ClientDataReferenceField clientDataReference = new ClientDataReferenceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, requestId, status, clientDataId, algorithmicTradeIndicator, clientId, accountBolsa, account, deaFlag, decisorId, executorId, liquidityProvisionActivity, giveInMember, firmMnemonic, allocText, lastCapacity, selfMatchPreventionId, automaticOrderFilterFlag, receivedDeptId, persistence, accountType, selfMatchPreventionType, clientDataReference);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Request ID (for application feedback)
     *
     * @return the RequestId field
     */
    public RequestIdField requestId() {
        return requestId;
    }

    /**
     * Request accepted or rejected
     *
     * @return the Status field
     */
    public StatusField status() {
        return status;
    }

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     *
     * @return the ClientDataId field
     */
    public ClientDataIdField clientDataId() {
        return clientDataId;
    }

    /**
     * Algorithmic flag indicator
     *
     * @return the AlgorithmicTradeIndicator field
     */
    public AlgorithmicTradeIndicatorField algorithmicTradeIndicator() {
        return algorithmicTradeIndicator;
    }

    /**
     * Mifid II ClientID
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Client code
     *
     * @return the AccountBolsa field
     */
    public AccountBolsaField accountBolsa() {
        return accountBolsa;
    }

    /**
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Direct Electronic Access indicator
     *
     * @return the DeaFlag field
     */
    public DeaFlagField deaFlag() {
        return deaFlag;
    }

    /**
     * MIFID II DecisorID
     *
     * @return the DecisorId field
     */
    public DecisorIdField decisorId() {
        return decisorId;
    }

    /**
     * Mifid II ExecutorID
     *
     * @return the ExecutorId field
     */
    public ExecutorIdField executorId() {
        return executorId;
    }

    /**
     * Liquidity Provision Activity Flag
     *
     * @return the LiquidityProvisionActivity field
     */
    public LiquidityProvisionActivityField liquidityProvisionActivity() {
        return liquidityProvisionActivity;
    }

    /**
     * Give-in member
     *
     * @return the GiveInMember field
     */
    public GiveInMemberField giveInMember() {
        return giveInMember;
    }

    /**
     * Firm Mnemonic
     *
     * @return the FirmMnemonic field
     */
    public FirmMnemonicField firmMnemonic() {
        return firmMnemonic;
    }

    /**
     * Alloc Text
     *
     * @return the AllocText field
     */
    public AllocTextField allocText() {
        return allocText;
    }

    /**
     * Last Capacity
     *
     * @return the LastCapacity field
     */
    public LastCapacityField lastCapacity() {
        return lastCapacity;
    }

    /**
     * Self Match Prevention Id
     *
     * @return the SelfMatchPreventionId field
     */
    public SelfMatchPreventionIdField selfMatchPreventionId() {
        return selfMatchPreventionId;
    }

    /**
     * Automatic Order Filter Flag
     *
     * @return the AutomaticOrderFilterFlag field
     */
    public AutomaticOrderFilterFlagField automaticOrderFilterFlag() {
        return automaticOrderFilterFlag;
    }

    /**
     * Received Dept Id
     *
     * @return the ReceivedDeptId field
     */
    public ReceivedDeptIdField receivedDeptId() {
        return receivedDeptId;
    }

    /**
     * Persistence type
     *
     * @return the Persistence field
     */
    public PersistenceField persistence() {
        return persistence;
    }

    /**
     * Capacity Indicator
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * Self Match Prevention Type
     *
     * @return the SelfMatchPreventionType field
     */
    public SelfMatchPreventionTypeField selfMatchPreventionType() {
        return selfMatchPreventionType;
    }

    /**
     * Free to use by clients
     *
     * @return the ClientDataReference field
     */
    public ClientDataReferenceField clientDataReference() {
        return clientDataReference;
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!requestId.parse(data, cursor)) {
            return false;
        }
        cursor += RequestIdField.BYTE_LENGTH;
        if (!status.parse(data, cursor)) {
            return false;
        }
        cursor += StatusField.BYTE_LENGTH;
        if (!clientDataId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientDataIdField.BYTE_LENGTH;
        if (!algorithmicTradeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AlgorithmicTradeIndicatorField.BYTE_LENGTH;
        if (!clientId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdField.BYTE_LENGTH;
        if (!accountBolsa.parse(data, cursor)) {
            return false;
        }
        cursor += AccountBolsaField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!deaFlag.parse(data, cursor)) {
            return false;
        }
        cursor += DeaFlagField.BYTE_LENGTH;
        if (!decisorId.parse(data, cursor)) {
            return false;
        }
        cursor += DecisorIdField.BYTE_LENGTH;
        if (!executorId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutorIdField.BYTE_LENGTH;
        if (!liquidityProvisionActivity.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityProvisionActivityField.BYTE_LENGTH;
        if (!giveInMember.parse(data, cursor)) {
            return false;
        }
        cursor += GiveInMemberField.BYTE_LENGTH;
        if (!firmMnemonic.parse(data, cursor)) {
            return false;
        }
        cursor += FirmMnemonicField.BYTE_LENGTH;
        if (!allocText.parse(data, cursor)) {
            return false;
        }
        cursor += AllocTextField.BYTE_LENGTH;
        if (!lastCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += LastCapacityField.BYTE_LENGTH;
        if (!selfMatchPreventionId.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        if (!automaticOrderFilterFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AutomaticOrderFilterFlagField.BYTE_LENGTH;
        if (!receivedDeptId.parse(data, cursor)) {
            return false;
        }
        cursor += ReceivedDeptIdField.BYTE_LENGTH;
        if (!persistence.parse(data, cursor)) {
            return false;
        }
        cursor += PersistenceField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!selfMatchPreventionType.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionTypeField.BYTE_LENGTH;
        return clientDataReference.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = requestId.encode(data, cursor);
        cursor = status.encode(data, cursor);
        cursor = clientDataId.encode(data, cursor);
        cursor = algorithmicTradeIndicator.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
        cursor = accountBolsa.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = deaFlag.encode(data, cursor);
        cursor = decisorId.encode(data, cursor);
        cursor = executorId.encode(data, cursor);
        cursor = liquidityProvisionActivity.encode(data, cursor);
        cursor = giveInMember.encode(data, cursor);
        cursor = firmMnemonic.encode(data, cursor);
        cursor = allocText.encode(data, cursor);
        cursor = lastCapacity.encode(data, cursor);
        cursor = selfMatchPreventionId.encode(data, cursor);
        cursor = automaticOrderFilterFlag.encode(data, cursor);
        cursor = receivedDeptId.encode(data, cursor);
        cursor = persistence.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = selfMatchPreventionType.encode(data, cursor);
        cursor = clientDataReference.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "RequestId" -> Optional.of(requestId);
            case "Status" -> Optional.of(status);
            case "ClientDataId" -> Optional.of(clientDataId);
            case "AlgorithmicTradeIndicator" -> Optional.of(algorithmicTradeIndicator);
            case "ClientId" -> Optional.of(clientId);
            case "AccountBolsa" -> Optional.of(accountBolsa);
            case "Account" -> Optional.of(account);
            case "DeaFlag" -> Optional.of(deaFlag);
            case "DecisorId" -> Optional.of(decisorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "LiquidityProvisionActivity" -> Optional.of(liquidityProvisionActivity);
            case "GiveInMember" -> Optional.of(giveInMember);
            case "FirmMnemonic" -> Optional.of(firmMnemonic);
            case "AllocText" -> Optional.of(allocText);
            case "LastCapacity" -> Optional.of(lastCapacity);
            case "SelfMatchPreventionId" -> Optional.of(selfMatchPreventionId);
            case "AutomaticOrderFilterFlag" -> Optional.of(automaticOrderFilterFlag);
            case "ReceivedDeptId" -> Optional.of(receivedDeptId);
            case "Persistence" -> Optional.of(persistence);
            case "AccountType" -> Optional.of(accountType);
            case "SelfMatchPreventionType" -> Optional.of(selfMatchPreventionType);
            case "ClientDataReference" -> Optional.of(clientDataReference);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAndQuoteClientDataParametersAckNackMessage message)) {
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
        if (!(other instanceof OrderAndQuoteClientDataParametersAckNackMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
