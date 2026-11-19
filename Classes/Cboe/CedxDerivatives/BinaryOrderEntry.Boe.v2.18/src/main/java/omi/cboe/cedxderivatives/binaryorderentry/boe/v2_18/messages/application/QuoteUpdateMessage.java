package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.AccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.AccountTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.CapacityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClearingAccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClientIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClientQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.CustOrderHandlingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.CustomGroupIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ExecutorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ExecutorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.InvestorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.InvestorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.OrderOriginationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.PostingInstructionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.QuoteCntField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.QuoteUpdateIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.groups.QuoteEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.groups.QuoteList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.PrintOptions;

/**
 * Represents the QuoteUpdateMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Quote Update Message.</p>
 */
public final class QuoteUpdateMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 65;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Update Message";

    /**
     * ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe, the ’at’ symbol and double quotes. Responses, both to the Quote Update and any Quote Executions, Quote Cancellations, and Quote Modification messages will include this identifier. Note: Cboe only enforces uniqueness of QuoteUpdateID values among those not yet acknowledged by the matching en- gine. However, we strongly recommend that you keep your QuoteUpdateID values day- unique.
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Custom Group Id
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Client Id
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Client Qualified Role
     */
    private final ClientQualifiedRoleField clientQualifiedRole = new ClientQualifiedRoleField();

    /**
     * Executor Id
     */
    private final ExecutorIdField executorId = new ExecutorIdField();

    /**
     * Executor Qualified Role
     */
    private final ExecutorQualifiedRoleField executorQualifiedRole = new ExecutorQualifiedRoleField();

    /**
     * Investor Id
     */
    private final InvestorIdField investorId = new InvestorIdField();

    /**
     * Investor Qualified Role
     */
    private final InvestorQualifiedRoleField investorQualifiedRole = new InvestorQualifiedRoleField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * P = Post Only (do not remove liquidity) B = Book Only (allow removal of liquidity, avail- able for Market Makers of futures only). Note that for options, only Post Only is sup- ported.
     */
    private final PostingInstructionField postingInstruction = new PostingInstructionField();

    /**
     * Number of repeating groups included in this quote update. Allowed values are 1-20.
     */
    private final QuoteCntField quoteCnt = new QuoteCntField();

    /**
     * Repeating group stated QuoteCnt times.
     */
    private final QuoteList quote = new QuoteList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteUpdateId, clearingFirm, clearingAccount, orderOrigination, algorithmicIndicator, liquidityProvision, custOrderHandlingInst, account, customGroupId, capacity, clientId, clientQualifiedRole, executorId, executorQualifiedRole, investorId, investorQualifiedRole, accountType, postingInstruction, quoteCnt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe, the ’at’ symbol and double quotes. Responses, both to the Quote Update and any Quote Executions, Quote Cancellations, and Quote Modification messages will include this identifier. Note: Cboe only enforces uniqueness of QuoteUpdateID values among those not yet acknowledged by the matching en- gine. However, we strongly recommend that you keep your QuoteUpdateID values day- unique.
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    /**
     * Algorithmic Indicator
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * Liquidity Provision
     *
     * @return the LiquidityProvision field
     */
    public LiquidityProvisionField liquidityProvision() {
        return liquidityProvision;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
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
     * Custom Group Id
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Client Id
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Client Qualified Role
     *
     * @return the ClientQualifiedRole field
     */
    public ClientQualifiedRoleField clientQualifiedRole() {
        return clientQualifiedRole;
    }

    /**
     * Executor Id
     *
     * @return the ExecutorId field
     */
    public ExecutorIdField executorId() {
        return executorId;
    }

    /**
     * Executor Qualified Role
     *
     * @return the ExecutorQualifiedRole field
     */
    public ExecutorQualifiedRoleField executorQualifiedRole() {
        return executorQualifiedRole;
    }

    /**
     * Investor Id
     *
     * @return the InvestorId field
     */
    public InvestorIdField investorId() {
        return investorId;
    }

    /**
     * Investor Qualified Role
     *
     * @return the InvestorQualifiedRole field
     */
    public InvestorQualifiedRoleField investorQualifiedRole() {
        return investorQualifiedRole;
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
     * P = Post Only (do not remove liquidity) B = Book Only (allow removal of liquidity, avail- able for Market Makers of futures only). Note that for options, only Post Only is sup- ported.
     *
     * @return the PostingInstruction field
     */
    public PostingInstructionField postingInstruction() {
        return postingInstruction;
    }

    /**
     * Number of repeating groups included in this quote update. Allowed values are 1-20.
     *
     * @return the QuoteCnt field
     */
    public QuoteCntField quoteCnt() {
        return quoteCnt;
    }

    /**
     * Repeating group stated QuoteCnt times.
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
        if (!orderOrigination.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginationField.BYTE_LENGTH;
        if (!algorithmicIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AlgorithmicIndicatorField.BYTE_LENGTH;
        if (!liquidityProvision.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityProvisionField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!clientId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdField.BYTE_LENGTH;
        if (!clientQualifiedRole.parse(data, cursor)) {
            return false;
        }
        cursor += ClientQualifiedRoleField.BYTE_LENGTH;
        if (!executorId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutorIdField.BYTE_LENGTH;
        if (!executorQualifiedRole.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutorQualifiedRoleField.BYTE_LENGTH;
        if (!investorId.parse(data, cursor)) {
            return false;
        }
        cursor += InvestorIdField.BYTE_LENGTH;
        if (!investorQualifiedRole.parse(data, cursor)) {
            return false;
        }
        cursor += InvestorQualifiedRoleField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!postingInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += PostingInstructionField.BYTE_LENGTH;
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
        cursor = orderOrigination.encode(data, cursor);
        cursor = algorithmicIndicator.encode(data, cursor);
        cursor = liquidityProvision.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
        cursor = clientQualifiedRole.encode(data, cursor);
        cursor = executorId.encode(data, cursor);
        cursor = executorQualifiedRole.encode(data, cursor);
        cursor = investorId.encode(data, cursor);
        cursor = investorQualifiedRole.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = postingInstruction.encode(data, cursor);
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
        if (!orderOrigination.isDecoded()) {
            return Optional.of(orderOrigination);
        }
        if (!algorithmicIndicator.isDecoded()) {
            return Optional.of(algorithmicIndicator);
        }
        if (!liquidityProvision.isDecoded()) {
            return Optional.of(liquidityProvision);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (!capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (!clientId.isDecoded()) {
            return Optional.of(clientId);
        }
        if (!clientQualifiedRole.isDecoded()) {
            return Optional.of(clientQualifiedRole);
        }
        if (!executorId.isDecoded()) {
            return Optional.of(executorId);
        }
        if (!executorQualifiedRole.isDecoded()) {
            return Optional.of(executorQualifiedRole);
        }
        if (!investorId.isDecoded()) {
            return Optional.of(investorId);
        }
        if (!investorQualifiedRole.isDecoded()) {
            return Optional.of(investorQualifiedRole);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!postingInstruction.isDecoded()) {
            return Optional.of(postingInstruction);
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
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "Account" -> Optional.of(account);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "Capacity" -> Optional.of(capacity);
            case "ClientId" -> Optional.of(clientId);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "ExecutorId" -> Optional.of(executorId);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            case "InvestorId" -> Optional.of(investorId);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "AccountType" -> Optional.of(accountType);
            case "PostingInstruction" -> Optional.of(postingInstruction);
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
