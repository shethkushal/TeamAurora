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
/**
 * Event marking a state transition in job update lifecycle.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-04")
public class JobUpdateEvent implements org.apache.thrift.TBase<JobUpdateEvent, JobUpdateEvent._Fields>, java.io.Serializable, Cloneable, Comparable<JobUpdateEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobUpdateEvent");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("timestampMs", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobUpdateEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobUpdateEventTupleSchemeFactory());
  }

  /**
   * Update status.
   * 
   * @see JobUpdateStatus
   */
  public JobUpdateStatus status; // required
  /**
   * Epoch timestamp in milliseconds.
   */
  public long timestampMs; // required
  /**
   * User who performed this event (if user-initiated).
   */
  public String user; // optional
  /**
   * Message from the user (for user-initiated transitions) or the scheduler about why the state was
   * changed.
   */
  public String message; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Update status.
     * 
     * @see JobUpdateStatus
     */
    STATUS((short)1, "status"),
    /**
     * Epoch timestamp in milliseconds.
     */
    TIMESTAMP_MS((short)2, "timestampMs"),
    /**
     * User who performed this event (if user-initiated).
     */
    USER((short)3, "user"),
    /**
     * Message from the user (for user-initiated transitions) or the scheduler about why the state was
     * changed.
     */
    MESSAGE((short)4, "message");

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
        case 1: // STATUS
          return STATUS;
        case 2: // TIMESTAMP_MS
          return TIMESTAMP_MS;
        case 3: // USER
          return USER;
        case 4: // MESSAGE
          return MESSAGE;
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
  private static final int __TIMESTAMPMS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USER,_Fields.MESSAGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobUpdateStatus.class)));
    tmpMap.put(_Fields.TIMESTAMP_MS, new org.apache.thrift.meta_data.FieldMetaData("timestampMs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobUpdateEvent.class, metaDataMap);
  }

  public JobUpdateEvent() {
  }

  public JobUpdateEvent(
    JobUpdateStatus status,
    long timestampMs)
  {
    this();
    this.status = status;
    this.timestampMs = timestampMs;
    setTimestampMsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobUpdateEvent(JobUpdateEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    this.timestampMs = other.timestampMs;
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
  }

  public JobUpdateEvent deepCopy() {
    return new JobUpdateEvent(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setTimestampMsIsSet(false);
    this.timestampMs = 0;
    this.user = null;
    this.message = null;
  }

  /**
   * Update status.
   * 
   * @see JobUpdateStatus
   */
  public JobUpdateStatus getStatus() {
    return this.status;
  }

  /**
   * Update status.
   * 
   * @see JobUpdateStatus
   */
  public JobUpdateEvent setStatus(JobUpdateStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  /**
   * Epoch timestamp in milliseconds.
   */
  public long getTimestampMs() {
    return this.timestampMs;
  }

  /**
   * Epoch timestamp in milliseconds.
   */
  public JobUpdateEvent setTimestampMs(long timestampMs) {
    this.timestampMs = timestampMs;
    setTimestampMsIsSet(true);
    return this;
  }

  public void unsetTimestampMs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMPMS_ISSET_ID);
  }

  /** Returns true if field timestampMs is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestampMs() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMPMS_ISSET_ID);
  }

  public void setTimestampMsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMPMS_ISSET_ID, value);
  }

  /**
   * User who performed this event (if user-initiated).
   */
  public String getUser() {
    return this.user;
  }

  /**
   * User who performed this event (if user-initiated).
   */
  public JobUpdateEvent setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  /**
   * Message from the user (for user-initiated transitions) or the scheduler about why the state was
   * changed.
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * Message from the user (for user-initiated transitions) or the scheduler about why the state was
   * changed.
   */
  public JobUpdateEvent setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((JobUpdateStatus)value);
      }
      break;

    case TIMESTAMP_MS:
      if (value == null) {
        unsetTimestampMs();
      } else {
        setTimestampMs((Long)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case TIMESTAMP_MS:
      return getTimestampMs();

    case USER:
      return getUser();

    case MESSAGE:
      return getMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case TIMESTAMP_MS:
      return isSetTimestampMs();
    case USER:
      return isSetUser();
    case MESSAGE:
      return isSetMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobUpdateEvent)
      return this.equals((JobUpdateEvent)that);
    return false;
  }

  public boolean equals(JobUpdateEvent that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_timestampMs = true;
    boolean that_present_timestampMs = true;
    if (this_present_timestampMs || that_present_timestampMs) {
      if (!(this_present_timestampMs && that_present_timestampMs))
        return false;
      if (this.timestampMs != that.timestampMs)
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_timestampMs = true;
    list.add(present_timestampMs);
    if (present_timestampMs)
      list.add(timestampMs);

    boolean present_user = true && (isSetUser());
    list.add(present_user);
    if (present_user)
      list.add(user);

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobUpdateEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestampMs()).compareTo(other.isSetTimestampMs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestampMs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestampMs, other.timestampMs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
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
    StringBuilder sb = new StringBuilder("JobUpdateEvent(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestampMs:");
    sb.append(this.timestampMs);
    first = false;
    if (isSetUser()) {
      if (!first) sb.append(", ");
      sb.append("user:");
      if (this.user == null) {
        sb.append("null");
      } else {
        sb.append(this.user);
      }
      first = false;
    }
    if (isSetMessage()) {
      if (!first) sb.append(", ");
      sb.append("message:");
      if (this.message == null) {
        sb.append("null");
      } else {
        sb.append(this.message);
      }
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobUpdateEventStandardSchemeFactory implements SchemeFactory {
    public JobUpdateEventStandardScheme getScheme() {
      return new JobUpdateEventStandardScheme();
    }
  }

  private static class JobUpdateEventStandardScheme extends StandardScheme<JobUpdateEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobUpdateEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = org.apache.aurora.gen.JobUpdateStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIMESTAMP_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestampMs = iprot.readI64();
              struct.setTimestampMsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobUpdateEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMESTAMP_MS_FIELD_DESC);
      oprot.writeI64(struct.timestampMs);
      oprot.writeFieldEnd();
      if (struct.user != null) {
        if (struct.isSetUser()) {
          oprot.writeFieldBegin(USER_FIELD_DESC);
          oprot.writeString(struct.user);
          oprot.writeFieldEnd();
        }
      }
      if (struct.message != null) {
        if (struct.isSetMessage()) {
          oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
          oprot.writeString(struct.message);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobUpdateEventTupleSchemeFactory implements SchemeFactory {
    public JobUpdateEventTupleScheme getScheme() {
      return new JobUpdateEventTupleScheme();
    }
  }

  private static class JobUpdateEventTupleScheme extends TupleScheme<JobUpdateEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobUpdateEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetTimestampMs()) {
        optionals.set(1);
      }
      if (struct.isSetUser()) {
        optionals.set(2);
      }
      if (struct.isSetMessage()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetTimestampMs()) {
        oprot.writeI64(struct.timestampMs);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobUpdateEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.status = org.apache.aurora.gen.JobUpdateStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timestampMs = iprot.readI64();
        struct.setTimestampMsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(3)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
    }
  }

}

