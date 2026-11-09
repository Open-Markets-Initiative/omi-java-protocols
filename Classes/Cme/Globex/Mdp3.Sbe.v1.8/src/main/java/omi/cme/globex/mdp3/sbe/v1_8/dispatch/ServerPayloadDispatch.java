package omi.cme.globex.mdp3.sbe.v1_8.dispatch;

import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.AdminHeartbeat;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.AdminLogin;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.AdminLogout;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.ChannelReset;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdIncrementalRefreshBook;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdIncrementalRefreshDailyStatistics;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdIncrementalRefreshLimitsBanding;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdIncrementalRefreshOrderBook;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdIncrementalRefreshSessionStatistics;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdIncrementalRefreshTrade;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdIncrementalRefreshTradeSummary;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdIncrementalRefreshVolume;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdInstrumentDefinitionFuture;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdInstrumentDefinitionOption;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.MdInstrumentDefinitionSpread;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.NegotiationReject;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.NegotiationResponse;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.QuoteRequest;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.RequestAck;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.RequestReject;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.SecurityStatus;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.SnapshotFullRefresh;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.SnapshotFullRefreshOrderBook;
import omi.cme.globex.mdp3.sbe.v1_8.messages.application.Terminate;
import omi.cme.globex.mdp3.sbe.v1_8.types.Message;

/**
 * Selects the message a Server Payload branch holds by its Template Id.
 */
public final class ServerPayloadDispatch {

    private ServerPayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 4L) {
            message = new ChannelReset();
        } else if (templateId == 12L) {
            message = new AdminHeartbeat();
        } else if (templateId == 15L) {
            message = new AdminLogin();
        } else if (templateId == 16L) {
            message = new AdminLogout();
        } else if (templateId == 27L) {
            message = new MdInstrumentDefinitionFuture();
        } else if (templateId == 29L) {
            message = new MdInstrumentDefinitionSpread();
        } else if (templateId == 30L) {
            message = new SecurityStatus();
        } else if (templateId == 32L) {
            message = new MdIncrementalRefreshBook();
        } else if (templateId == 33L) {
            message = new MdIncrementalRefreshDailyStatistics();
        } else if (templateId == 34L) {
            message = new MdIncrementalRefreshLimitsBanding();
        } else if (templateId == 35L) {
            message = new MdIncrementalRefreshSessionStatistics();
        } else if (templateId == 36L) {
            message = new MdIncrementalRefreshTrade();
        } else if (templateId == 37L) {
            message = new MdIncrementalRefreshVolume();
        } else if (templateId == 38L) {
            message = new SnapshotFullRefresh();
        } else if (templateId == 39L) {
            message = new QuoteRequest();
        } else if (templateId == 41L) {
            message = new MdInstrumentDefinitionOption();
        } else if (templateId == 42L) {
            message = new MdIncrementalRefreshTradeSummary();
        } else if (templateId == 43L) {
            message = new MdIncrementalRefreshOrderBook();
        } else if (templateId == 44L) {
            message = new SnapshotFullRefreshOrderBook();
        } else if (templateId == 201L) {
            message = new NegotiationReject();
        } else if (templateId == 202L) {
            message = new NegotiationResponse();
        } else if (templateId == 203L) {
            message = new Terminate();
        } else if (templateId == 206L) {
            message = new RequestAck();
        } else if (templateId == 207L) {
            message = new RequestReject();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
