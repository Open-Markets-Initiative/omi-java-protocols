package omi.databento.marketdata.normalized.dbn.v1.dispatch;

import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.BboMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.CbboMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.Cmbp1Msg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.ErrorMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.ImbalanceMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.InstrumentDefMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.MboMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.Mbp10Msg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.Mbp1Msg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.OhlcvMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.StatMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.StatusMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.SymbolMappingMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.SystemMsg;
import omi.databento.marketdata.normalized.dbn.v1.messages.application.TradeMsg;
import omi.databento.marketdata.normalized.dbn.v1.types.Message;

/**
 * Selects the message a Record Body branch holds by its Rtype.
 */
public final class RecordRecordBodyDispatch {

    private RecordRecordBodyDispatch() {
    }

    /**
     * Decodes the message a Rtype selects.
     *
     * @param rtype the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long rtype, byte[] data, int offset, int end) {
        Message message;
        if (rtype == 0L) {
            message = new TradeMsg();
        } else if (rtype == 1L) {
            message = new Mbp1Msg();
        } else if (rtype == 10L) {
            message = new Mbp10Msg();
        } else if (rtype == 17L) {
            message = new OhlcvMsg();
        } else if (rtype == 18L) {
            message = new StatusMsg();
        } else if (rtype == 19L) {
            message = new InstrumentDefMsg();
        } else if (rtype == 20L) {
            message = new ImbalanceMsg();
        } else if (rtype == 21L) {
            message = new ErrorMsg();
        } else if (rtype == 22L) {
            message = new SymbolMappingMsg();
        } else if (rtype == 23L) {
            message = new SystemMsg();
        } else if (rtype == 24L) {
            message = new StatMsg();
        } else if (rtype == 32L) {
            message = new OhlcvMsg();
        } else if (rtype == 33L) {
            message = new OhlcvMsg();
        } else if (rtype == 34L) {
            message = new OhlcvMsg();
        } else if (rtype == 35L) {
            message = new OhlcvMsg();
        } else if (rtype == 36L) {
            message = new OhlcvMsg();
        } else if (rtype == 160L) {
            message = new MboMsg();
        } else if (rtype == 177L) {
            message = new Cmbp1Msg();
        } else if (rtype == 192L) {
            message = new CbboMsg();
        } else if (rtype == 193L) {
            message = new CbboMsg();
        } else if (rtype == 194L) {
            message = new Cmbp1Msg();
        } else if (rtype == 195L) {
            message = new BboMsg();
        } else if (rtype == 196L) {
            message = new BboMsg();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
