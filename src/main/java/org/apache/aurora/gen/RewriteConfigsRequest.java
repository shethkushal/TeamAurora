/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.aurora.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-04")
public class RewriteConfigsRequest implements org.apache.thrift.TBase<RewriteConfigsRequest, RewriteConfigsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<RewriteConfigsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RewriteConfigsRequest");

  private static final org.apache.thrift.protocol.TField REWRITE_COMMANDS_FIELD_DESC = new org.apache.thrift.protocol.TField("rewriteCommands", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RewriteConfigsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RewriteConfigsRequestTupleSchemeFactory());
  }

  public List<ConfigRewrite> rewriteCommands; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REWRITE_COMMANDS((short)1, "rewriteCommands");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REWRITE_COMMANDS
          return REWRITE_COMMANDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REWRITE_COMMANDS, new org.apache.thrift.meta_data.FieldMetaData("rewriteCommands", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConfigRewrite.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RewriteConfigsRequest.class, metaDataMap);
  }

  public RewriteConfigsRequest() {
  }

  public RewriteConfigsRequest(
    List<ConfigRewrite> rewriteCommands)
  {
    this();
    this.rewriteCommands = rewriteCommands;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RewriteConfigsRequest(RewriteConfigsRequest other) {
    if (other.isSetRewriteCommands()) {
      List<ConfigRewrite> __this__rewriteCommands = new ArrayList<ConfigRewrite>(other.rewriteCommands.size());
      for (ConfigRewrite other_element : other.rewriteCommands) {
        __this__rewriteCommands.add(new ConfigRewrite(other_element));
      }
      this.rewriteCommands = __this__rewriteCommands;
    }
  }

  public RewriteConfigsRequest deepCopy() {
    return new RewriteConfigsRequest(this);
  }

  @Override
  public void clear() {
    this.rewriteCommands = null;
  }

  public int getRewriteCommandsSize() {
    return (this.rewriteCommands == null) ? 0 : this.rewriteCommands.size();
  }

  public java.util.Iterator<ConfigRewrite> getRewriteCommandsIterator() {
    return (this.rewriteCommands == null) ? null : this.rewriteCommands.iterator();
  }

  public void addToRewriteCommands(ConfigRewrite elem) {
    if (this.rewriteCommands == null) {
      this.rewriteCommands = new ArrayList<ConfigRewrite>();
    }
    this.rewriteCommands.add(elem);
  }

  public List<ConfigRewrite> getRewriteCommands() {
    return this.rewriteCommands;
  }

  public RewriteConfigsRequest setRewriteCommands(List<ConfigRewrite> rewriteCommands) {
    this.rewriteCommands = rewriteCommands;
    return this;
  }

  public void unsetRewriteCommands() {
    this.rewriteCommands = null;
  }

  /** Returns true if field rewriteCommands is set (has been assigned a value) and false otherwise */
  public boolean isSetRewriteCommands() {
    return this.rewriteCommands != null;
  }

  public void setRewriteCommandsIsSet(boolean value) {
    if (!value) {
      this.rewriteCommands = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REWRITE_COMMANDS:
      if (value == null) {
        unsetRewriteCommands();
      } else {
        setRewriteCommands((List<ConfigRewrite>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REWRITE_COMMANDS:
      return getRewriteCommands();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REWRITE_COMMANDS:
      return isSetRewriteCommands();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RewriteConfigsRequest)
      return this.equals((RewriteConfigsRequest)that);
    return false;
  }

  public boolean equals(RewriteConfigsRequest that) {
    if (that == null)
      return false;

    boolean this_present_rewriteCommands = true && this.isSetRewriteCommands();
    boolean that_present_rewriteCommands = true && that.isSetRewriteCommands();
    if (this_present_rewriteCommands || that_present_rewriteCommands) {
      if (!(this_present_rewriteCommands && that_present_rewriteCommands))
        return false;
      if (!this.rewriteCommands.equals(that.rewriteCommands))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_rewriteCommands = true && (isSetRewriteCommands());
    list.add(present_rewriteCommands);
    if (present_rewriteCommands)
      list.add(rewriteCommands);

    return list.hashCode();
  }

  @Override
  public int compareTo(RewriteConfigsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRewriteCommands()).compareTo(other.isSetRewriteCommands());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRewriteCommands()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rewriteCommands, other.rewriteCommands);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RewriteConfigsRequest(");
    boolean first = true;

    sb.append("rewriteCommands:");
    if (this.rewriteCommands == null) {
      sb.append("null");
    } else {
      sb.append(this.rewriteCommands);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RewriteConfigsRequestStandardSchemeFactory implements SchemeFactory {
    public RewriteConfigsRequestStandardScheme getScheme() {
      return new RewriteConfigsRequestStandardScheme();
    }
  }

  private static class RewriteConfigsRequestStandardScheme extends StandardScheme<RewriteConfigsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RewriteConfigsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REWRITE_COMMANDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list408 = iprot.readListBegin();
                struct.rewriteCommands = new ArrayList<ConfigRewrite>(_list408.size);
                ConfigRewrite _elem409;
                for (int _i410 = 0; _i410 < _list408.size; ++_i410)
                {
                  _elem409 = new ConfigRewrite();
                  _elem409.read(iprot);
                  struct.rewriteCommands.add(_elem409);
                }
                iprot.readListEnd();
              }
              struct.setRewriteCommandsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RewriteConfigsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.rewriteCommands != null) {
        oprot.writeFieldBegin(REWRITE_COMMANDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.rewriteCommands.size()));
          for (ConfigRewrite _iter411 : struct.rewriteCommands)
          {
            _iter411.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RewriteConfigsRequestTupleSchemeFactory implements SchemeFactory {
    public RewriteConfigsRequestTupleScheme getScheme() {
      return new RewriteConfigsRequestTupleScheme();
    }
  }

  private static class RewriteConfigsRequestTupleScheme extends TupleScheme<RewriteConfigsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RewriteConfigsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRewriteCommands()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRewriteCommands()) {
        {
          oprot.writeI32(struct.rewriteCommands.size());
          for (ConfigRewrite _iter412 : struct.rewriteCommands)
          {
            _iter412.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RewriteConfigsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list413 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.rewriteCommands = new ArrayList<ConfigRewrite>(_list413.size);
          ConfigRewrite _elem414;
          for (int _i415 = 0; _i415 < _list413.size; ++_i415)
          {
            _elem414 = new ConfigRewrite();
            _elem414.read(iprot);
            struct.rewriteCommands.add(_elem414);
          }
        }
        struct.setRewriteCommandsIsSet(true);
      }
    }
  }

}

