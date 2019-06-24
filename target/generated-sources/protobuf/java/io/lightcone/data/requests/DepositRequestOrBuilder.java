// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_requests.proto

package io.lightcone.data.requests;

public interface DepositRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.lightcone.data.requests.DepositRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 exchange_id = 1;</code>
   */
  int getExchangeId();

  /**
   * <code>optional .io.lightcone.data.types.AccountID account_id = 2;</code>
   *
   * <pre>
   * if not exist, the first time that need create
   * </pre>
   */
  boolean hasAccountId();
  /**
   * <code>optional .io.lightcone.data.types.AccountID account_id = 2;</code>
   *
   * <pre>
   * if not exist, the first time that need create
   * </pre>
   */
  io.lightcone.data.types.AccountID getAccountId();
  /**
   * <code>optional .io.lightcone.data.types.AccountID account_id = 2;</code>
   *
   * <pre>
   * if not exist, the first time that need create
   * </pre>
   */
  io.lightcone.data.types.AccountIDOrBuilder getAccountIdOrBuilder();

  /**
   * <code>optional .io.lightcone.data.types.TxData tx_data = 3;</code>
   */
  boolean hasTxData();
  /**
   * <code>optional .io.lightcone.data.types.TxData tx_data = 3;</code>
   */
  io.lightcone.data.types.TxData getTxData();
  /**
   * <code>optional .io.lightcone.data.types.TxData tx_data = 3;</code>
   */
  io.lightcone.data.types.TxDataOrBuilder getTxDataOrBuilder();
}