package omi.cme.globex.mdp3.sbe.v1_5;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.AdminHeartbeat;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.AdminLogin;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.AdminLogout;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.ChannelReset;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MarketDataRequest;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdIncrementalRefreshBook;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdIncrementalRefreshDailyStatistics;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdIncrementalRefreshLimitsBanding;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdIncrementalRefreshSessionStatistics;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdIncrementalRefreshTrade;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdIncrementalRefreshTradeSummary;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdIncrementalRefreshVolume;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdInstrumentDefinitionFuture;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdInstrumentDefinitionOption;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.MdInstrumentDefinitionSpread;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.Negotiate;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.NegotiationReject;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.NegotiationResponse;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.QuoteRequest;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.RequestAck;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.RequestReject;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.SecurityListRequest;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.SecurityStatus;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.SecurityStatusRequest;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.SnapshotFullRefresh;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.SubscriberHeartbeat;
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.Terminate;
import omi.cme.globex.mdp3.sbe.v1_5.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AdminLogin::new);
        check(AdminLogout::new);
        checkGrouped(ChannelReset::new, RoundTrip::wire0, true, true, true, 1, 0);
        checkGrouped(MarketDataRequest::new, RoundTrip::wire1, true, true, true, 1, 0);
        checkGrouped(MdIncrementalRefreshBook::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(MdIncrementalRefreshDailyStatistics::new, RoundTrip::wire3, true, true, true, 1, 0);
        checkGrouped(MdIncrementalRefreshLimitsBanding::new, RoundTrip::wire4, true, true, true, 1, 0);
        checkGrouped(MdIncrementalRefreshSessionStatistics::new, RoundTrip::wire5, true, true, true, 1, 0);
        checkGrouped(MdIncrementalRefreshTrade::new, RoundTrip::wire6, true, true, true, 1, 0);
        checkGrouped(MdIncrementalRefreshTradeSummary::new, RoundTrip::wire7, true, true, true, 1, 0);
        checkGrouped(MdIncrementalRefreshVolume::new, RoundTrip::wire8, true, true, true, 1, 0);
        checkGrouped(MdInstrumentDefinitionFuture::new, RoundTrip::wire9, true, true, true, 1, 0);
        checkGrouped(MdInstrumentDefinitionOption::new, RoundTrip::wire10, true, true, true, 1, 0);
        checkGrouped(MdInstrumentDefinitionSpread::new, RoundTrip::wire11, true, true, true, 1, 0);
        check(Negotiate::new);
        check(NegotiationReject::new);
        check(NegotiationResponse::new);
        checkGrouped(QuoteRequest::new, RoundTrip::wire12, true, true, true, 1, 0);
        checkGrouped(RequestAck::new, RoundTrip::wire13, true, true, true, 1, 0);
        check(RequestReject::new);
        checkGrouped(SecurityListRequest::new, RoundTrip::wire14, true, true, true, 1, 0);
        check(SecurityStatus::new);
        checkGrouped(SecurityStatusRequest::new, RoundTrip::wire15, true, true, true, 1, 0);
        checkGrouped(SnapshotFullRefresh::new, RoundTrip::wire16, true, true, true, 1, 0);
        check(Terminate::new);
        check(AdminHeartbeat::new);
        check(SubscriberHeartbeat::new);

        if (failures > 0) {
            System.out.println(failures + " FAILED");
            System.exit(1);
        }
        System.out.println("PASS");
    }

    private static void check(Supplier<Message> create) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        int length = message.byteLength();
        Random random = new Random(name.hashCode());
        int offset = 1 + random.nextInt(7);
        byte[] wire = new byte[offset + length + 3];
        random.nextBytes(wire);
        byte[] bytes = Arrays.copyOfRange(wire, offset, offset + length);

        expect(name + " decodes", message.parseFrom(wire, offset) && message.isDecoded());
        expect(name + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
        expect(name + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
        Arrays.fill(wire, (byte) 0x5A);
        expect(name + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

        Message again = create.get();
        again.parseFrom(bytes, 0);
        expect(name + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

        message.clear();
        expect(name + " clears", !message.isDecoded() && message.raw().isEmpty());
        expect(name + " refuses a short buffer", length == 0 || !message.parseFrom(bytes, 1));
    }

    private static int blockDelta;

    private static int delta(int root) {
        return blockDelta < 0 ? -Math.min(-blockDelta, root - 1) : blockDelta;
    }

    private interface Wire {
        byte[] build(Random random, int entries, long count);
    }

    private static void checkGrouped(Supplier<Message> create, Wire wire, boolean variable, boolean bounded, boolean counted, int builds, int leaves) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        Random random = new Random(name.hashCode());

        for (int delta : new int[] { 0, 3, -1 }) {
            blockDelta = delta;
            for (int entries : new int[] { 0, 1, 3 }) {
                String label = name + " with " + entries + " entries, block " + blockDelta;
                byte[] bytes = wire.build(random, entries, entries);
                int offset = 1 + random.nextInt(7);
                byte[] shifted = new byte[offset + bytes.length + leaves + 3];
                random.nextBytes(shifted);
                System.arraycopy(bytes, 0, shifted, offset, bytes.length);

                expect(label + " decodes", message.parseFrom(shifted, offset, offset + bytes.length + leaves) && message.isDecoded());
                expect(label + " has its length", message.byteLength() == bytes.length);
                expect(label + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
                expect(label + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
                Arrays.fill(shifted, (byte) 0x5A);
                expect(label + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

                Message again = create.get();
                again.parseFrom(Arrays.copyOf(bytes, bytes.length + leaves), 0);
                expect(label + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

                expect(label + " refuses a short buffer", !bounded || bytes.length == 0 || !message.parseFrom(bytes, 0, bytes.length - 1));
                message.clear();
                expect(label + " clears", !message.isDecoded() && message.raw().isEmpty());
            }
        }
        blockDelta = 0;

        for (int build = 0; build < builds; build++) {
            if (counted && variable && bounded) {
                expect(name + " refuses a count beyond its entries", !message.parseFrom(wire.build(random, 1, 2), 0));
            }
            if (counted && bounded) {
                expect(name + " refuses an absurd count", !message.parseFrom(wire.build(random, 1, Long.MAX_VALUE), 0));
            }
        }
    }

    private static void random(ByteArrayOutputStream wire, Random random, int length) {
        byte[] bytes = new byte[length];
        random.nextBytes(bytes);
        wire.writeBytes(bytes);
    }

    private static void count(ByteArrayOutputStream wire, long count, int width, boolean littleEndian) {
        for (int index = 0; index < width; index++) {
            wire.write((int) (count >>> (8 * (littleEndian ? index : width - 1 - index))));
        }
    }

    private static byte[] wire0(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, 2L + delta(2), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2 + delta(2));
        }
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, 6L + delta(6), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 6 + delta(6));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 32L + delta(32), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32 + delta(32));
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 32L + delta(32), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32 + delta(32));
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 32L + delta(32), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32 + delta(32));
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 24L + delta(24), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 24 + delta(24));
        }
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 32L + delta(32), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32 + delta(32));
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 32L + delta(32), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32 + delta(32));
        }
        count(wire, 16L + delta(16), 2, true);
        random(wire, random, 5);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        count(wire, 16L + delta(16), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 16 + delta(16));
        }
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 3);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 30);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, 9L + delta(9), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        count(wire, 5L + delta(5), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 5 + delta(5));
        }
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 30);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        count(wire, 9L + delta(9), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        count(wire, 5L + delta(5), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 5 + delta(5));
        }
        count(wire, 24L + delta(24), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 24 + delta(24));
        }
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 20);
        random(wire, random, 4);
        random(wire, random, 6);
        random(wire, random, 6);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 5);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 30);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 9L + delta(9), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 9 + delta(9));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        count(wire, 5L + delta(5), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 5 + delta(5));
        }
        count(wire, 18L + delta(18), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 18 + delta(18));
        }
        return wire.toByteArray();
    }

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 23);
        random(wire, random, 1);
        random(wire, random, 3);
        count(wire, 32L + delta(32), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 32 + delta(32));
        }
        return wire.toByteArray();
    }

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, 6L + delta(6), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 6 + delta(6));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        return wire.toByteArray();
    }

    private static byte[] wire14(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, 6L + delta(6), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 6 + delta(6));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 1);
        count(wire, 6L + delta(6), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 6 + delta(6));
        }
        count(wire, 4L + delta(4), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4 + delta(4));
        }
        return wire.toByteArray();
    }

    private static byte[] wire16(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, 22L + delta(22), 2, true);
        count(wire, count, 1, false);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 22 + delta(22));
        }
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
