package com.huobi.api.crossresponse.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossAccountPositionInfoResponse {

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("margin_account")
        private String marginAccount;
        @SerializedName("margin_asset")
        private String marginAsset;
        @SerializedName("margin_balance")
        private BigDecimal marginBalance;
        @SerializedName("margin_static")
        private BigDecimal marginStatic;
        @SerializedName("margin_position")
        private BigDecimal marginPosition;
        @SerializedName("margin_frozen")
        private BigDecimal marginFrozen;
        @SerializedName("profit_real")
        private BigDecimal profitReal;
        @SerializedName("profit_unreal")
        private BigDecimal profitUnreal;
        @SerializedName("withdraw_available")
        private BigDecimal withdrawAvailable;
        @SerializedName("risk_rate")
        private BigDecimal riskRate;
        private List<Positions> positions;
        @SerializedName("contract_detail")
        private List<ContractDetailBean> contractDetail;

        @Data
        @AllArgsConstructor
        public static class ContractDetailBean{
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("margin_position")
            private BigDecimal marginPosition;
            @SerializedName("margin_frozen")
            private BigDecimal marginFrozen;
            @SerializedName("margin_available")
            private BigDecimal marginAvailable;
            @SerializedName("profit_unreal")
            private BigDecimal profitUnreal;
            @SerializedName("liquidation_price")
            private BigDecimal liquidationPrice;
            @SerializedName("lever_rate")
            private BigDecimal leverRate;
            @SerializedName("adjust_factor")
            private BigDecimal adjustFactor;

        }



        @Data
        @AllArgsConstructor
        public static class Positions {
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            private BigDecimal volume;
            private BigDecimal available;
            private BigDecimal frozen;
            @SerializedName("cost_open")
            private BigDecimal costOpen;
            @SerializedName("cost_hold")
            private BigDecimal costHold;
            @SerializedName("profit_unreal")
            private BigDecimal profitUnreal;
            @SerializedName("profit_rate")
            private BigDecimal profitRate;
            private BigDecimal profit;
            @SerializedName("margin_asset")
            private String marginAsset;
            @SerializedName("position_margin")
            private BigDecimal positionMargin;
            @SerializedName("lever_rate")
            private Integer leverRate;
            private String direction;
            @SerializedName("last_price")
            private BigDecimal lastPrice;
            @SerializedName("margin_mode")
            private String marginMode;
            @SerializedName("margin_account")
            private String marginAccount;
        }
    }
}
