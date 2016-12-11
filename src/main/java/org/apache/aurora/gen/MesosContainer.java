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
 * Describes a mesos container, this is the default
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-04")
public class MesosContainer implements org.apache.thrift.TBase<MesosContainer, MesosContainer._Fields>, java.io.Serializable, Cloneable, Comparable<MesosContainer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MesosContainer");

  private static final org.apache.thrift.protocol.TField IMAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("image", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VOLUMES_FIELD_DESC = new org.apache.thrift.protocol.TField("volumes", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MesosContainerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MesosContainerTupleSchemeFactory());
  }

  /**
   * the optional filesystem image to use when launching this task.
   */
  public Image image; // optional
  /**
   * the optional list of volumes to mount into the task.
   */
  public List<Volume> volumes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the optional filesystem image to use when launching this task.
     */
    IMAGE((short)1, "image"),
    /**
     * the optional list of volumes to mount into the task.
     */
    VOLUMES((short)2, "volumes");

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
        case 1: // IMAGE
          return IMAGE;
        case 2: // VOLUMES
          return VOLUMES;
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
  private static final _Fields optionals[] = {_Fields.IMAGE,_Fields.VOLUMES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IMAGE, new org.apache.thrift.meta_data.FieldMetaData("image", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Image.class)));
    tmpMap.put(_Fields.VOLUMES, new org.apache.thrift.meta_data.FieldMetaData("volumes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Volume.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MesosContainer.class, metaDataMap);
  }

  public MesosContainer() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MesosContainer(MesosContainer other) {
    if (other.isSetImage()) {
      this.image = new Image(other.image);
    }
    if (other.isSetVolumes()) {
      List<Volume> __this__volumes = new ArrayList<Volume>(other.volumes.size());
      for (Volume other_element : other.volumes) {
        __this__volumes.add(new Volume(other_element));
      }
      this.volumes = __this__volumes;
    }
  }

  public MesosContainer deepCopy() {
    return new MesosContainer(this);
  }

  @Override
  public void clear() {
    this.image = null;
    this.volumes = null;
  }

  /**
   * the optional filesystem image to use when launching this task.
   */
  public Image getImage() {
    return this.image;
  }

  /**
   * the optional filesystem image to use when launching this task.
   */
  public MesosContainer setImage(Image image) {
    this.image = image;
    return this;
  }

  public void unsetImage() {
    this.image = null;
  }

  /** Returns true if field image is set (has been assigned a value) and false otherwise */
  public boolean isSetImage() {
    return this.image != null;
  }

  public void setImageIsSet(boolean value) {
    if (!value) {
      this.image = null;
    }
  }

  public int getVolumesSize() {
    return (this.volumes == null) ? 0 : this.volumes.size();
  }

  public java.util.Iterator<Volume> getVolumesIterator() {
    return (this.volumes == null) ? null : this.volumes.iterator();
  }

  public void addToVolumes(Volume elem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<Volume>();
    }
    this.volumes.add(elem);
  }

  /**
   * the optional list of volumes to mount into the task.
   */
  public List<Volume> getVolumes() {
    return this.volumes;
  }

  /**
   * the optional list of volumes to mount into the task.
   */
  public MesosContainer setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public void unsetVolumes() {
    this.volumes = null;
  }

  /** Returns true if field volumes is set (has been assigned a value) and false otherwise */
  public boolean isSetVolumes() {
    return this.volumes != null;
  }

  public void setVolumesIsSet(boolean value) {
    if (!value) {
      this.volumes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IMAGE:
      if (value == null) {
        unsetImage();
      } else {
        setImage((Image)value);
      }
      break;

    case VOLUMES:
      if (value == null) {
        unsetVolumes();
      } else {
        setVolumes((List<Volume>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IMAGE:
      return getImage();

    case VOLUMES:
      return getVolumes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IMAGE:
      return isSetImage();
    case VOLUMES:
      return isSetVolumes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MesosContainer)
      return this.equals((MesosContainer)that);
    return false;
  }

  public boolean equals(MesosContainer that) {
    if (that == null)
      return false;

    boolean this_present_image = true && this.isSetImage();
    boolean that_present_image = true && that.isSetImage();
    if (this_present_image || that_present_image) {
      if (!(this_present_image && that_present_image))
        return false;
      if (!this.image.equals(that.image))
        return false;
    }

    boolean this_present_volumes = true && this.isSetVolumes();
    boolean that_present_volumes = true && that.isSetVolumes();
    if (this_present_volumes || that_present_volumes) {
      if (!(this_present_volumes && that_present_volumes))
        return false;
      if (!this.volumes.equals(that.volumes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_image = true && (isSetImage());
    list.add(present_image);
    if (present_image)
      list.add(image);

    boolean present_volumes = true && (isSetVolumes());
    list.add(present_volumes);
    if (present_volumes)
      list.add(volumes);

    return list.hashCode();
  }

  @Override
  public int compareTo(MesosContainer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetImage()).compareTo(other.isSetImage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.image, other.image);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVolumes()).compareTo(other.isSetVolumes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVolumes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.volumes, other.volumes);
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
    StringBuilder sb = new StringBuilder("MesosContainer(");
    boolean first = true;

    if (isSetImage()) {
      sb.append("image:");
      if (this.image == null) {
        sb.append("null");
      } else {
        sb.append(this.image);
      }
      first = false;
    }
    if (isSetVolumes()) {
      if (!first) sb.append(", ");
      sb.append("volumes:");
      if (this.volumes == null) {
        sb.append("null");
      } else {
        sb.append(this.volumes);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MesosContainerStandardSchemeFactory implements SchemeFactory {
    public MesosContainerStandardScheme getScheme() {
      return new MesosContainerStandardScheme();
    }
  }

  private static class MesosContainerStandardScheme extends StandardScheme<MesosContainer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MesosContainer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IMAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.image = new Image();
              struct.image.read(iprot);
              struct.setImageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VOLUMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.volumes = new ArrayList<Volume>(_list24.size);
                Volume _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new Volume();
                  _elem25.read(iprot);
                  struct.volumes.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setVolumesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MesosContainer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.image != null) {
        if (struct.isSetImage()) {
          oprot.writeFieldBegin(IMAGE_FIELD_DESC);
          struct.image.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.volumes != null) {
        if (struct.isSetVolumes()) {
          oprot.writeFieldBegin(VOLUMES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.volumes.size()));
            for (Volume _iter27 : struct.volumes)
            {
              _iter27.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MesosContainerTupleSchemeFactory implements SchemeFactory {
    public MesosContainerTupleScheme getScheme() {
      return new MesosContainerTupleScheme();
    }
  }

  private static class MesosContainerTupleScheme extends TupleScheme<MesosContainer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MesosContainer struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetImage()) {
        optionals.set(0);
      }
      if (struct.isSetVolumes()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetImage()) {
        struct.image.write(oprot);
      }
      if (struct.isSetVolumes()) {
        {
          oprot.writeI32(struct.volumes.size());
          for (Volume _iter28 : struct.volumes)
          {
            _iter28.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MesosContainer struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.image = new Image();
        struct.image.read(iprot);
        struct.setImageIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.volumes = new ArrayList<Volume>(_list29.size);
          Volume _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = new Volume();
            _elem30.read(iprot);
            struct.volumes.add(_elem30);
          }
        }
        struct.setVolumesIsSet(true);
      }
    }
  }

}

