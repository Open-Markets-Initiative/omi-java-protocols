package omi.bse.bseindia.eti.fbe.v1_6_14.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AccountTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AlgoIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClientCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.CpCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MessageTagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrderIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteEventExecIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteEventLiquidityIndField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteEventMatchIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteEventPxField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteEventQtyField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteEventReasonField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteEventSideField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteEventTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.QuoteMsgIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SecurityIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SenderLocationIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.GroupEntry;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * One entry of the QuoteEventGrpComp repeating group.
 *
 * <p>Quote Event Grp Comp</p>
 */
public final class QuoteEventGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 104;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "QuoteEventGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 101, 3 };

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Sender Location Id
     */
    private final SenderLocationIdField senderLocationId = new SenderLocationIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Quote Event Px
     */
    private final QuoteEventPxField quoteEventPx = new QuoteEventPxField();

    /**
     * Quote Msg Id
     */
    private final QuoteMsgIdField quoteMsgId = new QuoteMsgIdField();

    /**
     * Quote Event Match Id
     */
    private final QuoteEventMatchIdField quoteEventMatchId = new QuoteEventMatchIdField();

    /**
     * Message Tag
     */
    private final MessageTagField messageTag = new MessageTagField();

    /**
     * Quote Event Exec Id
     */
    private final QuoteEventExecIdField quoteEventExecId = new QuoteEventExecIdField();

    /**
     * Quote Event Qty
     */
    private final QuoteEventQtyField quoteEventQty = new QuoteEventQtyField();

    /**
     * Quote Event Type
     */
    private final QuoteEventTypeField quoteEventType = new QuoteEventTypeField();

    /**
     * Quote Event Side
     */
    private final QuoteEventSideField quoteEventSide = new QuoteEventSideField();

    /**
     * Quote Event Liquidity Ind
     */
    private final QuoteEventLiquidityIndField quoteEventLiquidityInd = new QuoteEventLiquidityIndField();

    /**
     * Quote Event Reason
     */
    private final QuoteEventReasonField quoteEventReason = new QuoteEventReasonField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Algo Id
     */
    private final AlgoIdField algoId = new AlgoIdField();

    /**
     * Client Code
     */
    private final ClientCodeField clientCode = new ClientCodeField();

    /**
     * Cp Code
     */
    private final CpCodeField cpCode = new CpCodeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderId, senderLocationId, securityId, quoteEventPx, quoteMsgId, quoteEventMatchId, messageTag, quoteEventExecId, quoteEventQty, quoteEventType, quoteEventSide, quoteEventLiquidityInd, quoteEventReason, accountType, algoId, clientCode, cpCode);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Order Id
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Sender Location Id
     *
     * @return the SenderLocationId field
     */
    public SenderLocationIdField senderLocationId() {
        return senderLocationId;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Quote Event Px
     *
     * @return the QuoteEventPx field
     */
    public QuoteEventPxField quoteEventPx() {
        return quoteEventPx;
    }

    /**
     * Quote Msg Id
     *
     * @return the QuoteMsgId field
     */
    public QuoteMsgIdField quoteMsgId() {
        return quoteMsgId;
    }

    /**
     * Quote Event Match Id
     *
     * @return the QuoteEventMatchId field
     */
    public QuoteEventMatchIdField quoteEventMatchId() {
        return quoteEventMatchId;
    }

    /**
     * Message Tag
     *
     * @return the MessageTag field
     */
    public MessageTagField messageTag() {
        return messageTag;
    }

    /**
     * Quote Event Exec Id
     *
     * @return the QuoteEventExecId field
     */
    public QuoteEventExecIdField quoteEventExecId() {
        return quoteEventExecId;
    }

    /**
     * Quote Event Qty
     *
     * @return the QuoteEventQty field
     */
    public QuoteEventQtyField quoteEventQty() {
        return quoteEventQty;
    }

    /**
     * Quote Event Type
     *
     * @return the QuoteEventType field
     */
    public QuoteEventTypeField quoteEventType() {
        return quoteEventType;
    }

    /**
     * Quote Event Side
     *
     * @return the QuoteEventSide field
     */
    public QuoteEventSideField quoteEventSide() {
        return quoteEventSide;
    }

    /**
     * Quote Event Liquidity Ind
     *
     * @return the QuoteEventLiquidityInd field
     */
    public QuoteEventLiquidityIndField quoteEventLiquidityInd() {
        return quoteEventLiquidityInd;
    }

    /**
     * Quote Event Reason
     *
     * @return the QuoteEventReason field
     */
    public QuoteEventReasonField quoteEventReason() {
        return quoteEventReason;
    }

    /**
     * Account Type
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * Algo Id
     *
     * @return the AlgoId field
     */
    public AlgoIdField algoId() {
        return algoId;
    }

    /**
     * Client Code
     *
     * @return the ClientCode field
     */
    public ClientCodeField clientCode() {
        return clientCode;
    }

    /**
     * Cp Code
     *
     * @return the CpCode field
     */
    public CpCodeField cpCode() {
        return cpCode;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!senderLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!quoteEventPx.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventPxField.BYTE_LENGTH;
        if (!quoteMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteMsgIdField.BYTE_LENGTH;
        if (!quoteEventMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventMatchIdField.BYTE_LENGTH;
        if (!messageTag.parse(data, cursor)) {
            return false;
        }
        cursor += MessageTagField.BYTE_LENGTH;
        if (!quoteEventExecId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventExecIdField.BYTE_LENGTH;
        if (!quoteEventQty.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventQtyField.BYTE_LENGTH;
        if (!quoteEventType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventTypeField.BYTE_LENGTH;
        if (!quoteEventSide.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventSideField.BYTE_LENGTH;
        if (!quoteEventLiquidityInd.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventLiquidityIndField.BYTE_LENGTH;
        if (!quoteEventReason.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventReasonField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!algoId.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoIdField.BYTE_LENGTH;
        if (!clientCode.parse(data, cursor)) {
            return false;
        }
        cursor += ClientCodeField.BYTE_LENGTH;
        if (!cpCode.parse(data, cursor)) {
            return false;
        }
        cursor += CpCodeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = orderId.encode(data, cursor);
        cursor = senderLocationId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = quoteEventPx.encode(data, cursor);
        cursor = quoteMsgId.encode(data, cursor);
        cursor = quoteEventMatchId.encode(data, cursor);
        cursor = messageTag.encode(data, cursor);
        cursor = quoteEventExecId.encode(data, cursor);
        cursor = quoteEventQty.encode(data, cursor);
        cursor = quoteEventType.encode(data, cursor);
        cursor = quoteEventSide.encode(data, cursor);
        cursor = quoteEventLiquidityInd.encode(data, cursor);
        cursor = quoteEventReason.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        cursor = clientCode.encode(data, cursor);
        cursor = cpCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 104) {
            System.arraycopy(buffer, 101, data, cursor, 3); // padding
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "OrderId" -> Optional.of(orderId);
            case "SenderLocationId" -> Optional.of(senderLocationId);
            case "SecurityId" -> Optional.of(securityId);
            case "QuoteEventPx" -> Optional.of(quoteEventPx);
            case "QuoteMsgId" -> Optional.of(quoteMsgId);
            case "QuoteEventMatchId" -> Optional.of(quoteEventMatchId);
            case "MessageTag" -> Optional.of(messageTag);
            case "QuoteEventExecId" -> Optional.of(quoteEventExecId);
            case "QuoteEventQty" -> Optional.of(quoteEventQty);
            case "QuoteEventType" -> Optional.of(quoteEventType);
            case "QuoteEventSide" -> Optional.of(quoteEventSide);
            case "QuoteEventLiquidityInd" -> Optional.of(quoteEventLiquidityInd);
            case "QuoteEventReason" -> Optional.of(quoteEventReason);
            case "AccountType" -> Optional.of(accountType);
            case "AlgoId" -> Optional.of(algoId);
            case "ClientCode" -> Optional.of(clientCode);
            case "CpCode" -> Optional.of(cpCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof QuoteEventGrpCompEntry message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof QuoteEventGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
