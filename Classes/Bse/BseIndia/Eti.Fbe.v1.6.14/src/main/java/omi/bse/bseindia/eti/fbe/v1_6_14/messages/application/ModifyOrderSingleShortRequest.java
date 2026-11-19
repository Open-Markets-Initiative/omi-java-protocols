package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AccountTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ActivityTimeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AlgoIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClOrdIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClientCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.CpCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ExecInstField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MaxShowField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NetworkMsgIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrderIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrderQtyField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrigClOrdIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PriceField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PriceValidityCheckTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SenderLocationIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SideField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SimpleSecurityIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TimeInForceField;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.RequestHeaderComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * Represents the ModifyOrderSingleShortRequest message from the Eti protocol.
 */
public final class ModifyOrderSingleShortRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 130;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order Single Short Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 78, 4, 82, 2, 129, 1 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Orig Cl Ord Id
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Sender Location Id
     */
    private final SenderLocationIdField senderLocationId = new SenderLocationIdField();

    /**
     * Activity Time
     */
    private final ActivityTimeField activityTime = new ActivityTimeField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Max Show
     */
    private final MaxShowField maxShow = new MaxShowField();

    /**
     * Simple Security Id
     */
    private final SimpleSecurityIdField simpleSecurityId = new SimpleSecurityIdField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Price Validity Check Type
     */
    private final PriceValidityCheckTypeField priceValidityCheckType = new PriceValidityCheckTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

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
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(orderId), List.<Field>of(clOrdId), List.<Field>of(origClOrdId), List.<Field>of(price), List.<Field>of(senderLocationId), List.<Field>of(activityTime), List.<Field>of(orderQty), List.<Field>of(maxShow), List.<Field>of(simpleSecurityId), List.<Field>of(accountType), List.<Field>of(side), List.<Field>of(priceValidityCheckType), List.<Field>of(timeInForce), List.<Field>of(execInst), List.<Field>of(algoId), List.<Field>of(clientCode), List.<Field>of(cpCode)).flatMap(List::stream).toList();

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
     * Order Id
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Orig Cl Ord Id
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Activity Time
     *
     * @return the ActivityTime field
     */
    public ActivityTimeField activityTime() {
        return activityTime;
    }

    /**
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Max Show
     *
     * @return the MaxShow field
     */
    public MaxShowField maxShow() {
        return maxShow;
    }

    /**
     * Simple Security Id
     *
     * @return the SimpleSecurityId field
     */
    public SimpleSecurityIdField simpleSecurityId() {
        return simpleSecurityId;
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
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Price Validity Check Type
     *
     * @return the PriceValidityCheckType field
     */
    public PriceValidityCheckTypeField priceValidityCheckType() {
        return priceValidityCheckType;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
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
        return Optional.ofNullable(activityTime.value());
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 112)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!senderLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationIdField.BYTE_LENGTH;
        if (!activityTime.parse(data, cursor)) {
            return false;
        }
        cursor += ActivityTimeField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!maxShow.parse(data, cursor)) {
            return false;
        }
        cursor += MaxShowField.BYTE_LENGTH;
        if (!simpleSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += SimpleSecurityIdField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!priceValidityCheckType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceValidityCheckTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
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
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = senderLocationId.encode(data, cursor);
        cursor = activityTime.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = maxShow.encode(data, cursor);
        cursor = simpleSecurityId.encode(data, cursor);
        if (buffer != null && buffer.length >= 84) {
            System.arraycopy(buffer, 78, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = accountType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        cursor = clientCode.encode(data, cursor);
        cursor = cpCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 130) {
            System.arraycopy(buffer, 129, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "Price" -> Optional.of(price);
            case "SenderLocationId" -> Optional.of(senderLocationId);
            case "ActivityTime" -> Optional.of(activityTime);
            case "OrderQty" -> Optional.of(orderQty);
            case "MaxShow" -> Optional.of(maxShow);
            case "SimpleSecurityId" -> Optional.of(simpleSecurityId);
            case "AccountType" -> Optional.of(accountType);
            case "Side" -> Optional.of(side);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExecInst" -> Optional.of(execInst);
            case "AlgoId" -> Optional.of(algoId);
            case "ClientCode" -> Optional.of(clientCode);
            case "CpCode" -> Optional.of(cpCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyOrderSingleShortRequest message)) {
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
        if (!(other instanceof ModifyOrderSingleShortRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
