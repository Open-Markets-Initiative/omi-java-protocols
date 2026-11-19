package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.AccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.ClearingAccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.ClearingFirmField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.CmtaNumberField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.CustomGroupIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.PostingInstructionField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.QuoteCntField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.QuoteUpdateIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.ScratchPadField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.SendTimeField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.SessionEligibilityField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.SizeModifierField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.groups.QuoteEntry;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.groups.QuoteList;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.types.Field;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.types.Message;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.types.PrintOptions;

/**
 * Represents the QuoteUpdateMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Request to enter or update one or more quotes</p>
 */
public final class QuoteUpdateMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 60;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Update Message";

    /**
     * ID chosen by the member
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * CMTA Number of the firm that will clear the trade
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Reflected back on execution reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * GMT timestamp when the mass cancel or purge was sent by the Market Maker to the Exchange
     */
    private final SendTimeField sendTime = new SendTimeField();

    /**
     * PostingInstruction
     */
    private final PostingInstructionField postingInstruction = new PostingInstructionField();

    /**
     * Session Eligibility
     */
    private final SessionEligibilityField sessionEligibility = new SessionEligibilityField();

    /**
     * Controls the behavior of the quote OrderQty field
     */
    private final SizeModifierField sizeModifier = new SizeModifierField();

    /**
     * Field ignored by Cboe (any value is accepted)
     */
    private final ScratchPadField scratchPad = new ScratchPadField();

    /**
     * Number of quotes in the message
     */
    private final QuoteCntField quoteCnt = new QuoteCntField();

    /**
     * Quote
     */
    private final QuoteList quote = new QuoteList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteUpdateId, clearingFirm, clearingAccount, cmtaNumber, account, customGroupId, sendTime, postingInstruction, sessionEligibility, sizeModifier, scratchPad, quoteCnt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the member
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * CMTA Number of the firm that will clear the trade
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Reflected back on execution reports associated with this order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * GMT timestamp when the mass cancel or purge was sent by the Market Maker to the Exchange
     *
     * @return the SendTime field
     */
    public SendTimeField sendTime() {
        return sendTime;
    }

    /**
     * PostingInstruction
     *
     * @return the PostingInstruction field
     */
    public PostingInstructionField postingInstruction() {
        return postingInstruction;
    }

    /**
     * Session Eligibility
     *
     * @return the SessionEligibility field
     */
    public SessionEligibilityField sessionEligibility() {
        return sessionEligibility;
    }

    /**
     * Controls the behavior of the quote OrderQty field
     *
     * @return the SizeModifier field
     */
    public SizeModifierField sizeModifier() {
        return sizeModifier;
    }

    /**
     * Field ignored by Cboe (any value is accepted)
     *
     * @return the ScratchPad field
     */
    public ScratchPadField scratchPad() {
        return scratchPad;
    }

    /**
     * Number of quotes in the message
     *
     * @return the QuoteCnt field
     */
    public QuoteCntField quoteCnt() {
        return quoteCnt;
    }

    /**
     * Quote
     *
     * <p>Encode writes this list's size to the QuoteCnt field.</p>
     *
     * @return the Quote entries
     */
    public QuoteList quote() {
        return quote;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quote.byteLength();
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
        return Optional.ofNullable(sendTime.value());
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
        if (!quoteUpdateId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteUpdateIdField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        if (!sendTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendTimeField.BYTE_LENGTH;
        if (!postingInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += PostingInstructionField.BYTE_LENGTH;
        if (!sessionEligibility.parse(data, cursor)) {
            return false;
        }
        cursor += SessionEligibilityField.BYTE_LENGTH;
        if (!sizeModifier.parse(data, cursor)) {
            return false;
        }
        cursor += SizeModifierField.BYTE_LENGTH;
        if (!scratchPad.parse(data, cursor)) {
            return false;
        }
        cursor += ScratchPadField.BYTE_LENGTH;
        if (!quoteCnt.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteCntField.BYTE_LENGTH;
        if (!quote.parse(data, cursor, end, quoteCnt.value())) {
            return false;
        }
        cursor += quote.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quote.size() > 255) {
            throw new IllegalStateException("quote holds " + quote.size() + " entries, more than its count field can state");
        }
        quoteCnt.value((short) quote.size());
        int cursor = offset;
        cursor = quoteUpdateId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = sendTime.encode(data, cursor);
        cursor = postingInstruction.encode(data, cursor);
        cursor = sessionEligibility.encode(data, cursor);
        cursor = sizeModifier.encode(data, cursor);
        cursor = scratchPad.encode(data, cursor);
        cursor = quoteCnt.encode(data, cursor);
        cursor = quote.encode(data, cursor);
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
        quote.clear();
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
            if (field != quoteCnt && !field.isRecognized()) {
                return false;
            }
        }
        return quote.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != quoteCnt && !field.isValid()) {
                return false;
            }
        }
        if (!quote.isValid()) {
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
        if (!quoteUpdateId.isDecoded()) {
            return Optional.of(quoteUpdateId);
        }
        if (!clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (!clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (!cmtaNumber.isDecoded()) {
            return Optional.of(cmtaNumber);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (!sendTime.isDecoded()) {
            return Optional.of(sendTime);
        }
        if (!postingInstruction.isDecoded()) {
            return Optional.of(postingInstruction);
        }
        if (!sessionEligibility.isDecoded()) {
            return Optional.of(sessionEligibility);
        }
        if (!sizeModifier.isDecoded()) {
            return Optional.of(sizeModifier);
        }
        if (!scratchPad.isDecoded()) {
            return Optional.of(scratchPad);
        }
        if (!quoteCnt.isDecoded()) {
            return Optional.of(quoteCnt);
        }
        if (!quote.isDecoded()) {
            return Optional.of(quote.failedEntry().flatMap(QuoteEntry::failedAt).orElse(quoteCnt));
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
            case "QuoteUpdateId" -> Optional.of(quoteUpdateId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "Account" -> Optional.of(account);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "SendTime" -> Optional.of(sendTime);
            case "PostingInstruction" -> Optional.of(postingInstruction);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "SizeModifier" -> Optional.of(sizeModifier);
            case "ScratchPad" -> Optional.of(scratchPad);
            case "QuoteCnt" -> Optional.of(quoteCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteUpdateMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quote.diffFields(message.quote));
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
            quote.toFormattedString(builder, options);
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
        quote.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && quote.equals(message.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quote);
    }
}
