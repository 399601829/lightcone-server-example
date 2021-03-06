// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_dex.proto

package io.lightcone.data.dex;

public interface GetMarketsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.lightcone.data.dex.GetMarketsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool require_metadata = 1;</code>
   */
  boolean getRequireMetadata();

  /**
   * <code>optional bool require_ticker = 2;</code>
   */
  boolean getRequireTicker();

  /**
   * <code>optional bool query_loopring_ticker = 3;</code>
   */
  boolean getQueryLoopringTicker();

  /**
   * <code>optional string quote_currency_for_ticker = 4;</code>
   *
   * <pre>
   * USD, RMB
   * </pre>
   */
  java.lang.String getQuoteCurrencyForTicker();
  /**
   * <code>optional string quote_currency_for_ticker = 4;</code>
   *
   * <pre>
   * USD, RMB
   * </pre>
   */
  com.google.protobuf.ByteString
      getQuoteCurrencyForTickerBytes();

  /**
   * <code>repeated uint64 market_id = 5;</code>
   *
   * <pre>
   * empty for query all
   * </pre>
   */
  java.util.List<java.lang.Long> getMarketIdList();
  /**
   * <code>repeated uint64 market_id = 5;</code>
   *
   * <pre>
   * empty for query all
   * </pre>
   */
  int getMarketIdCount();
  /**
   * <code>repeated uint64 market_id = 5;</code>
   *
   * <pre>
   * empty for query all
   * </pre>
   */
  long getMarketId(int index);
}
