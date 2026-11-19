package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BasedFxField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.FxCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.MarketBaseRateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.OriginallyRegisteredNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PretaxUnitPriceField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PretaxYieldField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ProcessCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.RegisteredNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.RegisteredTimeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SettlementDateOtcField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SubcategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingDateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingTypeCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.VolumeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the OtcBondTradedInfoMessage message from the Koscom protocol.
 *
 * <p>OTC Bond Traded Information. Reports today's or prior-day trading history with volume, pretax unit price, yield, settlement date, and FX category.</p>
 */
public final class OtcBondTradedInfoMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 105;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Otc Bond Traded Info Message";

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * 51:Today's Trading History in OTC 52:Previous Day's Trading History in OTC 53:Omitted Info. in past OTC Trading History 54:Changed/Canceled Info. in past OTC Trading History.
     */
    private final SubcategoryField subcategory = new SubcategoryField();

    /**
     * YYYYMMDD.
     */
    private final TradingDateField tradingDate = new TradingDateField();

    /**
     * HHMMSS.
     */
    private final RegisteredTimeField registeredTime = new RegisteredTimeField();

    /**
     * 1:Normal 2:Amended 3:Cancel.
     */
    private final ProcessCategoryField processCategory = new ProcessCategoryField();

    /**
     * Registered Number.
     */
    private final RegisteredNumberField registeredNumber = new RegisteredNumberField();

    /**
     * 0:Normal Originally Registered Number:Change/Cancel.
     */
    private final OriginallyRegisteredNumberField originallyRegisteredNumber = new OriginallyRegisteredNumberField();

    /**
     * 1:Self-dealings 2:Cross Trading 3:Brokerage 9:Other.
     */
    private final TradingTypeCategoryField tradingTypeCategory = new TradingTypeCategoryField();

    /**
     * Unit: 1 KRW, 1 USD, 1 YEN, 1 EURO, 1 CNY, 1 GBP, 1 HKD, 1 AUD, 1 SGD, miscellaneous.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * 999999V99(Unit:1 KRW, 1 USD, 1YEN, 1 EURO, 1CNY, 1GBP, 1HKD, 1AUD, 1SGD, miscellaneous).
     */
    private final PretaxUnitPriceField pretaxUnitPrice = new PretaxUnitPriceField();

    /**
     * 999V99999.
     */
    private final PretaxYieldField pretaxYield = new PretaxYieldField();

    /**
     * YYYYMMDD.
     */
    private final SettlementDateOtcField settlementDateOtc = new SettlementDateOtcField();

    /**
     * 999V99999, FRN.
     */
    private final MarketBaseRateField marketBaseRate = new MarketBaseRateField();

    /**
     * 1:KRW 2:USD 3:YEN 4:EURO 5:CNY 6:GBP 7:HKD 8:AUD 9:SGD 0:miscellaneous.
     */
    private final FxCategoryField fxCategory = new FxCategoryField();

    /**
     * 9999V9999(KRW/USD, KRW/YEN, KRW/EURO, KRW/CNY, KRW/GBP, KRW/HKD, KRW/AUD, KRW/SGD, KRW/miscellaneous).
     */
    private final BasedFxField basedFx = new BasedFxField();

    /**
     * 2:Brokerage 4:Direct Participant.
     */
    private final TradingCategoryField tradingCategory = new TradingCategoryField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, subcategory, tradingDate, registeredTime, processCategory, registeredNumber, originallyRegisteredNumber, tradingTypeCategory, volume, pretaxUnitPrice, pretaxYield, settlementDateOtc, marketBaseRate, fxCategory, basedFx, tradingCategory, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * 51:Today's Trading History in OTC 52:Previous Day's Trading History in OTC 53:Omitted Info. in past OTC Trading History 54:Changed/Canceled Info. in past OTC Trading History.
     *
     * @return the Subcategory field
     */
    public SubcategoryField subcategory() {
        return subcategory;
    }

    /**
     * YYYYMMDD.
     *
     * @return the TradingDate field
     */
    public TradingDateField tradingDate() {
        return tradingDate;
    }

    /**
     * HHMMSS.
     *
     * @return the RegisteredTime field
     */
    public RegisteredTimeField registeredTime() {
        return registeredTime;
    }

    /**
     * 1:Normal 2:Amended 3:Cancel.
     *
     * @return the ProcessCategory field
     */
    public ProcessCategoryField processCategory() {
        return processCategory;
    }

    /**
     * Registered Number.
     *
     * @return the RegisteredNumber field
     */
    public RegisteredNumberField registeredNumber() {
        return registeredNumber;
    }

    /**
     * 0:Normal Originally Registered Number:Change/Cancel.
     *
     * @return the OriginallyRegisteredNumber field
     */
    public OriginallyRegisteredNumberField originallyRegisteredNumber() {
        return originallyRegisteredNumber;
    }

    /**
     * 1:Self-dealings 2:Cross Trading 3:Brokerage 9:Other.
     *
     * @return the TradingTypeCategory field
     */
    public TradingTypeCategoryField tradingTypeCategory() {
        return tradingTypeCategory;
    }

    /**
     * Unit: 1 KRW, 1 USD, 1 YEN, 1 EURO, 1 CNY, 1 GBP, 1 HKD, 1 AUD, 1 SGD, miscellaneous.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * 999999V99(Unit:1 KRW, 1 USD, 1YEN, 1 EURO, 1CNY, 1GBP, 1HKD, 1AUD, 1SGD, miscellaneous).
     *
     * @return the PretaxUnitPrice field
     */
    public PretaxUnitPriceField pretaxUnitPrice() {
        return pretaxUnitPrice;
    }

    /**
     * 999V99999.
     *
     * @return the PretaxYield field
     */
    public PretaxYieldField pretaxYield() {
        return pretaxYield;
    }

    /**
     * YYYYMMDD.
     *
     * @return the SettlementDateOtc field
     */
    public SettlementDateOtcField settlementDateOtc() {
        return settlementDateOtc;
    }

    /**
     * 999V99999, FRN.
     *
     * @return the MarketBaseRate field
     */
    public MarketBaseRateField marketBaseRate() {
        return marketBaseRate;
    }

    /**
     * 1:KRW 2:USD 3:YEN 4:EURO 5:CNY 6:GBP 7:HKD 8:AUD 9:SGD 0:miscellaneous.
     *
     * @return the FxCategory field
     */
    public FxCategoryField fxCategory() {
        return fxCategory;
    }

    /**
     * 9999V9999(KRW/USD, KRW/YEN, KRW/EURO, KRW/CNY, KRW/GBP, KRW/HKD, KRW/AUD, KRW/SGD, KRW/miscellaneous).
     *
     * @return the BasedFx field
     */
    public BasedFxField basedFx() {
        return basedFx;
    }

    /**
     * 2:Brokerage 4:Direct Participant.
     *
     * @return the TradingCategory field
     */
    public TradingCategoryField tradingCategory() {
        return tradingCategory;
    }

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     *
     * @return the EndKeyword field
     */
    public EndKeywordField endKeyword() {
        return endKeyword;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!subcategory.parse(data, cursor)) {
            return false;
        }
        cursor += SubcategoryField.BYTE_LENGTH;
        if (!tradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradingDateField.BYTE_LENGTH;
        if (!registeredTime.parse(data, cursor)) {
            return false;
        }
        cursor += RegisteredTimeField.BYTE_LENGTH;
        if (!processCategory.parse(data, cursor)) {
            return false;
        }
        cursor += ProcessCategoryField.BYTE_LENGTH;
        if (!registeredNumber.parse(data, cursor)) {
            return false;
        }
        cursor += RegisteredNumberField.BYTE_LENGTH;
        if (!originallyRegisteredNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OriginallyRegisteredNumberField.BYTE_LENGTH;
        if (!tradingTypeCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TradingTypeCategoryField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!pretaxUnitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PretaxUnitPriceField.BYTE_LENGTH;
        if (!pretaxYield.parse(data, cursor)) {
            return false;
        }
        cursor += PretaxYieldField.BYTE_LENGTH;
        if (!settlementDateOtc.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementDateOtcField.BYTE_LENGTH;
        if (!marketBaseRate.parse(data, cursor)) {
            return false;
        }
        cursor += MarketBaseRateField.BYTE_LENGTH;
        if (!fxCategory.parse(data, cursor)) {
            return false;
        }
        cursor += FxCategoryField.BYTE_LENGTH;
        if (!basedFx.parse(data, cursor)) {
            return false;
        }
        cursor += BasedFxField.BYTE_LENGTH;
        if (!tradingCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCategoryField.BYTE_LENGTH;
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = subcategory.encode(data, cursor);
        cursor = tradingDate.encode(data, cursor);
        cursor = registeredTime.encode(data, cursor);
        cursor = processCategory.encode(data, cursor);
        cursor = registeredNumber.encode(data, cursor);
        cursor = originallyRegisteredNumber.encode(data, cursor);
        cursor = tradingTypeCategory.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = pretaxUnitPrice.encode(data, cursor);
        cursor = pretaxYield.encode(data, cursor);
        cursor = settlementDateOtc.encode(data, cursor);
        cursor = marketBaseRate.encode(data, cursor);
        cursor = fxCategory.encode(data, cursor);
        cursor = basedFx.encode(data, cursor);
        cursor = tradingCategory.encode(data, cursor);
        cursor = endKeyword.encode(data, cursor);
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
            case "Isin" -> Optional.of(isin);
            case "Subcategory" -> Optional.of(subcategory);
            case "TradingDate" -> Optional.of(tradingDate);
            case "RegisteredTime" -> Optional.of(registeredTime);
            case "ProcessCategory" -> Optional.of(processCategory);
            case "RegisteredNumber" -> Optional.of(registeredNumber);
            case "OriginallyRegisteredNumber" -> Optional.of(originallyRegisteredNumber);
            case "TradingTypeCategory" -> Optional.of(tradingTypeCategory);
            case "Volume" -> Optional.of(volume);
            case "PretaxUnitPrice" -> Optional.of(pretaxUnitPrice);
            case "PretaxYield" -> Optional.of(pretaxYield);
            case "SettlementDateOtc" -> Optional.of(settlementDateOtc);
            case "MarketBaseRate" -> Optional.of(marketBaseRate);
            case "FxCategory" -> Optional.of(fxCategory);
            case "BasedFx" -> Optional.of(basedFx);
            case "TradingCategory" -> Optional.of(tradingCategory);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OtcBondTradedInfoMessage message)) {
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
        if (!(other instanceof OtcBondTradedInfoMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
