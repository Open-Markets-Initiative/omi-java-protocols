package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.ClordidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.MmProtectionResetField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.OrderIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.OrderQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.OrdtagidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.OrigclordidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PriceOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.RoutingInstructionField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SelfTradePreventionInstructionField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SideField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SimpleOrdtypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TimeInForceSimpleField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.InboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.InvestorId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the SimpleModifyOrderMessage message from the BinaryEntryPoint protocol.
 *
 * <p>SimpleModifyOrderMessage</p>
 */
public final class SimpleModifyOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 101;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Simple Modify Order Message";

    /**
     * ordTagID
     */
    private final OrdtagidField ordtagid = new OrdtagidField();

    /**
     * mmProtectionReset
     */
    private final MmProtectionResetField mmProtectionReset = new MmProtectionResetField();

    /**
     * clOrdID
     */
    private final ClordidField clordid = new ClordidField();

    /**
     * account
     */
    private final AccountField account = new AccountField();

    /**
     * senderLocation
     */
    private final SenderLocationField senderLocation = new SenderLocationField();

    /**
     * enteringTrader
     */
    private final EnteringTraderField enteringTrader = new EnteringTraderField();

    /**
     * selfTradePreventionInstruction
     */
    private final SelfTradePreventionInstructionField selfTradePreventionInstruction = new SelfTradePreventionInstructionField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * ordType
     */
    private final SimpleOrdtypeField simpleOrdtype = new SimpleOrdtypeField();

    /**
     * timeInForce
     */
    private final TimeInForceSimpleField timeInForceSimple = new TimeInForceSimpleField();

    /**
     * routingInstruction
     */
    private final RoutingInstructionField routingInstruction = new RoutingInstructionField();

    /**
     * orderQty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * price
     */
    private final PriceOptionalField priceOptional = new PriceOptionalField();

    /**
     * orderID
     */
    private final OrderIdOptionalField orderIdOptional = new OrderIdOptionalField();

    /**
     * origClOrdID
     */
    private final OrigclordidField origclordid = new OrigclordidField();

    /**
     * InboundBusinessHeader
     */
    private final InboundBusinessHeader inboundBusinessHeader = new InboundBusinessHeader();

    /**
     * SimpleNewOrderMessage
     */
    private final InvestorId investorId = new InvestorId();

    /**
     * memo data struct
     */
    private final Memo memo = new Memo();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(inboundBusinessHeader.fields(), List.<Field>of(ordtagid), List.<Field>of(mmProtectionReset), List.<Field>of(clordid), List.<Field>of(account), List.<Field>of(senderLocation), List.<Field>of(enteringTrader), List.<Field>of(selfTradePreventionInstruction), List.<Field>of(securityId), List.<Field>of(side), List.<Field>of(simpleOrdtype), List.<Field>of(timeInForceSimple), List.<Field>of(routingInstruction), List.<Field>of(orderQty), List.<Field>of(priceOptional), List.<Field>of(orderIdOptional), List.<Field>of(origclordid), investorId.fields(), memo.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * ordTagID
     *
     * @return the Ordtagid field
     */
    public OrdtagidField ordtagid() {
        return ordtagid;
    }

    /**
     * mmProtectionReset
     *
     * @return the MmProtectionReset field
     */
    public MmProtectionResetField mmProtectionReset() {
        return mmProtectionReset;
    }

    /**
     * clOrdID
     *
     * @return the Clordid field
     */
    public ClordidField clordid() {
        return clordid;
    }

    /**
     * account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * senderLocation
     *
     * @return the SenderLocation field
     */
    public SenderLocationField senderLocation() {
        return senderLocation;
    }

    /**
     * enteringTrader
     *
     * @return the EnteringTrader field
     */
    public EnteringTraderField enteringTrader() {
        return enteringTrader;
    }

    /**
     * selfTradePreventionInstruction
     *
     * @return the SelfTradePreventionInstruction field
     */
    public SelfTradePreventionInstructionField selfTradePreventionInstruction() {
        return selfTradePreventionInstruction;
    }

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * ordType
     *
     * @return the SimpleOrdtype field
     */
    public SimpleOrdtypeField simpleOrdtype() {
        return simpleOrdtype;
    }

    /**
     * timeInForce
     *
     * @return the TimeInForceSimple field
     */
    public TimeInForceSimpleField timeInForceSimple() {
        return timeInForceSimple;
    }

    /**
     * routingInstruction
     *
     * @return the RoutingInstruction field
     */
    public RoutingInstructionField routingInstruction() {
        return routingInstruction;
    }

    /**
     * orderQty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * price
     *
     * @return the PriceOptional field
     */
    public PriceOptionalField priceOptional() {
        return priceOptional;
    }

    /**
     * orderID
     *
     * @return the OrderIdOptional field
     */
    public OrderIdOptionalField orderIdOptional() {
        return orderIdOptional;
    }

    /**
     * origClOrdID
     *
     * @return the Origclordid field
     */
    public OrigclordidField origclordid() {
        return origclordid;
    }

    /**
     * InboundBusinessHeader
     *
     * @return the InboundBusinessHeader record
     */
    public InboundBusinessHeader inboundBusinessHeader() {
        return inboundBusinessHeader;
    }

    /**
     * SimpleNewOrderMessage
     *
     * @return the InvestorId record
     */
    public InvestorId investorId() {
        return investorId;
    }

    /**
     * memo data struct
     *
     * @return the Memo record
     */
    public Memo memo() {
        return memo;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + memo.byteLength() - Memo.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        for (int[] run = InboundBusinessHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += InboundBusinessHeader.BYTE_LENGTH;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 4;
        cursor += 10;
        cursor += 5;
        cursor += 1;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        for (int[] run = InvestorId.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += InvestorId.BYTE_LENGTH;
        cursor += memo.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(inboundBusinessHeader.sendingTime().value());
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
        if (!inboundBusinessHeader.parseFrom(data, cursor, end - 83)) {
            return false;
        }
        cursor += inboundBusinessHeader.byteLength();
        if (!ordtagid.parse(data, cursor)) {
            return false;
        }
        cursor += OrdtagidField.BYTE_LENGTH;
        if (!mmProtectionReset.parse(data, cursor)) {
            return false;
        }
        cursor += MmProtectionResetField.BYTE_LENGTH;
        if (!clordid.parse(data, cursor)) {
            return false;
        }
        cursor += ClordidField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        if (!enteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringTraderField.BYTE_LENGTH;
        if (!selfTradePreventionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SelfTradePreventionInstructionField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!simpleOrdtype.parse(data, cursor)) {
            return false;
        }
        cursor += SimpleOrdtypeField.BYTE_LENGTH;
        if (!timeInForceSimple.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceSimpleField.BYTE_LENGTH;
        if (!routingInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingInstructionField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!priceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PriceOptionalField.BYTE_LENGTH;
        if (!orderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdOptionalField.BYTE_LENGTH;
        if (!origclordid.parse(data, cursor)) {
            return false;
        }
        cursor += OrigclordidField.BYTE_LENGTH;
        if (!investorId.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += investorId.byteLength();
        if (!memo.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += memo.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = inboundBusinessHeader.encode(data, cursor);
        cursor = ordtagid.encode(data, cursor);
        cursor = mmProtectionReset.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = senderLocation.encode(data, cursor);
        cursor = enteringTrader.encode(data, cursor);
        cursor = selfTradePreventionInstruction.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = simpleOrdtype.encode(data, cursor);
        cursor = timeInForceSimple.encode(data, cursor);
        cursor = routingInstruction.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = priceOptional.encode(data, cursor);
        cursor = orderIdOptional.encode(data, cursor);
        cursor = origclordid.encode(data, cursor);
        cursor = investorId.encode(data, cursor);
        cursor = memo.encode(data, cursor);
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
        inboundBusinessHeader.clear();
        investorId.clear();
        memo.clear();
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
            if (field != memo.memoLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != memo.memoLength() && !field.isValid()) {
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
            case "Ordtagid" -> Optional.of(ordtagid);
            case "MmProtectionReset" -> Optional.of(mmProtectionReset);
            case "Clordid" -> Optional.of(clordid);
            case "Account" -> Optional.of(account);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            case "SelfTradePreventionInstruction" -> Optional.of(selfTradePreventionInstruction);
            case "SecurityId" -> Optional.of(securityId);
            case "Side" -> Optional.of(side);
            case "SimpleOrdtype" -> Optional.of(simpleOrdtype);
            case "TimeInForceSimple" -> Optional.of(timeInForceSimple);
            case "RoutingInstruction" -> Optional.of(routingInstruction);
            case "OrderQty" -> Optional.of(orderQty);
            case "PriceOptional" -> Optional.of(priceOptional);
            case "OrderIdOptional" -> Optional.of(orderIdOptional);
            case "Origclordid" -> Optional.of(origclordid);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SimpleModifyOrderMessage message)) {
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
        if (!(other instanceof SimpleModifyOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
