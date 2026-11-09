package omi.miax.pearlequities.expressorders.meo.v2_6.dispatch;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import omi.miax.pearlequities.expressorders.meo.v2_6.structs.GoodbyePacket;
import omi.miax.pearlequities.expressorders.meo.v2_6.structs.LoginRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.structs.LoginResponse;
import omi.miax.pearlequities.expressorders.meo.v2_6.structs.LogoutRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.structs.RetransmissionRequest;
import omi.miax.pearlequities.expressorders.meo.v2_6.structs.SynchronizationComplete;
import omi.miax.pearlequities.expressorders.meo.v2_6.structs.TestPacket;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.ByteOps;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.GroupEntry;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Message;

/**
 * Walks a Esesm Tcp Packet: its headers, then the message it holds, selected through the envelope its Esesm Packet Type names: {@link SequencedMessageDispatch}, {@link UnsequencedMessageDispatch}.
 */
public final class PacketDecoder {

    /**
     * The fixed length of the headers ahead of the first message.
     */
    public static final int HEADER_LENGTH = 0;

    /**
     * The fixed length of what follows the last message.
     */
    public static final int TRAILER_LENGTH = 0;

    /**
     * The fixed length of each message's own header.
     */
    public static final int MESSAGE_HEADER_LENGTH = 3;

    private PacketDecoder() {
    }

    /**
     * A decoded message and the bytes of its frame after it.
     *
     * @param message the message
     * @param bytes the bytes of its frame that followed it
     */
    public record Trailing(Message message, byte[] bytes) {
    }

    /**
     * What a packet decoded to.
     *
     * @param messages the messages decoded, in wire order
     * @param undecoded how many messages were passed over because this library does not decode their type
     * @param complete whether every message lay inside the packet and they ended where it ends
     * @param trailing the decoded messages that ended before their frame did
     * @param padding the decoded messages followed by their frame's padding
     * @param sessions the session packets decoded, in wire order, each filling its frame
     */
    public record Decoded(List<Message> messages, int undecoded, boolean complete, List<Trailing> trailing, List<Trailing> padding, List<GroupEntry> sessions) {

        /**
         * Holds unmodifiable copies of its lists.
         *
         * @param messages the messages decoded, in wire order
         * @param undecoded how many messages were passed over because this library does not decode their type
         * @param complete whether every message lay inside the packet and they ended where it ends
         * @param trailing the decoded messages that ended before their frame did
         * @param padding the decoded messages followed by their frame's padding
         * @param sessions the session packets decoded, in wire order, each filling its frame
         */
        public Decoded {
            messages = List.copyOf(messages);
            trailing = List.copyOf(trailing);
            padding = List.copyOf(padding);
            sessions = List.copyOf(sessions);
        }
    }

    /**
     * Decodes one packet.
     *
     * @param data the bytes holding the packet
     * @param offset where the packet starts
     * @param length the packet's length
     * @return the messages decoded, and whether the packet was walked to its end
     */
    public static Decoded decode(byte[] data, int offset, int length) {
        List<Message> messages = new ArrayList<>();
        List<Trailing> trailing = new ArrayList<>();
        List<Trailing> padding = new ArrayList<>();
        List<GroupEntry> sessions = new ArrayList<>();
        if (offset < 0 || length < HEADER_LENGTH + TRAILER_LENGTH || offset + length > data.length) {
            return new Decoded(messages, 0, false, trailing, padding, sessions);
        }

        int limit = offset + length - TRAILER_LENGTH;
        int position = offset + HEADER_LENGTH;
        int undecoded = 0;

        if (position <= limit) {
            if (position + 3 > limit) {
                return new Decoded(messages, undecoded, false, trailing, padding, sessions);
            }

            char esesmPacketType = (char) (data[position + 2] & 0xFF);
            if (esesmPacketType == 'u' || esesmPacketType == '0' || esesmPacketType == '1') {
                return new Decoded(messages, 0, position + 3 == limit, trailing, padding, sessions);
            }

            if (position + MESSAGE_HEADER_LENGTH > limit) {
                return new Decoded(messages, undecoded, false, trailing, padding, sessions);
            }

            long size = ByteOps.unsigned(data, position + 0, 2, true) - 1 + MESSAGE_HEADER_LENGTH;
            if (size < MESSAGE_HEADER_LENGTH || size > limit - position) {
                return new Decoded(messages, undecoded, false, trailing, padding, sessions);
            }

            int frameEnd = position + (int) size;

            if (esesmPacketType == 'l') {
                LoginRequest session = new LoginRequest();
                if (!session.parseFrom(data, position + MESSAGE_HEADER_LENGTH, frameEnd) || position + MESSAGE_HEADER_LENGTH + session.byteLength() != frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                sessions.add(session);
                return new Decoded(messages, undecoded, frameEnd == limit, trailing, padding, sessions);
            }

            if (esesmPacketType == 'r') {
                LoginResponse session = new LoginResponse();
                if (!session.parseFrom(data, position + MESSAGE_HEADER_LENGTH, frameEnd) || position + MESSAGE_HEADER_LENGTH + session.byteLength() != frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                sessions.add(session);
                return new Decoded(messages, undecoded, frameEnd == limit, trailing, padding, sessions);
            }

            if (esesmPacketType == 'c') {
                SynchronizationComplete session = new SynchronizationComplete();
                if (!session.parseFrom(data, position + MESSAGE_HEADER_LENGTH, frameEnd) || position + MESSAGE_HEADER_LENGTH + session.byteLength() != frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                sessions.add(session);
                return new Decoded(messages, undecoded, frameEnd == limit, trailing, padding, sessions);
            }

            if (esesmPacketType == 'a') {
                RetransmissionRequest session = new RetransmissionRequest();
                if (!session.parseFrom(data, position + MESSAGE_HEADER_LENGTH, frameEnd) || position + MESSAGE_HEADER_LENGTH + session.byteLength() != frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                sessions.add(session);
                return new Decoded(messages, undecoded, frameEnd == limit, trailing, padding, sessions);
            }

            if (esesmPacketType == 'X') {
                LogoutRequest session = new LogoutRequest();
                if (!session.parseFrom(data, position + MESSAGE_HEADER_LENGTH, frameEnd) || position + MESSAGE_HEADER_LENGTH + session.byteLength() != frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                sessions.add(session);
                return new Decoded(messages, undecoded, frameEnd == limit, trailing, padding, sessions);
            }

            if (esesmPacketType == 'G') {
                GoodbyePacket session = new GoodbyePacket();
                if (!session.parseFrom(data, position + MESSAGE_HEADER_LENGTH, frameEnd) || position + MESSAGE_HEADER_LENGTH + session.byteLength() != frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                sessions.add(session);
                return new Decoded(messages, undecoded, frameEnd == limit, trailing, padding, sessions);
            }

            if (esesmPacketType == 'T') {
                TestPacket session = new TestPacket();
                if (!session.parseFrom(data, position + MESSAGE_HEADER_LENGTH, frameEnd) || position + MESSAGE_HEADER_LENGTH + session.byteLength() != frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                sessions.add(session);
                return new Decoded(messages, undecoded, frameEnd == limit, trailing, padding, sessions);
            }

            Optional<Message> selected;
            int envelope = 0;
            if (esesmPacketType == 's') {
                envelope = 11;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                selected = SequencedMessageDispatch.decode(new String(data, position + 12, 2, StandardCharsets.US_ASCII), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else if (esesmPacketType == 'U') {
                envelope = 2;
                if (position + MESSAGE_HEADER_LENGTH + envelope > frameEnd) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                selected = UnsequencedMessageDispatch.decode(new String(data, position + 3, 2, StandardCharsets.US_ASCII), data, position + MESSAGE_HEADER_LENGTH + envelope, frameEnd);
            } else {
                selected = Optional.empty();
            }
            if (selected.isPresent()) {
                Message message = selected.get();
                if (!message.isDecoded()) {
                    return new Decoded(messages, undecoded, false, trailing, padding, sessions);
                }
                messages.add(message);
                int consumed = position + MESSAGE_HEADER_LENGTH + envelope + message.byteLength();
                if (consumed < frameEnd) {
                    trailing.add(new Trailing(message, Arrays.copyOfRange(data, consumed, frameEnd)));
                }
            } else {
                undecoded++;
            }
            position = frameEnd;
        }

        return new Decoded(messages, undecoded, position == limit, trailing, padding, sessions);
    }
}
