// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DexServiceImpl.proto

package io.lightcone.data.dex;

public interface GetUserFillsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.lightcone.data.dex.GetUserFillsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 account_id = 1;</code>
   */
  long getAccountId();

  /**
   * <code>optional uint64 order_uuid = 2;</code>
   */
  long getOrderUuid();

  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 3;</code>
   */
  boolean hasPaging();
  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 3;</code>
   */
  io.lightcone.data.types.CursorPaging getPaging();
  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 3;</code>
   */
  io.lightcone.data.types.CursorPagingOrBuilder getPagingOrBuilder();
}