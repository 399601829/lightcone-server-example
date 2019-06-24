// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_dex.proto

package io.lightcone.data.dex;

public interface GetUserTransactionsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.lightcone.data.dex.GetUserTransactionsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 account_id = 1;</code>
   */
  long getAccountId();

  /**
   * <code>optional uint32 token_id = 2;</code>
   */
  int getTokenId();

  /**
   * <code>optional string transaction_type = 3;</code>
   *
   * <pre>
   * `deposit`, `withdrawal`, `transfer`, or "both"
   * </pre>
   */
  java.lang.String getTransactionType();
  /**
   * <code>optional string transaction_type = 3;</code>
   *
   * <pre>
   * `deposit`, `withdrawal`, `transfer`, or "both"
   * </pre>
   */
  com.google.protobuf.ByteString
      getTransactionTypeBytes();

  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
   */
  boolean hasPaging();
  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
   */
  io.lightcone.data.types.CursorPaging getPaging();
  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
   */
  io.lightcone.data.types.CursorPagingOrBuilder getPagingOrBuilder();
}
