package omi.ice.icefutures.mdf.impact.v1_1_24.enums;

import java.util.Optional;

/**
 * See Appendix C for the list of market types and IDs.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarketTypeId {

    /**
     * Financial Gas
     */
    FINANCIAL_GAS((short) 0, "Financial Gas"),

    /**
     * Financial Power
     */
    FINANCIAL_POWER((short) 1, "Financial Power"),

    /**
     * Oil
     */
    OIL((short) 2, "Oil"),

    /**
     * Ipe Natural Gas Futures
     */
    IPE_NATURAL_GAS_FUTURES((short) 3, "Ipe Natural Gas Futures"),

    /**
     * Ipe Gas Oil Futures
     */
    IPE_GAS_OIL_FUTURES((short) 4, "Ipe Gas Oil Futures"),

    /**
     * Ipe Brent Futures
     */
    IPE_BRENT_FUTURES((short) 5, "Ipe Brent Futures"),

    /**
     * Ipe Uk Electricity Futures Peak
     */
    IPE_UK_ELECTRICITY_FUTURES_PEAK((short) 7, "Ipe Uk Electricity Futures Peak"),

    /**
     * Ipe Uk Electricity Futures Base
     */
    IPE_UK_ELECTRICITY_FUTURES_BASE((short) 8, "Ipe Uk Electricity Futures Base"),

    /**
     * Ice Wti Crude Futures
     */
    ICE_WTI_CRUDE_FUTURES((short) 9, "Ice Wti Crude Futures"),

    /**
     * G C Newcastle Coal Futures
     */
    GC_NEWCASTLE_COAL_FUTURES((short) 10, "G C Newcastle Coal Futures"),

    /**
     * Ice Brent Wti Futures Spread
     */
    ICE_BRENT_WTI_FUTURES_SPREAD((short) 11, "Ice Brent Wti Futures Spread"),

    /**
     * Ipeecx European Emissions
     */
    IPEECX_EUROPEAN_EMISSIONS((short) 12, "Ipeecx European Emissions"),

    /**
     * Ice Heating Oil Futures
     */
    ICE_HEATING_OIL_FUTURES((short) 13, "Ice Heating Oil Futures"),

    /**
     * Ice Heating Oil Wti Futures Crack
     */
    ICE_HEATING_OIL_WTI_FUTURES_CRACK((short) 14, "Ice Heating Oil Wti Futures Crack"),

    /**
     * Ice Nyh Rbob Gasoline Futures
     */
    ICE_NYH_RBOB_GASOLINE_FUTURES((short) 15, "Ice Nyh Rbob Gasoline Futures"),

    /**
     * Ice Nyh Rbob Gasoline Wti Futures Crack
     */
    ICE_NYH_RBOB_GASOLINE_WTI_FUTURES_CRACK((short) 16, "Ice Nyh Rbob Gasoline Wti Futures Crack"),

    /**
     * Ice Rotterdam Coal Futures
     */
    ICE_ROTTERDAM_COAL_FUTURES((short) 17, "Ice Rotterdam Coal Futures"),

    /**
     * Ice Richards Bay Coal Futures
     */
    ICE_RICHARDS_BAY_COAL_FUTURES((short) 18, "Ice Richards Bay Coal Futures"),

    /**
     * Ice Rotterdam Richards Bay Coal Futures Spread
     */
    ICE_ROTTERDAM_RICHARDS_BAY_COAL_FUTURES_SPREAD((short) 19, "Ice Rotterdam Richards Bay Coal Futures Spread"),

    /**
     * Cocoa
     */
    COCOA((short) 20, "Cocoa"),

    /**
     * Coffee C
     */
    COFFEE_C((short) 21, "Coffee C"),

    /**
     * Cotton No 2
     */
    COTTON_NO_2((short) 22, "Cotton No 2"),

    /**
     * Fcoj A
     */
    FCOJ_A((short) 23, "Fcoj A"),

    /**
     * Sugar No 11
     */
    SUGAR_NO_11((short) 24, "Sugar No 11"),

    /**
     * Heat Rate Spread
     */
    HEAT_RATE_SPREAD((short) 25, "Heat Rate Spread"),

    /**
     * Us Dollar Index
     */
    US_DOLLAR_INDEX((short) 26, "Us Dollar Index"),

    /**
     * Canadian Oilseeds
     */
    CANADIAN_OILSEEDS((short) 36, "Canadian Oilseeds"),

    /**
     * Ecx Cer Futures
     */
    ECX_CER_FUTURES((short) 38, "Ecx Cer Futures"),

    /**
     * Foreign Exchange
     */
    FOREIGN_EXCHANGE((short) 39, "Foreign Exchange"),

    /**
     * Financial Index Data
     */
    FINANCIAL_INDEX_DATA((short) 40, "Financial Index Data"),

    /**
     * Sugar No 16
     */
    SUGAR_NO_16((short) 41, "Sugar No 16"),

    /**
     * Ecx Euacer Futures Spread
     */
    ECX_EUACER_FUTURES_SPREAD((short) 42, "Ecx Euacer Futures Spread"),

    /**
     * Henry Hub
     */
    HENRY_HUB((short) 44, "Henry Hub"),

    /**
     * Dutch Ttf Gas Futures
     */
    DUTCH_TTF_GAS_FUTURES((short) 48, "Dutch Ttf Gas Futures"),

    /**
     * German Natural Gas Futures
     */
    GERMAN_NATURAL_GAS_FUTURES((short) 50, "German Natural Gas Futures"),

    /**
     * European Gas Spreads
     */
    EUROPEAN_GAS_SPREADS((short) 51, "European Gas Spreads"),

    /**
     * Canadian Financial Gas
     */
    CANADIAN_FINANCIAL_GAS((short) 53, "Canadian Financial Gas"),

    /**
     * Ngx Canadian Physical Crude
     */
    NGX_CANADIAN_PHYSICAL_CRUDE((short) 54, "Ngx Canadian Physical Crude"),

    /**
     * Us Coal Futures
     */
    US_COAL_FUTURES((short) 55, "Us Coal Futures"),

    /**
     * Fob Indo Subbit Coal Futures
     */
    FOB_INDO_SUBBIT_COAL_FUTURES((short) 57, "Fob Indo Subbit Coal Futures"),

    /**
     * Heating Oil Brent Futures Crack
     */
    HEATING_OIL_BRENT_FUTURES_CRACK((short) 58, "Heating Oil Brent Futures Crack"),

    /**
     * Nyh Rbob Gasoline Brent Futures Crack
     */
    NYH_RBOB_GASOLINE_BRENT_FUTURES_CRACK((short) 59, "Nyh Rbob Gasoline Brent Futures Crack"),

    /**
     * Wet Freight
     */
    WET_FREIGHT((short) 60, "Wet Freight"),

    /**
     * Dry Freight
     */
    DRY_FREIGHT((short) 61, "Dry Freight"),

    /**
     * Ferrous Metals
     */
    FERROUS_METALS((short) 62, "Ferrous Metals"),

    /**
     * Platts Variable Oil
     */
    PLATTS_VARIABLE_OIL((short) 63, "Platts Variable Oil"),

    /**
     * Nyh Rbob Gasoline Heating Oil Spread
     */
    NYH_RBOB_GASOLINE_HEATING_OIL_SPREAD((short) 66, "Nyh Rbob Gasoline Heating Oil Spread"),

    /**
     * Physical Environmental
     */
    PHYSICAL_ENVIRONMENTAL((short) 69, "Physical Environmental"),

    /**
     * Heating Oil Ls Gasoil Futures Spread
     */
    HEATING_OIL_LS_GASOIL_FUTURES_SPREAD((short) 70, "Heating Oil Ls Gasoil Futures Spread"),

    /**
     * Ls Gasoil Brent Futures Crack
     */
    LS_GASOIL_BRENT_FUTURES_CRACK((short) 71, "Ls Gasoil Brent Futures Crack"),

    /**
     * Nyh Rbob Gasoline Ls Gasoil Futures Spread
     */
    NYH_RBOB_GASOLINE_LS_GASOIL_FUTURES_SPREAD((short) 72, "Nyh Rbob Gasoline Ls Gasoil Futures Spread"),

    /**
     * Ecx Euaa Futures
     */
    ECX_EUAA_FUTURES((short) 84, "Ecx Euaa Futures"),

    /**
     * Ecx Cereuaa Futures Spread
     */
    ECX_CEREUAA_FUTURES_SPREAD((short) 85, "Ecx Cereuaa Futures Spread"),

    /**
     * Ecx Euaaeua Futures Spread
     */
    ECX_EUAAEUA_FUTURES_SPREAD((short) 86, "Ecx Euaaeua Futures Spread"),

    /**
     * Soybean
     */
    SOYBEAN((short) 89, "Soybean"),

    /**
     * Ecx Eua Eib Auction
     */
    ECX_EUA_EIB_AUCTION((short) 92, "Ecx Eua Eib Auction"),

    /**
     * Financial Lng
     */
    FINANCIAL_LNG((short) 93, "Financial Lng"),

    /**
     * Eua Uk Auction
     */
    EUA_UK_AUCTION((short) 95, "Eua Uk Auction"),

    /**
     * Euaa Uk Auction
     */
    EUAA_UK_AUCTION((short) 96, "Euaa Uk Auction"),

    /**
     * Cfr South China Coal Futures
     */
    CFR_SOUTH_CHINA_COAL_FUTURES((short) 97, "Cfr South China Coal Futures"),

    /**
     * Belgian Power Futures
     */
    BELGIAN_POWER_FUTURES((short) 98, "Belgian Power Futures"),

    /**
     * Dutch Power Futures
     */
    DUTCH_POWER_FUTURES((short) 99, "Dutch Power Futures"),

    /**
     * G C Newcastle Fob Indo Subbit Coal Futures Spread
     */
    GC_NEWCASTLE_FOB_INDO_SUBBIT_COAL_FUTURES_SPREAD((short) 100, "G C Newcastle Fob Indo Subbit Coal Futures Spread"),

    /**
     * Richards Bayg C Newcastle Coal Futures Spread
     */
    RICHARDS_BAYG_C_NEWCASTLE_COAL_FUTURES_SPREAD((short) 101, "Richards Bayg C Newcastle Coal Futures Spread"),

    /**
     * Fcoj A Mini
     */
    FCOJ_A_MINI((short) 102, "Fcoj A Mini"),

    /**
     * Cif Us
     */
    CIF_US((short) 104, "Cif Us"),

    /**
     * D 6 Rin
     */
    D6_RIN((short) 108, "D 6 Rin"),

    /**
     * European Power Spreads
     */
    EUROPEAN_POWER_SPREADS((short) 111, "European Power Spreads"),

    /**
     * Taqa
     */
    TAQA((short) 112, "Taqa"),

    /**
     * Belgian Ztp Gas Spot
     */
    BELGIAN_ZTP_GAS_SPOT((short) 113, "Belgian Ztp Gas Spot"),

    /**
     * Dutch Ttf Gas Spot
     */
    DUTCH_TTF_GAS_SPOT((short) 114, "Dutch Ttf Gas Spot"),

    /**
     * Dutch Ttf Gas Storage
     */
    DUTCH_TTF_GAS_STORAGE((short) 115, "Dutch Ttf Gas Storage"),

    /**
     * European Gas Spot Spreads
     */
    EUROPEAN_GAS_SPOT_SPREADS((short) 116, "European Gas Spot Spreads"),

    /**
     * Belgian Ztp Gas Futures
     */
    BELGIAN_ZTP_GAS_FUTURES((short) 117, "Belgian Ztp Gas Futures"),

    /**
     * Uk Ocm Gas Spot
     */
    UK_OCM_GAS_SPOT((short) 118, "Uk Ocm Gas Spot"),

    /**
     * Belgian Gas Spreads
     */
    BELGIAN_GAS_SPREADS((short) 119, "Belgian Gas Spreads"),

    /**
     * Financial Olefins
     */
    FINANCIAL_OLEFINS((short) 124, "Financial Olefins"),

    /**
     * Financial Monomers
     */
    FINANCIAL_MONOMERS((short) 125, "Financial Monomers"),

    /**
     * Platts Variable Oil Urals
     */
    PLATTS_VARIABLE_OIL_URALS((short) 126, "Platts Variable Oil Urals"),

    /**
     * Endex Spot Market Indices
     */
    ENDEX_SPOT_MARKET_INDICES((short) 127, "Endex Spot Market Indices"),

    /**
     * Interest Rate Futures
     */
    INTEREST_RATE_FUTURES((short) 131, "Interest Rate Futures"),

    /**
     * Singapore Energy
     */
    SINGAPORE_ENERGY((short) 133, "Singapore Energy"),

    /**
     * Singapore Financials
     */
    SINGAPORE_FINANCIALS((short) 134, "Singapore Financials"),

    /**
     * Singapore Metals
     */
    SINGAPORE_METALS((short) 135, "Singapore Metals"),

    /**
     * Italian Natural Gas Futures
     */
    ITALIAN_NATURAL_GAS_FUTURES((short) 136, "Italian Natural Gas Futures"),

    /**
     * Italian Power Futures
     */
    ITALIAN_POWER_FUTURES((short) 137, "Italian Power Futures"),

    /**
     * Credit Swap Data
     */
    CREDIT_SWAP_DATA((short) 139, "Credit Swap Data"),

    /**
     * Gold Fixing
     */
    GOLD_FIXING((short) 140, "Gold Fixing"),

    /**
     * North Sea Partials
     */
    NORTH_SEA_PARTIALS((short) 141, "North Sea Partials"),

    /**
     * Eu Financial Power Spreads
     */
    EU_FINANCIAL_POWER_SPREADS((short) 142, "Eu Financial Power Spreads"),

    /**
     * Eu Financial Power Futures
     */
    EU_FINANCIAL_POWER_FUTURES((short) 143, "Eu Financial Power Futures"),

    /**
     * Oil Cad
     */
    OIL_CAD((short) 144, "Oil Cad"),

    /**
     * Silver Fixing
     */
    SILVER_FIXING((short) 147, "Silver Fixing"),

    /**
     * Uk Spark Spread
     */
    UK_SPARK_SPREAD((short) 149, "Uk Spark Spread"),

    /**
     * Uk Ocm Physical Gas Spot
     */
    UK_OCM_PHYSICAL_GAS_SPOT((short) 150, "Uk Ocm Physical Gas Spot"),

    /**
     * Japan Domestic Waterborne
     */
    JAPAN_DOMESTIC_WATERBORNE((short) 152, "Japan Domestic Waterborne"),

    /**
     * Daily Metals
     */
    DAILY_METALS((short) 154, "Daily Metals"),

    /**
     * Brix Energia Fin
     */
    BRIX_ENERGIA_FIN((short) 155, "Brix Energia Fin"),

    /**
     * Japan Domestic Rack
     */
    JAPAN_DOMESTIC_RACK((short) 156, "Japan Domestic Rack"),

    /**
     * Financial Us Lng
     */
    FINANCIAL_US_LNG((short) 157, "Financial Us Lng"),

    /**
     * Ice Rotterdam Newcastle Coal Futures Spread
     */
    ICE_ROTTERDAM_NEWCASTLE_COAL_FUTURES_SPREAD((short) 160, "Ice Rotterdam Newcastle Coal Futures Spread"),

    /**
     * Oil Americas
     */
    OIL_AMERICAS((short) 165, "Oil Americas"),

    /**
     * Platts Petrochemical
     */
    PLATTS_PETROCHEMICAL((short) 167, "Platts Petrochemical"),

    /**
     * Permian Wti Futures
     */
    PERMIAN_WTI_FUTURES((short) 168, "Permian Wti Futures"),

    /**
     * Endex Equity Indices
     */
    ENDEX_EQUITY_INDICES((short) 170, "Endex Equity Indices"),

    /**
     * Endex Single Stock Options
     */
    ENDEX_SINGLE_STOCK_OPTIONS((short) 171, "Endex Single Stock Options"),

    /**
     * Ifus Ice Indices
     */
    IFUS_ICE_INDICES((short) 172, "Ifus Ice Indices"),

    /**
     * Platts Asia Bunker
     */
    PLATTS_ASIA_BUNKER((short) 173, "Platts Asia Bunker"),

    /**
     * Sofr Futures
     */
    SOFR_FUTURES((short) 177, "Sofr Futures"),

    /**
     * Digital Asset Futures
     */
    DIGITAL_ASSET_FUTURES((short) 178, "Digital Asset Futures"),

    /**
     * Permian Brent Futures Spread
     */
    PERMIAN_BRENT_FUTURES_SPREAD((short) 179, "Permian Brent Futures Spread"),

    /**
     * Permian Wti Futures Spread
     */
    PERMIAN_WTI_FUTURES_SPREAD((short) 180, "Permian Wti Futures Spread"),

    /**
     * Liffe Sti Rs
     */
    LIFFE_STI_RS((short) 200, "Liffe Sti Rs"),

    /**
     * Liffe Bonds
     */
    LIFFE_BONDS((short) 202, "Liffe Bonds"),

    /**
     * Liffe Swapnotes
     */
    LIFFE_SWAPNOTES((short) 203, "Liffe Swapnotes"),

    /**
     * Liffe Commodities
     */
    LIFFE_COMMODITIES((short) 205, "Liffe Commodities"),

    /**
     * Metals
     */
    METALS((short) 206, "Metals"),

    /**
     * Ifus Equity Indices
     */
    IFUS_EQUITY_INDICES((short) 207, "Ifus Equity Indices"),

    /**
     * Gcf Repo
     */
    GCF_REPO((short) 208, "Gcf Repo"),

    /**
     * Liffe Three Month Euro And Eonia
     */
    LIFFE_THREE_MONTH_EURO_AND_EONIA((short) 209, "Liffe Three Month Euro And Eonia"),

    /**
     * Eurodollar
     */
    EURODOLLAR((short) 210, "Eurodollar"),

    /**
     * Liffe Equity Derivatives Non Us Based
     */
    LIFFE_EQUITY_DERIVATIVES_NON_US_BASED((short) 211, "Liffe Equity Derivatives Non Us Based"),

    /**
     * Liffe Equity Derivatives Us Based
     */
    LIFFE_EQUITY_DERIVATIVES_US_BASED((short) 212, "Liffe Equity Derivatives Us Based"),

    /**
     * Liffe Index Options
     */
    LIFFE_INDEX_OPTIONS((short) 213, "Liffe Index Options"),

    /**
     * Liffe Index Futures Us Restricted
     */
    LIFFE_INDEX_FUTURES_US_RESTRICTED((short) 214, "Liffe Index Futures Us Restricted"),

    /**
     * Liffe Index Futures Non Us Restricted
     */
    LIFFE_INDEX_FUTURES_NON_US_RESTRICTED((short) 215, "Liffe Index Futures Non Us Restricted"),

    /**
     * Physical Gas
     */
    PHYSICAL_GAS((short) 305, "Physical Gas"),

    /**
     * Power
     */
    POWER((short) 306, "Power"),

    /**
     * Ngx Physical Gas
     */
    NGX_PHYSICAL_GAS((short) 314, "Ngx Physical Gas"),

    /**
     * Ngx Financial Power
     */
    NGX_FINANCIAL_POWER((short) 315, "Ngx Financial Power"),

    /**
     * Ngx Financial Gas
     */
    NGX_FINANCIAL_GAS((short) 316, "Ngx Financial Gas"),

    /**
     * Financial Ngl
     */
    FINANCIAL_NGL((short) 317, "Financial Ngl"),

    /**
     * Olefins Polymers
     */
    OLEFINS_POLYMERS((short) 318, "Olefins Polymers"),

    /**
     * Physical Ngl
     */
    PHYSICAL_NGL((short) 319, "Physical Ngl"),

    /**
     * Physical Oil
     */
    PHYSICAL_OIL((short) 320, "Physical Oil"),

    /**
     * Test Ipe
     */
    TEST_IPE((short) 600, "Test Ipe"),

    /**
     * Test Nybot
     */
    TEST_NYBOT((short) 601, "Test Nybot"),

    /**
     * Test Ndex
     */
    TEST_NDEX((short) 602, "Test Ndex"),

    /**
     * Test Liffeuk 1
     */
    TEST_LIFFEUK_1((short) 603, "Test Liffeuk 1"),

    /**
     * Test Liffeuk 2
     */
    TEST_LIFFEUK_2((short) 604, "Test Liffeuk 2");

    private final short wire;

    private final String description;

    MarketTypeId(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<MarketTypeId> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FINANCIAL_GAS);
            case 1 -> Optional.of(FINANCIAL_POWER);
            case 2 -> Optional.of(OIL);
            case 3 -> Optional.of(IPE_NATURAL_GAS_FUTURES);
            case 4 -> Optional.of(IPE_GAS_OIL_FUTURES);
            case 5 -> Optional.of(IPE_BRENT_FUTURES);
            case 7 -> Optional.of(IPE_UK_ELECTRICITY_FUTURES_PEAK);
            case 8 -> Optional.of(IPE_UK_ELECTRICITY_FUTURES_BASE);
            case 9 -> Optional.of(ICE_WTI_CRUDE_FUTURES);
            case 10 -> Optional.of(GC_NEWCASTLE_COAL_FUTURES);
            case 11 -> Optional.of(ICE_BRENT_WTI_FUTURES_SPREAD);
            case 12 -> Optional.of(IPEECX_EUROPEAN_EMISSIONS);
            case 13 -> Optional.of(ICE_HEATING_OIL_FUTURES);
            case 14 -> Optional.of(ICE_HEATING_OIL_WTI_FUTURES_CRACK);
            case 15 -> Optional.of(ICE_NYH_RBOB_GASOLINE_FUTURES);
            case 16 -> Optional.of(ICE_NYH_RBOB_GASOLINE_WTI_FUTURES_CRACK);
            case 17 -> Optional.of(ICE_ROTTERDAM_COAL_FUTURES);
            case 18 -> Optional.of(ICE_RICHARDS_BAY_COAL_FUTURES);
            case 19 -> Optional.of(ICE_ROTTERDAM_RICHARDS_BAY_COAL_FUTURES_SPREAD);
            case 20 -> Optional.of(COCOA);
            case 21 -> Optional.of(COFFEE_C);
            case 22 -> Optional.of(COTTON_NO_2);
            case 23 -> Optional.of(FCOJ_A);
            case 24 -> Optional.of(SUGAR_NO_11);
            case 25 -> Optional.of(HEAT_RATE_SPREAD);
            case 26 -> Optional.of(US_DOLLAR_INDEX);
            case 36 -> Optional.of(CANADIAN_OILSEEDS);
            case 38 -> Optional.of(ECX_CER_FUTURES);
            case 39 -> Optional.of(FOREIGN_EXCHANGE);
            case 40 -> Optional.of(FINANCIAL_INDEX_DATA);
            case 41 -> Optional.of(SUGAR_NO_16);
            case 42 -> Optional.of(ECX_EUACER_FUTURES_SPREAD);
            case 44 -> Optional.of(HENRY_HUB);
            case 48 -> Optional.of(DUTCH_TTF_GAS_FUTURES);
            case 50 -> Optional.of(GERMAN_NATURAL_GAS_FUTURES);
            case 51 -> Optional.of(EUROPEAN_GAS_SPREADS);
            case 53 -> Optional.of(CANADIAN_FINANCIAL_GAS);
            case 54 -> Optional.of(NGX_CANADIAN_PHYSICAL_CRUDE);
            case 55 -> Optional.of(US_COAL_FUTURES);
            case 57 -> Optional.of(FOB_INDO_SUBBIT_COAL_FUTURES);
            case 58 -> Optional.of(HEATING_OIL_BRENT_FUTURES_CRACK);
            case 59 -> Optional.of(NYH_RBOB_GASOLINE_BRENT_FUTURES_CRACK);
            case 60 -> Optional.of(WET_FREIGHT);
            case 61 -> Optional.of(DRY_FREIGHT);
            case 62 -> Optional.of(FERROUS_METALS);
            case 63 -> Optional.of(PLATTS_VARIABLE_OIL);
            case 66 -> Optional.of(NYH_RBOB_GASOLINE_HEATING_OIL_SPREAD);
            case 69 -> Optional.of(PHYSICAL_ENVIRONMENTAL);
            case 70 -> Optional.of(HEATING_OIL_LS_GASOIL_FUTURES_SPREAD);
            case 71 -> Optional.of(LS_GASOIL_BRENT_FUTURES_CRACK);
            case 72 -> Optional.of(NYH_RBOB_GASOLINE_LS_GASOIL_FUTURES_SPREAD);
            case 84 -> Optional.of(ECX_EUAA_FUTURES);
            case 85 -> Optional.of(ECX_CEREUAA_FUTURES_SPREAD);
            case 86 -> Optional.of(ECX_EUAAEUA_FUTURES_SPREAD);
            case 89 -> Optional.of(SOYBEAN);
            case 92 -> Optional.of(ECX_EUA_EIB_AUCTION);
            case 93 -> Optional.of(FINANCIAL_LNG);
            case 95 -> Optional.of(EUA_UK_AUCTION);
            case 96 -> Optional.of(EUAA_UK_AUCTION);
            case 97 -> Optional.of(CFR_SOUTH_CHINA_COAL_FUTURES);
            case 98 -> Optional.of(BELGIAN_POWER_FUTURES);
            case 99 -> Optional.of(DUTCH_POWER_FUTURES);
            case 100 -> Optional.of(GC_NEWCASTLE_FOB_INDO_SUBBIT_COAL_FUTURES_SPREAD);
            case 101 -> Optional.of(RICHARDS_BAYG_C_NEWCASTLE_COAL_FUTURES_SPREAD);
            case 102 -> Optional.of(FCOJ_A_MINI);
            case 104 -> Optional.of(CIF_US);
            case 108 -> Optional.of(D6_RIN);
            case 111 -> Optional.of(EUROPEAN_POWER_SPREADS);
            case 112 -> Optional.of(TAQA);
            case 113 -> Optional.of(BELGIAN_ZTP_GAS_SPOT);
            case 114 -> Optional.of(DUTCH_TTF_GAS_SPOT);
            case 115 -> Optional.of(DUTCH_TTF_GAS_STORAGE);
            case 116 -> Optional.of(EUROPEAN_GAS_SPOT_SPREADS);
            case 117 -> Optional.of(BELGIAN_ZTP_GAS_FUTURES);
            case 118 -> Optional.of(UK_OCM_GAS_SPOT);
            case 119 -> Optional.of(BELGIAN_GAS_SPREADS);
            case 124 -> Optional.of(FINANCIAL_OLEFINS);
            case 125 -> Optional.of(FINANCIAL_MONOMERS);
            case 126 -> Optional.of(PLATTS_VARIABLE_OIL_URALS);
            case 127 -> Optional.of(ENDEX_SPOT_MARKET_INDICES);
            case 131 -> Optional.of(INTEREST_RATE_FUTURES);
            case 133 -> Optional.of(SINGAPORE_ENERGY);
            case 134 -> Optional.of(SINGAPORE_FINANCIALS);
            case 135 -> Optional.of(SINGAPORE_METALS);
            case 136 -> Optional.of(ITALIAN_NATURAL_GAS_FUTURES);
            case 137 -> Optional.of(ITALIAN_POWER_FUTURES);
            case 139 -> Optional.of(CREDIT_SWAP_DATA);
            case 140 -> Optional.of(GOLD_FIXING);
            case 141 -> Optional.of(NORTH_SEA_PARTIALS);
            case 142 -> Optional.of(EU_FINANCIAL_POWER_SPREADS);
            case 143 -> Optional.of(EU_FINANCIAL_POWER_FUTURES);
            case 144 -> Optional.of(OIL_CAD);
            case 147 -> Optional.of(SILVER_FIXING);
            case 149 -> Optional.of(UK_SPARK_SPREAD);
            case 150 -> Optional.of(UK_OCM_PHYSICAL_GAS_SPOT);
            case 152 -> Optional.of(JAPAN_DOMESTIC_WATERBORNE);
            case 154 -> Optional.of(DAILY_METALS);
            case 155 -> Optional.of(BRIX_ENERGIA_FIN);
            case 156 -> Optional.of(JAPAN_DOMESTIC_RACK);
            case 157 -> Optional.of(FINANCIAL_US_LNG);
            case 160 -> Optional.of(ICE_ROTTERDAM_NEWCASTLE_COAL_FUTURES_SPREAD);
            case 165 -> Optional.of(OIL_AMERICAS);
            case 167 -> Optional.of(PLATTS_PETROCHEMICAL);
            case 168 -> Optional.of(PERMIAN_WTI_FUTURES);
            case 170 -> Optional.of(ENDEX_EQUITY_INDICES);
            case 171 -> Optional.of(ENDEX_SINGLE_STOCK_OPTIONS);
            case 172 -> Optional.of(IFUS_ICE_INDICES);
            case 173 -> Optional.of(PLATTS_ASIA_BUNKER);
            case 177 -> Optional.of(SOFR_FUTURES);
            case 178 -> Optional.of(DIGITAL_ASSET_FUTURES);
            case 179 -> Optional.of(PERMIAN_BRENT_FUTURES_SPREAD);
            case 180 -> Optional.of(PERMIAN_WTI_FUTURES_SPREAD);
            case 200 -> Optional.of(LIFFE_STI_RS);
            case 202 -> Optional.of(LIFFE_BONDS);
            case 203 -> Optional.of(LIFFE_SWAPNOTES);
            case 205 -> Optional.of(LIFFE_COMMODITIES);
            case 206 -> Optional.of(METALS);
            case 207 -> Optional.of(IFUS_EQUITY_INDICES);
            case 208 -> Optional.of(GCF_REPO);
            case 209 -> Optional.of(LIFFE_THREE_MONTH_EURO_AND_EONIA);
            case 210 -> Optional.of(EURODOLLAR);
            case 211 -> Optional.of(LIFFE_EQUITY_DERIVATIVES_NON_US_BASED);
            case 212 -> Optional.of(LIFFE_EQUITY_DERIVATIVES_US_BASED);
            case 213 -> Optional.of(LIFFE_INDEX_OPTIONS);
            case 214 -> Optional.of(LIFFE_INDEX_FUTURES_US_RESTRICTED);
            case 215 -> Optional.of(LIFFE_INDEX_FUTURES_NON_US_RESTRICTED);
            case 305 -> Optional.of(PHYSICAL_GAS);
            case 306 -> Optional.of(POWER);
            case 314 -> Optional.of(NGX_PHYSICAL_GAS);
            case 315 -> Optional.of(NGX_FINANCIAL_POWER);
            case 316 -> Optional.of(NGX_FINANCIAL_GAS);
            case 317 -> Optional.of(FINANCIAL_NGL);
            case 318 -> Optional.of(OLEFINS_POLYMERS);
            case 319 -> Optional.of(PHYSICAL_NGL);
            case 320 -> Optional.of(PHYSICAL_OIL);
            case 600 -> Optional.of(TEST_IPE);
            case 601 -> Optional.of(TEST_NYBOT);
            case 602 -> Optional.of(TEST_NDEX);
            case 603 -> Optional.of(TEST_LIFFEUK_1);
            case 604 -> Optional.of(TEST_LIFFEUK_2);
            default -> Optional.empty();
        };
    }
}
