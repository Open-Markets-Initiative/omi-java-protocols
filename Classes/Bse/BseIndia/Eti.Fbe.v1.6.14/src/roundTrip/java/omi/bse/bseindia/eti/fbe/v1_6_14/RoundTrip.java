package omi.bse.bseindia.eti.fbe.v1_6_14;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.BroadcastErrorNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DebtInquiryRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DebtInquiryResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderNrResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderQuoteEventBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllOrderResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllQuoteBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllQuoteRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteAllQuoteResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderComplexRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderNrResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.DeleteOrderSingleRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ForcedLogoutNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.GatewayRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.GatewayResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.GwOrderAcknowledgement;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.Heartbeat;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.HeartbeatNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.InquireSessionListRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.InquireSessionListResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.LogonRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.LogonResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.LogoutRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.LogoutResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MassQuoteRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MassQuoteResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderComplexRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderNrResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderSingleRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ModifyOrderSingleShortRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MultiLegExecReportBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MultiLegExecResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MultiLegOrderReject;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.MultiLegOrderRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderComplexRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderNrResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderSingleRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewOrderSingleShortRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.NewsBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.OrderExecNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.OrderExecReportBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.OrderExecResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.QuoteExecReportBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.QuoteExecutionReport;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.Reject;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RetransmitMeMessageRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RetransmitMeMessageResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RetransmitRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RetransmitResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RiskCollateralAlertAdminBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RiskCollateralAlertBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.RiskNotificationBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ServiceAvailabilityBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SessionPasswordChangeRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SessionPasswordChangeResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SessionRegistrationRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SessionRegistrationResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SubscribeRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.SubscribeResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.ThrottleUpdateNotification;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.TmTradingSessionStatusBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.TradeBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.TradeEnhancementBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.TradingSessionStatusBroadcast;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UnsubscribeRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UnsubscribeResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserLoginRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserLoginResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserLogoutRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserLogoutResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserPasswordChangeRequest;
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.UserPasswordChangeResponse;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        checkGrouped(BroadcastErrorNotification::new, RoundTrip::wire0, true, true, true, 1, 0);
        check(DebtInquiryRequest::new);
        check(DebtInquiryResponse::new);
        checkGrouped(DeleteAllOrderBroadcast::new, RoundTrip::wire1, true, true, true, 1, 0);
        check(DeleteAllOrderNrResponse::new);
        check(DeleteAllOrderQuoteEventBroadcast::new);
        check(DeleteAllOrderRequest::new);
        checkGrouped(DeleteAllOrderResponse::new, RoundTrip::wire2, true, true, true, 1, 0);
        checkGrouped(DeleteAllQuoteBroadcast::new, RoundTrip::wire3, true, true, true, 1, 0);
        check(DeleteAllQuoteRequest::new);
        checkGrouped(DeleteAllQuoteResponse::new, RoundTrip::wire4, true, true, true, 1, 0);
        check(DeleteOrderBroadcast::new);
        check(DeleteOrderComplexRequest::new);
        check(DeleteOrderNrResponse::new);
        check(DeleteOrderResponse::new);
        check(DeleteOrderSingleRequest::new);
        checkGrouped(ForcedLogoutNotification::new, RoundTrip::wire5, true, true, true, 1, 0);
        check(GatewayRequest::new);
        check(GatewayResponse::new);
        check(GwOrderAcknowledgement::new);
        check(Heartbeat::new);
        check(HeartbeatNotification::new);
        check(InquireSessionListRequest::new);
        checkGrouped(InquireSessionListResponse::new, RoundTrip::wire6, true, true, true, 1, 0);
        check(LogonRequest::new);
        check(LogonResponse::new);
        check(LogoutRequest::new);
        check(LogoutResponse::new);
        checkGrouped(MassQuoteRequest::new, RoundTrip::wire7, true, true, true, 1, 0);
        checkGrouped(MassQuoteResponse::new, RoundTrip::wire8, true, true, true, 1, 0);
        checkGrouped(ModifyOrderComplexRequest::new, RoundTrip::wire9, true, true, true, 1, 0);
        check(ModifyOrderNrResponse::new);
        check(ModifyOrderResponse::new);
        check(ModifyOrderSingleRequest::new);
        check(ModifyOrderSingleShortRequest::new);
        checkGrouped(MultiLegExecReportBroadcast::new, RoundTrip::wire10, true, true, true, 1, 0);
        checkGrouped(MultiLegExecResponse::new, RoundTrip::wire11, true, true, true, 1, 0);
        checkGrouped(MultiLegOrderReject::new, RoundTrip::wire12, true, true, true, 1, 0);
        checkGrouped(MultiLegOrderRequest::new, RoundTrip::wire13, true, true, true, 1, 0);
        checkGrouped(NewOrderComplexRequest::new, RoundTrip::wire14, true, true, true, 1, 0);
        check(NewOrderNrResponse::new);
        check(NewOrderResponse::new);
        check(NewOrderSingleRequest::new);
        check(NewOrderSingleShortRequest::new);
        checkGrouped(NewsBroadcast::new, RoundTrip::wire15, true, true, true, 1, 0);
        checkGrouped(OrderExecNotification::new, RoundTrip::wire16, true, true, true, 1, 0);
        checkGrouped(OrderExecReportBroadcast::new, RoundTrip::wire17, true, true, true, 1, 0);
        checkGrouped(OrderExecResponse::new, RoundTrip::wire18, true, true, true, 1, 0);
        checkGrouped(QuoteExecReportBroadcast::new, RoundTrip::wire19, true, true, true, 1, 0);
        checkGrouped(QuoteExecutionReport::new, RoundTrip::wire20, true, true, true, 1, 0);
        checkGrouped(Reject::new, RoundTrip::wire21, true, true, true, 1, 0);
        check(RetransmitMeMessageRequest::new);
        check(RetransmitMeMessageResponse::new);
        check(RetransmitRequest::new);
        check(RetransmitResponse::new);
        checkGrouped(RiskCollateralAlertAdminBroadcast::new, RoundTrip::wire22, true, true, true, 1, 0);
        checkGrouped(RiskCollateralAlertBroadcast::new, RoundTrip::wire23, true, true, true, 1, 0);
        check(RiskNotificationBroadcast::new);
        check(ServiceAvailabilityBroadcast::new);
        check(SessionPasswordChangeRequest::new);
        check(SessionPasswordChangeResponse::new);
        check(SessionRegistrationRequest::new);
        checkGrouped(SessionRegistrationResponse::new, RoundTrip::wire24, true, true, true, 1, 0);
        check(SubscribeRequest::new);
        check(SubscribeResponse::new);
        check(ThrottleUpdateNotification::new);
        check(TmTradingSessionStatusBroadcast::new);
        check(TradeBroadcast::new);
        check(TradeEnhancementBroadcast::new);
        check(TradingSessionStatusBroadcast::new);
        check(UnsubscribeRequest::new);
        check(UnsubscribeResponse::new);
        check(UserLoginRequest::new);
        check(UserLoginResponse::new);
        check(UserLogoutRequest::new);
        check(UserLogoutResponse::new);
        check(UserPasswordChangeRequest::new);
        check(UserPasswordChangeResponse::new);

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
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 4);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire1(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire2(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire3(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 16);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire4(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
        }
        return wire.toByteArray();
    }

    private static byte[] wire5(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 6);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire6(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        return wire.toByteArray();
    }

    private static byte[] wire7(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 16);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
        }
        return wire.toByteArray();
    }

    private static byte[] wire8(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 1, false);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire9(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 5);
        random(wire, random, 7);
        random(wire, random, 9);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 16);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        count(wire, count, 1, false);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 5);
        }
        return wire.toByteArray();
    }

    private static byte[] wire10(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 1);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 16);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 3);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 2);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire11(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        count(wire, count, 2, true);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 16);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 4);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire12(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire13(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 16);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 5);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
        }
        return wire.toByteArray();
    }

    private static byte[] wire14(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 8);
        random(wire, random, 2);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 5);
        random(wire, random, 7);
        random(wire, random, 9);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 20);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        count(wire, count, 1, false);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 5);
        }
        return wire.toByteArray();
    }

    private static byte[] wire15(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        count(wire, count, 2, true);
        random(wire, random, 256);
        random(wire, random, 6);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire16(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 4);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire17(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 5);
        random(wire, random, 7);
        random(wire, random, 9);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 20);
        random(wire, random, 16);
        random(wire, random, 12);
        random(wire, random, 12);
        random(wire, random, 12);
        count(wire, count, 1, false);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 2);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 2);
            random(wire, random, 1);
            random(wire, random, 5);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire18(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 1, false);
        random(wire, random, 16);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire19(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        count(wire, count, 1, false);
        random(wire, random, 1);
        random(wire, random, 6);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 16);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 3);
        }
        return wire.toByteArray();
    }

    private static byte[] wire20(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 16);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 4);
        count(wire, count, 2, true);
        count(wire, count, 1, false);
        random(wire, random, 1);
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 16);
            random(wire, random, 12);
            random(wire, random, 12);
            random(wire, random, 3);
        }
        for (int entry0 = 0; entry0 < entries; entry0++) {
            random(wire, random, 8);
            random(wire, random, 8);
            random(wire, random, 4);
            random(wire, random, 4);
            random(wire, random, 1);
            random(wire, random, 1);
            random(wire, random, 6);
        }
        return wire.toByteArray();
    }

    private static byte[] wire21(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 3);
        random(wire, random, 4);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire22(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 12);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire23(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 2);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 7);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 2);
        count(wire, count, 2, true);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 1);
        random(wire, random, 12);
        random(wire, random, 8);
        random(wire, random, 3);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static byte[] wire24(Random random, int entries, long count) {
        ByteArrayOutputStream wire = new ByteArrayOutputStream();
        random(wire, random, 2);
        random(wire, random, 8);
        random(wire, random, 8);
        random(wire, random, 4);
        random(wire, random, 4);
        random(wire, random, 1);
        random(wire, random, 1);
        count(wire, count, 2, true);
        random(wire, random, 4);
        random(wire, random, entries);
        return wire.toByteArray();
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
