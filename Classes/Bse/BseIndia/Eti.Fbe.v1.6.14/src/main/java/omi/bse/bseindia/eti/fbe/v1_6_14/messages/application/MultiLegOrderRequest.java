package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AccountTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AlgoIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AllOrNoneFlagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClOrdIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClientCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.CpCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NetworkMsgIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NoOfMultiLegField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SenderLocationIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.MultiLegOrdGrpCompEntry;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.MultiLegOrdGrpCompList;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.RequestHeaderComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * Represents the MultiLegOrderRequest message from the Eti protocol.
 */
public final class MultiLegOrderRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 82;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Multi Leg Order Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Sender Location Id
     */
    private final SenderLocationIdField senderLocationId = new SenderLocationIdField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * All Or None Flag
     */
    private final AllOrNoneFlagField allOrNoneFlag = new AllOrNoneFlagField();

    /**
     * No Of Multi Leg
     */
    private final NoOfMultiLegField noOfMultiLeg = new NoOfMultiLegField();

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
     * Multi Leg Ord Grp Comp
     */
    private final MultiLegOrdGrpCompList multiLegOrdGrpComp = new MultiLegOrdGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(senderLocationId), List.<Field>of(clOrdId), List.<Field>of(accountType), List.<Field>of(allOrNoneFlag), List.<Field>of(noOfMultiLeg), List.<Field>of(algoId), List.<Field>of(clientCode), List.<Field>of(cpCode)).flatMap(List::stream).toList();

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
     * Sender Location Id
     *
     * @return the SenderLocationId field
     */
    public SenderLocationIdField senderLocationId() {
        return senderLocationId;
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
     * Account Type
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * All Or None Flag
     *
     * @return the AllOrNoneFlag field
     */
    public AllOrNoneFlagField allOrNoneFlag() {
        return allOrNoneFlag;
    }

    /**
     * No Of Multi Leg
     *
     * @return the NoOfMultiLeg field
     */
    public NoOfMultiLegField noOfMultiLeg() {
        return noOfMultiLeg;
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
     * Multi Leg Ord Grp Comp
     *
     * <p>Encode writes this list's size to the NoOfMultiLeg field.</p>
     *
     * @return the MultiLegOrdGrpComp entries
     */
    public MultiLegOrdGrpCompList multiLegOrdGrpComp() {
        return multiLegOrdGrpComp;
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
        return MINIMUM_BYTE_LENGTH + multiLegOrdGrpComp.byteLength();
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
        cursor += 8;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 16;
        cursor += 12;
        cursor += 12;
        runs.add(cursor).add(5);
        cursor += 5;
        cursor = multiLegOrdGrpComp.padding(runs, cursor);
        return cursor;
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 64)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!senderLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!allOrNoneFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AllOrNoneFlagField.BYTE_LENGTH;
        if (!noOfMultiLeg.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfMultiLegField.BYTE_LENGTH;
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
        cursor += 5; // padding
        if (!multiLegOrdGrpComp.parse(data, cursor, end, noOfMultiLeg.value())) {
            return false;
        }
        cursor += multiLegOrdGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (multiLegOrdGrpComp.size() > 255) {
            throw new IllegalStateException("multiLegOrdGrpComp holds " + multiLegOrdGrpComp.size() + " entries, more than its count field can state");
        }
        noOfMultiLeg.value((short) multiLegOrdGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = senderLocationId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = allOrNoneFlag.encode(data, cursor);
        cursor = noOfMultiLeg.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        cursor = clientCode.encode(data, cursor);
        cursor = cpCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 82) {
            System.arraycopy(buffer, 77, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
        cursor = multiLegOrdGrpComp.encode(data, cursor);
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
        requestHeaderComp.clear();
        multiLegOrdGrpComp.clear();
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
            if (field != noOfMultiLeg && !field.isRecognized()) {
                return false;
            }
        }
        return multiLegOrdGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noOfMultiLeg && !field.isValid()) {
                return false;
            }
        }
        if (!multiLegOrdGrpComp.isValid()) {
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!senderLocationId.isDecoded()) {
            return Optional.of(senderLocationId);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!allOrNoneFlag.isDecoded()) {
            return Optional.of(allOrNoneFlag);
        }
        if (!noOfMultiLeg.isDecoded()) {
            return Optional.of(noOfMultiLeg);
        }
        if (!algoId.isDecoded()) {
            return Optional.of(algoId);
        }
        if (!clientCode.isDecoded()) {
            return Optional.of(clientCode);
        }
        if (!cpCode.isDecoded()) {
            return Optional.of(cpCode);
        }
        if (!multiLegOrdGrpComp.isDecoded()) {
            return Optional.of(multiLegOrdGrpComp.failedEntry().flatMap(MultiLegOrdGrpCompEntry::failedAt).orElse(noOfMultiLeg));
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
            case "SenderLocationId" -> Optional.of(senderLocationId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "AccountType" -> Optional.of(accountType);
            case "AllOrNoneFlag" -> Optional.of(allOrNoneFlag);
            case "NoOfMultiLeg" -> Optional.of(noOfMultiLeg);
            case "AlgoId" -> Optional.of(algoId);
            case "ClientCode" -> Optional.of(clientCode);
            case "CpCode" -> Optional.of(cpCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MultiLegOrderRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(multiLegOrdGrpComp.diffFields(message.multiLegOrdGrpComp));
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
            multiLegOrdGrpComp.toFormattedString(builder, options);
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
        multiLegOrdGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof MultiLegOrderRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && multiLegOrdGrpComp.equals(message.multiLegOrdGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, multiLegOrdGrpComp);
    }
}
