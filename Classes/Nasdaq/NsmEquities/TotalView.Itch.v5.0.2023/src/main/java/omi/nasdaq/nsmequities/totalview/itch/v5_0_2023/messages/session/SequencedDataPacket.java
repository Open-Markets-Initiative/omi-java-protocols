package omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.session;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.dispatch.SequencedMessageDispatch;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields.SequencedMessageTypeField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.AddOrderNoMpidAttributionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.AddOrderWithMpidAttributionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.BrokenTradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.CrossTradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.DirectListingWithCapitalRaisePriceDiscoveryMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.IpoQuotingPeriodUpdate;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.LuldAuctionCollarMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.MarketParticipantPositionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.MwcbStatusLevelMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.NetOrderImbalanceIndicatorMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.NonCrossTradeMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.OperationalHaltMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.OrderCancelMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.OrderDeleteMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.OrderExecutedMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.OrderExecutedWithPriceMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.OrderReplaceMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.RetailPriceImprovementIndicatorMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.Message;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.PrintOptions;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.UnknownMessage;

/**
 * Represents the SequencedDataPacket message from the TotalView protocol.
 *
 * <p>The Sequenced Data Packets act as an envelope to carry the actual sequenced data messages that are transferred from the server to the client. Each Sequenced Data Packet carries one message from the higher-lever protocol</p>
 */
public final class SequencedDataPacket implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'S';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 1;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Sequenced Data Packet";

    /**
     * Value identifying sequenced message type
     */
    private final SequencedMessageTypeField sequencedMessageType = new SequencedMessageTypeField();

    /**
     * The sequenced (server to client) message carried by the packet, opaque bytes unless an application source dispatches it
     */
    private Message sequencedMessage = new UnknownMessage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequencedMessageType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Value identifying sequenced message type
     *
     * @return the SequencedMessageType field
     */
    public SequencedMessageTypeField sequencedMessageType() {
        return sequencedMessageType;
    }

    /**
     * The sequenced (server to client) message carried by the packet, opaque bytes unless an application source dispatches it
     *
     * <p>The message its SequencedMessageType selected, or an {@link UnknownMessage} holding the bytes of one this library does not decode.</p>
     *
     * @return the SequencedMessage message
     */
    public Message sequencedMessage() {
        return sequencedMessage;
    }

    /**
     * Sets the message to hold. Encode writes the SequencedMessageType that selects it; an unknown message keeps the one it arrived with.
     *
     * @param message the message
     */
    public void sequencedMessage(Message message) {
        this.sequencedMessage = Objects.requireNonNull(message, "message");
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + sequencedMessage.byteLength();
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
        if (!sequencedMessageType.parse(data, cursor)) {
            return false;
        }
        cursor += SequencedMessageTypeField.BYTE_LENGTH;
        Optional<Message> sequencedMessageSelected = SequencedMessageDispatch.decode(sequencedMessageType.value(), data, cursor, end);
        if (sequencedMessageSelected.isPresent()) {
            if (!sequencedMessageSelected.get().isDecoded()) {
                return false;
            }
            sequencedMessage = sequencedMessageSelected.get();
        } else {
            UnknownMessage sequencedMessageUnknown = new UnknownMessage();
            if (!sequencedMessageUnknown.parseFrom(data, cursor, end)) {
                return false;
            }
            sequencedMessage = sequencedMessageUnknown;
        }
        cursor += sequencedMessage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sequencedMessage instanceof SystemEventMessage) {
            sequencedMessageType.value('S');
        } else if (sequencedMessage instanceof StockDirectoryMessage) {
            sequencedMessageType.value('R');
        } else if (sequencedMessage instanceof StockTradingActionMessage) {
            sequencedMessageType.value('H');
        } else if (sequencedMessage instanceof RegShoShortSalePriceTestRestrictedIndicatorMessage) {
            sequencedMessageType.value('Y');
        } else if (sequencedMessage instanceof MarketParticipantPositionMessage) {
            sequencedMessageType.value('L');
        } else if (sequencedMessage instanceof MwcbDeclineLevelMessage) {
            sequencedMessageType.value('V');
        } else if (sequencedMessage instanceof MwcbStatusLevelMessage) {
            sequencedMessageType.value('W');
        } else if (sequencedMessage instanceof IpoQuotingPeriodUpdate) {
            sequencedMessageType.value('K');
        } else if (sequencedMessage instanceof LuldAuctionCollarMessage) {
            sequencedMessageType.value('J');
        } else if (sequencedMessage instanceof OperationalHaltMessage) {
            sequencedMessageType.value('h');
        } else if (sequencedMessage instanceof AddOrderNoMpidAttributionMessage) {
            sequencedMessageType.value('A');
        } else if (sequencedMessage instanceof AddOrderWithMpidAttributionMessage) {
            sequencedMessageType.value('F');
        } else if (sequencedMessage instanceof OrderExecutedMessage) {
            sequencedMessageType.value('E');
        } else if (sequencedMessage instanceof OrderExecutedWithPriceMessage) {
            sequencedMessageType.value('C');
        } else if (sequencedMessage instanceof OrderCancelMessage) {
            sequencedMessageType.value('X');
        } else if (sequencedMessage instanceof OrderDeleteMessage) {
            sequencedMessageType.value('D');
        } else if (sequencedMessage instanceof OrderReplaceMessage) {
            sequencedMessageType.value('U');
        } else if (sequencedMessage instanceof NonCrossTradeMessage) {
            sequencedMessageType.value('P');
        } else if (sequencedMessage instanceof CrossTradeMessage) {
            sequencedMessageType.value('Q');
        } else if (sequencedMessage instanceof BrokenTradeMessage) {
            sequencedMessageType.value('B');
        } else if (sequencedMessage instanceof NetOrderImbalanceIndicatorMessage) {
            sequencedMessageType.value('I');
        } else if (sequencedMessage instanceof RetailPriceImprovementIndicatorMessage) {
            sequencedMessageType.value('N');
        } else if (sequencedMessage instanceof DirectListingWithCapitalRaisePriceDiscoveryMessage) {
            sequencedMessageType.value('O');
        }
        int cursor = offset;
        cursor = sequencedMessageType.encode(data, cursor);
        cursor = sequencedMessage.encode(data, cursor);
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
        this.sequencedMessage = new UnknownMessage();
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
            if (field != sequencedMessageType && !field.isRecognized()) {
                return false;
            }
        }
        return sequencedMessage.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != sequencedMessageType && !field.isValid()) {
                return false;
            }
        }
        if (!sequencedMessage.isValid()) {
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
        return "SequencedMessageType".equals(name) ? Optional.of(sequencedMessageType) : Optional.empty();
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SequencedDataPacket message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sequencedMessage.diffFields(message.sequencedMessage));
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
            builder.append(", ");
            sequencedMessage.toFormattedString(builder, options);
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
        sequencedMessage.toFormattedString(builder, nested);
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
        if (!(other instanceof SequencedDataPacket message)) {
            return false;
        }
        return fields.equals(message.fields) && sequencedMessage.equals(message.sequencedMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sequencedMessage);
    }
}
