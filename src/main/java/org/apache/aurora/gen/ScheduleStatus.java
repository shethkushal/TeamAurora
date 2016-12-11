/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.aurora.gen;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * States that a task may be in.
 */
public enum ScheduleStatus implements org.apache.thrift.TEnum {
  INIT(11),
  /**
   * The task will be rescheduled, but is being throttled for restarting too frequently.
   */
  THROTTLED(16),
  /**
   * Task is awaiting assignment to a slave.
   */
  PENDING(0),
  /**
   * Task has been assigned to a slave.
   */
  ASSIGNED(9),
  /**
   * Slave has acknowledged receipt of task and is bootstrapping the task.
   */
  STARTING(1),
  /**
   * The task is running on the slave.
   */
  RUNNING(2),
  /**
   * The task terminated with an exit code of zero.
   */
  FINISHED(3),
  /**
   * The task is being preempted by another task.
   */
  PREEMPTING(13),
  /**
   * The task is being restarted in response to a user request.
   */
  RESTARTING(12),
  /**
   * The task is being restarted in response to a host maintenance request.
   */
  DRAINING(17),
  /**
   * The task terminated with a non-zero exit code.
   */
  FAILED(4),
  /**
   * Execution of the task was terminated by the system.
   */
  KILLED(5),
  /**
   * The task is being forcibly killed.
   */
  KILLING(6),
  /**
   * A fault in the task environment has caused the system to believe the task no longer exists.
   * This can happen, for example, when a slave process disappears.
   */
  LOST(7);

  private final int value;

  private ScheduleStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ScheduleStatus findByValue(int value) { 
    switch (value) {
      case 11:
        return INIT;
      case 16:
        return THROTTLED;
      case 0:
        return PENDING;
      case 9:
        return ASSIGNED;
      case 1:
        return STARTING;
      case 2:
        return RUNNING;
      case 3:
        return FINISHED;
      case 13:
        return PREEMPTING;
      case 12:
        return RESTARTING;
      case 17:
        return DRAINING;
      case 4:
        return FAILED;
      case 5:
        return KILLED;
      case 6:
        return KILLING;
      case 7:
        return LOST;
      default:
        return null;
    }
  }
}
